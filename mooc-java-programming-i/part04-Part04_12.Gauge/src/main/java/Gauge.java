/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kataali
 */
public class Gauge {
    private int value;
    
//    Constructor
    public Gauge(){
        this.value = 0;
    }
//    Method
    public void increase(){
        if (this.value < 5){
            this.value++;
        }
    }
//    Method
    public void decrease(){
        if(this.value > 0)
            this.value--;
    }
//    Method
    public int value (){
        return this.value;
    }
//    Method
    public boolean full(){
        if (this.value == 5)
            return true;
        return false;
    }
}
