package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest{

    @Test
    public void meanTest1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String line = null;
        LinkedList<Double> lk = new LinkedList<Double>();
        while ((line = br.readLine()) != null) {
            lk.add(Double.parseDouble(line));
        }
        Double value = App.mean(lk);
        assertEquals(String.format(Locale.US, "%.2f", value),"550.60");
    }

    @Test
    public void meanTest2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String line = null;
        LinkedList<Double> lk = new LinkedList<Double>();
        while ((line = br.readLine()) != null) {
            lk.add(Double.parseDouble(line));
        }
        Double value = App.mean(lk);
        assertEquals(String.format(Locale.US, "%.2f", value),"550.60");
    }

    @Test
    public void standardDeviationTest() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String line = null;
        LinkedList<Double> lk = new LinkedList<Double>();
        while((line = br.readLine()) != null){
            lk.add(Double.parseDouble(line));
        }
        Double value = App.standardDeviation(lk);
        assertEquals(String.format(Locale.US, "%.2f", value),"572.03");
    }


    
}
