package SocialNetwork;

import com.campusdual.Utils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class PostText extends Post {

    private String content;

    public PostText(String title, LocalDateTime fechaPublicacion, String content, User user) {
        super(title, fechaPublicacion, user);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void createPost(){

        this.setTitle(Utils.string("Introduce el título: "));
        this.setContent(Utils.string("Introduce el contenido: "));
        System.out.println("Has creado el post con titulo : " + this.getTitle() + " En la fecha " + this.getFechaPublicacion() + " Con el contenido: " + this.getContent());
    }

    @Override
    public void deletePost(){

    }
}
