package main;

import java.util.Scanner;

/*swapping of two nos using 3rd variable  */
/*class swap {
    public static void main(String[] args) {
        int a,b,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos for swapping");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(" 2 nos before swapping="+a +b);
        c=a;
        a=b;
        b=c;
        System.out.println("2 nos after swapping="+a +b);
         }
}*/
/*swapping of two nos without using 3rd variable*/    
        
class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos for swapping");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(" 2 nos before swapping="+a +b);//10 20
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("2 nos after swapping="+a +b);
         }
}
        
