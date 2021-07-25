package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Save obj= new Save();
		obj.i=8;
		
		File f= new File("obj.txt");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis= new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fis);
		Save obj1= (Save)ois.readObject();
		System.out.println("Value of obj1 "+ obj1.i);
	}

}

class Save implements Serializable{
	int i;
}
