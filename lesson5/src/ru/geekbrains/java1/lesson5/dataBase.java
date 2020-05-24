package ru.geekbrains.java1.lesson5;

public class dataBase {
    public static User[] getArrayPersons() {
        System.out.println("Здравствуйте мой Господин, сейчас я покажу вам сотрудников старше 30 лет:");
        User[] userArray = new User[5];
        userArray[0] = new User("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        userArray[1] = new User("Titov Alexander", "Administrator", "titov@ya.ru", "89265216512", 50000, 31);
        userArray[2] = new User("Frosya Burlakova", "Director", "Burlakova@ya.ru", "89131231333", 80000, 45);
        userArray[3] = new User("Vladimir Putin", "President","Putin@ya.ru", "89136667755", 150000, 58);
        userArray[4] = new User("Dmitriy Cherepanov", "Welder", "Welder-Cherep@ya.ru", "89295554165",65,33);
        return userArray;
    }

}
