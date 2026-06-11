public class Student extends User {
    int studentID;
    int stressLevel;

    public Student(int userID, String name, int studentID) {
        super(userID, name);
        this.studentID = studentID;
    }

    public void fillSurvey(int score) {
        stressLevel = score;
        System.out.println(name + " filled survey. Stress Level: " + stressLevel);
    }
}
