package Source;

public class FizzyPrinter {
    public int n;
    public FizzyPrinter(int num){
        this.n=num;

    }
    public String printFizzy() {
        if (n % 3 == 0 && n % 5 == 0) {
            return "Fizzbuzzbang";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 7 == 0) {
            return "Bang";
        } else {
            return "Boom";
        }
    }




}
