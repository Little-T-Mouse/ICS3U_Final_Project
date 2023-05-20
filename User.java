public class User {
    private String userName;
    private int userID;
    private int numOfPoint;
    private int numOfSolve;
    private int numOfSubmit;
    private Role role;

    public User(String userName, int userID, int numOfPoint, int numOfSolve, int numOfSubmit, Role role) {
        setUserName(userName);
        setUserID(userID);
        setNumOfPoint(numOfPoint);
        setNumOfSolve(numOfSolve);
        setNumOfSubmit(numOfSubmit);
        setRole(role);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getNumOfSubmit() {
        return numOfSubmit;
    }

    public void setNumOfSubmit(int numOfSubmit) {
        this.numOfSubmit = numOfSubmit;
    }

    public int getNumOfSolve() {
        return numOfSolve;
    }

    public void setNumOfSolve(int numOfSolve) {
        this.numOfSolve = numOfSolve;
    }

    public int getNumOfPoint() {
        return numOfPoint;
    }

    public void setNumOfPoint(int numOfPoint) {
        this.numOfPoint = numOfPoint;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
