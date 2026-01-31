package com.functionalinterface.staticmethods.dateformatutility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateFormatUtils.formatDate(invoiceDate, "dd MMM yyyy");
        String format3 = DateFormatUtils.formatDate(invoiceDate, "yyyy/MM/dd");

        System.out.println("Invoice Date (DD-MM-YYYY): " + format1);
        System.out.println("Invoice Date (Readable): " + format2);
        System.out.println("Invoice Date (ISO): " + format3);
    }
}
