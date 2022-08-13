package zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal {

    private static final double WEIGHT = 5.50;

    public TerrestrialAnimal(String name, String king, double price) {
        super(name, king, WEIGHT, price);
    }

    @Override
    public void eat() {
        setKg(getKg() + 5.70);
    }
}
