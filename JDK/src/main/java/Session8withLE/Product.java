package Session8withLE;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    private String productName;
    private Integer pid;
    private String description;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", pid=" + pid +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return pid == product.pid && Objects.equals(productName, product.productName) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, pid, description);
    }

    public Product(String productName, int pid, String description) {
        this.productName = productName;
        this.pid = pid;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
