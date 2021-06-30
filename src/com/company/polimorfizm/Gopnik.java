package com.company.polimorfizm;

public class Gopnik implements Chuvak{
    @Override
    public void sayHello() {
        System.out.println("Hello epta!");
    }

    @Override
    public Integer age() {
        return null;
    }

    public Integer age(String string){
        return string.length();

    }
}
