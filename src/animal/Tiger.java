package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "gâu gâu gâu";
    }
    @Override
    public String howToEat(){
        return "Nấu cao";
    }
}
