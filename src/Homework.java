public class Homework {
    public static void main(String[] args) {

        byte numberCans = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        byte numberClasses = (byte) (numberCans / (whiteCan + brownCan));

        System.out.println("В школе, где " + (numberClasses) + " классов, нужно " + numberClasses * whiteCan + " банок белой краски и " + numberClasses * brownCan + " банок коричневой краски");

    }

}
