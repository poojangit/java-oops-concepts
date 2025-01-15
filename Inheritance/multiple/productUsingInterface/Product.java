package multiple.productUsingInterface;

public class Product implements Laptop, Mobile{

    @Override
    public void m1() {
       System.out.println("Im implenting class");
    }
    
}
