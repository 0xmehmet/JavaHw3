public class Main {
    public static void main(String[] args) {
    Trendyol trendyol=new Trendyol();
    trendyol.price(156);
    HepsiBurada hepsiBurada = new HepsiBurada();
    hepsiBurada.price(456);

    Musteri musteri = new Musteri(new HepsiBurada());
    musteri.alimGucu(156);
    }
}