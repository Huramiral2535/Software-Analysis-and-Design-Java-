/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsad;

 /*
 * @author pc
 */
public class member {
    private String name;
    private int uid;
    private int password;
    private int authority;

    public String getName() {
        return name;
    }

    public void setMember(String name, int uid, int password) {
        this.name = name;
        this.uid = uid;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAutharity() {
        return authority;
    }

    public void setAutharity(int autharity) {
        this.authority = autharity;
    }
}
