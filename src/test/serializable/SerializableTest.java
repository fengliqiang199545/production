package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

    public static void main(String[] args) throws Exception{
        Person person = new Person(1,"fengliqiang");

        System.out.println("Person Serila" + person);

        FileOutputStream fos = new FileOutputStream("person.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}
