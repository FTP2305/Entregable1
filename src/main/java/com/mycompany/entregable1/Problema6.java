/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.entregable1;

/**
 *
 * @author felix
 */
public class Problema6 extends javax.swing.JFrame {

    /**
     * Creates new form Problema6
     */
    public Problema6() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProyecNet = new javax.swing.JTextField();
        txtProySB = new javax.swing.JTextField();
        txtEfinal = new javax.swing.JTextField();
        btnPromedio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        btnPromedio1 = new javax.swing.JButton();
        btnPromedio2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("PROMEDIO DE NOTAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("La Casa Informatica");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Proyecto Netbeans(30%) :");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel4.setText("Proyecto  Spring Boot (30%):");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setText("Examen Final(40%):");

        txtProyecNet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProyecNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProyecNetActionPerformed(evt);
            }
        });

        txtProySB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEfinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnPromedio.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPromedio.setForeground(new java.awt.Color(51, 51, 255));
        btnPromedio.setText("CALCULAR PROMEDIO ");
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        txtA.setColumns(20);
        txtA.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtA.setForeground(new java.awt.Color(153, 255, 153));
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        btnPromedio1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPromedio1.setForeground(new java.awt.Color(51, 51, 255));
        btnPromedio1.setText("NUEVO CALCULO");
        btnPromedio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedio1ActionPerformed(evt);
            }
        });

        btnPromedio2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPromedio2.setForeground(new java.awt.Color(51, 51, 255));
        btnPromedio2.setText("SALIR");
        btnPromedio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedio2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("CURSO JAVA FEBRERO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProyecNet, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtProySB)
                            .addComponent(txtEfinal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnPromedio)
                        .addGap(42, 42, 42)
                        .addComponent(btnPromedio1)
                        .addGap(45, 45, 45)
                        .addComponent(btnPromedio2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(201, 201, 201)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProyecNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProySB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPromedio)
                    .addComponent(btnPromedio1)
                    .addComponent(btnPromedio2))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel6)
                    .addContainerGap(681, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProyecNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProyecNetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProyecNetActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
    try {
        // Declaramos notas
        double nota1 = Double.parseDouble(txtProyecNet.getText());
        double nota2 = Double.parseDouble(txtProySB.getText());
        double nota3 = Double.parseDouble(txtEfinal.getText());

        // Validamos que las notas estén en el rango de 0 a 20
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            javax.swing.JOptionPane.showMessageDialog(this, "Las notas deben estar en el rango de 0 a 20.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            double promedio = (nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4);
            String resultado = promedio >= 12 ? "Aprobado" : "Desaprobado";
            txtA.setText("Promedio: " + promedio + "\n" + resultado);
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnPromedioActionPerformed

    private void btnPromedio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedio1ActionPerformed
        txtProyecNet.setText("");
        txtProySB.setText("");
        txtEfinal.setText("");
        txtA.setText("");
        txtProyecNet.requestFocus();
    }//GEN-LAST:event_btnPromedio1ActionPerformed

    private void btnPromedio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedio2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnPromedio2ActionPerformed

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
            java.util.logging.Logger.getLogger(Problema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problema6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton btnPromedio1;
    private javax.swing.JButton btnPromedio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtEfinal;
    private javax.swing.JTextField txtProySB;
    private javax.swing.JTextField txtProyecNet;
    // End of variables declaration//GEN-END:variables
}
