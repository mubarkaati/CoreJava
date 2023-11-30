package abstraction;

abstract class House {

    public abstract void kitchen();
    public abstract void washroom();
    public abstract void parking();
}

abstract class HouseExtract extends House {

    @Override
    public void parking() {
        System.out.println("Not Implemented");
    }
}

class HouseImpl extends HouseExtract {

    @Override
    public void kitchen() {

    }

    @Override
    public void washroom() {

    }
}

public class HouseAbstraction {

}