/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Apri Anggara Yudha
 */
public class Country {
    private int id;
    private String name;
    private int holoceneVolc;
    private String flagPath;
    
    public Country() {
    }
    
    public Country(int id, String name, int holoceneVolc, String flagPath) {
        this.id = id;
        this.name = name;
        this.holoceneVolc = holoceneVolc;
        this.flagPath = flagPath;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHoloceneVolc() {
        return holoceneVolc;
    }

    public String getFlagPath() {
        return flagPath;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoloceneVolc(int holoceneVolc) {
        this.holoceneVolc = holoceneVolc;
    }

    public void setFlagPath(String flagPath) {
        this.flagPath = flagPath;
    }
}
