import builder.HotWheelsBuilder;
import director.Director;

public class App {
    public static void main(String[] args) throws Exception {
        Director director = new Director();

        HotWheelsBuilder acceleCharge = new HotWheelsBuilder();
        director.buildAcceleCharged(acceleCharge);
        acceleCharge
                .id(1)
                .seriesName("AcceleRacers")
                .model("Rip Rod")
                .color("red");
        System.out.println(acceleCharge.build());

        HotWheelsBuilder treasureHunt = new HotWheelsBuilder();
        director.buildTreasureHunt(treasureHunt);
        treasureHunt
                .id(2)
                .seriesName("Treasure Hunt")
                .model("Bone Shaker")
                .color("black");
        System.out.println(treasureHunt.build());

        HotWheelsBuilder zamac = new HotWheelsBuilder();
        director.buildZamac(zamac);
        zamac
                .id(3)
                .seriesName("Zamac")
                .model("Twin Mill")
                .color("silver");
        System.out.println(zamac.build());

        HotWheelsBuilder basic = new HotWheelsBuilder();
        director.buildBasic(basic);
        basic
                .id(4)
                .seriesName("Mainline")
                .model("Batmobile")
                .color("black");
        System.out.println(basic.build());
    }
}
