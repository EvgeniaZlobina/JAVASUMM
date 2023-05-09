// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int summ;
        summ = 100;
        int summ1;
        summ1 = 3000;
        int itog;
        int bonus;

        if (summ1 > 1000) {itog = summ + summ1 + summ1/100; bonus = summ1/100;}
        else {itog = summ + summ1; bonus = 0;};
        System.out.printf("итоговый счет = " + itog + ";");
        System.out.println(" количество бонусных рублей = " + bonus);



    }
}