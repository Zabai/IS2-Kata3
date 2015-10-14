package practica.pkg3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MailReader {
    
    private final String pathName;

    public MailReader(String name) {
        this.pathName = name;
    }
    
    public ArrayList<String> getDomainList(){
        ArrayList<String> domainList = new ArrayList();
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while((mail=fileIn.readLine()) != null){
                if(!mail.contains("@")) continue;
                domainList.add(mail.split("@")[1]);
            }
        }catch(Exception e){
            System.out.println("Fichero no existe. Error: " + e);
        }
        return domainList;
    }
}
