package Integrador.Colegio.Ar.edu.aui.business;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.text.Normalizer;

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

                /*
                String traslateTerm = "";
                for(char c : term.toCharArray()){
                    if (c == 'ó') {
                        traslateTerm += 'o';
                    } else if (c == 'ó') {
                        traslateTerm += 'o';
                    }
                }*/

                term = term.toLowerCase();
                term = Normalizer.normalize(term, Normalizer.Form.NFD);
                term = term.replaceAll("[^\\p{ASCII}]", "");

                if(item.getID().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getName().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getLastname().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getEmail().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getPhone().equals(term.trim())){
                    results.add(item);
                }

                if(item.getResidence().toString().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getDatebirth().toString().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getBloobType().toString().toLowerCase().equals(term.trim())){
                    results.add(item);
                }

                if(item.getNationality().toString().toLowerCase().equals(term.trim())){
                    results.add(term);
                }

                if(item.getEmisorID().toString().toLowerCase().equals(term.trim())){
                    results.add(term);
                }

            }
            

        }

        return results;

    }

    
}
