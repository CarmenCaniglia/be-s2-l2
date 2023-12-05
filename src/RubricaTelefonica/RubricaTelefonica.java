package RubricaTelefonica;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica;

    public RubricaTelefonica(){
        rubrica = new HashMap<>();
    }

    public void addContact (String name, String number){
        rubrica.put(name, number);
    }

    public void deleteContact (String name){
        rubrica.remove(name);
    }

    public String searchNumber (String name){
        return rubrica.get(name);
    }

    public String searchName (String number){
        for(Map.Entry<String, String> entry : rubrica.entrySet()){
           if (entry.getValue().equals(number)){
               return  entry.getKey();
           }
        }
        return "not found";
    }

    public void stampContacts(){
        for(Map.Entry<String,String> entry: rubrica.entrySet()){
            System.out.println("Nome: "+ entry.getKey() + ", Numero: " + entry.getValue());
        }
    }

}
