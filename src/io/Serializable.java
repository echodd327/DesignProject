package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class Students implements java.io.Serializable{
	
	private String name;
	 
	
	public Students(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
}

public class Serializable {
	public static final File file = new File(System.getProperty("user.dir") + 
			 File.separator + "student.txt");
	
	public static void doWrite(List<Student> list) throws FileNotFoundException, IOException {
		if (file.exists() == false)
			file.createNewFile();
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file, true));
		output.writeObject(list);
		
		output.flush();
		output.close();
	}
	
	public static void doRead() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
		List<Student> list = (List<Student>) input.readObject();
		System.out.println(list.size());
		for (Student i : list)
			System.out.println(i.getName());

		input.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Students> list = new ArrayList<Students>();
		list.add(new Students("asds"));
		list.add(new Students("base"));
//		doWrite(list);
		doRead();
	}

}