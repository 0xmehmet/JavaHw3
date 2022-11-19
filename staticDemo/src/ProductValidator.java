public class ProductValidator {
    static {
        System.out.println("static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println(" public yapıcı çalıştırıldı");
    }
    public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
