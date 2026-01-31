package com.functionalinterface.defaultinterface.dataexportfeature;

public class ReportService {

    public static void main(String[] args) {

        ReportExporter csvExporter = new CsvReportExporter();
        ReportExporter advancedExporter = new AdvancedReportExporter();

        csvExporter.exportToCSV("Sales Report");
        csvExporter.exportToJSON("Sales Report"); 

        advancedExporter.exportToPDF("Finance Report");
        advancedExporter.exportToJSON("Finance Report"); 
    }
}
