import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Memur Bilgisi");
        Officer officer=new Officer("mehmet ","kara",154,6);
        officer.listele();

        System.out.println("-----------------------------------------------------------");
        System.out.println(" İşçi Bilgisi");
        Employee employee=new Employee("0xmehemt","kral",456,54);
        employee.goster();

        System.out.println("----------------------listeleme operasyonları------------------");

        ArrayList<String> workers=new ArrayList<>();
        workers.add("İşçiler muazzam derecede iyi çalışanlardır");
        workers.add("Memurlar muazzam derecede iyi çalışanlardır");

        for (String a:workers){
           System.out.println(" Yorum :  "+a);
       }
    }
}