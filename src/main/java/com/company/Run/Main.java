package com.company.Run;

import com.company.Exceptions.Exceptions;
import com.company.Logic.MatrixSort.MatrixSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter size: ");
            int size = Integer.parseInt(input.next());

            MatrixSort matrix = new MatrixSort(size);

            System.out.println("Before sort:");
            System.out.println(matrix);

            System.out.print("Enter k: ");
            int k = input.nextInt();

            matrix.sort(k);

            System.out.println("After sort:");
            System.out.println(matrix);

        } catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
        } catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
        }

    }
}
