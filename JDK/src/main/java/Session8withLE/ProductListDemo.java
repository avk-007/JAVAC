package Session8withLE;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductListDemo {

    static void main() {
            List<Product> listproduct=new ArrayList<Product>();

       Product pro=new Product();
            pro.setPid(1);
            pro.setProductName("pen");
            pro.setDescription("sttaionary");

        Product pro2=new Product();
        pro2.setPid(2);
        pro2.setProductName("bike");
        pro2.setDescription("drive");

        Product pro3=new Product();
        pro3.setPid(3);
        pro3.setProductName("plane");
        pro3.setDescription("fly");

        Product pro4=new Product();
        pro4.setPid(4);
        pro4.setProductName("aeroplane");
        pro4.setDescription("flying");

        //sort

       listproduct.add(pro);
       listproduct.add(pro2);
       listproduct.add(pro3);
       listproduct.add(pro4);

      //  Collections.sort(listproduct, (p1,p2)->(p1.getProductName().compareTo(p2.getProductName())));
        Collections.sort(listproduct, Comparator.comparingInt(Product::getPid));
        System.out.println("collection sort"+":"+listproduct);

        }

    }
