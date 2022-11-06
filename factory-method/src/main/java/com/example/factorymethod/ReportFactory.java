package com.example.factorymethod;

public class ReportFactory {

    private ReportFactory() {
    }

    public static synchronized Report getReport(ReportType type) {
        switch (type) {
            case CODE:
                return new Code();
            case DISCOURSE:
                return new Discourse();
            case MULTIPLE_CHOICE:
                return new MultipleChoice();
            default:
                throw new IllegalArgumentException("Unsupported");
        }
    }

}
