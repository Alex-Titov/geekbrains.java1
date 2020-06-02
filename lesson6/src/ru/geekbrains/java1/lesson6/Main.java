package ru.geekbrains.java1.lesson6;
public class Main {

    public static void main(String[] args) {
	Cat catBarsik = new Cat("Барсик", 122f, 22f, 9f,2f);
	catBarsik.run();
	catBarsik.jump();


	Dog dogTuzik = new Dog("Тузик", 22, 33, 10, 5, 33,50);
	dogTuzik.run();
	dogTuzik.swim();
	dogTuzik.jump();

	Animal.animalCount();
    Cat.countCat();
    Dog.countDog();
    }
}
