package corejava;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {

	public static void main(String[] args) {
		try {
			Student s1 = new Student();
			s1.setName("Raj");
			s1.setRoll(101);

			Student s2 = new Student();
			s2.setName("Rahul");
			s2.setRoll(102);

			List<Student> s = new ArrayList<>();
			s.add(s1);
			s.add(s2);

			College c = new College();
			c.setStudent(s);

			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("mycollege.xml")));
			x.writeObject(c);
			x.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
