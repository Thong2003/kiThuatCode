package GIAI;

import java.io.IOException;
import java.util.Scanner;

public class KiThuatLapTrinh {

    public static void check_ki_tu() throws IOException {

        char ki2;

        System.out.println("nhập vao kí tự : ");

        char kitu;

        // cứ dùng nhập chỗ nào xóa chỗ đó ( nếu ko xóa chõ này thì thì trong while câu
        // read nó sẽ đọc 2 kí tự dư thứa , chứ ko nhập đc )

        System.out.println(" nhap vao ki tu chu cai : ");

        ki2 = (char) System.in.read();

        do {

            kitu = (char) System.in.read();

        } while (kitu != '\n');

        while (((int) ki2 < 65 || (int) ki2 > 122 || (int) ki2 > 90 && (int) ki2 < 97)) {

            System.out.println(" nhap sai vui long nhap lai : ");

            ki2 = (char) System.in.read();

            // lấy lùi và xuống ra khỏi vùng đệm consol
            do {

                kitu = (char) System.in.read();

            } while (kitu != '\n');
        }

        if (ki2 > 65 && ki2 < 90) {

            System.out.println(" kí tự nhập vào là in hoa : " + ki2);

            ki2 = (char) (ki2 + 32);
            System.out.println(" sau khi biến thành chữ thường : " + ki2);

        }

        else {

            System.out.println(" kí tự nhập vào là chữ thường  : " + ki2);

            ki2 = (char) (ki2 - 32);

            System.out.println(" sau khi biến thành chữ hoa : " + ki2);
        }
    }

    public static void bai1(int n) {

        for (int i = 1; i <= n; i++) {

            System.out.println(i);

        }
    }

    public static void bai2(int n) {
        for (int i = 1; i <= n; i += 2) {

            System.out.println(i);

        }
    }

    public static void bai3(int n) {

        // cách 1 :

        // loop1: for (int i = 0; i <= n; i += 2) {
        // if (i % 4 == 0)
        // System.out.println(-i);
        // else {
        // System.out.println(i);
        // }
        // cách 2 :
        int dem = 0;

        loop2: for (int j = 2; j <= n; j += 2) {
            if (++dem == 2) {// tóm gọn : dem++ ; // if (dem == 2 )
                System.out.print(-j + " ");
                dem = 0;
            } else
                System.out.print(j + " ");

        }
    }

    public static void bai4(int n) {
        // cách 1 :

        for (int i = 2, dem = 0; i <= n; i += 2) {

            if (++dem == 3) {
                dem = 0;
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        // cách 2 :

        for (int i = 2; i <= n; i += 2) {
            if (i % 3 == 0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }

    }

    // bài 5 ;
    public static void bai5(int n) {

        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    public static void bai6(int n) {

        int dem = 0;

        int lượng_in = 2;

        for (int i = 2; i <= n; i += 2) {

            if (++dem == lượng_in) {

                lượng_in++;

                dem = 0;
                System.out.print(-i + " ");

            } else {

                System.out.print(i + " ");
            }

        }

    }
    // in số lượng fibo theo n

    public static void bai7(int n) {

        int f1 = 1, f2 = 1, f = 0;

        System.out.print(f1 + " " + f2 + " ");

        for (int i = 3; i <= n; i++) {

            // f là giá trị fibo
            // i ms là fibo

            f = f2 + f1;

            f1 = f2;

            f2 = f;

            System.out.print(f + " ");

        }

    }

    public static void bai8(int n) {

        int sotruoc = 1, sosau = 0;

        System.out.print(sotruoc + " ");
        for (int i = 1; i <= n; i++) {

            sosau = sotruoc + (int) Math.pow(2, i);

            sotruoc = sosau;

            System.out.print(sosau + " ");
        }

    }

    public static void bai9(int n) {

        int sotruoc = 1, sosau = 0;

        System.out.print(sotruoc + " ");
        for (int index = 1; index <= n; index++) {

            if (index % 2 == 1) {
                sosau = sotruoc + (int) Math.pow(2, index);

                sotruoc = sosau;
                System.out.print(-sosau + " ");

            } else {

                sosau = sotruoc + (int) Math.pow(2, index);

                sotruoc = sosau;
                System.out.print(sosau + " ");
            }

        }

    }

    public static void bai10(int n) {

        int tong = 0, lưu = 0, lưu_n = n;

        while (n > 0) {
            lưu = n % 10;

            tong = tong + lưu;

            n = n / 10;

        }
        System.out.print("tong cac con so của " + lưu_n + " là : " + tong);
    }

    public static void bai11(int a, int b) {

        int value = 1;

        int save = 1;

        if (a >= b) {

            while (value <= b) {

                if ((a % value == 0) && (b % value == 0))
                    save = value;
                value++;
            }
            System.out.println(" ước chung lớn nhất của " + a + " và " + b + " là " + save);
        }

        else {

            while (value <= a) {

                if ((a % value == 0) && (b % value == 0))
                    save = value;
                value++;
            }
            System.out.println(" ước chung lớn nhất của " + a + " và " + b + " là " + save);
        }

    }

    public static void bai11_b(int a, int b) {

        int save = 1;
        int value = 0;
        if (a >= b) {
            value = a;
            loop1: while (value >= a) {

                if ((value % a == 0) && (value % b == 0)) {
                    save = value;
                    System.out.println(" giá trị bội chung bé nhất là : " + value);
                    break loop1;
                }
                value++;
            }
        } else {
            value = b;
            loop1: while (value >= b) {

                if ((value % a == 0) && (value % b == 0)) {
                    save = value;
                    System.out.println(" giá trị bội chung bé nhất là : " + value);
                    break loop1;
                }
                value++;
            }

        }

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // System.out.println("hãy nhập vào 1 con số chẵn : ");
        // int a = sc.nextInt();
        // // yêu cầu nhập số chẵn :

        // while (a % 2 == 1) {

        // System.out.println(" vui lòng nhập laị số chẵn : ");

        // a = sc.nextInt();

        // }
        bai11_b(15, 25);

    }

}
