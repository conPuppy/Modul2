package thuchanh.fruit;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].howToEat());
        }
    }
}
