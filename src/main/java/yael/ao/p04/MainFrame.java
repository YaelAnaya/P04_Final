/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yael.ao.p04;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import yael.ao.p04.UI.CButton;
import yael.ao.p04.UI.Notification;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * En esta clase se crea la GUI que se le muestra al usuario.
 * @author yaela
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Se inicializa el frame, se llena la lista con los estados y se muestra el
     * estado que se encuentra en el nodo Head de la Lista Simple.
     */
    public MainFrame() throws IOException {
        initComponents();
        statesView.fillList();
        statesView.showCurrentSate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statesView = new yael.ao.p04.StatesView();
        playButton = new CButton();
        shuffleButton = new CButton();
        nextButton = new CButton();
        resetButton = new CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        playButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PlayButton.png"))); // NOI18N
        playButton.setBaseImage(new javax.swing.ImageIcon(getClass().getResource("/icons/PlayButton.png")));
        playButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playButton.setHoverImage(new javax.swing.ImageIcon(getClass().getResource("/icons/PlayButton_1.png")));
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        shuffleButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shuffleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ShuffleButton.png"))); // NOI18N
        shuffleButton.setBaseImage(new javax.swing.ImageIcon(getClass().getResource("/icons/ShuffleButton.png")));
        shuffleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shuffleButton.setHoverImage(new javax.swing.ImageIcon(getClass().getResource("/icons/ShuffleButton_1.png")));
        shuffleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shuffleButtonMouseClicked(evt);
            }
        });

        nextButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NextButton.png"))); // NOI18N
        nextButton.setBaseImage(new javax.swing.ImageIcon(getClass().getResource("/icons/NextButton.png")));
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setHoverImage(new javax.swing.ImageIcon(getClass().getResource("/icons/NextButton_1.png")));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        resetButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ResetButton.png"))); // NOI18N
        resetButton.setBaseImage(new javax.swing.ImageIcon(getClass().getResource("/icons/ResetButton.png")));
        resetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetButton.setHoverImage(new javax.swing.ImageIcon(getClass().getResource("/icons/ResetButton_1.png")));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(shuffleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statesView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statesView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shuffleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este evento avanza al siguiente estado y lo muestra en la pantalla, siempre
     * y cuando no se haya llegado al final de la lista de estados, si se llega al
     * final de la lista se le muestra una notificación al usuario indicando que
     * ya no hay más estados.
     * */
    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if (statesView.getCurrentStateIndex() == StatesView.getStates().getSize() - 1) {
            Notification noti = new Notification(this, Notification.Type.INFO,
                    Notification.Location.TOP_RIGHT,
                    "Ha llegado al final de la Lista");
            noti.showNotification();
        } 
        
        else 
            statesView.nextState();

    }

    /**
     * Este evento crea la ventana de diálogo en la cual se lleva a cabo
     * la actividad lúdica de la aplicación.
     * */
    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {
        var game = new Quiz(this, true);
        game.setVisible(true);
    }
    /**
     * Este evento mezcla todos los estados de la lista, se regresa al estado
     * en la posición 0 y se muestra en la pantalla.
     * */
    private void shuffleButtonMouseClicked(java.awt.event.MouseEvent evt) {
        statesView.shuffleList();
        statesView.showCurrentSate();
    }
    /**
     * Este evento ordena la lista de manera ascendente, se regresa al estado
     * en la posición 0 y se muestra en la pantalla.
     * */
    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {
        statesView.resetList();
        statesView.showCurrentSate();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /**
             * Cambiamos el Look and Feel de la aplicación para que se vea más chula,
             * en este caso se usa la dependencia de la librería FlatLaf.
             * */
            UIManager.setLookAndFeel(new FlatGitHubIJTheme());
            UIManager.put("Button.arc", 20);
            UIManager.put("TextComponent.arc", 15);
            UIManager.put("Component.focusWidth", 0);

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainFrame().setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    // Variables declaration
    private CButton nextButton;
    private CButton playButton;
    private CButton resetButton;
    private CButton shuffleButton;
    private yael.ao.p04.StatesView statesView;
    // End of variables declaration
}
