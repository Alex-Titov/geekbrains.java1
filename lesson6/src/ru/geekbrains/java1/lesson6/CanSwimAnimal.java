package ru.geekbrains.java1.lesson6;

public abstract class CanSwimAnimal extends Animal {

    protected float swimDistans;
    protected float maxSwimDistans;

    public CanSwimAnimal(String name, float runDistans, float maxRunDistans, float jumpHeight, float maxJumpHeight, float swimDistans, float maxSwimDistans) {
        super(name, runDistans, maxRunDistans, jumpHeight, maxJumpHeight);
        this.swimDistans = swimDistans;
        this.maxSwimDistans = maxSwimDistans;
    }


    public  void swim(){
        if (swimDistans <= maxSwimDistans) {
            System.out.println(String.format("%s проплыл %.2f метров", name, swimDistans));
        } else{
            System.out.println(String.format("%s проплыл %.2f метров, и утонул.... Тебе не стыдно???", name, maxSwimDistans));
        }
    }
}
