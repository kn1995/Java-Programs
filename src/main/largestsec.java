package main;
import java.util.Scanner;

public class largestsec {
static int n,i;
        static int largest=0;
        static int n1;
        static  int[] a;
        static int secondlargest;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of values");
        n=sc.nextInt();
        a=new int[n];
       System.out.println("Enter no ");
   
       for(i=0;i<n;i++){
        n1=sc.nextInt();
        a[i]=n1;}
        for(i=0;i<n;i++){
        if(a[i]>largest){
        secondlargest=largest;
            largest=a[i];
            }
        
        }
    System.out.println("Largest no is"+largest);
        System.out.println("Second Largest no is"+secondlargest);
        
       }
       
        }
       /* int[] a=new int[n];
       
        for(i=0;i<=a.length;i++){
        System.out.println("enter a number");
        
            a[i]=sc.nextInt();
            Integer[] a1 = a[i];
            
        }
      for(i=0;i<a[i];i++){
            if(a[i]>a[i+1]){
            System.out.println("Greatest number is"+a[i]);}}*/


