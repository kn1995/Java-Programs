package main;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int i,j,k=0,rows,n=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows of Pascals Triangle");
        rows=sc.nextInt();
        System.out.println();
        for(i=1;i<=rows;i++){
        for(j=1;j<=n;j++){
            if(j<i){
                k=k+1;
            }
            else{
            k=k-1;}
            System.out.print(k);
            
        }
        n++;
        System.out.print("\n");
        }
    }
  }
    

