
package AulasMaps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.sound.midi.Soundbank;

public class AulasMaps1 {
    
    public static void main(String[] args) {
    
        System.out.println("Crei um dicionário que relacione os respectivos consumos: ");
        Map<String, Double> CarrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.4);
            put("HB20", 14.5);
            put("Kwid", 16.4);
        }};
        System.out.println(CarrosPopulares.toString());

        /*System.out.println("Substitua o consumo do Gol por 15.2km/l: ");
        CarrosPopulares.put("Gol", 15.2);
        System.out.println(CarrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + CarrosPopulares.containsKey("Tucson"));
        System.out.println("Exiba o consumo do Uno: " + CarrosPopulares.get("Uno"));

        System.out.println("Exiba o modelos dos carros: ");
        Set<String> modelos= CarrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumo= CarrosPopulares.values();
        System.out.println(consumo);*/

        /*System.out.println("Exiba o modelo mais eficiente: ");

        Double consumoMaisEficiente = Collections.max(CarrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = CarrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
            }
                    modeloMaisEficiente = entry.getKey();
        }
        
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + 
        consumoMaisEficiente);
       
        //Imprime mais de um modelode acordo com a quantidade de KM/l
        for(Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + 
        consumoMaisEficiente);
            }        
        

        System.out.println("Exiba o modelo menos economico: ");
        Double consumoMenosEficiente = Collections.min(CarrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: CarrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + 
                consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = CarrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média de consumo entre as unidades: " + 
        (soma/CarrosPopulares.size()));}*/

        System.out.println("Remova os modelos com consumo igual a 15.6km/l: ");
        Iterator<Double> iterator1 = CarrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(CarrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> CarrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.4);
            put("HB20", 14.5);
            put("Kwid", 16.4);
        }};
        System.out.println(CarrosPopulares1.toString());

    //Alinhar em ordem alfabetica;
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(CarrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        CarrosPopulares.clear();
        System.out.println("A lista de CarrosPopulares esta vazia: " + CarrosPopulares.isEmpty());;
        System.out.println(CarrosPopulares);
// Final das primeiras chaves.
    }
}
