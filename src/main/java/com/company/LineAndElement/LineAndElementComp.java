package com.company.LineAndElement;

import java.util.Comparator;

public class LineAndElementComp implements Comparator<LineAndElement> {

    public int compare(LineAndElement firstElement, LineAndElement secondElement) {
        if (firstElement.getElementOfLine() > secondElement.getElementOfLine()) {
            return 1;
        } else {
            return -1;
        }

    }

}
