package com.jdbc.transactionmanagement;

import java.sql.*;

public class BankingService {
    public void transferMoney(String fromAcc, String toAcc, double amount) {

        String debitQuery =
                "UPDATE account SET balance = balance - ? WHERE account_number = ?";

        String creditQuery =
                "UPDATE account SET balance = balance + ? WHERE account_number = ?";

        String historyQuery =
                "INSERT INTO transaction_history (from_account, to_account, amount) VALUES (?, ?, ?)";

        try (Connection conn = DBUtil.getConnection()) {

            conn.setAutoCommit(false);  

            try (PreparedStatement debitStmt = conn.prepareStatement(debitQuery);
                 PreparedStatement creditStmt = conn.prepareStatement(creditQuery);
                 PreparedStatement historyStmt = conn.prepareStatement(historyQuery)) {

                double balance = getBalanceInternal(conn, fromAcc);

                if (balance < amount) {
                    throw new SQLException("Insufficient balance!");
                }

                debitStmt.setDouble(1, amount);
                debitStmt.setString(2, fromAcc);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setString(2, toAcc);
                creditStmt.executeUpdate();

                historyStmt.setString(1, fromAcc);
                historyStmt.setString(2, toAcc);
                historyStmt.setDouble(3, amount);
                historyStmt.executeUpdate();

                conn.commit();   

                System.out.println("Transfer successful!");

            } catch (Exception e) {

                conn.rollback(); 
                System.out.println("Transaction failed! Rolled back.");
                System.out.println("Reason: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public double checkBalance(String accountNumber) {

        String sql = "SELECT balance FROM account WHERE account_number = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, accountNumber);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble("balance");
            }

        } catch (SQLException e) {
            System.out.println("Error checking balance");
        }

        return 0;
    }

    private double getBalanceInternal(Connection conn, String accountNumber) throws SQLException {

        String sql = "SELECT balance FROM account WHERE account_number = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, accountNumber);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble("balance");
            }

            throw new SQLException("Account not found!");
        }
    }

    public void showTransactionHistory(String accountNumber) {

        String sql = "SELECT * FROM transaction_history " +
                "WHERE from_account = ? OR to_account = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, accountNumber);
            ps.setString(2, accountNumber);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("from_account") + " → " +
                        rs.getString("to_account") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getTimestamp("transaction_date")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error fetching history");
        }
    }
}
