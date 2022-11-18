public class Musteri {
    private MarkaUrun markaUrun;

    public Musteri(MarkaUrun markaUrun) {
        this.markaUrun = markaUrun;
    }
    public void alimGucu(int para){
        System.out.println("max para : "+para);
        this.markaUrun.price(189);

    }
}
