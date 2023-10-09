import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        do{
            System.out.println("Введи 5");
            a = scan.nextInt();
        } while(a !=5);
        System.out.println("Вы ввели 5");
    }
}
