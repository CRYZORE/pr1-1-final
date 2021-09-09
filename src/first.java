import java.util.Scanner;

public class first {
    public static void main(String[] arg) {
        System.out.printf("Введите размер массива: ");
        Scanner intScan=new Scanner(System.in);
        int number = intScan.nextInt();
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.printf("Введите "+(i+1) +" число массива: ");
            arr[i] = intScan.nextInt();
        }
        int Sum = 0;
        for (int i=0; i<arr.length; i++){
            Sum = Sum + arr[i];
        }
        System.out.println(Sum);
        int w=0;
        Sum =0;
        while (w<arr.length){
            Sum=Sum+arr[w];
            w++;
        }
        System.out.println(Sum);
        Sum=0;
        w=0;
        do{
            Sum=Sum+arr[w];
            w++;
        }while(w<arr.length);
        System.out.println(Sum);
    }
}
