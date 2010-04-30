 /* PoisonGUI.java
 *
 * Creado el 17-04-2010, 02:30:57 PM
 */
package DistProb.interfaces;

import DistProb.Expone;
import DistProb.Poison;
import interfaces.Grafica;
import interfaces.GraficaContinua;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validadores.api.GrupoValidador;
import validadores.validadoresformato.DoubleValidador;
import validadores.validadoresformato.EnteroValidador;

/**
 *ESTA CLASE IMPLEMENTA LA INTERFAZ GRAFICA DE LA DISTRIBUCION EXPONENCIAL.
 * @author Steve
 */
public class ExponencialGUI extends javax.swing.JInternalFrame {

    //creamos un objeto de una clase con la que se valida el formulario.
    GrupoValidador validadorFormulario = new GrupoValidador();

    /** Creates new form PoisonGUI */
    public ExponencialGUI() {
        initComponents();//se inicializan los componentes de la ventana


        //A este metodo se le envia el JTextField como parametro
        //Aqui se configura el tipo de validacion, en este caso que se digite un numero real positivo.
        mediaValidador.configurarValidacion(paramMediaTextField,
                true,
                "Ingrese el valor de la media",
                new DoubleValidador("Ingrese un numero real", DoubleValidador.CONFIGURACIONES.POSITIVO, "Dato incorrecto. Ingrese un numero real"));

//A este metodo se le envia como parametro el JTextField que captura el numero de observaciones.
//Aqui se configura el tipo de validacion, en este caso que se digite un numero real positivo.
        observacionesValidador.configurarValidacion(paramObservacionesTextField, true, "Ingrese el numero de observaciones", new EnteroValidador("Ingrese el numero entero", EnteroValidador.CONFIGURACIONES.POSITIVO, "Dato Incorrecto. Ingrese un entero"));
        //Se Validan los formularios segun la configuracion del metodo configurarValidacion
        validadorFormulario.add(mediaValidador, observacionesValidador);

        jSplitPane1.setVisible(false);//Un separador de ventana se deja invisible por el momento.
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parametrosPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paramMediaTextField = new javax.swing.JTextField();
        mediaValidador = new validadores.api.ValidadorJTextComponent();
        simularButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paramObservacionesTextField = new javax.swing.JTextField();
        observacionesValidador = new validadores.api.ValidadorJTextComponent();
        contenedorPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        graficaPanel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Distribución Exponencial");

        parametrosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Media:");

        simularButton.setText("Simular");
        simularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("<html>Numero de<br>Observaciones</html>");

        javax.swing.GroupLayout parametrosPanelLayout = new javax.swing.GroupLayout(parametrosPanel);
        parametrosPanel.setLayout(parametrosPanelLayout);
        parametrosPanelLayout.setHorizontalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(parametrosPanelLayout.createSequentialGroup()
                        .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(parametrosPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paramMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paramObservacionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mediaValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(observacionesValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                .addContainerGap())
        );
        parametrosPanelLayout.setVerticalGroup(
            parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(paramMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mediaValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paramObservacionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observacionesValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simularButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(parametrosPanel, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setContinuousLayout(true);
        jSplitPane1.setOneTouchExpandable(true);

        datosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(datosTable);

        jSplitPane1.setLeftComponent(jScrollPane1);

        graficaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        graficaPanel.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(graficaPanel);

        javax.swing.GroupLayout contenedorPanelLayout = new javax.swing.GroupLayout(contenedorPanel);
        contenedorPanel.setLayout(contenedorPanelLayout);
        contenedorPanelLayout.setHorizontalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        contenedorPanelLayout.setVerticalGroup(
            contenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(contenedorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if (validadorFormulario.validar()) {
            //si la informacion en los JTextField es la correcta, se toman los valores
            //Entero y Real de los JTextField para ser utilizados para los algoritmos.
            double media = Double.parseDouble(paramMediaTextField.getText());
            int observaciones = Integer.parseInt(paramObservacionesTextField.getText());

            //Se crea un objeto de la clase Expone y se envia la media capturada como parametro.
            Expone exp = new Expone(media);
            //Aqui se obtienen las observaciones guardadas en un vector.
            //el tamaño del arreglo equivale al numero de observaciones realizadas.
            double[] datos = exp.getObservaciones(observaciones);
            //arrayToModel(p.getObservaciones(observaciones));

            //Aqui se define el modelo de la tabla que mostrara las observaciones
            datosTable.setModel(arrayToModel(datos));

            //una vez se tienen todas las observaciones se crea un objeto de tipo GraficaContinua
            //Se envia un titulo al constructor y el arreglo de las observaciones para graficar
            //la distribucion de probabilidad.
            GraficaContinua g = new GraficaContinua("Grafico", datos);
            graficaPanel.removeAll();//Se borra todo del panel antes de graficar.
            graficaPanel.add(g.createDemoPanel());//se agrega la grafica al panel.
            
            jSplitPane1.setVisible(true);//El separador de ventana es visible.
            contenedorPanel.updateUI();//Se dibujan todos los componentes del panel otra vez.
        }
    }//GEN-LAST:event_simularButtonActionPerformed

    public DefaultTableModel arrayToModel(double[] datos) {
        //Se define una tabla  con un numero de filas igual al numero de observciones.
        Object[][] odatos = new Object[datos.length][2];
        for (int i = 0; i < datos.length; i++) {
            odatos[i][0] = 1 + i;
            odatos[i][1] = datos[i];
        }
        //La tabla tiene 2 columnas y sus encabezados son  Observacion y Dato.
        Object[] coln = new Object[]{"Observacion", "Dato"};
        DefaultTableModel dtm = new DefaultTableModel(odatos, coln);
        return dtm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPanel;
    private javax.swing.JTable datosTable;
    private javax.swing.JPanel graficaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private validadores.api.ValidadorJTextComponent mediaValidador;
    private validadores.api.ValidadorJTextComponent observacionesValidador;
    private javax.swing.JTextField paramMediaTextField;
    private javax.swing.JTextField paramObservacionesTextField;
    private javax.swing.JPanel parametrosPanel;
    private javax.swing.JButton simularButton;
    // End of variables declaration//GEN-END:variables
}
