package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by joakimlindvall on 2017-10-05.
 */
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @javax.persistence.JoinColumn(name = "pnr")
    private String pnr;

    public String getPnr(){
        return pnr;
    }

    public void setPnr(String pnr){
        this.pnr = pnr;
    }

    @javax.persistence.JoinColumn(name = "fname")
    private String fname;

    public String getFname(){
        return fname;
    }

    public void setFname(String lname){
        this.fname = fname;
    }

    @javax.persistence.JoinColumn(name = "lname")
    private String lname;

    public String getLname(){
        return lname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }


}
