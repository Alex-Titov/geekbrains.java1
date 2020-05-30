package ru.geekbrains.java1.lesson6;

public abstract class Animal {
    protected static int count = 0;
    protected String name;
    protected float runDistans;
    protected float maxRunDistans;
    protected float jumpHeight;
    protected float maxJumpHeight;

    public Animal(String name, float runDistans, float maxRunDistans, float jumpHeight, float maxJumpHeight) {
        this.name = name;
        this.runDistans = runDistans;
        this.maxRunDistans = maxRunDistans;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = maxJumpHeight;
        count++;
    }

    public static void animalCount() {
        System.out.println(String.format("Количество животных в системе: %d ", count ));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRunDistans() {
        return runDistans;
    }

    public void setRunDistans(float runDistans) {
        this.runDistans = runDistans;
    }

    public float getMaxRunDistans() {
        return maxRunDistans;
    }

    public void setMaxRunDistans(float maxRunDistans) {
        this.maxRunDistans = maxRunDistans;
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public float getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(float maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public  void run(){
        if (runDistans <= maxRunDistans) {
            System.out.println(String.format("%s пробежал %.2f метров", name, runDistans));
        } else {
            System.out.println(String.format("%s пробежал %.2f метров и упал.... Загонял ты животинку, бесчувственная ты скотина!!!", name, maxRunDistans));
        }
    }


    public  void jump(){
        if (jumpHeight <= maxJumpHeight) {
            System.out.println(String.format("%s перепрыгнул препятствие высотой %.2f метров", name, jumpHeight));
        } else {
            System.out.println(String.format("%s не может прыгать так высоко", name));
        }
    }

}
