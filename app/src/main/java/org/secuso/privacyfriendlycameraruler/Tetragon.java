package org.secuso.privacyfriendlycameraruler;

/**
 * Created by roberts on 23.01.17.
 */

public class Tetragon extends Polygon {
    public Point[] corners = {new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0)};

    public float getArea() {
        double a1 = corners[0].dist(corners[1]);
        double b1 = corners[0].dist(corners[3]);
        double c = corners[3].dist(corners[1]);
        double a2 = corners[1].dist(corners[1]);
        double b2 = corners[2].dist(corners[3]);

        double[] lengths1 = sort3(a1, b1, c);
        double[] lengths2 = sort3(a2, b2, c);

        a1 = lengths1[0];
        b1 = lengths1[1];
        double c1 = lengths1[2];
        a2 = lengths2[0];
        b2 = lengths2[1];
        double c2 = lengths2[2];

        return (float) (0.25 * (Math.sqrt((a1+(b1+c1))*(c1-(a1-b1))*(c1+(a1-b1))*(a1+(b1-c1))) +
                Math.sqrt((a2+(b2+c2))*(c2-(a2-b2))*(c2+(a2-b2))*(a2+(b2-c2)))));
    }
}
