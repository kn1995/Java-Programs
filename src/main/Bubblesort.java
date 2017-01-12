
package main;

import java.util.Scanner;

public class Bubblesort {
    
    static int[]a;
    static int n,n1,i;
  
    public static void main(String[] args) {
        System.out.println("Enter no of value");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter Nos");
    for(i=0;i<n;i++){
        n1=sc.nextInt();
        a[i]=n1;}
    for(i=0;i<n-1;i++){
    for(int j=0;j<n-1;j++){
    if(a[j]>a[j+1]){
        int temp=0;
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
    }
    }}
    for(i=0;i<n;i++){
        System.out.println("Nos are");
        System.out.println(+a[i]);}
    
          }
    
}
