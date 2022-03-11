package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner input = new Scanner(System.in);

    static double Pole(int x1, int x2, int x3, int y1, int y2, int y3){
        return 0.5*Math.abs( (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) );
    }

    static void pisz(int a){
        if (a == 1) System.out.println("Podaj pierwszy wierzchołek x1 y1: ");
        if (a == 2) System.out.println("Podaj drugi wierzchołek x2 y2: ");
        if (a == 3) System.out.println("Podaj trzeci wierzchołek x3 y3: ");
        if (a == 4) System.out.println("Podaj współrzędne sprawdzonego punktu: ");
        if (a == 5) System.out.println("Punkt jest wewnątrz trójkąta");
        if (a == 6) System.out.print("Punkt nie jest wewnątrz trójkąta");
    }

    public static void main(String[] args) {
        pisz(1);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        pisz(2);
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        pisz(3);
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        pisz(4);
        int xp = input.nextInt();
        int yp = input.nextInt();
        double PoleTrojkata = Pole(x1, x2, x3, y1, y2, y3);
        double PoleTrojkata1 = Pole(xp, x2, x3, yp, y2, y3);
        double PoleTrojkata2 = Pole(x1, xp, x3, y1, yp, y3);
        double PoleTrojkata3 = Pole(x1, x2, xp, y1, y2, yp);
        if (PoleTrojkata == PoleTrojkata1+PoleTrojkata2+PoleTrojkata3) pisz(5);
        else pisz(6);
    }
}

