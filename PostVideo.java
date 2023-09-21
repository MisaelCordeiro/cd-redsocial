package SocialNetwork;

import java.time.LocalDateTime;
import java.util.Date;

public class PostVideo extends Post{
    private String quality;
    private int duration;

    public PostVideo(String title, LocalDateTime fechaPublicacion, User user ,String quality, int duration) {
        super(title, fechaPublicacion, user);
        this.quality = quality;
        this.duration = duration;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void createPost(){

    }

    @Override
    public void deletePost(){

    }
}
