import java.util.Scanner;
public class NumberTest {
    public static void main (String... args){
        Number profile = new Number();
      System.out.println("Welcome. This is a number profile system");
        Scanner input = new Scanner(System.in);
      System.out.println("Enter number");
      int number = input.nextInt();
      profile.setNumber(number);

      profile.check_negate(number);
      profile.even(number);
      profile.prime(number);
      profile.decimal(number);
      profile.palindrome(number);
      profile.perfect(number);
      profile.root(number);
      profile.square(number);
    }
}
