public class DigitIncreasingChecker {

    public  int number;


    public DigitIncreasingChecker(int number) {
        this.number=number;
    }

    public int CheckIsDigitIncreasingNumber() {

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
