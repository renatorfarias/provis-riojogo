/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author renat
 */
public class Tabuleiro extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form Tabuleiro
     */
    //int j = 0;
    private Image Im_Tabuleiro;
    vitoria v = new vitoria();
    Peça pv = new Peça();
    Peça pp = new Peça();
    int pos[][]={{5, 75, 145, 220, 295, 365, 440, 510, 585, 655,655,585,510,440,365,295,220,145,75,5,5, 75, 145, 220, 295, 365, 440, 510, 585, 655,655,585,510,440,365,295,220,145,75,5,5, 75, 145, 220, 295, 365, 440, 510, 585, 655,655,585,510,440,365,295,220,145,75,5,5, 75, 145, 220, 295, 365, 440, 510, 585, 655,655,585,510,440,365,295,220,145,75,5,5, 75, 145, 220, 295, 365, 440, 510, 585, 655,655,585,510,440,365,295,220,145,75,5}, { 650, 650, 650, 650, 650, 650, 650, 650, 650, 650,580,580,580,580,580,580,580,580,580,580,515,515,515,515,515,515,515,515,515,515,445,445,445,445,445,445,445,445,445,445,380,380,380,380,380,380,380,380,380,380,310,310,310,310,310,310,310,310,310,310,240,240,240,240,240,240,240,240,240,240,170,170,170,170,170,170,170,170,170,170,100,100,100,100,100,100,100,100,100,100,35,35,35,35,35,35,35,35,35,35}};
    
    public void moverpv(int d){
        pv.setPA(pv.getPN());
        pv.setPN(pv.getPA()+ d);
        if(pv.getPN()-1 <= 99){
            if(pv.getPN()== 100){
               v.setVisible(true);
                }
            else{
            pv.setx(pos[0][pv.getPN()-1]);
            pv.sety(pos[1][pv.getPN()-1]);
            System.out.println(pos[0][pv.getPN() -1]);
            System.out.println(pos[1][pv.getPN() -1]);}}
        else{
            int aux = (pv.getPN()-1) -100;
            pv.setx(pos[0][99-aux]);
            pv.sety(pos[1][99-aux]);
            pv.setPN(99-aux);
        }
        
    }
    public Tabuleiro(){
        initComponents();
        Timer t = new Timer(5,this);
        ImageIcon icone = new ImageIcon("src\\imagens\\Tabuleiro.png");
        ImageIcon icone_v = new ImageIcon("src\\imagens\\Icone_Vermelho.png");
        ImageIcon icone_p = new ImageIcon("src\\imagens\\Icone_Preto.png");
        Image v = icone_v.getImage();
        Image p = icone_p.getImage();
        pv.setImage(v);
        //pv.setx(5);
        //pv.sety(650);
        pp.setImage(p);
        //pp.setx(5);
        //pp.sety(620);
        Im_Tabuleiro = icone.getImage();
        t.start();
        
    }
    public void paint(Graphics g){
        Graphics2D tela = (Graphics2D) g;
        tela.drawImage(Im_Tabuleiro,0,0,null);
        tela.drawImage(pv.get_image(),pv.getx(),pv.gety(),null);
        tela.drawImage(pp.get_image(),pp.getx(),pp.gety(),null);
        g.dispose();
    }
    @Override
    public void actionPerformed(ActionEvent arg0){
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(724, 693));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}