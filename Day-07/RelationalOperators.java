public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean isEqual = (x == y);
        System.out.println("Is Equal: " + isEqual);

        boolean isNotEqual = (x != y);
        System.out.println("Is Not Equal: " + isNotEqual);

        boolean isGreaterThan = (x > y);
        System.out.println("Is Greater Than: " + isGreaterThan);

        boolean isLessThan = (x < y);
        System.out.println("Is Less Than: " + isLessThan);

        boolean isGreaterThanOrEqual = (x >= y);
        System.out.println("Is Greater Than or Equal: " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = (x <= y);
        System.out.println("Is Less Than or Equal: " + isLessThanOrEqual);
    }
}