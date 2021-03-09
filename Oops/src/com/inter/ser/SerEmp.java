package com.inter.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerEmp {

	public static void main(String[] args) {
		/**
		 * Ser
		 */
		Employee emp = new Employee();
		emp.setfName("Fname");
		emp.setlName("Lname");
		FileOutputStream fio = null;
		ObjectOutputStream objO = null;
		try {
			fio = new FileOutputStream("file.ser");
			objO = new ObjectOutputStream(fio);
			objO.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fio.close();
				objO.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Dser
		 */
		FileInputStream in = null;
		ObjectInputStream objI = null;
				
		try {
			 in= new FileInputStream("file.ser");
			 objI = new ObjectInputStream(in);
			 Employee e = (Employee) objI.readObject();
			 System.out.println(e.getlName());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
