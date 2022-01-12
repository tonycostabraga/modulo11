import java.util.List;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploListComArrayList {

    public static void main(String[] args) {

        int i;
        //Scanner leia = new Scanner(System.in);
        List<Alunos> lista = new ArrayList<>();
        Alunos a = new Alunos("Antonio","M");
        Alunos b = new Alunos("Maria", "F");
        Alunos c = new Alunos("Joana", "F");
        Alunos d = new Alunos("Francisco", "M");
        Alunos e = new Alunos("José", "M");

            lista.add(a);
            lista.add(b);
            lista.add(c);
            lista.add(d);
            lista.add(e);
            Collections.sort(lista);
            System.out.println(" Relação de nomes é:" + lista);
        }
    }
