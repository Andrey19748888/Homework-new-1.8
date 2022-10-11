import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        checkYear(1996);

        checkVersion(2015, 0 );

        checkDays(95);
    }

    // task1
    public static void checkYear(int year) {
        if (year % 100 == 0) {
            System.out.println( year + " не високосный");
        } else if (year % 4 == 0 ) {
            System.out.println( year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }



    public static void checkVersion( int year, int os) {
        // task2
        if (year < LocalDate.now().getYear()) {
            if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установите обычную версию приложения по ссылке");
        }
    }

    // task3

    public static void checkDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }



}
