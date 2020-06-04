public class Number {
    private int number, check;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void check_negate(int number){
        if (number>0){
            System.out.println(number+ " is a positive number");
        }
        else
            System.out.println(number+ " is a negative number");
    }

    public void even(int number){
        if (number % 2 == 0){
            System.out.println(number+ " is an even number");
        }
        else
            System.out.println(number+ " is an odd number");
    }

    public void prime(int number){
       if (number == 0 || number == 1){
           System.out.println(number+ " is not a prime number");
       }
       else{
           for(int divisor = 2; divisor <= number/2; divisor++){
               if(number%divisor == 0){
                    check = 1;
               }

           }
           if( check == 1){
               System.out.println(number+ " is not a prime number");
           }
           if(check == 0){
               System.out.println(number+ " is a prime number");
           }
       }

    }
    public void decimal(int number){
        if ( number == (long) number){
            System.out.println(number+ " is not a decimal");
        }
        else
            System.out.println(number+ " is a decimal number");
    }

    public void palindrome(int number){
        int originalNum = number;
        int reverse = 0;
        for( ; number > 0; number/=10 ){
            int remainder = number % 10;
            reverse = reverse*10+remainder;
        }
        if(originalNum == reverse){
            System.out.println(originalNum+ " is palindrome");
        }
        else
            System.out.println(originalNum+ " is not a palindrome");
    }

    public void perfect(int number){
        int sum = 0;
        for(int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        if (sum == number){
            System.out.println(number+ " is a perfect number");
        }
        else if(sum > number){
            System.out.println(number+ " is an abundant number");
        }
        else
            System.out.println(number+ " is a deficient number");
    }
    public void square(int number){
        int square = number * number;
        System.out.printf("The square of %d is %d", number, square);
    }
    public void root(int number){
        double root = Math.sqrt(number);
        System.out.println(root+ " is the square root of " +number);
    }
}