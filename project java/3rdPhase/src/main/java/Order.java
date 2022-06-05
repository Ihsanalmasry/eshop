import java.util.ArrayList;
public class Order {
    private ArrayList<ProductInOrder>products = new ArrayList<ProductInOrder>();
    
    public void setProducts(ProductInOrder x){
        products.add(x);
    }
    public ArrayList getProducts(){
        return products;
    }
    public float getTotalPrice2(){
        float finalPrice = 0;
        for(int i=0;i<products.size();i++){
            finalPrice+= products.get(i).getTotalPrice1();
        }
        return finalPrice;
    }
}



