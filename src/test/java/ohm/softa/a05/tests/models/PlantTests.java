package ohm.softa.a05.tests.models;

import ohm.softa.a05.collections.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlantTests {
    private final Logger logger = LogManager.getLogger();
    Shrub shrub1;
    Flower blueFlower;

    PlantBed<Plant> plants;

    @BeforeEach
    void setup() throws Exception {

        plants = new PlantBed<>();

        shrub1 = new Shrub(4.5,"Shrub1","ShrubFamily");
        try {
            blueFlower = new Flower(10.5,"Flower1","FlowerF2", PlantColor.BLUE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        plants.add(shrub1);
        plants.add(blueFlower);
        plants.add(new Flower(2.3,"RedFlower", "family3", PlantColor.RED));
        plants.add(new Flower(30.3,"YellowFlower", "family3", PlantColor.YELLOW));


    }

    @Test
    void shrubIsAlwaysGreen()
    {
        logger.info("Shrub");
        assertEquals(PlantColor.GREEN, shrub1.getPlantColor());
    }

    @Test
    void blueFlowerIsBlue()
    {
        logger.info("Blue Flower");
        assertEquals(PlantColor.BLUE,blueFlower.getPlantColor());
    }

    @Test
    void flowerCantBeGreen()
    {
        logger.info("Green Flower");
        assertThrows(Exception.class,()-> new Flower(4.5,"greenFlower","family2",PlantColor.GREEN));
    }

    @Test
    void plantBedSize()
    {
        assertEquals(4, plants.size());
    }

    @Test
    void onlyYellowFlowers()
    {
        SimpleList<Plant> yellowPlants = plants.getPlantsByColor(PlantColor.YELLOW);

        assertEquals(1,yellowPlants.size());
    }
}
