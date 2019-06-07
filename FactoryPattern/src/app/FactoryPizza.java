package app;

/**
 * FactoryPizza
 */
public class FactoryPizza {

    public IPizza getPizza(KindOfPizza kind){
        switch(kind){
            case TOMATO: {
                return new TomatoPizza();
            }
            case CHEESE:{
                return new CheesePizza();
            }
            default:{
                return new TomatoPizza();
            }
        }
    }

}