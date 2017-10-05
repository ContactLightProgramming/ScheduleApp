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




}
