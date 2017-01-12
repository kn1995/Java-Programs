
package main;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        String s="y";
      while(s.equalsIgnoreCase("y")){ 
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No ");
        n=sc.nextInt();
        if(n%2==1){
            System.out.println(n+"is odd no ");}
        else{
        System.out.println(n +"is even no ");}
    
     System.out.println("Do You Want to Continue(Y/N) ");
     s=sc.next();
}}}