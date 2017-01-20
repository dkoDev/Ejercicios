package com.dko.algoritmos;

import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// String nom_fun="e01";
		//
		// try {
		//
		//
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		e17();

	}

	public static void e01() {
		// Write a program in Java to display the first 10 natural numbers.
		for (int i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}

	}

	// public static void e0(){}
	public static void e02() {
		// Write a Java program to find the sum of first 10 natural numbers.
		int aux = 0;

		for (int i = 1; i <= 10; i++) {

			// aux=aux+i;
			aux += i;
		}
		System.out.println(aux);

	}

	public static void e03() {
		// Write a program in Java to display n terms of natural number and
		// their sum

		System.out.println("Ingresa Numero");
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			// aux=aux+i;
			aux += i;
		}
		System.out.println("\n" + aux);
		sc.close();
	}

	public static void e04() {
		// Write a program in C to read 10 numbers from keyboard and find their
		// sum and average

		int aux = 0;
		Scanner sc = new Scanner(System.in);
		int array_num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingresa Numero: " + (i + 1) + ")");
			array_num[i] = sc.nextInt();
			aux += array_num[i];
		}

		// int num;
		// for (int i = 0; i < 10; i++) {
		// System.out.println("Ingresa Numero: "+(i+1)+")");
		// num=sc.nextInt();
		// aux+=num;
		// }

		System.out.println("la suma: " + aux + " El promedio: " + aux / 10);
		sc.close();

	}

	public static void e05() {
		// Write a program in C to display the cube of the number upto given an
		// integer.
		int base;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero para elevarlo al cubo");
		base = sc.nextInt();
		for (int i = 1; i <= base; i++) {

			System.out.println("Number is: "+ i +" and cube of the "+i+" is : "
					+ (i*i*i));

		}
		sc.close();

	}

	 public static void e06(){
	//Write a program in C to display the multiplication table of a given integer
		Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa un numero para su tabla de multiplicar");
		int	num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.err.println(num+" X "+i+" = "+(i*num));
		} 
		sc.close();
		 
}
	 public static void e07(){
		 // Write a program in C to display the multipliaction table vertically from 1 to n
		 //1x1 = 1, 2x1 = 2, 3x1 = 3, 4x1 = 4, 5x1 = 5, 6x1 = 6, 7x1 = 7, 8x1 = 8 
		 Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa un numero para su tabla de multiplicar");
		int	num = sc.nextInt();
		
		for (int i = 1; i <=10 ; i++) {
			for (int j = 1; j <= num; j++) {
				if(j==num){
					System.out.print(i+" x "+j+" = "+(j*i));
				}
				else{
				System.out.print(i+" x "+j+" = "+(j*i)+", ");
				}
				
			}
			System.out.println("");
		}
		sc.close();
		 
		 
		 
	 }
	public static void e08(){
		//Write a program in C to display the n terms of odd natural number and their sum
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el numero de terminos");
		int	num = sc.nextInt();
		int aux=1;
		int sum=0;
		int impar=0;
		for (;;) {
			if(impar==num){
				break;
			}
			if(aux%2!=0){
				System.out.print(aux+" ");
				sum+=aux;
				impar++;
			}

			aux++;	
		}
		System.out.println("la suma es: "+sum);
		
		sc.close();
		
		
	}
	public static void e09(){
		//Write a program in C to display the pattern like right angle triangle using an asterisk.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public static void e10(){
		//Write a program in C to display the pattern like right angle triangle with a number.
		for (int i = 1; i <=10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
				
			}
			System.out.println("");
		}
		
	}
	
	public static void e11(){
		//Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row
		int n=4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(i+1);
			}
			System.out.println("");
		}
		
	}
	public static void e12(){
		//Write a program in C to make such a pattern like right angle triangle with number increased by 1
		int aux=1;
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(aux+" ");
				aux++;
			}
			System.out.println("");
		}
		
		
	}
	
	public static void e13(){
		//Write a program in C to make such a pattern like a pyramid with numbers increased by 1
		int aux=1,n=4;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < (n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i ; j++) {
				System.out.print((aux++)+" ");
			}
			System.out.println("");
		}
		
	}
	
	
	public static void e14(){
		//Write a program in C to make such a pattern like a pyramid with an asterisk
		int n=20;
		for (int i = 1; i <=n; i++) {
			
			for (int j=0;j<(n-i); j++) {
				System.out.print(" ");				
			}
			
			for (int k = 0; k <i ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void e15(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para calcular el factorial ");
		int num=sc.nextInt();
		int aux=1;
		for (int i =0; i < num ; i++) {
			
			aux*=(i+1);
			
		}
		
		System.out.println("el valor es :"+aux);
		sc.close();
		
		
	}
	public static void e16(){
		//Write a program in C to display the n terms of even natural number and their sum
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num=sc.nextInt();
		int aux=0;
		for(int i=1;i<=num;i++){
			System.out.print((i*2)+" ");
			aux=aux+(i*2);
		}
		System.out.println("");
		System.out.println("La suma es: "+aux);
		sc.close();
	}
	public static void e17(){
		//Write a program in C to make such a pattern like a pyramid with a number which will repeat the number in the same row
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para a piramide");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= (num-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		sc.close();
		
	}
	 //public static void e0(){}
}
