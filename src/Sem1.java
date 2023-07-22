import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Введите свое имя: ");
        String name = scan.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if(hour>= 5 && hour < 12){
            System.out.println("Доброе утро " +name);
        } else if(hour >= 12 && hour < 18){
            System.out.println("Добрый день. " + name);
        } else if(hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер. " + name);
        } else  {
            System.out.println("Добрый ночи. " + name);
        }
scan.close();
    }
}


