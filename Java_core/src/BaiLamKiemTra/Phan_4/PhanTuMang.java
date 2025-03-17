package BaiLamKiemTra.Phan_4;

import java.util.*;

public class PhanTuMang {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang");
        int n = scanner.nextInt();
        //nhap phan tu
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) + ": " );
            arr.add(scanner.nextInt());
        }

        int max = Collections.max(arr);
        int min = Collections.min(arr);
        System.out.println("Gia tri lon nhat: "+max);
        System.out.println("Gia tri nho nhat: "+min);


        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        System.out.println("Tong cac phan tu: "+sum);

        System.out.println("Nhap vao vi tri muon them phan tu tu 0 -> "+arr.size()+ "):");
        int viTri = scanner.nextInt();
        System.out.println("Nhap gia tri muon them vao: ");
        int giaTri = scanner.nextInt();
        arr.ensureCapacity(arr.size()*2);
        arr.add(viTri, giaTri);
        System.out.println("Mang sau khi them: "+arr);

        System.out.println("Nhap gia tri muon xoa: ");
        int xoaGiaTri = scanner.nextInt();
        arr.removeIf(num -> num == xoaGiaTri);
        System.out.println("Mang sau khi xoa gia tri " +arr);

    }
}
