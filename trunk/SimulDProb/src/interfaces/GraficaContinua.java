package interfaces;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class GraficaContinua extends ApplicationFrame {

    double[][] resultados;
    boolean esAcumulada;

    public GraficaContinua(final String title, double resultados[][], boolean esAcumulada) {
        super(title);
        this.esAcumulada = esAcumulada;
        this.resultados = resultados;
        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private XYDataset createDataset() {
        XYSeries serie = new XYSeries("");
        //java.util.Arrays.sort(resultados);
        for (int i = 0; i < resultados.length; i++) {
            serie.add(resultados[i][0], resultados[i][1]);

        }
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie);
        return dataset;
    }

    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    private JFreeChart createChart(final XYDataset dataset) {
        final JFreeChart chart = ChartFactory.createXYLineChart(
                this.getTitle(),
                "x", esAcumulada ? "F(x)" : "f(x)",
                dataset, 
                PlotOrientation.VERTICAL,
                false, true, false);

        if (esAcumulada) {
            chart.addSubtitle(new TextTitle("Distribucion de probabilidad acumulada"));
        } else {
            chart.addSubtitle(new TextTitle("Distribucion de probabilidad"));
        }
        final XYPlot plot = chart.getXYPlot();

        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesShapesVisible(0, false);
        plot.setRenderer(renderer);
        return chart;

    }
}
