package main;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Character to get ASCII value");
      String  n=sc.next();
      for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            int ascii=(int)c;
            System.out.println("character="+c);
            System.out.println("ASCII value="+ascii);
      }*/
        for(int i=0;i<128;i++){
            System.out.printf("%d :%c\n",i,i);
        }
    }
    
}
