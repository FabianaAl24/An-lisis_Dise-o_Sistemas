package Proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Matricula extends javax.swing.JFrame {

   DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
    
    public Matricula() {
        initComponents();
    this.setTitle("REGISTRO MATRICULA");
        this.setSize(700,520);
        this.setLocationRelativeTo(null);
        modelo.addColumn("ALUMNO");
        modelo.addColumn("DNI");
        modelo.addColumn("GRADO");
        modelo.addColumn("SECCION");
        modelo.addColumn("FECHA");
        modelo.addColumn("GENERO");
        modelo.addColumn("CODIGO");
        refrescarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxSeccion = new javax.swing.JComboBox<>();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxGrado = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtAlumno = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbRegistro = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(147, 52, 214));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setText("REGISTRO DE MATRICULA");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setText("Alumno :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 20));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setText("Fecha : ");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 70, 20));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setText("DNI :");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 90, 40, 20));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel9.setText("Grado :");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, 20));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel10.setText("Seccion :");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 40));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel11.setText("Genero :");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel12.setText("Codigo de Estudiante :");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        cbxSeccion.setBackground(new java.awt.Color(204, 204, 204));
        cbxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "Secundaria", "Primaria" }));
        jPanel6.add(cbxSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 130, 40));

        cbxGenero.setBackground(new java.awt.Color(204, 204, 204));
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "Masculino", "Femenino" }));
        jPanel6.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 40));

        cbxGrado.setBackground(new java.awt.Color(204, 204, 204));
        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "1", "2", "3", "4", "5", "6" }));
        jPanel6.add(cbxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, 40));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 190, 40));

        txtAlumno.setBackground(new java.awt.Color(204, 204, 204));
        txtAlumno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(txtAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, 40));

        txtDni.setBackground(new java.awt.Color(204, 204, 204));
        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel6.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 40));

        txtFecha.setBackground(new java.awt.Color(204, 204, 204));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFecha.setText("     /  /");
        jPanel6.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 110, 40));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tlbRegistro.setBackground(new java.awt.Color(204, 204, 204));
        tlbRegistro.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        tlbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tlbRegistro);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 700, 250));

        jButton1.setBackground(new java.awt.Color(192, 125, 239));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("IMPRIMIR");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 30));

        btnRegistrar.setBackground(new java.awt.Color(192, 125, 239));
        btnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel6.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 140, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void refrescarTabla(){
       modelo.setRowCount(0);
       
        if (!listaAlumnos.isEmpty()) {
            for (Alumno alumno : listaAlumnos) {
                Object a[] = new Object[7];
                a[0] = alumno.getAlumno();
                a[1] = alumno.getDni();
                a[2] = alumno.getGrado();
                a[3] = alumno.getSeccion();
                a[4] = alumno.getFecha();
                a[5] = alumno.getGenero();
                a[6] = alumno.getCodigo();
                modelo.addRow(a);
            }
        }
        tlbRegistro.setModel(modelo);       
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
        Alumno alumno = new Alumno(
            txtAlumno.getText(),
            Integer.parseInt(txtDni.getText()),
            Integer.parseInt(cbxGrado.getSelectedItem().toString()),
            cbxSeccion.getSelectedItem().toString(),
            txtFecha.getText(),
            cbxGenero.getSelectedItem().toString(),
            Integer.parseInt(txtCodigo.getText())
            );

        listaAlumnos.add(alumno);
        refrescarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR AL MATRICULAR");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxGrado;
    private javax.swing.JComboBox<String> cbxSeccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlbRegistro;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
