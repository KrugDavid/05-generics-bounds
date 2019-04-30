package ohm.softa.a05.model;

public class Shrub extends Plant {
    public Shrub(double height, String name, String family){
        super(height,name,family);
        this.plantColor = PlantColor.GREEN;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
