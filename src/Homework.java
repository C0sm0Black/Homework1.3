public class Homework {
    public static void main(String[] args) {

        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;

        float increaseMasha = (float) (masha * 1.1);
        float increaseDenis = (float) (denis * 1.1);
        float increaseCristina = (float) (cristina * 1.1);

        float annualDifferenceMasha = increaseMasha * 12 - masha * 12;
        float annualDifferenceDenis = increaseDenis * 12 - denis * 12;
        float annualDifferenceCristina = increaseCristina * 12 - cristina * 12;

        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + annualDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + annualDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseCristina + " рублей. Годовой доход вырос на " + annualDifferenceCristina + " рублей");

    }

}
