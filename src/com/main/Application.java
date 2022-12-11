package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Matematik notunuz : ");
		mat = input.nextInt();
		if(mat>100 || mat<0) { mat = 0; System.out.println("Notunuz 100 ile 0 arası olmalıdır");}
	
		System.out.println("Fizik notunuz : ");
		fizik = input.nextInt();
		if(fizik>100 || fizik<0) {fizik = 0; System.out.println("Notunuz 100 ile 0 arası olmalıdır");}
		
		System.out.println("Turkce notunuz : ");
		turkce = input.nextInt();
		if(turkce>100 || turkce<0) {turkce = 0; System.out.println("Notunuz 100 ile 0 arası olmalıdır");}
		
		System.out.println("Kimya notunuz : ");
		kimya = input.nextInt();
		if(kimya>100 || kimya<0) {kimya = 0; System.out.println("Notunuz 100 ile 0 arası olmalıdır");}
		
		System.out.println("Muzik notunuz : ");
		muzik = input.nextInt();
		if(muzik>100 || muzik<0) {muzik = 0; System.out.println("Notunuz 100 ile 0 arası olmalıdır");}
		
		double average = (mat + fizik + turkce + kimya + muzik)/5;
		
		if(average<55) {
			System.out.println("Sinif Tekrari");
			System.out.println("Ortalamaniz: "+average);
		}else {
			System.out.println("Tebrikler Gectiniz ! Ortalamanız: "+average);
		}
		
		
		

	}

}
