
public class Lab4Methods {
    public static void factorial(long userInput) {
        long num = 1; // multiply by 1 first, then the rest of the numbers before it.
        for (long i = userInput; i > 0; i--) {
            num = num * i;
            //ex. if user enters 3. 1 = 1 * 3--> 3 = 3 * 2 --> 6 = 6 *1 --> answer is 6!
        }
        System.out.println(userInput + "! = " + num);
    }
}
