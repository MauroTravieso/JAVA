package designpattern.strategy.factory;

public class House implements Building {

    @Override
    public String getType() {
        return "house";
    }

}
