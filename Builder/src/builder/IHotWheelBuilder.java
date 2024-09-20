package builder;

public interface IHotWheelBuilder {
  IHotWheelBuilder id(int id);

  IHotWheelBuilder seriesName(String seriesName);

  IHotWheelBuilder model(String model);

  IHotWheelBuilder color(String color);

  IHotWheelBuilder rarity(String rarity);

  IHotWheelBuilder type(String type);

  IHotWheelBuilder wheels(int wheels);

  IHotWheelBuilder doors(int doors);

}
