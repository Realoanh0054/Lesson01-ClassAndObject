package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NHAP VAO 10 NGUOI");
		System.out.println("*************************");
		for (int i = 0; i < arr.length; i++) {
		  System.out.println("Nhap vao nguoi thu " + (i + 1));
		  String name = sc.nextLine();
		  int old = sc.nextInt();
		  sc.nextLine();
		  String adress = sc.nextLine();
		  int phone = sc.nextInt();
		  sc.nextLine();
		  float average = sc.nextFloat();
		  arr[i] = new Person(name, old, adress, phone, average);
		  sc.nextLine();
		}
		
		//In ra danh sach 
		for (int i = 0; i < arr.length; i++) {
		  System.out.format("Name: %s - Old: %d - Adress: %s - Phone: %d - Average: %2f", arr[i].name, arr[i].old, arr[i].adress, arr[i].phone, arr[i].average).println();
		}

		
	}

}