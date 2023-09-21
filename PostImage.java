package SocialNetwork;

import java.time.LocalDateTime;
import java.util.Date;

public class PostImage extends Post {
    private String size;

    public PostImage(String title, LocalDateTime fechaPublicacion , String size, User user) {
        super(title, fechaPublicacion, user);
        this.size = size;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void createPost(){

    }

    @Override
    public void deletePost(){

    }

}
