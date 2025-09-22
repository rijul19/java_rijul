package com.Rijul.day43;

import java.util.*;
public class Cache {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pages: ");
        n = sc.nextInt();
        sc.nextLine();
        String[] cache = new String[n];
        for(int i=0;i<n;i++){
            cache[i] = sc.nextLine();
        }

        for(int i=0;i<n;i++){
            System.out.println(cache[i]);
        }

    }
}
