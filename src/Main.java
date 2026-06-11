public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Thimanya", 101);
        Counselor counselor = new Counselor(2, "Dr. Silva", 201);

        student.login();
        student.fillSurvey(4);

        counselor.viewStudent(student);

        Appointment app = new Appointment(1);
        Report report = new Report(1, student.stressLevel);
        report.display();

        Notification n = new Notification(1, "Appointment Tomorrow");
        n.send();

        student.logout();
    }
}