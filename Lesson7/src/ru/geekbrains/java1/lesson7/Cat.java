package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    public boolean CatEat;

        public Cat(String name, int appetite, boolean catEat) {
        this.name = name;
        this.appetite = appetite;
        this.CatEat = catEat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

//    public void isCatEat() {
//        System.out.println("Сытость кота: " + setCatEat());
//    }

    // Этим методом я пытался поменять значение булевой переменной, означающей сытость кота
//    public void setCatEat(boolean c) {
//        this.CatEat = c;
//    }



    public void eat(Plate p) {

        p.decreaseFood(appetite, getName());
    }

}
