package ru.job4j.oop.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String jsonText = jsonReport.generate("name", "body");
        System.out.println(jsonText);
    }
}
