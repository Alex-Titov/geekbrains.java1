package ru.geekbrains.java1.lesson5;

public class User{
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public User(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void userInfo(){
        System.out.println("ФИО:" + getName());
        System.out.println("Должность:" + getPosition());
        System.out.println("Email:" + getEmail());
        System.out.println("Номер телефона: " + getPhoneNumber());
        System.out.println("Зароботная плата: " + getSalary() + " руб.");
        System.out.println("Возраст: " + getAge());
    }

}
