package ru.mayorov.factory;

public class CoffeeFactory {
    public Coffee getCoffee(TypeOfCoffee typeOfCoffee){
        Coffee coffee;
        switch (typeOfCoffee){
            case ESPRESSO: coffee = new Espresso();
                break;
            case AMERICANO: coffee = new  Americano();
                break;
            default: throw new IllegalArgumentException("неверный тип кофе");
        }
    return coffee;
    }
}
