package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble(), x3 = in.nextDouble(), y3 = in.nextDouble(), x4 = in.nextDouble(), y4 = in.nextDouble();
        Line a = new Line(x1, y1, x2, y2);
        System.out.println(a.intersectionPointWith(new Line(x3, y3, x4, y4)));
    }
}
