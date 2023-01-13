public class Homework {
    public static void main(String[] args) {

        byte ludmilaPavlova = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;

        short totalStudent = (short) (ludmilaPavlova + annaSergeevna + ekaterinaAndreevna);
        short totalList = 480;

        System.out.println("На каждого ученика рассчитано " + totalList / totalStudent + " листов бумаги");

    }

}
