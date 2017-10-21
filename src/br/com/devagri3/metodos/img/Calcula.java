/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.metodos.img;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
/**
 *
 * @author willyan
 */
public class Calcula {
    public double area = 0;
    public double area2 = 0;
    
    public double getArea(){
        return area;
    }
    
    public void Calcula() throws IOException {
        
        
        BufferedImage imagem = ImageIO.read(new File("imgprocess.jpg"));
       int w = imagem.getWidth();
       int h = imagem.getHeight();
       int pxwh = 0;
       
       for (int y =0; y < imagem.getHeight(); y++){
           for (int x=0; x < imagem.getWidth(); x++) {
               
             int scrPixel = imagem.getRGB(x, y);
             Color c = new Color (scrPixel);
             int valR = c.getRed();
             int valG = c.getGreen();
             int valB = c.getBlue();
             
             if ( valR == 255 && valG == 255 && valB == 255) {
                 pxwh++;
             }
                      
           }
       }
       
       System.out.println(pxwh);
        area = pxwh;
        System.out.println(area);
        
        area2 = ((area/37.79)* 2.54);///100  ;
        System.out.println("Area em cm "+area2);
    }
    
}
