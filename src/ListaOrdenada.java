import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada {

    public static void main(String[] args) {


       List<String> lista = new ArrayList<String>();

            lista.add("Julio");
            lista.add("Sabrina");
            lista.add("Antonio");
            lista.add("Fabricio");

            System.out.println("******* RELAÇÃO DOS NOMES ******");
            System.out.println(lista);

        System.out.println("******* RELAÇÃO DOS NOMES ORDENADOS ******");
        Collections.sort(lista);
        System.out.println(lista);

    }
}

