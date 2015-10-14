package practica.pkg3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) throws FileNotFoundException {
        Histogram<String> sHistogram = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica 3\\Datos\\emailsfilev1.txt";
        MailReader domains = new MailReader(pathName);
        ArrayList<String> domis = domains.getDomainList();
        for (int i = 0; i < domis.size(); i++) {
            sHistogram.increment(domis.get(i));
        }
        
        HistogramDisplay histo = new HistogramDisplay(sHistogram);
        histo.execute();
    }
}
