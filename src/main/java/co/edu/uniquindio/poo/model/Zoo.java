package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Optional;

public class Zoo {
private String name;
private ArrayList<Animal> listAnimals;

public Zoo(String name) {
    this.name = name;
    this.listAnimals = new ArrayList<>();
}

//Getter and Setter

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public ArrayList<Animal> getListAnimals() {
    return listAnimals;
}

public void setListAnimals(ArrayList<Animal> listAnimals) {
    this.listAnimals = listAnimals;
}

@Override
public String toString() {
    return "Zoo: " + name + "\n number of animals: " + listAnimals.size();
}

/**
 * Method to add animals to the zoo
 */

 public String addAnimal(Animal newAnimal){
    String message="";
    Optional<Animal> existingAnimal= searchAnimal(newAnimal.getCode());
    if(existingAnimal.isPresent()){
        message="The animal with code: " + newAnimal.getCode() + " already exists in the zoo";
    }else{
        listAnimals.add(newAnimal);
        message="The animal " + newAnimal.getName() + " was added successfully";
    }
    return message;
}

/**
 * Method to search for animals in the zoo
 */

public Optional searchAnimal(int code){
    return listAnimals.stream().filter(animal -> animal.getCode() == code).findFirst();
}

/**
 * Method to update animals in the zoo
 */

 public String updateAnimal (String newName, int code){
    String message="";
    Optional <Animal> existingAnimal= searchAnimal(code);
    if(existingAnimal.isPresent()){
        existingAnimal.get().setName(newName);
        message="The animal with code: " + code + " was updated correctly";
    }else{
        message="The animal doesn't exist in the zoo";
    }
    return message;
}

/**
 * Method to remove animals from the zoo
 */

public String removeAnimal(int code){
    String message="";
    Optional<Animal> existingAnimal= searchAnimal(code);
    if(existingAnimal.isPresent()){
        listAnimals.remove(existingAnimal.get());
        message="The animal with code: " + code + " was removed successfully";
    }else{
        message="The animal doesn't exist in the zoo";
    }
    return message;
}

/**
 * Method to return the animal's sound
 */

 public String animalSound(){
    String sound= "";
    for (Animal i : listAnimals) {
        sound += i.getName() + " makes the sound: " + i.makeSound() + "\n";
    }
    return sound;
}

}