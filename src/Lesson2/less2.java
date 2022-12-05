package Lesson2;

public class less2 {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("Ёто сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("ƒеление на ноль");
        }
        System.out.println("«авершение работы");
    }

}
