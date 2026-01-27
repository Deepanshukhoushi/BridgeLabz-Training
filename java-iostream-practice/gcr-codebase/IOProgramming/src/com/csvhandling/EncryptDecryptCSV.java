package com.csvhandling;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "1234567890123456"; // 16 chars

    // Encrypt text
    private static String encrypt(String value) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes()));
    }

    // Decrypt text
    private static String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
    }

    // Write encrypted CSV
    public static void writeEncryptedCSV(String input, String output) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        String line;
        bw.write(br.readLine()); 
        bw.newLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            data[2] = encrypt(data[2]); // Email
            data[4] = encrypt(data[4]); // Salary

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static void readDecryptedCSV(String encryptedFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(encryptedFile));
        String line;

        br.readLine(); 

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String email = decrypt(data[2]);
            String salary = decrypt(data[4]);

            System.out.println(
                "ID: " + data[0] +
                ", Name: " + data[1] +
                ", Email: " + email +
                ", Department: " + data[3] +
                ", Salary: " + salary
            );
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {

        writeEncryptedCSV("employees.csv", "employees_encrypted.csv");
        System.out.println("CSV written with encrypted fields.\n");

        readDecryptedCSV("employees_encrypted.csv");
    }
}
