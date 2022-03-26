package Quadrangle;

abstract public class Quadrangle {
    protected int a;
    protected int b;
    protected double alpha;
    protected double beta;
    protected String color;

    public Quadrangle(int a, int b, double alpha, double beta, String color) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
        this.beta = beta;
        this.color = color;
    }

    abstract public double getLargeDiagonal();

    abstract public double getHeight();

    abstract public String getColor();
}
