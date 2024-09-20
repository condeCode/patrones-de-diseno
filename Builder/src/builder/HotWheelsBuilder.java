package builder;

import model.HotWheels;

public class HotWheelsBuilder implements IHotWheelBuilder {
  private int id;
  private String seriesName;
  private String model;
  private String color;
  private String rarity;
  private String type;
  private int wheels;
  private int doors;

  @Override
  public HotWheelsBuilder id(int id) {
    this.id = id;
    return this;
  }

  @Override
  public HotWheelsBuilder seriesName(String seriesName) {
    this.seriesName = seriesName;
    return this;
  }

  @Override
  public HotWheelsBuilder model(String model) {
    this.model = model;
    return this;
  }

  @Override
  public HotWheelsBuilder color(String color) {
    this.color = color;
    return this;
  }

  @Override
  public HotWheelsBuilder rarity(String rarity) {
    this.rarity = rarity;
    return this;
  }

  @Override
  public HotWheelsBuilder type(String type) {
    this.type = type;
    return this;
  }

  @Override
  public HotWheelsBuilder wheels(int wheels) {
    this.wheels = wheels;
    return this;
  }

  @Override
  public HotWheelsBuilder doors(int doors) {
    this.doors = doors;
    return this;
  }

  public HotWheels build() {
    return new HotWheels(id, seriesName, model, color, rarity, type, wheels, doors);
  }

}
