/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author CELESTIN
 */
public class JButtonHover extends JButton{
    
    private Color colorHover = new Color(67, 150, 209);
    private Color colorTextHover = new Color(255, 255, 255);
    private Color colorText = new Color(255, 255, 255);
    private Color colorPressed = new Color(255,255,255);
    private boolean isHover = false;

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }
    
    Shape shape;

    public JButtonHover() {
        this.setFont(new Font("Tahoma", 1, 14));
        this.setPreferredSize(new Dimension(200, 40));
        this.setSize(new Dimension(200,40));
        this.setBackground(new Color(0, 112,192));
        this.setForeground(this.colorText);
        this.setCursor(new Cursor(12));
        this.setContentAreaFilled(false);
    }
    
    protected void paintComponent(Graphics g) {
      if (this.getModel().isSelected()) {
         g.setColor(this.getColorHover());
      } else if (this.getModel().isRollover()) {
         g.setColor(this.getColorHover());
         this.isHover = true;
      } else if (this.getModel().isPressed()) {
            g.setColor(this.getColorPressed());
        }
      
      else {
         g.setColor(this.getBackground());
         this.isHover = false;
      }

      if (this.isHover) {
         this.setForeground(this.getColorTextHover());
      } else {
         this.setForeground(this.getColorText());
      }

      g.fillRect(0, 0, this.getSize().width, this.getSize().height);
      super.paintComponent(g);
   }

   public boolean contains(int x, int y) {
      if (this.shape == null || !this.shape.getBounds().equals(this.getBounds())) {
         this.shape = new Ellipse2D.Float(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight());
      }

      return this.shape.contains((double)x, (double)y);
   }

   public Color getColorHover() {
      return this.colorHover;
   }

   public void setColorHover(Color colorHover) {
      this.colorHover = colorHover;
   }

   public Color getColorTextHover() {
      return this.colorTextHover;
   }

   public void setColorTextHover(Color colorTextHover) {
      this.colorTextHover = colorTextHover;
   }

   public Color getColorText() {
      return this.colorText;
   }

   public void setColorText(Color colorText) {
      this.colorText = colorText;
   }
      
}
