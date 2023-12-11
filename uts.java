import java.util.LinkedList;
import java.util.Queue;

public class uts {

    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        
        antrian.add("bunga melati");
        antrian.add("bunga mawar");
        antrian.add("bunga teratai");
        antrian.add("bunga matahari");

        System.out.println(antrian.offer("cantik"));
        System.out.println(antrian.remove("bunga mawar"));
        System.out.println(antrian.remove("bunga teratai"));
        System.out.println(antrian.offer("semua bunga"));
        System.out.println(antrian.add("pokoknya semua bunga cantik"));
        System.out.println(antrian.peek());
        System.out.println(antrian);
    }
}
