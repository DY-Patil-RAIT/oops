class OddException extends Exception {
    int num;

    OddException(int x) {
        num = x;
    }

    @Override
    public String toString() {
        return "OddException: " + num + " is an odd number. Input number must be even.";
    }
}

public class Exp_10 {
    static void OddNoException(int number) throws OddException {
        if (number % 2 != 0) {
            throw new OddException(number);
        }
        System.out.println("Square of " + number + " is: " + (number * number));
    }

    public static void main(String[] args) {
        try {
            OddNoException(3);
        } catch (OddException e) {
            System.out.println(e);
        }
    }
}
