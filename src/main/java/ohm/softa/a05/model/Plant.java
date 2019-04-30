package ohm.softa.a05.model;

public abstract class Plant implements Comparable{
    protected double height;
    protected String name;
    protected String family;
    protected PlantColor plantColor;

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public PlantColor getPlantColor(){
        return plantColor;
    }

    public Plant(double height, String name, String family) {
        this.height = height;
        this.name = name;
        this.family = family;
    }
}
