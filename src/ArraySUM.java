import java.util.Scanner;

public class ArraySUM {

    public static void main(String[] args) {
        //Правя си сканер за запазване на
        // размера на масивите
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size : ");
        size = sc.nextInt();
        int[] A = new int[size];
        //int A ми е първия масив
        int[] B = new int[size];
        //int B е втория масив
        int[] SUM = new int[size];
        //int SUM е масива сбор от предишните два

        for(int i = 0; i < A.length; i++) {
            //Използвам функция за въвеждане на
            //случайни стойности с размер до 10
            //и така запълвам масивите A и B
            A[i] = (int)(Math.random() * 10);
            B[i] = (int)(Math.random() * 10);
            //При всяко запълване на първите масиви
            //запълвам SUM със сбора им
            SUM[i] = A[i] + B[i];
            //Накрая изписвам случайните числа
            //заедно с техния сбор
            System.out.print(A[i] + " + " + B[i] + " = "
                    + SUM[i] + "\n");
        }
    }
}
