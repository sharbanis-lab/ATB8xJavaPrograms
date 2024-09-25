package Sept.ex_16092024;

public class Lab037_Compund_Assignment_Operator {
    public static void main(String[] args) {
        //Compund Assignment Operator

        //+=, -=, *=, /=

        int a = 10;
        a+=10;  //a=a+10
        System.out.printf("Compound Operator 1 is 'a=+' %d",a);
        System.out.println();

        int b =20;
        b-=10;  //b=b-10
        System.out.printf("Compound Operator 2 is 'b-=' %d",b);
        System.out.println();

        int c =20;
        c*=10; //c=c*20
        System.out.printf("Compound Operator 3 is 'c*=' %d",c);
        System.out.println();

        int d =20;
        d/=10; //d=d/2
        System.out.printf("Compound Operator 4 is 'd/=' %d",d);
        System.out.println();
    }
}
