public class MathOperations4 {
//    squareArea(int side) — возвращает площадь квадрата (side×side).
//    squarePerimeter(int side) — возвращает периметр квадрата (4×side).

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        System.out.println(squareArea(10));
        System.out.println(squarePerimeter(10));
    }
}
