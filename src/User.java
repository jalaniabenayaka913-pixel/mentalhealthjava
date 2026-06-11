public class User {
    int userID;
    String name;
    String email;
    String password;

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public void login() {
        System.out.println(name + " logged in");
    }

    public void logout() {
        System.out.println(name + " logged out");
    }
}