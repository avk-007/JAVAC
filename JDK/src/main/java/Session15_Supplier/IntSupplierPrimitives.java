package Session15_Supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class IntSupplierPrimitives {
    public static void main(String[] args) {
        //ex1 with IntSupplier method is getAsInt

        IntSupplier s=()->(int)(Math.random()*10);
        String opt="";
        for (int i=0;i<6;i++){
            opt=opt+s.getAsInt();
        }


    }
}
