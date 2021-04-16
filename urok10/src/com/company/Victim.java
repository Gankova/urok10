package com.company;

// final

// модификатор final, указанный в сигнатуре класса, делает этот класс ненаследуемым

public final class Victim {
    private static final float PI = 3.14f;

    private void test() {
        final int age = 10;

        final User u =  new User();
        u.speed = 12.9f;
        // u = new user()  ошибка. final для объектов делает неизменяемой ссылку на этот объект

    }
}
