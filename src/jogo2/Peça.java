/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2;

import java.awt.Image;

public class Peça {
    private int x,y;
    private int posicaoAntiga=0,posicaoNova=0;
    private Image Im_peça;
    
    void setImage(Image I){
    Im_peça = I;
    }
    
    void setx(int x){
    this.x = x;
    }
    
    void sety(int y){
    this.y = y;
    }
    
    int getx(){
    return x;
    }
    
    int gety(){
    return y;
    }
    
    Image get_image(){
    return Im_peça;
    }

    
}
