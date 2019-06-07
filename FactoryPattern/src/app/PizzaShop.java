package app;

public class PizzaShop {
    public static void main(String[] args) throws Exception {
        
        FactoryPizza factory = new FactoryPizza();
        KindOfPizza tomato = KindOfPizza.TOMATO;
        IPizza tomatoPizza = factory.getPizza(tomato);
        
        tomatoPizza.doPizza();
    }
}