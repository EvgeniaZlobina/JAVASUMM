public class Main {
    public static void main(String[] args) {
        int summ = 100;
        int summ1 = 3_000;
        int itog;
        int bonus;

        if (summ1 > 1000) {itog = summ + summ1 + summ1/100; bonus = summ1/100;}
        else {itog = summ + summ1; bonus = 0;};
        System.out.printf("итоговый счет = " + itog);
        System.out.println(" количество бонусных рублей = " + bonus);


    }
}