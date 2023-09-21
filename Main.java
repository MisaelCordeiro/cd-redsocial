package SocialNetwork;


import com.campusdual.Utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private List<User> UsersList = new ArrayList<>();
    private List<Post> PostsList = new ArrayList<>();



    private User activeUser;
    private User registeredUser;

    public List<User> getUsersList(){
        return UsersList;
    }

    public List<Post> getPostsList(){return PostsList; }

    public User getActiveUser(){
        return activeUser;
    }

    public void setActiveUser(User activeUser){
        this.activeUser = activeUser;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    public static void main(String[] args) {
        Main m = new Main();


        m.objetosDePrueba();
        m.tituloWeb();
        m.opcionesInicio();
        m.opcionUser();


    }

    private void objetosDePrueba (){
        User u1 = new User("Misa",123);
        User u2 = new User("Diego",321);
        User u3 = new User("Burrito",690);

        PostText pt1 = new PostText("Texto Misa",java.time.LocalDateTime.now(),"Contenido post tipo texto",u1);
        PostImage pi1 = new PostImage("Imagen Misa",java.time.LocalDateTime.now(),"100x100",u1);
        PostVideo pv1 = new PostVideo("Video Misa",java.time.LocalDateTime.now(),u1,"HD", 150);

        PostText pt2 = new PostText("Texto Diego",java.time.LocalDateTime.now(),"Contenido post tipo texto",u2);
        PostImage pi2 = new PostImage("Imagen Diego",java.time.LocalDateTime.now(),"50x50",u2);
        PostVideo pv2 = new PostVideo("Video Diego",java.time.LocalDateTime.now(),u2,"1080p",669);

        PostText pt3 = new PostText("Texto Burrito",java.time.LocalDateTime.now(),"Contenido post tipo texto",u2);
        PostImage pi3 = new PostImage("Imagen Burrito",java.time.LocalDateTime.now(),"15950x5049",u2);
        PostVideo pv3 = new PostVideo("Video Burrito",java.time.LocalDateTime.now(),u3,"ULTRA 4K",753);

        Comments c1 = new Comments(u1,pt1,java.time.LocalDateTime.now(),"Pedazo post tipo texto te creaste ahi wapo");
        Comments c2 = new Comments(u2,pt1,java.time.LocalDateTime.now(),"WOW");
        Comments c3 = new Comments(u3,pt1,java.time.LocalDateTime.now(),"OMG CANT BE REAL");
/*
        this.getUserList().add(u1);
        this.getUserList().add(u2);
        this.getUserList().add(u3);

        this.getUserPost().add(pt1);
        this.getUserPost().add(pi1);
        this.getUserPost().add(pv1);

 */
        // esto es la lista de usuarios ficticia
        getUsersList().add(u1);
        getUsersList().add(u2);
        getUsersList().add(u3);

        // estas son las listas generales ficticias
        getPostsList().add(pt1);
        getPostsList().add(pi1);
        getPostsList().add(pv1);
        getPostsList().add(pt2);
        getPostsList().add(pi2);
        getPostsList().add(pv2);
        getPostsList().add(pt3);
        getPostsList().add(pi3);
        getPostsList().add(pv3);

        // esto son las listas de post de cada usuario creado ficticio
        u1.getUserListPost().add(pt1);
        u1.getUserListPost().add(pi1);
        u1.getUserListPost().add(pv1);

        u2.getUserListPost().add(pt2);
        u2.getUserListPost().add(pi2);
        u2.getUserListPost().add(pv2);

        u3.getUserListPost().add(pt3);
        u3.getUserListPost().add(pi3);
        u3.getUserListPost().add(pv3);

        // comentarios

        pt1.getPostCommentList().add(c1);
        pt1.getPostCommentList().add(c2);
        pt1.getPostCommentList().add(c3);

        // seguir usuario
        u1.getListFollowing().add(u2);
        u1.getListFollowing().add(u3);
    }




    public void tituloWeb(){
        System.out.println(" ======= Bienvenidos a PERRITO.NET ======= ");
        System.out.println(" ========================================= ");
        System.out.println(" ========================================= ");
        System.out.println(" ========================================= ");
        System.out.println(" ");
    }

    public void opcionesInicio(){ // mensajito
        System.out.println("Que deseas hacer?");
        System.out.println(" ");
        System.out.println("1.- Registro");
        System.out.println("2 . Login");
        System.out.println("3 . Salir");
    }

    public void opcionUser(){ // menu para registrarse, loguearse
        int num = Utils.integer("Introduce la opción deseada: ");
        switch (num){
            case 1:
                System.out.println("Vamos a registro");
                registerUser();
                break;
            case 2:
                System.out.println("Vamos a login");
                loginUser();
                break;
            case 3:
                System.out.println("Saliendooo");
                tituloWeb();
                opcionesInicio();
                opcionUser();
                break;
        }

    }

    public void registerUser(){ // registrar usuario
        System.out.println("========= REGISTRO =========");
        System.out.println(" ");
        String name = Utils.string("Introduce tu nombre de usuario : ");
        int id = Utils.integer("Introduce el ID: ");
        boolean found = false;
        for (User user : UsersList){
            if (!user.getName().equals(name)){
                found = true;
                User regis = new User(name,id);
                this.setActiveUser(regis); // cambie a set active user para probar
                System.out.println("Nombre " + activeUser.getName() + "  disponible!");
                System.out.println(" ");
                System.out.println(" ");
                listarOpcionesUsuario(activeUser.getName());
                break;
            }
            else {
                System.out.println("El nombre de usuario ya existe");
                System.out.println(" ");
                System.out.println("Deseas volver a registrarte? Opciones 1 = Si. 2 = No");
                System.out.println(" ");
                int opt = Utils.integer("Introduce la opcion deseada: ");
                switch (opt){
                    case 1:
                        System.out.println("Volviendo al registro");
                        registerUser();
                        break;
                    case 2:
                        System.out.println("Volviendo al menu principal");
                        tituloWeb();
                        opcionesInicio();
                        break;
                }
            }
        }




    }

    public void loginUser(){ // loguearte con un user ya creado
        String name = Utils.string("Introduce tu nombre de usuario :");
        boolean found = false;
        for (User user : UsersList) { // bucle foreach que recorre la lista de usuarios y los compara con el nombre que introducimos en la variable name luego con el if comparamos con name.
            if (user.getName().equals(name)){
                found = true;
                this.setActiveUser(user);
                break;
            }
        }
        if (found){
            System.out.println("======================");
            System.out.println(" ");
            System.out.println("Bienvenido " + activeUser.getName());
            System.out.println(" ");
            listarOpcionesUsuario(activeUser.getName());


        } else {
            System.out.println("========= ERROR =========");
            System.out.println(" ");
            System.out.println("El usuario no existe");
            System.out.println(" ");
            System.out.println("Deseas volver a intentarlo?");
            System.out.println(" ");
            System.out.println("1.- Volver a intentar login");
            System.out.println("2.- Registrarte");
            System.out.println("3.- Volver al menu principal");
            System.out.println(" ");
            int opt = Utils.integer("Selecciona la opción deseada");
            switch (opt){
                case 1:
                    System.out.println("===== Volviendo al login =====");
                    System.out.println(" ");
                    loginUser();
                    break;
                case 2:
                    System.out.println("======= REGISTRO =======");
                    System.out.println(" ");
                    registerUser();
                    break;
                case 3:
                    System.out.println("====== Volviendo al menu principal =======");
                    System.out.println(" ");
                    tituloWeb();
                    opcionesInicio();
                    break;
            }
        }


    }
    public void listarOpcionesUsuario(String name){ // menu acciones de usuario. donde accedemos a todas las funciones
        System.out.println("============= ACCIONES =================");
        System.out.println("=======================================");
        System.out.println(" ");

        System.out.println("Que deseas hacer " + getActiveUser().getName() + " ?");
        System.out.println(" ");
        System.out.println("1.- Publicaciones recientes");
        System.out.println("2.- Mostrar mis publicaciones");
        System.out.println("3.- Nueva publicación");
        System.out.println("4.- Seguidores");
        System.out.println("5.- Salir");
        System.out.println(" ");

        int opt = Utils.integer("Introduce la opción deseada: ");
        switch (opt){
            case 1: // listar todas las publicaciones
                listarPosts(activeUser);
                break;
            case 2: // listar mis publicacion
                listarMisPublicaciones(activeUser);
                break;
            case 3: // publicar nuevo comentatio
                System.out.println("Tipos de publicación:");
                System.out.println(" ");
                System.out.println("1.- Texto");
                System.out.println("2.- Imagen");
                System.out.println("3.- Video");
                System.out.println(" ");
                int pub = Utils.integer("Elige la opción que desees: ");
                switch (pub){
                    case 1:
                        crearTipoText(activeUser);
                        listarOpcionesUsuario(activeUser.getName());
                        break;
                    case 2:
                        crearTipoImage(activeUser);
                        listarOpcionesUsuario(activeUser.getName());
                        break;
                    case 3:
                        crearTipoVideo(activeUser);
                        listarOpcionesUsuario(activeUser.getName());
                        break;
                }
                break;
            case 4:
                accionesSegudiores(activeUser);
                break;
            case 5:
                tituloWeb();
                opcionesInicio();
                opcionUser();
                break;
        }
    }


    public void mensajeCrearPost(){
        System.out.println("Selecciona el tipo de post que quieres crear:");
        System.out.println(" ");
        System.out.println("1.- Post tipo texto");
        System.out.println("2.- Post tipo imagen");
        System.out.println("3.- Post tipo video");
        System.out.println("4.- Salir");
        System.out.println(" ");
    }


    public void listarPosts(User user){
        System.out.println("========== ULTIMAS PUBLICACIONES =============");
        for (Post p : PostsList){
            int numComents = p.getPostCommentList().size();
            System.out.println(" ");
            System.out.println("Titulo: " + p.getTitle());
            System.out.println("Fecha: " + p.getFechaPublicacion());
            System.out.println("Usuario: " + p.getUser().getName());
            System.out.println(" Numero de comentarios: " + numComents);
            System.out.println(" ");



            for (Comments c : p.getPostCommentList()){
                System.out.println(" ");

                System.out.println("  El usuario: " + c.getUser().getName() + " En la fecha: " + c.getFechaPublicacion() + ". Ha comentado : " + c.getContent());

                System.out.println(" ");

            }
            int opt = Utils.integer(" 1.- Para ver el siguiente. 2.- Para comentar. 3.- salir ");
            switch (opt){
                case 1:
                    break;
                case 2:
                    addComment(activeUser,p);
                    break;
                case 3:
                    listarOpcionesUsuario(activeUser.getName());
                    break;
            }


        }
        listarOpcionesUsuario(activeUser.getName());
    }
    public void listarMisPublicaciones(User user){

        System.out.println("========== MIS PUBLICACIONES ==============");
        System.out.println(" ");
        for (Post p : activeUser.getUserListPost()){
            System.out.println(" ");
            System.out.println("Titulo: " + p.getTitle());
            System.out.println("Fecha: " + p.getFechaPublicacion());
            System.out.println("Usuario: " + p.getUser().getName());
            System.out.println(" ");

            for (Comments c : p.getPostCommentList()){
                System.out.println(" ");
                System.out.println("El usuario: " + c.getUser().getName() + " En la fecha: " + c.getFechaPublicacion() + " Ha comentado: " + c.getContent());
                System.out.println(" ");
                int optC = Utils.integer("1.- Ver siguiente comentario   2.- Borrar comentario    ");
                switch (optC){
                    case 1:
                        break;
                    case 2:
                        if(p.getPostCommentList().remove(c)){
                            System.out.println("Se ha borrado el comentario");
                            System.out.println(" ");
                            listarMisPublicaciones(activeUser);
                        }
                        else {
                            System.out.println("Error al borrar comenrtario");
                            System.out.println(" ");
                        }
                        break;
                }
            }
            int opt = Utils.integer("1.- Siguiente   2.- Borrar   3.- Salir   ");
            switch (opt){
                case 1:
                    break;
                case 2:
                    if(activeUser.getUserListPost().remove(p)){
                        System.out.println("Se ha borrado correctamente");
                        System.out.println("============================");
                        System.out.println(" ");
                    }
                    else {
                        System.out.println("Error al borrar");
                        System.out.println("==========================");
                        System.out.println(" ");
                    }
                    listarOpcionesUsuario(activeUser.getName());
                    break;
                case 3:
                    listarOpcionesUsuario(activeUser.getName());
                    break;
            }

        }
        listarOpcionesUsuario(getActiveUser().getName());
    }

    public void crearTipoText(User user){
        System.out.println("=========== PUBLICACION TIPO TEXTO =============");
        System.out.println(" ");
        String title = Utils.string("Introduce el título: ");
        String content = Utils.string("Introduce el contenido :");

        PostText pt = new PostText(title,java.time.LocalDateTime.now(),content,activeUser);
        activeUser.getUserListPost().add(pt);

    }

    public void crearTipoImage(User user){
        System.out.println("========== PUBLICACION TIPO IMAGEN =============");
        System.out.println(" ");
        String title = Utils.string("Introduce el título: ");
        String size = Utils.string("Introduce las dimensiones: ");
        PostImage pi = new PostImage(title,java.time.LocalDateTime.now(),size,activeUser);
        activeUser.getUserListPost().add(pi);
    }

    public void crearTipoVideo(User user){
        System.out.println("=========== PUBLICACION TIPO VIDEO =============");
        System.out.println(" ");
        String title = Utils.string("Introduce el título: ");
        String quality = Utils.string("Introduce la calidad: ");
        int duration = Utils.integer("Introduce la duración en segundos: ");

        PostVideo pv = new PostVideo(title,java.time.LocalDateTime.now(),activeUser,quality,duration);
        activeUser.getUserListPost().add(pv);
    }



    public void addComment (User user, Post post){
        String content = Utils.string("Introduce el comentario: ");
        Comments c = new Comments(user,post,java.time.LocalDateTime.now(),content);

        post.getPostCommentList().add(c);
    }

    public void accionesSegudiores(User user){
        System.out.println("========== ACCIONES SEGUIDORES ==========");
        System.out.println(" ");
        System.out.println("1.- Listar Seguidores");
        System.out.println("2.- Seguir nuevo usuario");
        System.out.println(" ");
        int opt = Utils.integer("Selecciona la opcion deseada: ");
        switch (opt){
            case 1:
                listarSeguidres(activeUser);
                break;
            case 2:
                //seguirUsuario(activeUser);
                seguirUsuarioE(activeUser);
                break;
        }
        listarOpcionesUsuario(activeUser.getName());
    }

    public void listarSeguidres (User user){
        System.out.println("=========== TUS SEGUIDORES ===========");
        System.out.println(" ");
        for (User u : user.getListFollowing()){
            System.out.println(" ");
            System.out.println("Usuario : " + u.getName());
            System.out.println(" ");
            int opt = Utils.integer("1.- Siguiente   2.- Dejar de seguir ");
            switch (opt){
                case 1:
                    break;
                case 2:
                    user.getListFollowing().remove(u);
                    System.out.println("Se ha dejado de seguir a este usuario.");
                    System.out.println(" ");
                    listarOpcionesUsuario(activeUser.getName());

            }
        }
        listarOpcionesUsuario(activeUser.getName());
    }
    public void seguirUsuario(User user) { // que no existe
        System.out.println("========= FOLLOW NEW USER ============");
        System.out.println(" ");
        String name = Utils.string("Introduce el usuario que deseas seguir: ");
        User userNuevo = new User(name,666);
        user.getListFollowing().add(userNuevo);
        System.out.println(" ");
        System.out.println("Usuario seguido correctamente!");

    }
    public void seguirUsuarioE(User u){
        System.out.println("========= FOLLOW MISA DIEGO OR BURRITO =========");
        System.out.println(" ");
        String name = Utils.string("A quien quieres seguir:  ");
        for (User user : UsersList){

            if(user.getName().equals(name)){
                activeUser.getListFollowing().add(user);
                System.out.println("Se ha seguido a " + user.getName());
            }
//            else {
//                System.out.println("ERROR al seguir");
//            }

        }
    }









}
