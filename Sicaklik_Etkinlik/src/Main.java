import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int heat ;

        System.out.print(" Sıcaklık değerini giriniz : ");
        heat=scan.nextInt();

        if(heat<5){
            System.out.println(" Sobanın başında çay için. ");
        } else if (heat>=5&& heat<15) {
            System.out.println(" Sahilde koşu yap.");

        } else if (heat>=15&&heat<25) {
            System.out.println(" Arkadaşlarınla buluş.");
        }else{
            System.out.println(" Denize atla. ");
        }
    }
}