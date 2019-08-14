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
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line = null;
        LinkedList lk =  new LinkedList();
        while((line = br.readLine()) != null){
            lk.add(Integer.parseInt(line));
        }
        System.out.printf(Locale.US,"%.2f\n",mean(lk));
        System.out.printf(Locale.US,"%.2f\n",standardDeviation(lk));
        
    }

    /**
     * Metodo que calcula la media de los numeros en una lista encadenada
     * @param lk lista de numeros 
     * @return la media de los numeros en la lista 
     */
    public static double mean(LinkedList lk){
        Node pointer = lk.getFirst();
        double m = 0;
        while (pointer != null) {
            m+= pointer.geData();
            pointer = pointer.nextNode();
        }
        return m/lk.getSize();
    }

    /**
     * Metodo que calcula la desviacion estandar de los numeros en una lista encadenada
     * @param lk lista de numeros
     * @return la desviacion estandar de los numeros en la lista 
     */
    public static double standardDeviation(LinkedList lk){
        double mean =  mean(lk);
        Node pointer = lk.getFirst();
        double sd = 0;
        while (pointer != null) {
            sd+= Math.pow(pointer.geData() - mean,2);
            pointer = pointer.nextNode();
        }
        return Math.sqrt(sd/(lk.getSize()-1));
    }
}
