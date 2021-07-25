package corejava;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializeXML {
	
	public static void main(String[] args) throws FileNotFoundException {
		XMLDecoder decoder= new XMLDecoder(new BufferedInputStream(new FileInputStream("mycollege.xml")));
		College c= (College)decoder.readObject();
		
		List <Student>  s= c.getStudent();
		
		for (Student value : s){
			System.out.println(value);
		}
		
	}

}
