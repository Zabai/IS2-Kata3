package practica.pkg3;

import java.util.ArrayList;

public class DomainHistogramBuilder {
    
    public static <T> Histogram<String> execute(ArrayList<String> domains){
        Histogram<String> histogram = new Histogram<>();
        for (int i = 0; i < domains.size(); i++) {
            histogram.increment(domains.get(i));
        }
        return histogram;
    }
}
