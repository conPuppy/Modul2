package thuchanh.animal;

import thuchanh.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: gruuuuuu";
    }

    @Override
    public String howToEat() {
        return "toi an thit nguoi";
    }
}
