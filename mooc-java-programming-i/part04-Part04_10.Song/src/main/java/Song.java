/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class Song {
    private String name;
    private int length;
//    Constructor
    public Song (String initName, int initLength){
        this.name = initName;
        this.length = initLength;
    }
//    Method
    public String name(){
        return this.name;
    }
//    Method
    public int length(){
        return this.length;
    }
}
