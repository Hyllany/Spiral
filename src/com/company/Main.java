package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] spiral= Spiral.spiral(4,3);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
        }
    }