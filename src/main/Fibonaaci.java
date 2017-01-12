
package main;

import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        int n,i=0,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an no ");
        s=sc.nextInt();
        
        int []a=new int[s] ;
       a[0]=0;
       a[1]=1;

   for(i=2;i<s;i++){
       a[i]=a[i-1]+a[i-2];
   }
   System.out.println("Fibonacci Series= " );
     for(i=0;i<s;i++){ 
                  
             System.out.println(+a[i]+" " );
    }
    }
   }
/*Scanner sc=new Scanner(System.in);
        System.out.println("Enter an no 0 and 1");
       for(i=0;i<2;i++){
        n=sc.nextInt();
       a[i]=n;
    }*/