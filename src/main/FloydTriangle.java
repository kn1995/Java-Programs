package main;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int i,j,rows,k=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows of Floyd's Triangle ");
            rows=sc.nextInt();
            System.out.println("\n");
            for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
            System.out.println(k+" ");
            
            
            k=k+1;}
           System.out.println("\n");
            }
          }
    }

