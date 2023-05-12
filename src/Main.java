public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int depozitAmout = 3_000;
        int itog;
        int bonus;
        if (depozitAmout > 1000) {
            bonus = depozitAmout / 100;
        } else {
            bonus = 0;
        }
        itog = balans + depozitAmout + depozitAmout / 100;
        System.out.printf("итоговый счет = " + itog);
        System.out.println(" количество бонусных рублей = " + bonus);
    }
}