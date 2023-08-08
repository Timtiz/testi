import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname;
        System.out.println("Как тебя зовут?");
        fname = sc.next();
    if (fname.endsWith("а")
            || fname.endsWith("я")
            || fname.endsWith("и"))
        System.out.println("Приветик!");
    else
        System.out.println("Здарова!");



    }
}



