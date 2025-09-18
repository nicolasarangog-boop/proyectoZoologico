package co.edu.uniquindio.poo.model;

public abstract class Animal {
private String  name;
private int code;
private byte numberWhiskers;
private Zoo ownedByZoo;

public Animal(String name, int code, byte numberWhiskers, Zoo ownedByZoo) {
    this.name = name;
    this.code = code;
    this.numberWhiskers = numberWhiskers;
    this.ownedByZoo = ownedByZoo;
}

//Getter and Setter

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getCode() {
    return code;
}

public void setCode(int code) {
    this.code = code;
}

public byte getNumberWhiskers() {
    return numberWhiskers;
}

public void setNumberWhiskers(byte numberWhiskers) {
    this.numberWhiskers = numberWhiskers;
}

public Zoo getOwnedByZoo() {
    return ownedByZoo;
}

public void setOwnedByZoo(Zoo ownedByZoo) {
    this.ownedByZoo = ownedByZoo;
}

@Override
public String toString() {
    return "Animal No. " + code +
            " \n -Name='" + name +
            " \n -Number of Whiskers=" + numberWhiskers +
            " \n -Zoo=" + ownedByZoo;
}

public void eat(String food){
    System.out.println("The animal is eating " + food);
}

public String makeSound(){
    return "The animal makes a sound";
}

}
