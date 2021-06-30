package com.company.polimorfizm;

public class Pol_Main {
    public static void main(String[] args) {
        // создали массив chuvaki
        Chuvak[] chuvaki = {new Evrei(), new Gopnik()};

        //создали экземпляр класса Gopmik
        Chuvak gopnik = new Gopnik();
        gopnik.sayHello();

        Evrei evrei = new Evrei();
        evrei.sayHello();

        for (int i = 0; i < chuvaki.length; i++) {
            chuvaki[i].sayHello();
        }
    }
}
