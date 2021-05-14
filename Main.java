public class Main {
    public static void main(String[] args) {

        int account = 3050;

        boolean accountMoreThousand = true;
        int bonus;

        if (accountMoreThousand) {
            bonus = account / 100;}
        else {bonus = 0;}

        System.out.println("Сумма счета =" + account);
        System.out.println("Ваш бонус =" + bonus);

        }

    }