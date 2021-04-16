package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User u1= new User();
        User u2 = new User();

        // обращение к свойству age через свойства класса.

        u1.age = 12;
        u2.age = 23;
        // обращение к  свойству  age  через название класса
        User.age = 23;

        u2.doSomething();

        System.out.println(u1.age);
        System.out.println(u2.age);



        // посчитать сколько user
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        System.out.println(User.getCount());

        //объявление объекта класса Passport(User)
        User.Passport passport = new User.Passport();

        //Exception
        // try-catch-finally
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("На ноль делить нельзя");

        } catch (ArrayIndexOutOfBoundsException hello){

        } finally {
            // выполняется код, при любом завершении блоков try-catch
            System.out.println("Finally");

        }


    }
}
