public class Main {
    public static void main(String[] args) {
//        OgretmenKrediManager manager=new OgretmenKrediManager();
//        System.out.println(manager.tutar(100));
//        TarimKrediManager krediManager=new TarimKrediManager();
//        System.out.println(krediManager.tutar(100));

        BaseKrediManager[] baseKrediManagers=new BaseKrediManager[]{new TarimKrediManager(),new OgretmenKrediManager()};
        for (BaseKrediManager krediManager:baseKrediManagers){
            System.out.println(krediManager.tutar(200));
        }

    }
}