package Sept.ex_16092024;

public class Lab035_String_Concatenation_Operator2 {
    public static void main(String[] args) {
        // '+' when used with String than it is a concatenation operator
        String first_name = "Sharbani";
        String last_name = "Patil";
        System.out.println(first_name + last_name);

        // '+' when used with int than it is Arithmetic operator
        int a = 10;
        int b = 10;
        System.out.println(a + b);

        // If first variable in string than '+' operator will perform concatenation
        System.out.println(first_name + last_name + a + b); //only concatenation done
        System.out.println(first_name + last_name + (a + b)); //Concatenation+Arithematic

        // If first variable in int than '+' operator will perform Arithmetic first and than concatenation
        System.out.println(a + b + first_name + last_name);
    }

}