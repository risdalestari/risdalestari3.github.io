import java.util.LinkedList;
import java.util.Queue;

public class zulfiuts {
  public static void main(String[] args) { 
    
        Queue<String> antrian = new LinkedList<>();

        antrian.add("bakso ");
        antrian.add("nasi goreng");
        antrian.add("ayam goreng");
        antrian.add("ayam bakar");
        antrian.add("ikan bakar");
        antrian.add("gado-gado");
        antrian.add("mie ayam");

        System.out.println(antrian.remove("ayam bakar"));
        System.out.println(antrian.add( "semua makanan enak"));
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian);

    }
    
}
