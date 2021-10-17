/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsad;

/**
 *
 * @author pc
 */
public class course_description {
    private int id;
    private String name;
    private String info;
    
    public void setAll(int id, String name, String info){
        this.id = id;
        this.name = name;
        this.info = info;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

}
