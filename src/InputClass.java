import java.util.Scanner;

public class InputClass {
    public static void main(String [] args){
        String myString = new String("Строка");
        Scanner abc = new Scanner(System.in);
        System.out.println("Введите данные:");
        String str = abc.nextLine();
        System.out.println("Вы ввели: " + str);
    }
}
