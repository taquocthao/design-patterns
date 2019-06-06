package app;

public class PizzaShop {
    public static void main(String[] args) throws Exception {
        IPizza tomatoPizza = new TomatoPizza();
        System.out.println(tomatoPizza.doPizza());
        IPizza chickenPizza = new ChickenPizza();
        System.out.println(chickenPizza.doPizza());
        
        PeperDecorator pepperDecorator = new PeperDecorator(tomatoPizza);
        System.out.println(pepperDecorator.doPizza());

        CheeseDecorator cheeseDecorator = new CheeseDecorator(chickenPizza);
        System.out.println(cheeseDecorator.doPizza());
        
    }
}