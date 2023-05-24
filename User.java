public class User {
    private String userName;
    private int userID;
    private int numOfPoint;
    private int numOfSolve;
    private int numOfSubmit;
    private Role role;

    /**
     * Constructor for class User
     * @param userName the username of the user
     * @param userID the id of the user
     * @param numOfPoint the number of point that the user have
     * @param numOfSolve the number of solve that the user have
     * @param numOfSubmit the number of submit that the user have
     * @param role the role of the user
     */
    public User(String userName, int userID, int numOfPoint, int numOfSolve, int numOfSubmit, Role role) {
        setUserName(userName);
        setUserID(userID);
        setNumOfPoint(numOfPoint);
        setNumOfSolve(numOfSolve);
        setNumOfSubmit(numOfSubmit);
        setRole(role);
    }

    /**
     * getRole
     * Getter method for variable role
     * @return the variable role
     */
    public Role getRole() {
        return role;
    }

    /**
     * setRole
     * Setter method for variable role
     * @param role variable role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * getNumOfSubmit
     * Getter method for variable numOfSubmit
     * @return variable numOfSubmit
     */
    public int getNumOfSubmit() {
        return numOfSubmit;
    }

    /**
     * setNumOfSubmit
     * Setter method for variable numOfSubmit
     * @param numOfSubmit variable numOfSubmit
     */
    public void setNumOfSubmit(int numOfSubmit) {
        this.numOfSubmit = numOfSubmit;
    }

    /**
     * getNumOfSolve
     * Getter method for variable numOfSolve
     * @return variable numOfSolve
     */
    public int getNumOfSolve() {
        return numOfSolve;
    }

    /**
     * setNumOfSolve
     * Setter method for variable numOfSolve
     * @param numOfSolve variable numOfSolve
     */
    public void setNumOfSolve(int numOfSolve) {
        this.numOfSolve = numOfSolve;
    }

    /**
     * getNumOfPoint
     * Getter method for variable numOfPoint
     * @return variable numOfPoint
     */
    public int getNumOfPoint() {
        return numOfPoint;
    }

    /**
     * setNumOfPoint
     * Setter method for variable numOfPoint
     * @param numOfPoint variable numOfPoint
     */
    public void setNumOfPoint(int numOfPoint) {
        this.numOfPoint = numOfPoint;
    }

    /**
     * getUserID
     * Getter method for variable userID
     * @return variable userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * setUserID
     * Setter method for variable userID
     * @param userID variable userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * getUserName
     * Getter method for variable userName
     * @return variable userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * setUserName
     * Setter method for variable userName
     * @param userName variable userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
