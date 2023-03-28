import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Các cạnh phải lơn hơn 0!");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Ba cạnh không thể tạo thành một tam giác!");
            }

            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}