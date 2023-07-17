import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int a = scanner.nextInt();
        Main main = new Main();
        main.checkNumber(a);
    }

    public void checkNumber(int a) {
        try {
            if(a > 0) {
                System.out.println("Girdiğiniz sayı pozitif.");
            }
            else {
                throw new NotValidException("Girilen sayı negatif");
            }
        }
        catch (NotValidException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("İşlem tamamlandı.");
        }
    }

    class NotValidException extends Exception {
        public NotValidException(String s)
        {
            super(s);
        }
    }
}