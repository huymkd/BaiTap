package BaiTap;
import java.util.Scanner;
public class Cau3_DoWhite {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n, i=1;
        int KetQua=1;
        System.out.println("Nhap so nguyen n");
        n= scanner.nextInt();
        do{
            i++;
            KetQua= KetQua *i;
        }while (i<=n); System.out.println("Giai thua n = "+KetQua);
    }
}
