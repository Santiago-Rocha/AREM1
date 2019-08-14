package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Hello world!
 *
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

    public static double mean(LinkedList lk){
        Node pointer = lk.getFirst();
        double m = 0;
        while (pointer != null) {
            m+= pointer.geData();
            pointer = pointer.nextNode();
        }
        return m/lk.getSize();
    }

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
