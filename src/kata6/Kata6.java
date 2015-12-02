package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata6 {
 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String nameFile = "emails.txt";
        
        System.out.println("Inicio");
        ArrayList<Person> mailList = MailListReader.read(nameFile);
        
        System.out.println("número de mails = " + mailList.size());
        
        HistogramBuilder<Person> builder = new HistogramBuilder(mailList);
        
        Histogram<String> domain = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        new HistogramDisplay<>(domain, "Dominios").execute();
        new HistogramDisplay<>(letters, "Caracter").execute();
        
        System.out.println("Fin");
    }
    
}
