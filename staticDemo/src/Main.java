public class Main {
    public static void main(String[] args) {

        Product product=new Product();
        product.name= " ";
        product.price= 0;
        ProductManager productManager=new ProductManager();
        productManager.add(product);

        DatabaseHelper.crud.Delete();
        DatabaseHelper.crud.Update();
        DatabaseHelper.Connection.createConnection();
    }
}