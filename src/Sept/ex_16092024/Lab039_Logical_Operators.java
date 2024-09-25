package Sept.ex_16092024;

public class Lab039_Logical_Operators {
    public static void main(String[] args) {
        //Logical Operaters - AND (&&), OR(||), NOT (!)
        // There are called as gates – OR gate, AND gate, Not Gate
        // They follow a set of rules to give output
        // Output would be Boolean
        // AND -> if both operands are true than only true -> else false
            // TRUE & TRUE = TRUE
        // OR-> if both are false than only false-> else true
            // FALSE or FALSE = FALSE

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        boolean output1 = a&&b; //AND Operator
        System.out.printf ("output1 a AND b is %b", output1);
        System.out.println();

        boolean output2 = c||d; //OR Operator
        System.out.printf ("output2 c OR d is %b", output2);
        System.out.println();

        System.out.println(!output1); //NOT Operator

        System.out.println(!output2); //NOT Operator

    }
}
