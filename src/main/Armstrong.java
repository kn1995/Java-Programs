
package main;

import java.util.Scanner;

public class Armstrong {
     
    public static void main(String[] args) {
    
    String z="y";
    while(z.equalsIgnoreCase("y")){
    int n,s;
    int s1=0;
    int temp=0;
          Scanner sc=new Scanner(System.in);

        System.out.println("Enter no to check whether it is Armstrong or Not?");  
        n=sc.nextInt();
        temp=n;
        while(n>0){
            s=n%10;
            n=n/10;
            s1=s1+(s*s*s);
           
        }
        if(s1==temp){
        System.out.println(" It is  Armstrong No");
    }
        else{
         System.out.println(" It is an not Armstrong No");}
    
        
      System.out.println(" Do You Want to Continue(Y/N)");
    z=sc.next();
    }}
    
}
/*Follwing are Armstrong nos=0, 1, 153, 370, 371, 407*/