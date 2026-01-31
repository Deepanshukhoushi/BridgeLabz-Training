package com.functionalinterface.defaultinterface.dataexportfeature;

public class CsvReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting report to PDF: " + data);
    }
}
