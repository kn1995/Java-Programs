
package main;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
    String original;
    String reverse="";
 Scanner sc=new Scanner(System.in);        
 System.out.println("Enter any String to check whether it is palindrome or Not? ");
    original=sc.next();
   // temp=original;
    int n=original.length();
    for(int i=n-1;i>=0;i--){
    reverse=reverse+original.charAt(i);}
    if(original.equals(reverse)){
        System.out.println("String is Palindrome");}
    else{
     System.out.println("String is not Palindrome");}
    }
}
