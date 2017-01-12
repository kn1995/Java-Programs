
package main;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class primenos extends Thread implements Runnable {
    static int n;
    public static void main(String[] args) {
        int i,j;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of an elements");
        int a = sc.nextInt();

    //System.out.println("Enter the Element "+a+" of an Array");

    double[] nos = new double[a];
       for (i=0;i<nos.length;i++) {
            System.out.println("enter a number");
            nos[i]=sc.nextDouble();}
       for(i=0;i<nos[i];i++){
          
       if(nos[i]%2==0){
           System.out.println(nos[i]+"is  notprime no");}
       else  {System.out.println(nos[i]+"is   prime no");}}
        
       /* List<Double> list;
        list=Arrays.asList(nos[i]);

        TreeSet<Double>set=new Tr
       eeSet<Double>(list);
          
          for(Object o:set){
          Double i1=(Double)o;
              System.out.println(i1);}*/
    }}
    /*1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97*/
