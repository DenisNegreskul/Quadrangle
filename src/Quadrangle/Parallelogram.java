package Quadrangle;

public class Parallelogram extends Quadrangle implements Figure{
    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, alpha, beta, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.PI / 180 * Math.max(alpha, beta)));
    }

    @Override
    public double getHeight() {
        return Math.min(a, b) * Math.sin(Math.PI / 180 * alpha);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b * Math.sin(Math.PI / 180 * alpha);
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
