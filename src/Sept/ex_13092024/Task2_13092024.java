package Sept.ex_13092024;

public class Task2_13092024 {
    public static void main(String[] args) {
        //Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
        //double a = 34;
        //double b = 10;
        //Print - a+b, a-b, ab, a/b, a%b all the outputs.

        double a = 34;
        double b = 10;

        System.out.printf ("Addition of two numbers (a+b) is %f+%f =%f", a, b, a+b);
        System.out.println();
        System.out.printf ("Subtraction of two numbers (a-b) is %f-%f =%f", a, b, a-b);
        System.out.println();
        System.out.printf ("Multiplication of two numbers (a*b) is %f*%f =%f", a, b, a*b);
        System.out.println();
        System.out.printf ("Division of two numbers (a/b) is %f/%f =%f", a, b, a/b);

    }
}

