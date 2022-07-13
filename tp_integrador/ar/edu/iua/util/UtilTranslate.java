package ar.edu.iua.util;

public class UtilTranslate {
    
    static public String traducirCadena(String cadena){
        
        cadena = cadena.replace('ñ', 'n');
        cadena = cadena.replace('á','a');
        cadena = cadena.replace('Á','A');
        cadena = cadena.replace('é','e');
        cadena = cadena.replace('É','E');
        cadena = cadena.replace('í','i');
        cadena = cadena.replace('Í','I');
        cadena = cadena.replace('ó','o');
        cadena = cadena.replace('Ó','O');
        cadena = cadena.replace('ú','u');
        cadena = cadena.replace('Ú','U');
        cadena = cadena.replace('ü','u');
        cadena = cadena.replace('Ü','U');
        cadena = cadena.replace("-","");
        cadena = cadena.replaceAll("'", "");
        cadena = cadena.replaceAll("%20", " ");

        cadena.trim().toLowerCase();
        
        return cadena;
    }
}
