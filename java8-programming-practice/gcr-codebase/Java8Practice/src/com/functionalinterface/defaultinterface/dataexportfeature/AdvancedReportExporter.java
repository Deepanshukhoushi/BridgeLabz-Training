package com.functionalinterface.defaultinterface.dataexportfeature;

public class AdvancedReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Advanced CSV export: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Advanced PDF export: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println(
            "Advanced JSON export with metadata"
        );
        System.out.println("{ \"type\": \"report\", \"content\": \"" + data + "\" }");
    }
}
