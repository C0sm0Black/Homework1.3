public class Homework {
    public static void main(String[] args) {

        byte amountBananas = 5;
        short amountMilk = 2;
        byte amountIceCream = 2;
        byte amountEggs = 4;

        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;

        short grams = (short) (amountBananas * weightBanana + amountMilk * weightMilk + amountIceCream * weightIceCream + amountEggs * weightEgg);
        float kilograms = (float) grams / 1000;

        System.out.println(grams + " грамм");
        System.out.println(kilograms + " килограмм");

    }

}
