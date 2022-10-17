public class Main {
    public static void main(String[] args) {
        int initialAccount = 200;
        int add = 2000;

        int bonus = add > 1000 ? add / 100 : 0;

        int finalAccount = initialAccount + add + bonus;
        System.out.println("Итоговый счет:" + finalAccount);
        System.out.println("Бонус:" + bonus);
    }

}