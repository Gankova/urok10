package com.company;
//static
//статические поля класса наследуются, но статические методы класса нельзя переопределить
// статические конструкторы в jave  запрещены

public class User {
    // поле класса, помеченная модификатором static, будет представлена в памяти в единственном экземляре
    // и боращаться к нему можно, как через объект класса так и через название классаю
    public static int age;

    public float speed;

    private static int count;
    //Статические конструкторы в java  не возможны
    // public static User - не возможны
    public static class Passport{
        public String number;
        public String photo;
    }

    public User (){
        count++;
    }
    public static int getCount(){
        return count;
    }




    public static void move(){
        // в статических методах нельзя ссылаться на не статические поля класса(динамические)
        // нельзя использовать ключевое слово this
        //System.out.println(this.speed);  ОШИБКА
        System.out.println("user is moving");
    }

    public void doSomething(){
        move();
        User.move();

        User.age = 2;
        age = 232;
    }
}
