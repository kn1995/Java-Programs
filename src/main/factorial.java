package main;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n-1;i>=1;i--){
        n=n*i;}
        System.out.println("Factorial of no="+n);
        
    }
}
