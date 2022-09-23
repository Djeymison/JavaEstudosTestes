package AulasSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

public class AulaSet1 {
    public static void main(String[] args) {
      /*System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5,0 esta na lista: " + notas.contains(5d));

        System.out.println("imprima a menor nota: " + Collections.min(notas));
        System.out.println("imprima a maior nota: " + Collections.max(notas));

        System.out.println("Exiba as somas das notas: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0d: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba na lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next <7 ) iterator1.remove();
        
        } System.out.println(notas);*/

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7D);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //Esse deu erro por conta da importação do Treeset
      /*   System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);*/

        /*System.out.println("Apague todo o conjunto: ");
        notas2.clear();
        System.out.println(notas2);*/
        
        System.out.println("Confira se a lista esta vazia: " + notas2.isEmpty());
        
    }
}
