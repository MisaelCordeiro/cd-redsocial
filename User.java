package SocialNetwork;

import com.campusdual.Utils;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;

    private int id;

    private List<User> listFollowing = new ArrayList<>();
    private List<Post> UserListPost = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getListFollowing() {
        return listFollowing;
    }

    public List<Post> getUserListPost() {
        return UserListPost;
    }

    public void followUser(User user){
        if (!this.listFollowing.contains(user)){
            this.listFollowing.add(user);
        }
        else{
            System.out.println("Ya sigues a este usuario");
        }
    }



    public void addPost(){
       int opt = Utils.integer("Introduce 1 para post tipo texto, 2 para tipo imagen, y 3 tipo video");
        switch (opt){
            case 1:

                break;
            case 2:
                System.out.println("Es imagen");
                break;
            case 3:
                System.out.println("Es video");
                break;
        }
    }


}


// private List<String> phoneNumberList = new ArrayList<>();

// private Map<String, Contact> contactMap = new HashMap<>();