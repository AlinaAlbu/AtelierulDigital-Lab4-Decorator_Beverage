package lab4.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super("White Whip", 1, beverage);
    }

}
