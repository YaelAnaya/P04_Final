/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yael.ao.p04.UI;

import com.formdev.flatlaf.ui.FlatRoundBorder;
import com.formdev.flatlaf.ui.FlatTableCellBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Esta clase crea un botón circular.
 * @author yaela
 */
public class CButton extends JLabel {
    
    private ImageIcon baseImage;
    private ImageIcon hoverImage;

 
    public CButton() {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(true);
        this.setText(" ");
        setIcon(baseImage);
        // Se añade el evento de mouse
        addMouseListener(new MouseAdapter() {
            // Cuando entra el mouse en el botón se cambia la imagen.
            @Override
            public void mouseEntered(MouseEvent e) {
               setIcon(hoverImage);
               repaint();
            }
            // Cuando sale el mouse del botón se cambia la imagen.
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(baseImage);
                repaint();
            }
        });
    }

    public void setBaseImage(ImageIcon baseImage) {
        this.baseImage = baseImage;
    }

    public void setHoverImage(ImageIcon hoverImage) {
        this.hoverImage = hoverImage;
    }
    /**
     * Se dibuja el botoón en el ambiente gráfico de la aplicación.
     * @param g El objeto Graphics donde se dibujará el botón.
     * */
    @Override
    protected void paintComponent(Graphics g) {
        var graphics2D = (Graphics2D) g.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.dispose();
        super.paintComponent(g);

    }

}
