package saving.serializable.serializeDemo;

import java.io.*;
public class Deserialize {
    //Deserialization = 	The reverse process of converting a byte stream into an object.
    //					(Think of this as if you're loading a saved file)

    //					Steps to Deserialize
    //					---------------------------------------------------------------
    //					1. Your class should implement Serializable interface
    //					2. add import java.io.Serializable;
    //					3. FileInputStream fileIn = new FileInputStream(file path);
    //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
    //					5. objectNam = (Class) in.readObject();
    //					6. in.close(); fileIn.close();
    //					---------------------------------------------------------------

    public static void main(String [] args) {

        User user = null;

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("Demo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: " + serialVersionUID);

        System.out.println("name: " + user.name);
        System.out.println("password: " + user.password);

        user.hello();

    }
}