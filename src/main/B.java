/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class B {
public static void main(String[] args) 
{
 int no,a=0;
 Scanner s=new Scanner(System.in);
System.out.println("Enter any number : ");
 no = s.nextInt();

if(no<0)
{
no=no * -1;
}
else if(no==0)
{
no=1;
}
while(no>0)
{
no=no/10;
a++;
}
System.out.println("Number of Digits in given number is: "+a);
}
}    
