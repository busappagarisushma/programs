package day2;
import java.io.*;
class CheckedExample {
	public static void main(String[] args) {

		//Unhandled exception type InterruptedException
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("sleep");
			}
		}

		System.out.println("----------");

		// Unhandled exception type FileNotFoundException

		try {
			FileReader f = new FileReader("Student.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("Invalid file name");
		}
	}

}
