package Lesson2;

public class less2 {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("��� ��������� �� ����� �������� � �������");
        } catch (ArithmeticException e) {
            System.out.println("������� �� ����");
        }
        System.out.println("���������� ������");
    }

}
