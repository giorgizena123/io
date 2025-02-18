import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first person's first name, last name, and age: ");
        String firstName1 = scanner.next();
        String lastName1 = scanner.next();
        int age1 = scanner.nextInt();
        Human person1 = new Human(firstName1, lastName1, age1);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("human.dat"))) {
            oos.writeObject(person1);
            System.out.println("Human object saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("human.dat"))) {
            Human savedPerson = (Human) ois.readObject();
            System.out.println("Human object read from file: " + savedPerson.getFirstName() + " " + savedPerson.getLastName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        person1.walk();

        scanner.close();
    }
}
