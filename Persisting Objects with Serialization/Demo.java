

public class Demo {

    public static void main(String[] args) {
        Student student = new Student("Erol","071411689",1005,9999);
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student.txt";
        fileStream.writeToFile(student, fileName);
        fileStream.readFromFile(fileName);
    }

}
