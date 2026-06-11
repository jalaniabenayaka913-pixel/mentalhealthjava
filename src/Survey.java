public class Survey {
    int surveyID;
    double averageScore;

    public Survey(int surveyID) {
        this.surveyID = surveyID;
    }

    public void calculateAverage(int total, int count) {
        averageScore = (double) total / count;
        System.out.println("Survey Average Score: " + averageScore);
    }
}