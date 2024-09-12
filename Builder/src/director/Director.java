package director;

import builder.HotWheelsBuilder;

public class Director {

  public void buildAcceleCharged(HotWheelsBuilder builder) {
    builder
        .id(1)
        .seriesName("AcceleCharged")
        .model("RD-02")
        .color("Blue")
        .rarity("Common")
        .type("AcceleCharged")
        .wheels(4)
        .doors(2);
  }
}
