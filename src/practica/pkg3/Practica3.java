package practica.pkg3;

public class Practica3 {

    public static void main(String[] args) {
        Histogram<String> sHistogram = new Histogram<>();
        sHistogram.increment("gmail.com");
        sHistogram.increment("gmail.com");
        sHistogram.increment("gmail.com");
        sHistogram.increment("gmail.com");
        
        sHistogram.increment("ulpgc.es");
        sHistogram.increment("ulpgc.es");
        sHistogram.increment("ulpgc.es");
        sHistogram.increment("ulpgc.es");

        sHistogram.increment("hotmail.com");
        sHistogram.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(sHistogram);
        histo.execute();
    }
}
