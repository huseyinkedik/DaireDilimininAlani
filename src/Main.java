import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {

        //değişkenleri tanımlıyoruz
        double r, 𝛼, pi=3.14, alan;

        //Scanner tanımlıyoruz
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan yarıçapı girmesini istiyoruz
        System.out.print("Yarıçapı giriniz: ");
        r = input.nextInt();

        //Kullanıcıdan merkez açısını girmesini istiyoruz
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        𝛼 = input.nextInt();

        //Daire Diliminin Alan hesaplamasını yapıp, ekrana yazdırıyoruz
        alan = (pi * (r * r) * 𝛼 ) / 360;
        System.out.print("Alan: " + alan);



    }
}
