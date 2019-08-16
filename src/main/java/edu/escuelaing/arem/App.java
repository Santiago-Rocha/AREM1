package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/** 
 * @author Santiago Rocha 
*/

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
        String line = null;
        LinkedList<Double> linkedList = new LinkedList<Double>();
        while((line = bufferedReader.readLine()) != null){
            linkedList.add(Double.parseDouble(line));
        }
        System.out.printf(Locale.US,"%.2f\n",mean(linkedList));
        System.out.printf(Locale.US,"%.2f\n",standardDeviation(linkedList));
    }

    /**
     * Metodo que calcula la media de los numeros en una lista encadenada
     * @param linkedList lista de numeros 
     * @return la media de los numeros en la lista 
     */
    public static double mean(LinkedList<Double> linkedList){
        Node<Double> pointer = linkedList.getFirst();
        double mean = 0;
        while (pointer != null) {
            mean+= pointer.geData();
            pointer = pointer.nextNode();
        }
        return mean/linkedList.getSize();
    }

    /**
     * Metodo que calcula la desviacion estandar de los numeros en una lista encadenada
     * @param linkedList lista de numeros
     * @return la desviacion estandar de los numeros en la lista 
     */
    public static double standardDeviation(LinkedList<Double> linkedList){
        double mean =  mean(linkedList);
        Node<Double> pointer = linkedList.getFirst();
        double stdDev = 0;
        while (pointer != null) {
            stdDev+= Math.pow(pointer.geData() - mean,2);
            pointer = pointer.nextNode();
        }
        return Math.sqrt(stdDev/(linkedList.getSize()-1));
    }
}
