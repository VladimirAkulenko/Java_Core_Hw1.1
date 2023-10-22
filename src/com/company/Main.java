package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // 1 + 2 = 3
        int b = calc.minus.apply(1, 1); // 1 - 1 = 0
        //int c = calc.devide.apply(a, b); // 3 / 0 Происходит деление на ноль, что выбрасывает ошибку ArithmeticException
        //int c = calc.devide_if.apply(a, b); //Решение через условие

        int c = calc.devide_tern.apply(a, b);// Решение через тернарный оператор

        calc.println.accept(c);


    }
}
