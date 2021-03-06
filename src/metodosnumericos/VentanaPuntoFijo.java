/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;
/**
 *
 * @author Juan Fernando Zuluaga <jzulua50@eafit.edu.co>
 * @author Daniel Arango Pelaez <darang24@eafit.edu.co>
 * 
 */
public class VentanaPuntoFijo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPuntoFijo
     */
    public VentanaPuntoFijo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Punto Fijo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtXa = new javax.swing.JTextField();
        txtTolerancia = new javax.swing.JTextField();
        txtIteraciones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        butCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtGx = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelGrafica = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        panelTabla = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Xa:");

        jLabel3.setText("Tolerancia:");

        jLabel4.setText("Iteraciones:");

        txtXa.setText("Xa");

        txtTolerancia.setText("Tolerancia");

        txtIteraciones.setText("Iteraciones");
        txtIteraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIteracionesActionPerformed(evt);
            }
        });

        jButton1.setText("< Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        butCalcular.setText("Calcular");
        butCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("g(x):");

        txtGx.setText("g(x)");
        txtGx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGxActionPerformed(evt);
            }
        });

        panelGrafica.add(canvas1);

        jTabbedPane1.addTab("Grafica", panelGrafica);

        panelTabla.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Tabla", panelTabla);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIteraciones)
                            .addComponent(txtTolerancia)
                            .addComponent(txtXa)
                            .addComponent(txtGx)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(90, 90, 90)
                        .addComponent(butCalcular))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtXa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtGx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(butCalcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaUnaVariable vuv = new VentanaUnaVariable();
        this.setVisible(false);
        vuv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    String funcion;
    
    public void RecibirFuncion(String f){
        funcion = f;
    }

    
    private void butCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcularActionPerformed
        if(txtGx.getText().isEmpty() || txtIteraciones.getText().isEmpty() || txtTolerancia.getText().isEmpty() || txtXa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verifique que los campos no esten vacios", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
            Graficador t = new Graficador();
            double tolerancia = Double.parseDouble(txtTolerancia.getText());
            int iteraciones = Integer.parseInt(txtIteraciones.getText());
            double xi = Double.parseDouble(txtXa.getText());
            String gx = txtGx.getText();
        
           
            Metodos m = new Metodos();
            JOptionPane.showMessageDialog(null,m.PuntoFijo(tolerancia, xi, iteraciones, funcion, gx, true),
                                      "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
            GeneradorTablas g = new GeneradorTablas();
            JTable tabla = g.tablaPuntoFijo(m.getPuntoFijoXn(), m.getPuntoFijoFxn(),
                                            m.getPuntoFijoEa(), m.getPuntoFijoEr());
            
            
            double xs;
            //Si Xi < Xv
            if(xi<m.getPuntoFijoXn().get(m.getPuntoFijoXn().size()-1).doubleValue()){
                xs = m.getPuntoFijoXn().get(m.getPuntoFijoXn().size()-1).doubleValue()+5;
            }else{
                xs = xi;
                xi = m.getPuntoFijoXn().get(m.getPuntoFijoXn().size()-1).doubleValue()-5;
            }
            XYSeries series = t.series2(gx, "gx", xi, xs);
            XYSeries seriesx = t.series2("x", "X", xi, xs);
            XYSeriesCollection collection = new XYSeriesCollection(series);
            collection.addSeries(seriesx);
            JFreeChart chart = ChartFactory.createXYLineChart("Grafica", "X", "Y", collection);
            ChartPanel panel = new ChartPanel(chart);
            panel.setPreferredSize(new java.awt.Dimension(400,300));

            panelGrafica.removeAll();
            panelGrafica.add(panel);
            panelGrafica.updateUI();
         
            panelTabla.removeAll();
            panelTabla.add(new JScrollPane(tabla));
            panelTabla.updateUI();
        
            VentanaUnaVariable vuv = new VentanaUnaVariable();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Verifique que los campos sean Numeros", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_butCalcularActionPerformed

    private void txtGxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGxActionPerformed

    private void txtIteracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIteracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIteracionesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this,"Este método consiste en obtener una ecuación g(x) de una ecuación f(x), en las cuales el objetivo es llegar a un g(x) = 0 \n"
                + "lo cual es como obtener un f(x) = 0. En los x donde se cumpla que g(x) = x es donde hay raíces en la ecuación f(x).");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPuntoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCalcular;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtGx;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txtTolerancia;
    private javax.swing.JTextField txtXa;
    // End of variables declaration//GEN-END:variables
}
