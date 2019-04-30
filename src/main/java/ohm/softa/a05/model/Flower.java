package ohm.softa.a05.model;

public class Flower extends Plant {
    public Flower(double height, String name, String family, PlantColor plantColor) throws Exception {
        super(height,name,family);

        if(plantColor!=PlantColor.GREEN)
        {
            this.plantColor = plantColor;
        }else{
            throw new Exception("Flowers cant be green!!!!");
        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
