package com.inter.ser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Car implements Externalizable{

	static int age;
    String name;
    int year;
    
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(year);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readInt();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.asList("abc".split(" ")));
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * List<String> tokens = new ArrayList<>(); while (scanner.hasNextLine()) {
		 * Scanner lineScanner = new Scanner(scanner.nextLine());
		 * 
		 * while (lineScanner.hasNext()) { tokens.add(lineScanner.next()); }
		 * 
		 * lineScanner.close();
		 * 
		 * } System.out.println(tokens); scanner.close();
		 */
		/*
		 * Scanner scanner = new Scanner(System.in); List<String> list = new
		 * ArrayList<>(); int count = 0; while (scanner.hasNextLine()) { if(count!=0) {
		 * list.add(scanner.nextLine());
		 * //System.out.println(tokens.add()Arrays.toString(tokens));
		 * System.out.println(list); } count++; } scanner.close();
		 */
	        
		/*
		 * Car c = new Car(); c.year = 2010;
		 * 
		 * FileOutputStream outF = null; ObjectOutputStream outO = null; FileInputStream
		 * fin= null; ObjectInputStream oIn = null;
		 * 
		 * try { outF = new FileOutputStream("car.txt"); outO = new
		 * ObjectOutputStream(outF); outO.writeObject(c); outO.flush(); fin = new
		 * FileInputStream("car.txt"); oIn =new ObjectInputStream(fin); Car c1 = (Car)
		 * oIn.readObject(); System.out.println(c1.year); System.out.println(c1.name); }
		 * catch (IOException | ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }finally { try { outF.close(); } catch
		 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * try { outO.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } }
		 * 
		 * 
		 */}

}
