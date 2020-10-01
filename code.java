package com.namahshree;
import java.util.Scanner;

public class Percentage_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Percentage_Calculator");
		System.out.println("Enter the marks of first subject (out of 20 marks)");
        float a = sc.nextInt();
        System.out.println("Enter the marks of second subject (out of 20 marks)");
        float b = sc.nextInt();
        System.out.println("Enter the marks of third subject (out of 20 marks)");
        int c = sc.nextInt();
        System.out.println("Enter the marks of fourth subject (out of 20 marks)");
        int d = sc.nextInt();
        System.out.println("Enter the marks of fifth subject (out of 20 marks)");
        int e = sc.nextInt();
        float sum = a + b + c + d + e ;
        float divsum = sum/100;
        float answer = divsum*100;
        System.out.println(answer);
	}
}
