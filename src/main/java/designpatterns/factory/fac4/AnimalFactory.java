package designpatterns.factory.fac4;

/**
 * @author karamanmert
 * @date 14.10.2024
 */
public class AnimalFactory {

    private AnimalFactory(){}

    public static Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else {
            throw new IllegalArgumentException("Invalid animal type: " + animalType);
        }
    }
}
