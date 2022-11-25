import java.util.Scanner;

public class Main {
    public static void mean(int[] arr ){
        int total = 0;
        for (int i=0;i<arr.length;i++){
            total +=arr[i];
        }
        System.out.println("ortalama : "+total/ arr.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr2= new int[4];
        System.out.println("arr2 değeri giriniz : ");
        for (int i =0 ; i< arr2.length;i++){
            arr2[i]=scanner.nextInt();
        }
        mean(arr2);


//        System.out.println("arr2 değeri : ");
//        for (int i=0;i<arr2.length;i++){
//            System.out.println("array saydırıldı : "+arr2[i]);
//
//     }



//
//     for (int i=0;i<arr.length;i++){
//         System.out.println("array saydırıldı : "+arr[i]);
//
//     }


    }
}
//        String[] makale= new String[4];
//        makale[0]="0";
//        makale[1]="1";
//        makale[2]="2123";
//        makale[3]="566";
//
//        for (int i=0;i< makale.length;i++){
//            System.out.println("makale dizisindekiler sayıldı " + makale[i]);
//
//        }

