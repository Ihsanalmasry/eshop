public class ProductInOrder {
    private Product product;
    private int quantity;
    
    public ProductInOrder(Product product,int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public void setProduct(Product x){
        product = x;
    }
    public Product getProduct(){
        return product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public float getTotalPrice1(){
        return getQuantity()*product.getPrice();
    }
}
