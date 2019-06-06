package app;

/**
 * PizzaDecorator
 */
public abstract class PizzaDecorator implements IPizza {
    
    protected IPizza mPizza;
    
    public PizzaDecorator(IPizza pizza){
        this.mPizza = pizza;
    }

    public IPizza getPizza(){
        return this.mPizza;
    }

    public void setPizza(IPizza iPizza){
        this.mPizza = iPizza;
    }


}