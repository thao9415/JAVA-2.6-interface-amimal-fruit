package test;

import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import edible.Edible;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals
        ) {
            System.out.println(animal.makeSound());

        }


    }
}
