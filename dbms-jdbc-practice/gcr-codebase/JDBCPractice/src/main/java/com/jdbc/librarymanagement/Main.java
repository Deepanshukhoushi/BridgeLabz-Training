package com.jdbc.librarymanagement;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {

            System.out.println("\n1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: addBook(); break;
                case 2: borrowBook(); break;
                case 3: returnBook(); break;
                case 4: searchBook(); break;
                case 5: System.exit(0);
            }
        }
    }

    // Add Book
    static void addBook() {

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Copies: ");
        int copies = sc.nextInt();

        String sql = "INSERT INTO book(title, author, category, available_copies) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setInt(4, copies);

            ps.executeUpdate();
            System.out.println("Book added!");

        } catch (Exception e) {
            System.out.println("Error adding book");
        }
    }

    // Borrow Book
    static void borrowBook() {

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Book ID: ");
        int bookId = sc.nextInt();

        String checkSql = "SELECT available_copies FROM book WHERE id=?";
        String updateSql = "UPDATE book SET available_copies=available_copies-1 WHERE id=?";
        String insertSql = "INSERT INTO borrow_record(student_name, book_id, borrow_date) VALUES (?, ?, CURDATE())";

        try (Connection conn = DBUtil.getConnection()) {

            conn.setAutoCommit(false);

            try (PreparedStatement check = conn.prepareStatement(checkSql);
                 PreparedStatement update = conn.prepareStatement(updateSql);
                 PreparedStatement insert = conn.prepareStatement(insertSql)) {

                check.setInt(1, bookId);
                ResultSet rs = check.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {

                    update.setInt(1, bookId);
                    update.executeUpdate();

                    insert.setString(1, name);
                    insert.setInt(2, bookId);
                    insert.executeUpdate();

                    conn.commit();
                    System.out.println("Book borrowed!");

                } else {
                    throw new SQLException();
                }

            } catch (Exception e) {
                conn.rollback();
                System.out.println("Book not available!");
            }

        } catch (Exception e) {
            System.out.println("Database error");
        }
    }

    // Return Book + Fine
    static void returnBook() {

        System.out.print("Borrow Record ID: ");
        int id = sc.nextInt();

        String selectSql = "SELECT borrow_date FROM borrow_record WHERE id=?";
        String updateSql = "UPDATE borrow_record SET return_date=CURDATE(), fine=? WHERE id=?";

        try (Connection conn = DBUtil.getConnection()) {

            PreparedStatement select = conn.prepareStatement(selectSql);
            select.setInt(1, id);
            ResultSet rs = select.executeQuery();

            if (rs.next()) {

                Date borrowDate = rs.getDate(1);
                long days = (System.currentTimeMillis() -
                        borrowDate.getTime()) / (1000 * 60 * 60 * 24);

                double fine = 0;
                if (days > 7)
                    fine = (days - 7) * 10;

                PreparedStatement update = conn.prepareStatement(updateSql);
                update.setDouble(1, fine);
                update.setInt(2, id);
                update.executeUpdate();

                System.out.println("Returned. Fine: ₹" + fine);
            }

        } catch (Exception e) {
            System.out.println("Error returning book");
        }
    }

    // Search Book (Multiple Filters)
    static void searchBook() {

        System.out.print("Title (or press enter): ");
        String title = sc.nextLine();

        System.out.print("Author (or press enter): ");
        String author = sc.nextLine();

        String sql = "SELECT * FROM book WHERE 1=1";

        if (!title.isEmpty())
            sql += " AND title LIKE '%" + title + "%'";

        if (!author.isEmpty())
            sql += " AND author LIKE '%" + author + "%'";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getInt("available_copies")
                );
            }

        } catch (Exception e) {
            System.out.println("Search error");
        }
    }
}
