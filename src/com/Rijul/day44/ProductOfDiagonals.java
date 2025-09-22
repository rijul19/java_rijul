package com.Rijul.day44;

import java.util.Scanner;
public class ProductOfDiagonals {
    public static void main(String[] args) {
        int m,n,i,j,prod=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    prod = prod*arr[i][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
