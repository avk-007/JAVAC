package Inheritance;

public class kidsCalc extends CalccBasic {
    public static void main(String[] args) {
        scienticCalc calcc=new scienticCalc();
        int i = calcc.addDigits(2, 4);
        int ii = calcc.addDigits(2, 9,3);
        int iii = calcc.sub(2, 9,3);
        int mul=calcc.multi(2,5);
        int div=calcc.div(2,5);
        double power=calcc.power(3,5);
        System.out.println(i );
        System.out.println(ii);
        System.out.println(iii);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(power );



    }
}
