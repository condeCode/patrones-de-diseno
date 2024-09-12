import builder.HotWheelsBuilder;
import director.Director;

public class App {
    public static void main(String[] args) throws Exception {
        Director director = new Director();

        HotWheelsBuilder builder = new HotWheelsBuilder();
        director.buildAcceleCharged(builder);
        System.out.println(builder.build());
    }
}
