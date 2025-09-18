package co.edu.uniquindio.poo.model;

public class Lion extends Animal{

    public Lion(String name, int code, byte numberWhiskers, Zoo ownedByZoo) {
        super(name, code, numberWhiskers, ownedByZoo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String makeSound(){
        return "Grrrrrrrr!!!";
    }
}
