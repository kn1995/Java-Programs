
package main;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    
    public static void main(String[] args) {
        //String s1="";
        int value=0;
        int k1=0;
        int a=0,a1=0,s1,i=0;
      int[] k=new int[4];   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");    
        int s=sc.nextInt();
        System.out.println("Entered no is ="+s);
       while(s>0)
{
s=s/10;
a++;
}
        while(s>0){
        a1=s/1000;
        //k[i]=a;
        int reaminder=s-1000;
        
       
        a--;
        } 
        
}
    }
