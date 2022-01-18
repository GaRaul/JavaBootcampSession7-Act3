package main;

import objetos.Libro;

public class mainApp {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("1234567JK", "JavaBasics", "Raul", 200);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		libro1.setAutor("Abel");
		libro2.setAutor("Abel");
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
	}

}
