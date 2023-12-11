import java.util.Scanner;

public class nna {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" masukkan angka");
    int angka = input.nextInt();

    if (angka % 3 ==0  && angka % 5 ==0){
        System.out.println("duarr");
    }
    else if (angka % 3 ==0){
        System.out.println("");
    }
    else if (angka % 5 ==0){
        System.out.println("duarr");
    }
}
}

