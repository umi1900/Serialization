package org.umar.learnSerialization;
import java.io.*;

public class SerialExample 
{
	public static void main(String [] args) 
	{
		Emp e = new Emp();
		e.name = "Umar";
		e.address = "The Woodlands";
		e.SSN = 01010101;
		e.number = 936;
		
		try 
		{
			FileOutputStream fileOut =
			new FileOutputStream("/tmp/employee.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		}
		catch (IOException i) 
		{
			i.printStackTrace();
		}
	}
}