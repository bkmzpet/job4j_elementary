package condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(
                Math.max(first, second),
                max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                Math.max(first, second),
                max(second, third, fourth)
        );
    }


    public static void main(String[] args) {
        int result = Max.max(3, 25);
        System.out.println(result);
        int result1 = Max.max(3, 70, 30, 50);
        System.out.println(result1);
    }
}