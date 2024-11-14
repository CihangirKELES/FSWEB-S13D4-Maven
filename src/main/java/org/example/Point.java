package org.example;

public class Point {
    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //getter setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //calculate distance
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    //calculate distance x to y
    public double distance(Point p) {
        int distanceX = this.x - p.getX();
        int distanceY = this.y - p.getY();
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public double distance(int a, int b) {
        int distanceX = this.x - a;
        int distanceY = this.y - b;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
}
