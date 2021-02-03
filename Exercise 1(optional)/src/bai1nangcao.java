import java.util.Scanner;

public class bai1nangcao {
    public static void main(String[] args) throws Exception {
        // Nhập vào màn hình số nguyên dương "n"
        // sau đó nhập vào n phần tử
        System.out.println("Nhập vào màn hình số nguyên dương n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[];
        arr = new int[n];

        // In ra màn hình mảng đó
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử arr[" + i + "]");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Phần tử mảng vừa nhập là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Sắp xếp các mảng theo thứ tự giảm dần
        int giamDan = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    giamDan = arr[j];
                    arr[j] = arr[i];
                    arr[i] = giamDan;
                }
                ;
            }
        }
        System.out.println("\nCác mảng được sắp xếp theo thứ tự giảm dần:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+"\t");
        }
        // Tìm phần tử lớn nhất và lớn thứ 2
        int thuNhat = 0;
        int thuHai = 0;
        System.out.println("\nPhần tử lớn nhất là");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i]; j++) {
                if (thuNhat < arr[i] && thuHai < arr[j]) {
                    thuNhat = arr[i];
                    thuHai = arr[j];
                }

            }
            
        }System.out.println(thuNhat);
        System.out.println("\nPhần tử lớn thứ hai là");
        System.out.println(thuHai);
    }

    

}
