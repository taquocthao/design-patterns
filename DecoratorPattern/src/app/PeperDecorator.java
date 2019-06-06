package app;

/**
 * PeperDecorator
 */
public class PeperDecorator extends PizzaDecorator{

    public PeperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        return mPizza.doPizza() + addPepper();
    }

    private String addPepper(){
        return " + Pepper";
    }

    
}