import java.util.Date;

public class Problem {
    private int problemID;
    private int difficulty;
    private String content;
    private String type;
    private Date date;
    private Comment comments;
    private User author;

    public Problem(int problemID, int difficulty, String content, String type, Date date, Comment comments, User author) {
        setProblemID(problemID);
        setDifficulty(difficulty);
        setContent(content);
        setType(type);
        setDate(date);
        setComments(comments);
        setAuthor(author);
    }

    public int getProblemID() {
        return problemID;
    }

    public void setProblemID(int problemID) {
        this.problemID = problemID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
