/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PoisonGUI.java
 *
 * Created on 04-17-2010, 02:30:57 PM
 */
package DistProb.interfaces;

import DistProb.DistribucionProbabilidadUtil;
import DistProb.Geometrica;
import DistProb.Poison;
import interfaces.Grafica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validadores.api.GrupoValidador;
import validadores.validadoresformato.DoubleValidador;
import validadores.validadoresformato.EnteroValidador;

/**
 *ESTA CLASE IMPLEMENTA LA INTERFAZ GRAFICA DE LA DISTRIBUCION GEOMETRICA.
 * @author Steve
 */
public class GeometricaGUI extends javax.swing.JInternalFrame {

    //Se crea un nuevo Objeto de tipo GrupoValidador
    //El cual contiene metodos para validar  formularios.
    GrupoValidador validadorFormulario = new GrupoValidador();

    /** Creates new form PoisonGUI */
    public GeometricaGUI() {
        initComponents();//Se inicializan los componentes de la ventana.

        //Se configura la validacion para el JTextField paramQTextField
        //Este verificara que se ingrese un numero real positivo.
        qValidador.configurarValidacion(paramQTextField,
                true,
                "Ingrese el valor de la media",
                new DoubleValidador("Ingrese un numero real", DoubleValidador.CONFIGURACIONES.POSITIVO, "Dato incorrecto. Ingrese un numero real"));

 //Se configura la validacion para el JTextField paramQTextField
        //Este verificara que se ingrese un numero entero positivo.
        observacionesValidador.configurarValidacion(paramObservacionesTextField, true, "Ingrese el numero de observaciones", new EnteroValidador("Ingrese el numero entero", EnteroValidador.CONFIGURACIONES.POSITIVO, "Dato Incorrecto. Ingrese un entero"));
        //Se validan los formularios.
        validadorFormulario.add(qValidador, observacionesValidador);
        jSplitPane1.setVisible(false);//El separador de ventana se hace invisible
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        parametrosPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paramQTextField = new javax.swing.JTextField();
        qValidador = new validadores.api.ValidadorJTextComponent();
        simularButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paramObservacionesTextField = new javax.swing.JTextField();
        observacionesValidador = new validadores.api.ValidadorJTextComponent();
        contenedorPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        graficaPanel = new javax.swing.JPanel();
        graficoProbPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        probTable = new javax.swing.JTable();
        graficoAcumPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acumTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Distribución Geometrica");

        parametrosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("q:");

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
                            .addComponent(paramQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paramObservacionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parametrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qValidador, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
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
                        .addComponent(paramQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        contenedorPanel.setLayout(new java.awt.BorderLayout());

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

        graficoProbPanel.setLayout(new java.awt.BorderLayout());

        probTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(probTable);

        graficoAcumPanel.setLayout(new java.awt.BorderLayout());

        acumTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(acumTable);

        javax.swing.GroupLayout graficaPanelLayout = new javax.swing.GroupLayout(graficaPanel);
        graficaPanel.setLayout(graficaPanelLayout);
        graficaPanelLayout.setHorizontalGroup(
            graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graficaPanelLayout.createSequentialGroup()
                .addGroup(graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graficoProbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoAcumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
        );
        graficaPanelLayout.setVerticalGroup(
            graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graficaPanelLayout.createSequentialGroup()
                .addGroup(graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoProbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(graficoAcumPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graficaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
        );

        jSplitPane1.setRightComponent(graficaPanel);

        contenedorPanel.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(contenedorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if (validadorFormulario.validar()) {
            //Si el formulario esta validado se extraen los datos Entero y Real
            //de los campos JTextField y se asignan a 2 variables q y observaciones
            //de tipo double y entero respectivamente.
            double q = Double.parseDouble(paramQTextField.getText());
            int observaciones = Integer.parseInt(paramObservacionesTextField.getText());

            //Se crea un objeto de tipo Geometrica que contiene los
            //algoritmos para realizar las observaciones de esta distribucion.
            Geometrica geo = new Geometrica();

            //Se obtienen las observaciones que han sido guardadas en un vector.
            double[] datos = geo.getObservaciones(observaciones, q);
            //Se define un modelo de tabla con el arreglo
            datosTable.setModel(arrayToModel(datos,new String[]{"observacion","dato"}));

            //Se saca la frecuencia de la distribucion de probabilidad
            double[][] frec = new DistribucionProbabilidadUtil().obtenerTablaFrecuencia(datos);
            //se obtiene la probabilidad de ocurrencia de un intervalo especifico.
            double[][] prob = new DistribucionProbabilidadUtil().obtenerProbabilidad(frec, observaciones);
            //Acum obtiene la probabilidad acumulada.
            double[][] acum = new DistribucionProbabilidadUtil().obtenerAcumulada(prob);
            //arrayToModel(p.getObservaciones(observaciones));


            //Se grafica la distribucion de probabilidad
            Grafica gp = new Grafica("Distribucion Geometrica", prob, false);
            graficoProbPanel.removeAll();//Se limpia el panel.
            graficoProbPanel.add(gp.createDemoPanel());//Se agrega el grafico al panel.
            //Se define una table que contendra los intervalos de datos y la probabilidad
            //correspondiente.
            probTable.setModel(arrayToModel(prob, new String[]{"Intervalo","Probabilidad"}));

            //Se grafica la probabilidad acumulada de la distribucion Geometrica
            Grafica ga = new Grafica("Distribucion Geometrica", acum, true);
            graficoAcumPanel.removeAll();//Se limpia el panel.
            graficoAcumPanel.add(ga.createDemoPanel());//Se agrega el grafico al panel.
            //Se define un modelo de tabla  para representar la probabilidad acumulada.
            acumTable.setModel(arrayToModel(acum, new String[]{"Intervalo","Probabilidad Acumulada"}));


            jSplitPane1.setVisible(true);//se hace visible el separador de ventana
            contenedorPanel.updateUI();//se dibujan todos los componentes de nuevo.
        }
    }//GEN-LAST:event_simularButtonActionPerformed

    public DefaultTableModel arrayToModel(double[][] datos, String[] cols) {
        //Se define un modelo te tabla de las observaciones realizadas
        Object[][] odatos = new Object[datos.length][datos[0].length];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                odatos[i][j] = datos[i][j];

            }
        }
        //Object[] coln = new Object[]{"Observacion", "Dato"};
        DefaultTableModel dtm = new DefaultTableModel(odatos,cols);
        return dtm;
    }

    public DefaultTableModel arrayToModel(double[] datos, String[] cols) {
        Object[][] odatos = new Object[datos.length][2];
        for (int i = 0; i < datos.length; i++) {
            odatos[i][0] = i+1;
            odatos[i][1] = datos[i];
        }        
        DefaultTableModel dtm = new DefaultTableModel(odatos, cols);
        return dtm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable acumTable;
    private javax.swing.JPanel contenedorPanel;
    private javax.swing.JTable datosTable;
    private javax.swing.JPanel graficaPanel;
    private javax.swing.JPanel graficoAcumPanel;
    private javax.swing.JPanel graficoProbPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private validadores.api.ValidadorJTextComponent observacionesValidador;
    private javax.swing.JTextField paramObservacionesTextField;
    private javax.swing.JTextField paramQTextField;
    private javax.swing.JPanel parametrosPanel;
    private javax.swing.JTable probTable;
    private validadores.api.ValidadorJTextComponent qValidador;
    private javax.swing.JButton simularButton;
    // End of variables declaration//GEN-END:variables
}
