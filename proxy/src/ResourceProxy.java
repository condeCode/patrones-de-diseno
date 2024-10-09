public class ResourceProxy implements Resource {

    private RealResource realResource;
    private final String userRole;

    public ResourceProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void performAction() {
        if (isUserAuthorized()) {
            if (realResource == null) {
                realResource = new RealResource();
            }
            realResource.performAction();
        } else {
            System.out.println("Acceso denegado: usuario no autorizado.");
        }
    }

    private boolean isUserAuthorized() {
        // Aquí definimos la lógica de autorización
        return "ADMIN".equals(userRole);
    }
}
