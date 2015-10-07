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
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Juan Fernando Zuluaga <jzulua50@eafit.edu.co>
 * @author Daniel Arango Pelaez <darang24@eafit.edu.co>
 * 
 */
public class VentanaMetodoSecante extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMetodoSecante
     */
    public VentanaMetodoSecante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Metodo de la Secante");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtTolerancia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        butCalcular = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelGrafica = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        panelTabla = new javax.swing.JPanel();
        txtIteraciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Metodo de Secante");

        jLabel2.setText("Xo:");

        jLabel3.setText("X1:");

        jLabel4.setText("Tolerancia:");

        txtX0.setText("Xo");
        txtX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX0ActionPerformed(evt);
            }
        });

        txtX1.setText("X1");

        txtTolerancia.setText("Tolerancia");

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

        panelGrafica.add(canvas1);

        jTabbedPane1.addTab("Grafica", panelGrafica);

        panelTabla.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Tabla", panelTabla);

        txtIteraciones.setText("Iteraciones");

        jLabel7.setText("Iteraciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(butCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTolerancia)
                            .addComponent(txtX0)
                            .addComponent(txtX1)
                            .addComponent(txtIteraciones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(butCalcular))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String funcion;
    public void RecibirFuncion(String f){
        funcion = f;
    }
    
    private void txtX0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaUnaVariable vuv = new VentanaUnaVariable();
        this.setVisible(false);
        vuv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void butCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcularActionPerformed
        if(txtIteraciones.getText().isEmpty() || txtTolerancia.getText().isEmpty() || txtX0.getText().isEmpty() || txtX1.getText().isEmpty()){
              JOptionPane.showMessageDialog(null, "Verifique que los campos no esten vacios", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }else{
               try{     
            Graficador t = new Graficador();
            double tolerancia = Double.parseDouble(txtTolerancia.getText());
            int iteraciones = Integer.parseInt(txtIteraciones.getText());
            double x0 = Double.parseDouble(txtX0.getText());
            double x1 = Double.parseDouble(txtX1.getText());
           
            
            Metodos m = new Metodos();
            JOptionPane.showMessageDialog(null,m.MetodoDeLaSecante(tolerancia, x0, x1, iteraciones, funcion, true),
                                      "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
            GeneradorTablas g = new GeneradorTablas();
            JTable tabla = g.tablaPuntoFijo(m.getSecanteXn(), m.getSecanteFxn(),
                                            m.getSecanteEa(), m.getSecanteEr());
            
            
           double xs;
            //Si Xi < Xv
            if(x0<m.getSecanteXn().get(m.getSecanteXn().size()-1).doubleValue()){
                xs = m.getSecanteXn().get(m.getSecanteXn().size()-1).doubleValue()+5;
            }else{
                xs = x0;
                x0 = m.getSecanteXn().get(m.getSecanteXn().size()-1).doubleValue()-5;
            }
            
            panelGrafica.removeAll();
            panelGrafica.add(t.series(funcion, x0, xs));
            panelGrafica.updateUI();
        
            panelTabla.removeAll();
            panelTabla.add(new JScrollPane(tabla));
            panelTabla.updateUI();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Verifique que los campos sean Numeros", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
               }
        }

    }//GEN-LAST:event_butCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMetodoSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMetodoSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMetodoSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMetodoSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMetodoSecante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCalcular;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txtTolerancia;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    // End of variables declaration//GEN-END:variables
}
