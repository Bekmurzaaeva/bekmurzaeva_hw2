import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(goWalk(25, 5));
        System.out.println(goWalk(18, 20));
        System.out.println(goWalk(50, 10));
        System.out.println(goWalk(30, -15));
        System.out.println(goWalk(22, 35));
    }

    public static String goWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}