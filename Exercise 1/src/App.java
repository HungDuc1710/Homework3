import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Nhập vào một mảng n số nguyên
        // khai báo mảng
        System.out.println("Nhập vào số nguyên dương n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử arr[" + i + "]");
            arr[i] = scanner.nextInt();
        }
        // In ra màn hình mảng vừa nhập
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        // Tìm min/max
        int max = arr[0];
        int min = arr[0];
        System.out.println("\nPhần tử lớn nhất là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("\nPhần tử nhỏ nhất là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];

            }
        }
        System.out.println(min);
        // Tìm và đếm các số chẵn trong mảng
        int dem = 0;
        System.out.println("Số lượng các số chẵn trong mảng là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ;
                dem++;
            }
        }
        System.out.println(dem);
        System.out.println("Các số chẵn đó là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                System.out.print(arr[i] + "\t");
            }

        }
        // Tìm các số nguyên tố có trong mảng
        System.out.println("\nKhông làm được câu tìm các số nguyên tố trong mảng :( ");
        // Sắp xếp mảng theo thứ tự tăng dần
        int tangDan = 0;
        System.out.println("\nMảng được sắp xếp tăng dần là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tangDan = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tangDan;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Sắp xếp mảng thứ tự giảm dần
        int giamDan = 0;
        System.out.println("\nMảng được sắp xếp giảm dần là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    giamDan = arr[j];
                    arr[j] = arr[i];
                    arr[i] = giamDan;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

            scanner.close();
        }
    }
}
