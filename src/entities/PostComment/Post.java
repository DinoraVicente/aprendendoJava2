package entities.PostComment;

import entities.PostComment.Comment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> commentsList = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /*
    Quando for uma Lista de outra classe, utilizar apenas o get
    e alterar apenas com add ou remove ou qualquer outra lógica.
     */
    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void addComment(Comment comment){
        commentsList.add(comment);
    }

    public void removeComment(Comment comment){
        commentsList.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: ").append("\n");
        for(Comment c : commentsList){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
