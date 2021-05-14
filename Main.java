public class Main {
    public static void main(String[] args) {

        int account = 5000;
        boolean accountMoreThousand  = true;
        int bonus;

        if (account>1000) {
            bonus = account / 100;}
       else {
           bonus=0;
        }

        System.out.println("Сумма счета =" + account);
        System.out.println("Ваш бонус =" + bonus);

    }

}
