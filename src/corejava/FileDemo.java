package corejava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	// File f= new File("C:\\Users\\Asus\\Desktop\\Corejava\\demo.txt");

	public static void main(String[] args) throws IOException {
		String str = "Soumya Kar";
		FileWriter fw = new FileWriter("C:\\Users\\Asus\\Desktop\\Corejava\\output1.txt");
		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));
		
		System.out.println("Writting successful");
		fw.close();
		
		FileReader fr= new FileReader("C:\\Users\\Asus\\Desktop\\Corejava\\output1.txt");
		int iter;
		
		while((iter=fr.read())!=-1)
			System.out.print((char)iter);
		fr.close();
		
	}

}
