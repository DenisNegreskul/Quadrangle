import Quadrangle.*;

public class Main {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(2, 3, 60, 120, "Pink");
        Parallelogram parallelogram1 = new Parallelogram(2, 1, 60, 120, "Pink");
        System.out.println(parallelogram.getHeight() + " " + parallelogram1.getHeight());
        System.out.println(parallelogram.getLargeDiagonal());
        System.out.println(parallelogram1.getLargeDiagonal());
        System.out.println(parallelogram.area());
        System.out.println(parallelogram1.area());
        System.out.println(parallelogram.perimeter());
        System.out.println(parallelogram1.perimeter());
        System.out.println(parallelogram.getColor());
    }
}
