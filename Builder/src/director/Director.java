package director;

import builder.HotWheelsBuilder;

public class Director {

  public void buildAcceleCharged(HotWheelsBuilder builder) {
    builder
        .rarity("Exclusive")
        .type("AcceleCharged")
        .wheels(4)
        .doors(2);
  }

  public void buildTreasureHunt(HotWheelsBuilder builder) {
    builder
        .rarity("Super Rare")
        .type("Treasure Hunt")
        .wheels(4)
        .doors(4);
  }

  public void buildZamac(HotWheelsBuilder builder) {
    builder
        .rarity("Exclusive")
        .type("Zamac")
        .wheels(4)
        .doors(4);
  }

  public void buildBasic(HotWheelsBuilder builder) {
    builder
        .rarity("Common")
        .type("Basic")
        .wheels(4)
        .doors(4);
  }

  public void buildChrome(HotWheelsBuilder builder) {
    builder
        .rarity("Rare")
        .type("Chrome")
        .wheels(4)
        .doors(4);
  }

  public void buildEpic(HotWheelsBuilder builder) {
    builder
        .rarity("Super Rare")
        .type("Epic Fast")
        .wheels(4)
        .doors(4);
  }

  public void buildFlame(HotWheelsBuilder builder) {
    builder
        .rarity("Ultra Rare")
        .type("Exotic")
        .wheels(4)
        .doors(2);
  }

  public void buildNFT(HotWheelsBuilder builder) {
    builder
        .rarity("Ultra Rare")
        .type("NFT")
        .wheels(4)
        .doors(2);
  }

  public void buildPremium(HotWheelsBuilder builder) {
    builder
        .rarity("Uncommon")
        .type("Premium")
        .wheels(4)
        .doors(4);
  }
}
