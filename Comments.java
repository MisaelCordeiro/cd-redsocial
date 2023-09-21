package SocialNetwork;

import java.time.LocalDateTime;

public class Comments {
    private User user;
    private Post post;
    private LocalDateTime fechaPublicacion;
    private String content;

    public Comments(User user, Post post, LocalDateTime fechaPublicacion, String content) {
        this.user = user;
        this.post = post;
        this.fechaPublicacion = fechaPublicacion;
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
