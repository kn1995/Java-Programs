package main;

import java.util.Scanner;
public class QuadraticEq {
     
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double r1=0,r2=0;
               
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c respectively");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double discriminant=b*b-4*a*c;
        if(discriminant>0){
        r1=(-b+Math.sqrt(discriminant))/(2*a);
        r2=(-b-Math.sqrt(discriminant))/(2*a);
        System.out.println("The equation has two real roots " + r1 + " and " + r2);
        }
         if (discriminant == 0){
             System.out.println("Roots are real and equal");
             r1=-((b)/(2*a));
             System.out.println("The equation has one root " +r1);
        }
        if (discriminant < 0){
            System.out.println("Roots are imaginary");
            System.out.println("The equation has no real root");
            /*r1=(-b/(2*a))+i((-Math.sqrt(discriminant))/(2*a));
            r2=(-b/(2*a))-i((-Math.sqrt(discriminant))/(2*a));
            */
        }}
    }
    

