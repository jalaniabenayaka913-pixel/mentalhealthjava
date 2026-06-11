public class Appointment {
    int appointmentID;
    String status;

    public Appointment(int appointmentID) {
        this.appointmentID = appointmentID;
        status = "Scheduled";
    }

    public void cancel() {
        status = "Cancelled";
        System.out.println("Appointment cancelled");
    }
}