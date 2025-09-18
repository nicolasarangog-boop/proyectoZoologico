package co.edu.uniquindio.poo.app;
import javax.swing.JOptionPane;
import co.edu.uniquindio.poo.model.*;

public class App {
    public static void main(String[] args) {
        Zoo myZoo= new Zoo ("My Zoo");  

        Animal lion = new Lion("Simba", 1, (byte) 4, myZoo);
        Animal sheep = new Sheep("Dolly", 2, (byte) 2, myZoo);
        Animal lion2 = new Lion("Nala", 3, (byte) 3, myZoo);
        Animal sheep2 = new Sheep("Molly", 4, (byte) 1, myZoo);
        Animal sheep3 = new Sheep("Lola", 5, (byte) 2, myZoo);

        JOptionPane.showMessageDialog(null, myZoo.addAnimal(lion));
        JOptionPane.showMessageDialog(null, myZoo.addAnimal(sheep));
        JOptionPane.showMessageDialog(null, myZoo.addAnimal(lion2));
        JOptionPane.showMessageDialog(null, myZoo.addAnimal(sheep2));
        JOptionPane.showMessageDialog(null, myZoo.addAnimal(sheep3));

        JOptionPane.showMessageDialog(null, myZoo.animalSound());
    }
}
