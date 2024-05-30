package ru.mayorov.factory;

public class PreparCoffee {
    private CoffeeMachine coffeeMachine;
    public PreparCoffee(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    public void start(TypeOfCoffee typeOfCoffee){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(typeOfCoffee);
        coffeeMachine.makeCoffeе();
        coffee.makeCoffee();
        System.out.println("Кофе готов!");
    }
}
