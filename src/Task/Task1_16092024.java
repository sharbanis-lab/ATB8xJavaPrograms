package Task;

public class Task1_16092024 {
    public static void main(String[] args) {

        // 1. Difference between = and  ==
            // '=' is assignment operator -> assigns RHS value to LHS variable
            // '==' is a relational operator for equal to

        // 2. byte b = 10; long l = 10l; → How much Byte will be used.
            //for variable b -> 1 byte and for variable l 8 bytes-> so total  9 bytes

        //3. Another byte b = 10; byte e = 10;  What is the answer if the perform b+c,
          byte b=10;
          int e = 10;
          int ans = b+e;
          System.out.printf("Addition of %d+%d=%d",b,e,ans);
                  System.out.println ();
        // What is the data type it will give in result.
            //The output would be int -> vas both operands are byte be 4 bytes

        short s = 10;

        char c = 'A'; //65

        int ss = s+c;
        System.out.printf("Addition of 's(10)+c(A)'- %d+%c=%d",s,c,ss);
        System.out.println ();
        //System.out.println(ss); //output is 75-> ASCII value of A = 65 hnece s+c=65+10=75
    }
}
