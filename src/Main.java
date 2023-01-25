public class Main {

    public static void main(String[] args) {

        int balance = 312;
        int refill = 2400;
        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        int totalBalance = balance + refill + bonus;

        System.out.println("Балланс после пополнения: " + totalBalance);
        System.out.println("Бонусов начислено: " + bonus);


    }
}
