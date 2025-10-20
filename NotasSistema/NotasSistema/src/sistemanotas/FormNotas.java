package sistemanotas;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class FormNotas extends javax.swing.JFrame {

    private ArrayList<Estudiante> listaestu = new ArrayList<>();

    public FormNotas() {
        initComponents();
        setTitle("Rodrigo 27-2016-2024 Alexander 27-1857-2024");
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Nota Guia");
        model.addColumn("Nota Parcial");
        model.addColumn("Promedio Final");
        tablanotas.setModel(model);

        actualizarCantidadRegistros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnombre = new javax.swing.JTextField();
        txtguia = new javax.swing.JTextField();
        txtparcial = new javax.swing.JTextField();
        txtcantregistros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablanotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcantregistros.setEditable(false);

        jLabel1.setText("INGRESO DE NOTAS");

        jLabel2.setText("Estudiante:");

        jLabel3.setText("Nota parcial:");

        jLabel4.setText("Nota guia:");

        jLabel5.setText("Registros:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablanotas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablanotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablanotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablanotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtparcial, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtguia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcantregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtparcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtguia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(21, 21, 21)
                .addComponent(btnEliminar)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcantregistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtnombre.getText();
        String guiaS = txtguia.getText();
        String parcialS = txtparcial.getText();

        if (nombre.isEmpty() || guiaS.isEmpty() || parcialS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }

        try {
            double guia = Double.parseDouble(guiaS);
            double parcial = Double.parseDouble(parcialS);

            if (guia < 0 || guia > 10 || parcial < 0 || parcial > 10) {
                JOptionPane.showMessageDialog(this, "Las notas no deben ser mayores a 10 o menores a 0");
                return;
            }

            Estudiante estu = new Estudiante(nombre, guia, parcial);
            listaestu.add(estu);
            actualizarTabla();
            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Datos agregados");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres espéciales");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int filaSelec = tablanotas.getSelectedRow();

        if (filaSelec == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para actualizar");
            return;
        }

        String nombre = txtnombre.getText();
        String guiaStr = txtguia.getText();
        String parcialStr = txtparcial.getText();

        if (nombre.isEmpty() || guiaStr.isEmpty() || parcialStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }

        try {
            double guia = Double.parseDouble(guiaStr);
            double parcial = Double.parseDouble(parcialStr);

            if (guia < 0 || guia > 10 || parcial < 0 || parcial > 10) {
                JOptionPane.showMessageDialog(this, "Las notas no deben ser mayores a 10 o ser menores a 0");
                return;
            }

            Estudiante estu = new Estudiante(nombre, guia, parcial);
            listaestu.set(filaSelec, estu);
            actualizarTabla();
            limpiarCampos();

            JOptionPane.showMessageDialog(this, "Datos actualizados");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSelec = tablanotas.getSelectedRow();

        if (filaSelec == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
            return;
        }

        listaestu.remove(filaSelec);
        actualizarTabla();
        limpiarCampos();

        JOptionPane.showMessageDialog(this, "Datos eliminados");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablanotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablanotasMouseClicked
        int filaSeleccionada = tablanotas.getSelectedRow();

        if (filaSeleccionada != -1) {
            Estudiante estu = listaestu.get(filaSeleccionada);
            txtnombre.setText(estu.nombre);
            txtguia.setText(String.valueOf(estu.guia));
            txtparcial.setText(String.valueOf(estu.parcial));
        }
    }//GEN-LAST:event_tablanotasMouseClicked

    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablanotas.getModel();
        model.setRowCount(0); 

        for (Estudiante estu : listaestu) {
            model.addRow(new Object[]{estu.nombre, estu.guia, estu.parcial, estu.promedio});
        }

        actualizarCantidadRegistros();
    }

    private void actualizarCantidadRegistros() {
        txtcantregistros.setText(String.valueOf(listaestu.size()));
    }

    private void limpiarCampos() {
        txtnombre.setText("");
        txtguia.setText("");
        txtparcial.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new FormNotas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablanotas;
    private javax.swing.JTextField txtcantregistros;
    private javax.swing.JTextField txtguia;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtparcial;
    // End of variables declaration//GEN-END:variables
}
