package Fruit;

public class Fruit {
	protected final String color;
    protected String seed;
    protected Fruit(String color){this.color=color;}
    void reproduce() {}
    protected Nutrition getNutrients() {return new Nutrition();}
}

