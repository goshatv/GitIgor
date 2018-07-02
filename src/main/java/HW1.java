public class HW1 {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

    public static double abc(double a, double b, double c) {
        double res = 0;
        double sumAC = a + c;
        double sumBC = b + c;

        if (a % 2 == 0) {
            res = a * (b / c);
        }

        if (sumAC % 2 == 0) {
            res = Math.pow(a, c);
        }

        if (sumBC % 2 == 0) {
            res = Math.pow(a, c);
        } else {
            res = a + b - c;
        }
        return res;
    }

    //Сделал для двухмерноіх координат
    public static String xy(int x, int y) {
        String res = "";
        if (x > 0 & y > 0) {
            res = "Первая четверть";
        }

        if (x < 0 & y > 0) {
            res = "Вторая четверть";
        }

        if (x < 0 & y < 0) {
            res = "Третья четверть";
        }
        if (x > 0 & y < 0) {
            res = "Четвертая четверть";
        }
        return res;
    }

    public static int Factorial(int x) {
        int res = 1;

        for (int i = 1; i <=x; i++) {
            res *= i;
        }
        return res;

    }
}