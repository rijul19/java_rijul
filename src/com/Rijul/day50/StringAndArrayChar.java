package com.Rijul.day50;

import java.sql.SQLOutput;

public class StringAndArrayChar {
    public static void main(String[] args) {
        String str = "Rijul";
        char str2[] = {'R','I','J','U','L'};
        str2[0] = 'J';
        str = "Jijul";
        for(int i=0;i<5;i++){
            System.out.println(str2[i]);
        }
        System.out.println();
        System.out.println(str);
    }
}.
