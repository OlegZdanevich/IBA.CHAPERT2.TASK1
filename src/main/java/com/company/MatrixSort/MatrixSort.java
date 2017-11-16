package com.company.MatrixSort;


import com.company.LineAndElement.LineAndElement;
import com.company.LineAndElement.LineAndElementComp;

import java.util.ArrayList;
import java.util.Collections;


public class MatrixSort {
    private double[][] matrix = null;
    private int size = 0;

    public MatrixSort(int size) {
        try {
            if (size <= 0) throw new IllegalArgumentException("Size should be greater then zero");

            this.size = size;
            matrix = new double[size][size];

            generateRandomMatrix();

        } catch (IllegalArgumentException e) {

            StackTraceElement[] info = e.getStackTrace();

            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }

            System.err.println(e);
        }
    }

    public void sort(int k) {
        try {
            if (k < 0) throw new IllegalArgumentException("K should be greater then zero");
            if (k >= size) throw new IllegalArgumentException("Size shouldn't be greater then number of columns");

            ArrayList<LineAndElement> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                arr.add(new LineAndElement(matrix[i][k], matrix[i]));
            }

            Collections.sort(arr, new LineAndElementComp());
            int counterOfLines = 0;

            for (LineAndElement element : arr) {
                matrix[counterOfLines] = element.getLine().clone();
                counterOfLines++;
            }

        } catch (IllegalArgumentException e) {

            StackTraceElement[] info = e.getStackTrace();

            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    @Override
    public String toString() {

        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                toReturn.append(matrix[i][k] + ", ");
            }
            toReturn.append("\n");
        }

        return toReturn.toString();
    }

    private void generateRandomMatrix() {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                matrix[i][k] = +(Math.random() * (size * 2 + 1)) - size;
            }
        }
    }
}
