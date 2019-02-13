package serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTest {
    public static void main(String[] args) throws Exception{

        Person  person = null;

        FileInputStream fis = new FileInputStream("person.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        person = (Person) ois.readObject();

        ois.close();
        System.out.println(person);
    }
}
