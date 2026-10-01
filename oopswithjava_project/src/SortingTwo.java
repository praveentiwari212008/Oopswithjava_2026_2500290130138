 import java.util.*;

class Product {
    int productId;
    String productName;
    int productprice;
    Product(int id ,String name,int p){
        productId=id;
        productName=name;
        productprice=p;
    }
     
     @Override
    public String toString() {
        // TODO Auto-generated method stub
        return productName + "  " + productprice;
    }
 }
 class CustomProductComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1,Product o2) {
        // TODO Auto-generated method stub
        if(o1.productprice==o2.productprice){
            return o1.productName.compareTo(o2.productName);
        }
        return o2.productprice-o1.productprice;
    }
 }
 public class SortingTwo {
    public static void main(String[] args){
        ArrayList< Product> st  = new ArrayList<>();
         st.add(new Product(1,"praveen",15));
         st.add(new Product(2,"Rahul",16));
         st.add(new Product(3,"jay",17));
         st.add(new Product(4,"abhi",15));
         st.sort(new  CustomProductComparator());
        for(Product p : st) {
    System.out.println(p);
}

    }
}