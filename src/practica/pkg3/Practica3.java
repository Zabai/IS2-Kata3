package practica.pkg3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practica3 {

    public static void main(String[] args) throws FileNotFoundException {
        Histogram<String> sHistogram = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica 3\\Datos\\emailsfilev1.txt";
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while((mail=fileIn.readLine()) != null){
                if(!mail.contains("@")) continue;
                sHistogram.increment(mail.split("@")[1]);
            }
        }catch(Exception e){
            System.out.println("Fichero no existe. Error: " + e);
        }
        HistogramDisplay histo = new HistogramDisplay(sHistogram);
        histo.execute();
    }
}
