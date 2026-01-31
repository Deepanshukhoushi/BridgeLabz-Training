package com.functionalinterface.defaultinterface.dataexportfeature;

public interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println(
            "Exporting report data to JSON using default implementation"
        );
        System.out.println("{ \"report\": \"" + data + "\" }");
    }
}
