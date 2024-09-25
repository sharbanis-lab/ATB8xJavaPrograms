package Sept.ex_16092024;

public class Lab042 {
    public static void main(String[] args) {
        //AND Operator
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F

        System.out.println (true && true);
        System.out.println (true && false);
        System.out.println (false && true);
        System.out.println (false && false);

        //OR Operator
        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F

        System.out.println (true|| true);
        System.out.println (true || false);
        System.out.println (false || true);
        System.out.println (false || false);
    }
}
