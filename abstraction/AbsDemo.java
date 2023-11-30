package abstraction;

//same type -> parent-child (extends)
//class -> class
//interface -> interface
//class (child) -> interface (parent) (implements)

abstract class Animal {

    public abstract void eat();
}

class Cat extends Animal {

    @Override
    public void eat() {

    }
}

abstract class DemoMainApp {

    public static void main(String[] args) {
        Animal[] absDemos = new Animal[10];
    }
}