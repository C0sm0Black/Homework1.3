public class Homework {
    public static void main(String[] args) {

        byte numberBottles = 16;
        byte amountTime = 2;
        byte twentyMinutes = 20;
        short oneDay = 24 * 60;
        short threeDays = 3 * 24 * 60;
        long oneMouth = 30 * 24 * 60;

        System.out.println("За 20 минут машина произвела " + ((twentyMinutes / amountTime) * numberBottles) + " штук бутылок");
        System.out.println("За сутки машина произвела " + ((oneDay / amountTime) * numberBottles) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + ((threeDays / amountTime) * numberBottles) + " штук бутылок");
        System.out.println("За 1 месяц минут машина произвела " + ((oneMouth / amountTime) * numberBottles) + " штук бутылок");

    }

}
