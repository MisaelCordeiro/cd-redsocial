package SocialNetwork;

import com.campusdual.Utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Post {
    private String title;
    private LocalDateTime fechaPublicacion;
    private User user;
    private List<Comments> PostCommentList = new ArrayList<>();

    public Post(String title, LocalDateTime fechaPublicacion, User user) {
        this.title = title;
        this.fechaPublicacion = fechaPublicacion;
        this.user = user;


    }

    public Post (){

        this.title = Utils.string("Introduce el título: ");
        this.fechaPublicacion = java.time.LocalDateTime.now();


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = java.time.LocalDateTime.now();
    }

    public List<Comments> getPostCommentList() {
        return PostCommentList;
    }

    public void setPostCommentList(List<Comments> postCommentList) {
        this.PostCommentList = postCommentList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract void createPost(); // estructura metodo crear post



    public abstract void deletePost(); // estructura metodo eliminar post



}
