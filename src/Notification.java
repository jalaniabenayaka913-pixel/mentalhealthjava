public class Notification {
    int notificationID;
    String message;

    public Notification(int notificationID, String message) {
        this.notificationID = notificationID;
        this.message = message;
    }

    public void send() {
        System.out.println("Notification: " + message);
    }
}
