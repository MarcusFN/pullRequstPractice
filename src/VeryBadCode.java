public class VeryBadCode {

    public class BadCode {
        public static void main(String[] args) {
            int x = 5;
            int y = 10;


            System.out.println("The sum of x and y is: " + add(x, y));
        }

        public static int add(int a, int b) {
            int result = a + b;
            return result;
        }
    }

}
