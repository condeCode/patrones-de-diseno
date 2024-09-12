package model;

public class HotWheels {
  private final int id;
  private final String seriesName;
  private final String model;
  private final String color;
  private final String rarity;
  private final String type;
  private final int wheels;
  private final int doors;

  public HotWheels(int id, String seriesName, String model, String color, String rarity, String type, int wheels,
      int doors) {
    this.id = id;
    this.seriesName = seriesName;
    this.model = model;
    this.color = color;
    this.rarity = rarity;
    this.type = type;
    this.wheels = wheels;
    this.doors = doors;
  }

  @Override
  public String toString() {
    return """
        HotWheels {
          id: %d,
          seriesName: %s,
          model: %s,
          color: %s,
          rarity: %s,
          type: %s,
          wheels: %d,
          doors: %d
        }""".formatted(id, seriesName, model, color, rarity, type, wheels, doors);
  }
}
