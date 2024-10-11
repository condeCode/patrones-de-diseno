public class Company {
    private final ResourceManagementSystem resourceSystem;

    public Company(ResourceManagementSystem resourceSystem) {
        this.resourceSystem = resourceSystem;
    }
    public ResourceManagementSystem requestResource() {
        return resourceSystem;
    }

}
