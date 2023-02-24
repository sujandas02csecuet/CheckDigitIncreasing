public class Main {
    public static void main(String[] args) {

        DigitIncreasingChecker digitIncreasingCheckerObject = new DigitIncreasingChecker(36);

        int result = digitIncreasingCheckerObject.CheckIsDigitIncreasingNumber();
        String finalResult = "the number is not digit increasing";
        if (result == 1) finalResult = "the number is digit increasing";

        System.out.println(finalResult);

    }


}