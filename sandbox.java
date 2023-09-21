//package SocialNetwork;
//
//import com.campusdual.Utils;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Main {
//
//    private List<User> userList = new ArrayList<>();
//    private User activeUser;
//
//    public List<User> getUserList(){
//        return userList;
//    }
//
//    public User getActiveUser(){
//        return activeUser;
//    }
//
//    public void setActiveUser(User activeUser){
//        this.activeUser = activeUser;
//    }
//
//    public void main(String[] args) {
//        Main m = new Main();
//
//
//        m.tituloWeb();
//        m.opcionesInicio();
//        m.opcionUser();
//
//
//    }
//
//
//
//
//    public void tituloWeb(){
//        System.out.println(" ======= Bienvenidos a PERRITO.NET ======= ");
//        System.out.println(" ========================================= ");
//        System.out.println(" ========================================= ");
//        System.out.println(" ========================================= ");
//    }
//
//    public void opcionesInicio(){
//        System.out.println("Que deseas hacer?");
//        System.out.println("1.- Registro");
//        System.out.println("2 . Login");
//        System.out.println("3 . Salir");
//    }
//
//    public void opcionUser(){
//        int num = Utils.integer("Introduce la opción deseada: ");
//        switch (num){
//            case 1:
//                System.out.println("Vamos a registro");
//                registerUser();
//                break;
//            case 2:
//                System.out.println("Vamos a login");
//                loginUser();
//                break;
//            case 3:
//                System.out.println("Saliendooo");
//                tituloWeb();
//                opcionesInicio();
//                opcionUser();
//                break;
//        }
//
//    }
//
//    public void registerUser(){
//        String name = Utils.string("Introduce tu nombre de usuario : ");
//        int id = Utils.integer("Introduce el ID: ");
//        User u1 = new User(name,id);
//        listarOpcionesUsuario(name);
//
//        // ver como escribir en un fichero los usuarios
//    }
//
//    public void loginUser(){
//        String name = Utils.string("Introduce tu nombre de usuario :");
//        if (name.equals("Misa")){
//            System.out.println("Bienvenido " + name);
//            listarOpcionesUsuario(name);
//
//        }
//        else {
//            System.out.println("El usuario no existe");
//            System.out.println("Deseas registrarte? 1 = Si. 2 = No");
//            int num = Utils.integer("Introduce la opcion deseada : ");
//            switch (num){
//                case 1:
//                    System.out.println("Vamos al registro");
//                    registerUser();
//                    break;
//                case 2:
//                    System.out.println("Hasta otra!");
//                    tituloWeb();
//                    opcionesInicio();
//                    opcionUser();
//                    break;
//            }
//        }
//    }
//    public void listarOpcionesUsuario(String name){
//        System.out.println("Que deseas hacer " + name + " ?");
//        System.out.println("1.- Publicar Post");
//        System.out.println("2.- Eliminar Post");
//        System.out.println("3.- Seguir nuevo usuario");
//        System.out.println("4.- Dejar de seguir usuario");
//        System.out.println("5.- Listar tus posts");
//        System.out.println("6.- Listar comentarios");
//        System.out.println("7.- Salir");
//        int opt = Utils.integer("Introduce la opción deseada: ");
//        switch (opt){
//            case 1:
//                System.out.println("Publicar Post");
//                createPost();
//                break;
//            case 2:
//                System.out.println("Eliminar Post");
//                break;
//            case 3:
//                System.out.println("Seguir usuario");
//                break;
//            case 4:
//                System.out.println("Dejar de seguir");
//                break;
//            case 5:
//                System.out.println("Listar posts");
//                break;
//            case 6:
//                System.out.println("Listar comentarios");
//                break;
//            case 7:
//                System.out.println("ADIOOOOOOOS");
//                tituloWeb();
//                opcionesInicio();
//                opcionUser();
//        }
//    }
//
//    // crear post
//    public void mensajeCrearPost(){
//        System.out.println("Selecciona el tipo de post que quieres crear:");
//        System.out.println("1.- Post tipo texto");
//        System.out.println("2.- Post tipo imagen");
//        System.out.println("3.- Post tipo video");
//        System.out.println("4.- Salir");
//    }
//    public void createPost(){
//        mensajeCrearPost();
//        int num = Utils.integer("Introduce la opcion deseada: ");
//        switch (num){
//            case 1:
//                System.out.println("CREAR POST TIPO TEXTO");
//                createPostText();
//                break;
//            case 2:
//            case 3:
//            case 4:
//                mensajeCrearPost();
//                opcionUser();
//                break;
//        }
//    }
//
//    public void createPostText(){
//        System.out.println("========== Creando Post tipo texto ===========");
//        LocalDateTime fecha = java.time.LocalDateTime.now();
//        PostText nuevoPostText = new PostText(Utils.string("Introduce el título: "), fecha, Utils.string("Introduce el contenido: "));
//        System.out.println("Post creado con éxito!");
//        createPost();
//    }
//
//
//
//
//}
