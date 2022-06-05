public class Product {
    private float price,tax;
    private String title,category,description ;
    
    public Product(){
    }
    
    public Product(float price,float tax,String title,String category,String description){
        this.price = price;
        this.tax = tax;
        this.title = title;
        this.category = category;
        this.description = description;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        float extra = price*tax;
        return price+extra;   
    }
    public void setTax(float tax){
        this.tax = tax;
    }
    public float getTax(){
        return tax;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
