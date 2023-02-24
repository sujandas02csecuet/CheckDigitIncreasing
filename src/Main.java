public class Main {
    public static void main(String[] args) {


        int result = CheckIsDigitIncreasingNumber(37);
        String finalResult = "the number is not digit increasing";
        if (result == 1) finalResult = "the number is digit increasing";

        System.out.println(finalResult);

    }

    private static int CheckIsDigitIncreasingNumber(int number) {


        for (int i = 1; i <= 9; i++) {

            int sum = 0;
            int product = 0;

            while (sum < number) {

                product = (product * 10) + i;
                sum = sum + product;
            }
            if (sum == number) return 1;
        }
        return 0;
    }
}