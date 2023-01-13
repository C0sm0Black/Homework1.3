public class Homework {
    public static void main(String[] args) {

        short amountWeight = 7000;
        short planOnePerDay = 250;
        short planTwoPerDay = 500;

        short dietOne = (short) (amountWeight / planOnePerDay);
        short dietTwo = (short) (amountWeight / planTwoPerDay);
        float averageValue = (float) (dietOne + dietTwo) / 2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм на похудение уйдет " + dietOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм на похудение уйдет " + dietTwo + " дней");
        System.out.println("в среднем может потребоваться " + averageValue + " дней");

    }

}
