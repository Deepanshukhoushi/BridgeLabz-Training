package com.methodreference.invoiceobjectcreation;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceCreation {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        List<Integer> transationIds = new ArrayList<>();

        System.out.print("Enter number of IDs: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Transation Ids:");
        for (int i = 0; i < n; i++) {
            transationIds.add(sc.nextInt());
        }

        List<Invoice> invoices = transationIds.stream()
                .map(Invoice::new)  
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
        sc.close();
    }
}
