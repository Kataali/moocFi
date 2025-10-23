/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class Film {
    private String name;
    private int ageRating;
//    Constructor
    public Film(String initName, int initRating){
        this.name = initName;
        this.ageRating = initRating;
    }
//    Method
    public String name(){
        return this.name;
    }
//   Method
    public int ageRating(){
        return this.ageRating;
    }
}
