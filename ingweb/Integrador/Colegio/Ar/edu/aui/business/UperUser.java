package ingweb.Integrador.Colegio.Ar.edu.aui.business;

import ingweb.Integrador.Colegio.Ar.edu.aui.model.User;
import ingweb.Integrador.Colegio.Ar.edu.aui.persist.DataBase;

public class UperUser {
    
    public boolean exec(User user){
        if(user == null) return false;
        if(user.getUserName()==null) return false;
        if(user.getPassword()==null) return false;
        if(user.getPassword().length()<8) return false;
        
        return DataBase.users.add(user);
    }
}
