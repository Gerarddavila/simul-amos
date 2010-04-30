

/*
 * MainMDI.java
 *
 * Created on 04-17-2010, 12:21:44 PM
 */
package DistProb.interfaces;

import interfaces.ArchivosGUI;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *ESTA CLASE IMPLEMENTA LA INTERFAZ GRAFICA PRINCIPAL.
 * @author Steve
 */
public class MainMDI extends javax.swing.JFrame {

   
    public MainMDI() {
        initComponents();//Se inicializan los componentes de la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorDesktopPane = new javax.swing.JDesktopPane();
        menuPrincipalToolBar = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        geometricaButton = new javax.swing.JButton();
        poisonButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        uniformeButton = new javax.swing.JButton();
        exponencialButton = new javax.swing.JButton();
        normalButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(contenedorDesktopPane, java.awt.BorderLayout.CENTER);

        menuPrincipalToolBar.setRollover(true);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discretas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        geometricaButton.setText("Geometrica");
        geometricaButton.setFocusable(false);
        geometricaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        geometricaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        geometricaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geometricaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(geometricaButton);

        poisonButton.setText("Poison");
        poisonButton.setFocusable(false);
        poisonButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        poisonButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        poisonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poisonButtonActionPerformed(evt);
            }
        });
        jPanel1.add(poisonButton);

        jPanel3.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Continuas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        uniformeButton.setText("Uniforme");
        uniformeButton.setFocusable(false);
        uniformeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uniformeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        uniformeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniformeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(uniformeButton);

        exponencialButton.setText("Exponencial");
        exponencialButton.setFocusable(false);
        exponencialButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exponencialButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exponencialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponencialButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exponencialButton);

        normalButton.setText("Normal");
        normalButton.setFocusable(false);
        normalButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        normalButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        normalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalButtonActionPerformed(evt);
            }
        });
        jPanel2.add(normalButton);

        jPanel3.add(jPanel2);

        menuPrincipalToolBar.add(jPanel3);

        getContentPane().add(menuPrincipalToolBar, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("Archivo");

        abrirMenuItem.setText("Abrir");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(abrirMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Distribuciones de Probabilidad");

        jMenu3.setText("Discreta");

        jMenuItem1.setText("Geometrica");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Poison");
        jMenu3.add(jMenuItem2);

        jMenu2.add(jMenu3);

        jMenu4.setText("Continuas");

        jMenuItem3.setText("Uniforme");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Exponencial");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Normal");
        jMenu4.add(jMenuItem5);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void poisonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poisonButtonActionPerformed
        addInternalWindow("poison");
        //Se agrega la ventana interna la cual contiene el formulario
        //de la distribucion de poison

    }//GEN-LAST:event_poisonButtonActionPerformed

    private void uniformeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniformeButtonActionPerformed
        addInternalWindow("uniforme");
        //Se agrega la ventana interna la cual contiene el formulario
        //de la distribucion de Uniforme
    }//GEN-LAST:event_uniformeButtonActionPerformed

    private void geometricaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geometricaButtonActionPerformed
        addInternalWindow("geometrica");
        //Se agrega la ventana interna la cual contiene el formulario
        //de la distribucion de Geometrica
    }//GEN-LAST:event_geometricaButtonActionPerformed

    private void exponencialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponencialButtonActionPerformed
        addInternalWindow("exponencial");
        //Se agrega la ventana interna la cual contiene el formulario
        //de la distribucion de Exponencial.
    }//GEN-LAST:event_exponencialButtonActionPerformed

    private void normalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalButtonActionPerformed
        addInternalWindow("normal");
        //Se agrega la ventana interna la cual contiene el formulario
        //de la distribucion de Normal.
    }//GEN-LAST:event_normalButtonActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        new ArchivosGUI(this, true).setVisible(true);
        //
    }//GEN-LAST:event_abrirMenuItemActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMDI().setVisible(true);
            }
        });
    }

    public void addInternalWindow(String ventana) {
        JInternalFrame jInternalFrame =null;
        //Si la seleccion fue geometrica
        if (ventana.compareTo("geometrica") == 0) {
            //se carga el formulario de la distribucion geometrica
            jInternalFrame=new GeometricaGUI();
             //Si la seleccion fue poison
        } else if (ventana.compareTo("poison") == 0) {
            //se carga el formulario de la distribucion poison
            jInternalFrame=new PoisonGUI();
             //Si la seleccion fue uniforme
        } else if (ventana.compareTo("uniforme") == 0) {
            //se carga el formulario de la distribucion uniforme
            jInternalFrame=new UniforGUI();
             //Si la seleccion fue exponencial
        } else if (ventana.compareTo("exponencial") == 0) {
            //se carga el formulario de la distribucion Exponencial
            jInternalFrame=new ExponencialGUI();
             //Si la seleccion fue normal.
        } else if (ventana.compareTo("normal") == 0) {
            //se carga el formulario de la distribucion Normal
            jInternalFrame=new NormalGUI();
        }
        jInternalFrame.setVisible(true);//se hace visible la ventana interna
        jInternalFrame.setSize(contenedorDesktopPane.getSize());
        //Se establece el tamanio de la ventana interna.
        contenedorDesktopPane.add(jInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JDesktopPane contenedorDesktopPane;
    private javax.swing.JButton exponencialButton;
    private javax.swing.JButton geometricaButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar menuPrincipalToolBar;
    private javax.swing.JButton normalButton;
    private javax.swing.JButton poisonButton;
    private javax.swing.JButton uniformeButton;
    // End of variables declaration//GEN-END:variables
}
