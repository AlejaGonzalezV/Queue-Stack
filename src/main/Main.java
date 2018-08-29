package main;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import lists.*;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Balance ex = new Balance();
	System.out.println("Ingrese el numero de datos");
	
	try {
		ex.read();
	} catch (IOException e) {
		
		e.printStackTrace();
	}

//		List<Integer,Integer> lista1 = new List<Integer,Integer>();
		
//		Stack
//		lista1.push(1);
//		lista1.push(2);
//		lista1.push(3);
//		lista1.push(4);
//		lista1.push(5);
//		System.out.println(lista1.isEmptyS());
//		System.out.println(lista1.pop());
//		System.out.println(lista1.sizeS());
//		System.out.println("");
//		System.out.println(lista1.pop());
//		System.out.println(lista1.sizeS());
//		System.out.println("");
//		System.out.println(lista1.pop());
//		System.out.println(lista1.sizeS());
//		System.out.println("");
//		System.out.println(lista1.pop());
//		System.out.println(lista1.sizeS());
//		System.out.println("");
//		System.out.println(lista1.pop());
//		System.out.println(lista1.sizeS());
//		System.out.println("");
//		System.out.println(lista1.isEmptyS());
//		
////		Queue
//		
//		lista1.enqueue(1);
//		lista1.enqueue(2);
//		lista1.enqueue(3);
//		lista1.enqueue(4);
//		lista1.enqueue(5);
//		System.out.println(lista1.isEmptyQ());
//		System.out.println(lista1.dequeue());
//		System.out.println(lista1.sizeQ());
//		System.out.println("");
//		System.out.println(lista1.dequeue());
//		System.out.println(lista1.sizeQ());
//		System.out.println("");
//		System.out.println(lista1.dequeue());
//		System.out.println(lista1.sizeQ());
//		System.out.println("");
//		System.out.println(lista1.dequeue());
//		System.out.println(lista1.sizeQ());
//		System.out.println("");
//		System.out.println(lista1.dequeue());
//		System.out.println(lista1.sizeQ());
//		System.out.println("");
//		System.out.println(lista1.isEmptyQ());
		
		
	}

}
