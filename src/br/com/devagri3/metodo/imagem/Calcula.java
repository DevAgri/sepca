/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.metodo.imagem;
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
        
        
       BufferedImage imagem = ImageIO.read(new File("rec_Talhoes_2017_Prod_Setor__02501.jpg"));
       int w = imagem.getWidth();
       int h = imagem.getHeight();
       int pxdb = 0;
       int cont2=0;
       for (int y =0; y < imagem.getHeight(); y++){
           for (int x=0; x < imagem.getWidth(); x++) {
             ++cont2;  
             int scrPixel = imagem.getRGB(x, y);
             Color c = new Color (scrPixel);
             int valR = c.getRed();
             int valG = c.getGreen();
             int valB = c.getBlue();
             
             if ( valR != 0 && valG != 0 && valB != 0) { 
                 pxdb++;
             }
                      
           }
       }
       
       //Imagens do satelite Sentinel 2 - medidas  10x10m/px
        area=pxdb;    
        System.out.println("Região:"+cont2);
        System.out.println("Região de interesse:" + pxdb);   
        area2 = ((area/(37.79*10))* 2.54);
        System.out.println("Área em Ha : "+area2);
        
        
    }
    
}
