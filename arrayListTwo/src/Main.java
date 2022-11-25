import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groups= new ArrayList<>();
        groups.add("metallica");
        groups.add("arabica");
        groups.add("stabucks");
        groups.add("zara");
// for each döngüsü ile dönecek
        for(String gruplar: groups){
            System.out.println("gruplar döndürüldü : " + gruplar);

        }
    }
}

//  for (int i =0 ;i< groups.size();i++){
//    System.out.println(" döngü başlatıldı : "+groups.get(i));


// }

// System.out.println(" döngü başlatıldı : "+groups.get(0));