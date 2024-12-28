package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Person person = new Person("John", 30);

        // try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
        //     oos.writeObject(person);
        //     System.out.println("Object serialized.");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        //deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Name: " + person.name + ", Age: " + person.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
