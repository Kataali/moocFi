/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class Whistle {
    private String sound;
//    Constructor
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
//    Method
    public void sound(){
        System.out.println(this.sound);
    }
}
