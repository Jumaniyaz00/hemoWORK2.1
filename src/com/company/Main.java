package com.company;

public class Main{

    public static void main(String[] args) {
        canWalk("ali",16,20);
        canWalk2("ali",16,20);
    }

    public static void canWalk(String name, int age,int temperature ) {
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println(name + "можно идти гуллят ");
        } else {
            System.out.println(name +" нелзя идти гулят ");
        }
        if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println(name + "  можно гулят ");
        } else {
            System.out.println(name + " нелзя идти гулят");

        }
        if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println(name +" можно гулят ");
        } else {
            System.out.println(name +" не можно гулят ");
        }
    }
        public static void canWalk2(String name, int age,int temperature ) {
            if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
                System.out.println(name + "можно идти гуллят ");
            } else {
                System.out.println(name + " нелзя идти гулят ");
            }
            if (age < 20 && temperature > 0 && temperature < 28) {
                System.out.println(name + "  можно гулят ");
            } else {
                System.out.println(name + " нелзя идти гулят");

            }
            if (age > 45 && temperature > -10 && temperature < 25) {
                System.out.println(name + " можно гулят ");
            } else {
                System.out.println(name + " не можно гулят ");
            }
        }
}
