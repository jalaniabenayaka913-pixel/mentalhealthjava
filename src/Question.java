public class Question {
    int questionID;
    String questionText;

    public Question(int questionID, String questionText) {
        this.questionID = questionID;
        this.questionText = questionText;
    }

    public void display() {
        System.out.println(questionText);
    }
}