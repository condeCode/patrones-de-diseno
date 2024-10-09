public class Main {
    public static void main(String[] args) {

        Resource adminResource = new ResourceProxy("ADMIN");
        adminResource.performAction();  // Debe permitir el acceso

        Resource userResource = new ResourceProxy("USER");
        userResource.performAction();  // Debe denegar el acceso

    }
}