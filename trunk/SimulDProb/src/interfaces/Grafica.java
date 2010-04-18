/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;
import java.util.ArrayList;

    import javax.swing.JPanel;

    import org.jfree.chart.ChartFactory;
    import org.jfree.chart.ChartPanel;
    import org.jfree.chart.JFreeChart;
    import org.jfree.chart.axis.NumberAxis;
   import org.jfree.chart.plot.CategoryPlot;
   import org.jfree.chart.plot.PlotOrientation;
   import org.jfree.chart.renderer.category.LineAndShapeRenderer;
   import org.jfree.chart.title.TextTitle;
   import org.jfree.data.category.CategoryDataset;
   import org.jfree.data.category.DefaultCategoryDataset;
   import org.jfree.ui.ApplicationFrame;
   import org.jfree.ui.HorizontalAlignment;
   import org.jfree.ui.RectangleEdge;
   import org.jfree.ui.RefineryUtilities;

   public class Grafica extends ApplicationFrame{


       double resultados[];
       int tamanio = 0;

       public Grafica(String title,double resultados[]) {
           super(title);
           this.resultados = resultados;
           tamanio=resultados.length;
           CategoryDataset dataset = createDataset();
           JFreeChart chart = createChart(dataset);
           ChartPanel panel = new ChartPanel(chart);
           panel.setPreferredSize(new Dimension(500, 270));
           this.setContentPane(panel);
       }


       private static JFreeChart createChart(CategoryDataset dataset) {
           JFreeChart chart = ChartFactory.createLineChart("Distribucion Exponencial", "Release", "Class Count", dataset, PlotOrientation.VERTICAL, false, true, false);
           chart.addSubtitle(new TextTitle("Observaciones"));
           TextTitle source = new TextTitle("Distribucion Exponencial");
           source.setFont(new Font("SansSerif", Font.PLAIN, 10));
           source.setPosition(RectangleEdge.BOTTOM);
           source.setHorizontalAlignment(HorizontalAlignment.RIGHT);
           chart.addSubtitle(source);

           chart.setBackgroundPaint(Color.white);

           CategoryPlot plot = (CategoryPlot) chart.getPlot();
           plot.setBackgroundPaint(Color.LIGHT_GRAY);
           plot.setRangeGridlinePaint(Color.white);

           NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
           rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

           LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
           renderer.setShapesVisible(true);
           renderer.setDrawOutlines(true);
           renderer.setUseFillPaint(true);
           renderer.setFillPaint(Color.BLACK);

           return chart;
       }

       public  JPanel createDemoPanel() {
           JFreeChart chart = createChart(createDataset());
           return new ChartPanel(chart);
       }

       private CategoryDataset createDataset() {

           DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           int salir =1;

          /* while (salir==1){
                      }*/
           java.util.Arrays.sort(resultados);


           for(int i = 0; i<tamanio ; i++){
               dataset.addValue(i, "Continua", ""+resultados[i]);
           }
          /* dataset.addValue(212, "Continua", "x");
           dataset.addValue(504, "Continua", "y");
           dataset.addValue(1520, "Continua", "");
           dataset.addValue(1842, "Continua", "");
           dataset.addValue(2991, "Continua", "");*/

           return dataset;
       }


      /* public static void main(String[] args) {
           Grafica demo = new Grafica("EXPONECIAL");
           demo.pack();
           RefineryUtilities.centerFrameOnScreen(demo);
           demo.setVisible(true);
       }*/

   }