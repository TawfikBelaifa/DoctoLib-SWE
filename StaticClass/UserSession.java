package StaticClass;

public class UserSession {
    public static UserSession instance;
    private String username;
    private int userID;
    private String role;

    private UserSession(String username, int userID, String role) {
        this.username = username;
        this.userID = userID;
        this.role = role;
    }

    public static void sessionCreate(String username, int userID, String role) {
    	instance = new UserSession(username, userID, role);
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
