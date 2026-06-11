public class Report {
    int reportID;
    double summaryScore;

    public Report(int reportID, double score) {
        this.reportID = reportID;
        this.summaryScore = score;
    }

    public void display() {
        System.out.println("Report Score: " + summaryScore);
    }
}
