package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chíp chíp";
    }
    @Override
    public String howToEat(){
        return "Chiên, luộc, hầm.....";
    }

}
