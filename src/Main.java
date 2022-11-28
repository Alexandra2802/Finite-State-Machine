import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    void showMenu(){
        System.out.println("Meniu");
        System.out.println("a.Automatul pentru identificatori");
        System.out.println("b.Automatul pentru constante numerice");
        System.out.println("1.Arata alfabetul");
        System.out.println("2.Arata starile");
        System.out.println("3.Arata tranzitiile");
        System.out.println("4.Arata starile finale");
        System.out.println("5.Verifica acceptarea unei secvente");
        System.out.println("5.Verifica acceptarea unei secvente");
        System.out.println("6.Arata starea urmatoare");
        System.out.println("x.Iesire");
    }

    void runMenu(){
        Scanner scanner = new Scanner(System.in);
        String option="";
        while(!Objects.equals(option, "x")){
            showMenu();
            String filename="";
            option=scanner.nextLine();
            if(option=="a")
                filename="src/identifierConfig";
            else filename="src/numericalConstantConfig";
        }
    }

    public static void main(String[] args) {
        ConfigParser idConfigParser=new ConfigParser();
        idConfigParser.parse("src/identifierConfig");
        idConfigParser.alphabet.forEach(System.out::println);
        idConfigParser.transitions.forEach(t-> System.out.println(t.fromState+" "+t.toState+" "+t.element));
        idConfigParser.states.forEach(s-> System.out.println(s.stateType+" "+s.name));
    }

}
