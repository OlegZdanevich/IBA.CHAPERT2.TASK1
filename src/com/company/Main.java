package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        MatrixSort matrix = new MatrixSort(n);
        System.out.println("Before sort:");
        System.out.println(matrix);
        System.out.print("Enter k: ");
        int k = input.nextInt();
        matrix.sort(k);
        System.out.println("After sort:");
        System.out.println(matrix);
    }
}
