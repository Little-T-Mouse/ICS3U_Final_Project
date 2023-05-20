import java.util.Date;

public class Comment {
    private String content;
    private User author;
    private Date date;
    private int vote;
    private boolean isPublic;

    public Comment(String content, User author, Date date, int vote, boolean isPublic) {
        setContent(content);
        setAuthor(author);
        setDate(date);
        setVote(vote);
        setPublic(isPublic);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
