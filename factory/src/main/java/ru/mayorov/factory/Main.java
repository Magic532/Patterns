package ru.mayorov.factory;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        PreparCoffee preparCoffee = new PreparCoffee(coffeeMachine);
        preparCoffee.start(TypeOfCoffee.ESPRESSO);
    }
}