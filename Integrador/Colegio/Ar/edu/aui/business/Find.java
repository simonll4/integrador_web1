package Integrador.Colegio.Ar.edu.aui.business;

import java.util.ArrayList;
import java.util.List;

import Integrador.Colegio.Ar.edu.aui.model.Person;
import Integrador.Colegio.Ar.edu.aui.persist.DataBase;

public class Find {

    public List<Object> exec(String terms){

        if (terms == null) {
            return null;
        }

        if (terms.trim().length() == 0) { //empty
            return null;
        }

        List<Object> results = new ArrayList<Object>();

        String[] termsArray = terms.split(" ");

        // Persona

        for(Person item : DataBase.people){
            for(String term : termsArray){

                
                String traslateTerm = "";

                for(char c : term.toCharArray()){
                    if (c == 'ó') {
                        traslateTerm += 'o';
                    } else if (c == 'ó') {
                        traslateTerm += 'o';
                    }
                }

                if(item.getName().equals(term.trim())){
                    results.add(item);
                }

                if(item.getEmail().equals(term.trim())){
                    results.add(item);
                }

                if(item.getDatebirth().toString().equals(term.trim())){
                    results.add(item);
                }

                if(item.getBloobType().toString().equals(term.trim())){
                    results.add(item);
                }

            }
            

        }

        // ...

        return results;

    }

    
}
