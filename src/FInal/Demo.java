package FInal;

import AccessModifierss.A;

class Calc
        {

            public void show(){
                System.out.println("in calc show");
            }

            public void add(){
                int num=7;
                System.out.println(num);
            }
        }
        class AdvanceCalc extends Calc{
            public void show(){
                System.out.println("By JOhn");
            }

            public  void add(){
                int num=7;
                System.out.println(num);
            }
        }

public class Demo {
    public static void main(String[] args) {
      AdvanceCalc calc=new AdvanceCalc();
      calc.show();
      calc.add();
    }
}
