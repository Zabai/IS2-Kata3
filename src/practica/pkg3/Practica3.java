package practica.pkg3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) throws FileNotFoundException {
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica 3\\Datos\\emailsfilev1.txt";
        MailReader domains = new MailReader(pathName);
        ArrayList<String> domis = domains.getDomainList();
        
        Histogram<String> sHistogram = DomainHistogramBuilder.execute(domis);
        
        
        HistogramDisplay histo = new HistogramDisplay(sHistogram);
        histo.execute();
    }
}
