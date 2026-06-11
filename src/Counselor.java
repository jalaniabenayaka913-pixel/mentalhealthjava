public class Counselor extends User {
    int counselorID;

    public Counselor(int userID, String name, int counselorID) {
        super(userID, name);
        this.counselorID = counselorID;
    }

    public void viewStudent(Student student) {
        System.out.println("Counselor Name:" + name);
        System.out.println("Student: " + student.name);
        System.out.println("Stress Level: " + student.stressLevel);
    }
}