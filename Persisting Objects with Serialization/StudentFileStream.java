

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentFileStream {

    public void writeToFile(Student student, String fileName){
        try {

            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(student);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                + "Data before Deserialization.");
            printData(student);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public Student readFromFile(String fileName){
        Student student = new Student();
        try {

            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            student = (Student) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                + "Data after Deserialization.");
            printData(student);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                " is caught");
        }
        return student;
    }



    public void printData(Student  student) {
        System.out.println("Name = " + student.name);
        System.out.println("Index number = " + student.indexNum);
        System.out.println("Record number = " + student.recordNum);
        System.out.println("Phone number = " + student.phoneNum);
    }

}
