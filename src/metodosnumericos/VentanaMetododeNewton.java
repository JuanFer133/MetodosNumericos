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
public class VentanaMetododeNewton extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMetododeNewton
     */
    public VentanaMetododeNewton() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Metodo de Newton");
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
        txtX0 = new javax.swing.JTextField();
        txtTolerancia = new javax.swing.JTextField();
        txtIteraciones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        butCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFdx = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelGrafica = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        panelTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Xo:");

        jLabel3.setText("Tolerancia:");

        jLabel4.setText("Iteraciones:");

        txtX0.setText("Xo");

        txtTolerancia.setText("Tolerancia");

        txtIteraciones.setText("Iteraciones");

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

        jLabel1.setText("f'(x)=");

        txtFdx.setText("f'(x)");

        panelGrafica.add(canvas1);

        jTabbedPane1.addTab("Grafica", panelGrafica);

        panelTabla.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Tabla", panelTabla);

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
                            .addComponent(txtX0)
                            .addComponent(txtTolerancia)
                            .addComponent(txtIteraciones, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtFdx)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(butCalcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtFdx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(butCalcular))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String funcion;
    public void RecibirFuncion(String f){
        funcion = f;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaUnaVariable vuv = new VentanaUnaVariable();
        this.setVisible(false);
        vuv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void butCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcularActionPerformed
        if(txtFdx.getText().isEmpty() || txtIteraciones.getText().isEmpty() || txtTolerancia.getText().isEmpty() || txtX0.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verifique que los campos no esten vacios", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
            Graficador t = new Graficador();
            double tolerancia = Double.parseDouble(txtTolerancia.getText());
            int iteraciones = Integer.parseInt(txtIteraciones.getText());
            double xi = Double.parseDouble(txtX0.getText());
            String fdx = txtFdx.getText();
        
            
            Metodos m = new Metodos();
            JOptionPane.showMessageDialog(null,m.Newton(tolerancia, xi, iteraciones, funcion, fdx, true),
                                      "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
            GeneradorTablas g = new GeneradorTablas();
           
            JTable tabla = g.tablaNewton(m.getNewtonXn(), m.getNewtonFx(), 
                                         m.getNewtonFdx(),m.getNewtonEa(), 
                                         m.getNewtonEr());
            
            double xs;
            //Si Xi < Xv
            if(xi<m.getNewtonXn().get(m.getNewtonXn().size()-1).doubleValue()){
                xs = m.getNewtonXn().get(m.getNewtonXn().size()-1).doubleValue()+5;
            }else{
                xs = xi;
                xi = m.getNewtonXn().get(m.getNewtonXn().size()-1).doubleValue()-5;
            }
            
            panelGrafica.removeAll();
            panelGrafica.add(t.series(funcion, xi, xs));
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
            java.util.logging.Logger.getLogger(VentanaMetododeNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMetododeNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMetododeNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMetododeNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMetododeNewton().setVisible(true);
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtFdx;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txtTolerancia;
    private javax.swing.JTextField txtX0;
    // End of variables declaration//GEN-END:variables
}
