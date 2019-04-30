package ohm.softa.a05.collections;

import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBed<T extends Plant> {

    protected SimpleList<T> plants;

    public PlantBed() {
        this.plants = new SimpleListImpl<>();
    }

    public void add(T plant){
        this.plants.add(plant);
    }

    public int size()
    {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor plantColor)
    {
        return plants.filter(p -> p.getPlantColor().equals(plantColor));
    }

}
