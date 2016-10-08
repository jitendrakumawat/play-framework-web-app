package models;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;





@Entity
public class PasswordLinks extends  Model {

    public String id;

    @Id
    @Column(name="passwdLink", length=255)
    public String passwdLink;

    public String getId(){
        return this.id;
    }

    public String getPasswdLink(){
        return this.passwdLink;
    }

    public void setId(String id){
        this.id=id;
    }

    public  void setPasswdLink(String passwdLink){
        this.passwdLink=passwdLink;
    }


    public static Finder<String, PasswordLinks> find = new Finder<String, PasswordLinks>(PasswordLinks.class);
}
