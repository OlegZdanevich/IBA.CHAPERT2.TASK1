package com.company.LineAndElement;

public class LineAndElement
{
    private double elementOfLine;
    private double[] line=null;
    public LineAndElement(double elementOfLine, double[] line)
    {
        this.elementOfLine=elementOfLine;
        this.line=line.clone();
    }

    public double getElementOfLine() {
        return elementOfLine;
    }

    public double[] getLine() {
        return line;
    }
}