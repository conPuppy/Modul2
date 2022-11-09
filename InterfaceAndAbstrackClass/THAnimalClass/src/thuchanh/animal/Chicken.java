package thuchanh.animal;

import thuchanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: o o o o oooo...";
    }

    @Override
    public String howToEat() {
        return "toi an thoc va gao";
    }
}
