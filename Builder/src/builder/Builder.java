package builder;

public interface Builder {
  Builder id(int id);

  Builder seriesName(String seriesName);

  Builder model(String model);

  Builder color(String color);

  Builder rarity(String rarity);

  Builder type(String type);

  Builder wheels(int wheels);

  Builder doors(int doors);

}
