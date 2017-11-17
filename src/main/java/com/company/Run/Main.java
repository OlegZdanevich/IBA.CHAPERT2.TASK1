package com.company.Run;

import com.company.MatrixSort.MatrixSort;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter size: ");
            int n = Integer.parseInt(input.next());

            MatrixSort matrix = new MatrixSort(n);

            System.out.println("Before sort:");
            System.out.println(matrix);

            System.out.print("Enter k: ");
            int k = input.nextInt();

            matrix.sort(k);

            System.out.println("After sort:");
            System.out.println(matrix);

        }
        catch (NumberFormatException exception)
        {
            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error("You should enter integer number" + "\nTrace: \n" + trace);
        }

        catch (NullPointerException exception) {
            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error("Object should be initalized" + "\nTrace: \n" + trace);
        }

    }
}
