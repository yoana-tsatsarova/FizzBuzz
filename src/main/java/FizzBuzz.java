public class FizzBuzz {

    public String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0 || n % 10 == 3 || n / 10 ==3 ) {
            return "Fizz";
        }

        if (n % 5 == 0 || n / 10 == 5) {
            return "Buzz";
        }
        return Integer.toString(n);
    }
    public void counter(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.counter();
    }
}

