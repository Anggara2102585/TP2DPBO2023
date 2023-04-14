/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Apri Anggara Yudha
 */
public class Volcano {
    private int id;
    private String name;
    private String type;
    private int lastEruption;
    private int countryID;
    private String imgPath;
    
    public Volcano() {
    }
    
    public Volcano(int id, String name, String type, int lastEruption, int countryID, String imgPath) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.lastEruption = lastEruption;
        this.countryID = countryID;
        this.imgPath = imgPath;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLastEruption() {
        return lastEruption;
    }

    public int getCountry() {
        return countryID;
    }

    public String getImgPath() {
        return imgPath;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLastEruption(int lastEruption) {
        this.lastEruption = lastEruption;
    }

    public void setCountry(int countryID) {
        this.countryID = countryID;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
