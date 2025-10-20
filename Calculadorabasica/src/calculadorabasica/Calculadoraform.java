
package calculadorabasica;
import java.util.*;
import javax.swing.JOptionPane;
public class Calculadoraform extends javax.swing.JFrame {

    /**
     * Creates new form Calculadoraform
     */
    public Calculadoraform() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();
        btnsumar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtresultado.setEditable(false);

        btnsumar.setText("Sumar");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });

        btnrestar.setText("Restar");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });

        btnmultiplicar.setText("Multiplicar");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnraiz.setText("Raiz");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsumar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnrestar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmultiplicar)
                                    .addComponent(btnDividir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnraiz)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsumar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrestar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnmultiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDividir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnraiz)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
    String texto1 = txtnum1.getText().trim();
    String texto2 = txtnum2.getText().trim();

        if (texto1.isEmpty() || texto2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese ambos números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);

        double resultado = num1 + num2;
        txtresultado.setText(String.valueOf(resultado));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnsumarActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
    String texto1 = txtnum1.getText().trim();
    String texto2 = txtnum2.getText().trim();

    if (texto1.isEmpty() || texto2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese ambos números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);

        double resultado = num1 - num2;
        txtresultado.setText(String.valueOf(resultado));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnrestarActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
    String texto1 = txtnum1.getText().trim();
    String texto2 = txtnum2.getText().trim();

    if (texto1.isEmpty() || texto2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);

        double resultado = num1 * num2;
        txtresultado.setText(String.valueOf(resultado));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
    String texto1 = txtnum1.getText().trim();
    String texto2 = txtnum2.getText().trim();

   
    if (texto1.isEmpty() || texto2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);

     
        if (num2 == 0) {
            JOptionPane.showMessageDialog(this, "No se puede dividir entre 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double resultado = num1 / num2;
        txtresultado.setText(String.valueOf(resultado));

    } catch (NumberFormatException e) {
       
        JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
        String texto = txtnum1.getText().trim();

  
    if (texto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un número en el primer campo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        double num = Double.parseDouble(texto);

      
        if (num < 0) {
            JOptionPane.showMessageDialog(this, "No se puede calcular la raíz cuadrada de un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double resultado = Math.sqrt(num);
        txtresultado.setText(String.valueOf(resultado));

    } catch (NumberFormatException e) {
        
        JOptionPane.showMessageDialog(this, "Solo se permiten números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnraizActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculadoraform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadoraform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadoraform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadoraform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadoraform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsumar;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
