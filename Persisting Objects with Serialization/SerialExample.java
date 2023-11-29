

//import Example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExample {

    public static void printData(Example object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("transientInt = " + object1.transientInt);
        System.out.println("staticInt = " + object1.staticInt);
    }

    public static void main(String[] args) {
        Example object = new Example("Name", 20, 2, 1000);
        String filename = "test.txt";

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                (filename);
            ObjectOutputStream out = new ObjectOutputStream
                (file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n" + "Data before Deserialization.");
            printData(object);

            // value of static variable changed
            object.staticInt = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object = (Example) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
            printData(object);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" + " is caught");
        }
    }
}
