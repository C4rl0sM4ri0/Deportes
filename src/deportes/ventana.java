/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Hack
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    
     clase_deportes clase;
     int contador=0;
    
     
    
    public ventana() {
        initComponents();
        completarPeso();
        completarEstatura();
        
        botongrupo.add(CuadroM);
        botongrupo.add(CuadroF);
    }

    public void completarPeso(){
         for (int i = 0; i <= 200; i++) 
         {
            CuadroPeso.addItem(String.valueOf(i));
         }
    }
     public void completarEstatura() {
        for (int i = 1; i <= 200; i++)
        {
            CuadroEstatura.addItem(String.valueOf(i));
        }
     }
    
       public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    
    public void mostrarEnTabla() {
        DefaultTableModel tabla = (DefaultTableModel) CuadroTabla.getModel();
    }
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botongrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CuadroEstatura = new javax.swing.JComboBox<>();
        CuadroNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CuadroM = new javax.swing.JRadioButton();
        CuadroF = new javax.swing.JRadioButton();
        CuadroPeso = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CuadroTamaño = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CuadroTabla = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        cuadronacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DEPORTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 6, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 700, 10));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Datos Personales ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estatura en cm:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        CuadroEstatura.setBackground(new java.awt.Color(0, 0, 0));
        CuadroEstatura.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(CuadroEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, -1));

        CuadroNombre.setBackground(new java.awt.Color(0, 0, 0));
        CuadroNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(CuadroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("A continuación se muestra la lista de las personas que aplican a un deporte:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 620, -1));

        CuadroM.setBackground(new java.awt.Color(0, 255, 102));
        CuadroM.setForeground(new java.awt.Color(0, 0, 0));
        CuadroM.setText("M");
        jPanel1.add(CuadroM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 183, -1, 30));

        CuadroF.setBackground(new java.awt.Color(102, 255, 102));
        CuadroF.setForeground(new java.awt.Color(0, 0, 0));
        CuadroF.setText("F");
        CuadroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroFActionPerformed(evt);
            }
        });
        jPanel1.add(CuadroF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 183, -1, 30));

        CuadroPeso.setBackground(new java.awt.Color(0, 0, 0));
        CuadroPeso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(CuadroPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, -1));

        jLabel8.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Peso (Kg):");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero de Personas:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        jPanel1.add(CuadroTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 40, -1));

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 30));

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("MOSTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        CuadroTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo", "Estatura (cm)", "Peso (Km)", "Deporte"
            }
        ));
        jScrollPane2.setViewportView(CuadroTabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 620, 150));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 640, 10));
        jPanel1.add(cuadronacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          try {
            if (contador < clase.getNumero_Elementos()) {
                /*Guardar nombre*/
                String name = CuadroNombre.getText();
                clase.setNombre(name, contador);

                /*Guardar el sexo*/
                String sex;
                if (CuadroM.isSelected()) {
                    sex = "M";
                } else {
                    sex = "F";
                }
                clase.setSexo(sex, contador);

                /*Guardar Edad*/
                int edad = clase.edad(cuadronacimiento.getDate());
                clase.setEdad(edad, contador);

                /*Guardar Estatura*/
                int est = Integer.parseInt(CuadroEstatura.getSelectedItem().toString());
                clase.setEstatura(est, contador);

                /*Guardar Peso*/
                int pes = Integer.parseInt(CuadroPeso.getSelectedItem().toString());
                clase.setPeso(pes, contador);

                /*Guardar Deporte*/
                String deporte = clase.Analizar_aceptados(contador);
                clase.setDeportes(deporte, contador);

                contador++;
                
                CuadroNombre.setText("");
                
                
            } else {
                mensajeError("Datos Completos");
            }
        } catch (Exception e) {
            mensajeError("Por favor ingrese todos los datos.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CuadroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         try {
            int tamaño = Integer.parseInt(CuadroTamaño.getText());
            clase = new clase_deportes(tamaño);
            CuadroTamaño.setEnabled(false);
        } catch (Exception e) {
            mensajeError("¡Por favor ingrese una cantidad!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    DefaultTableModel actualModel = (DefaultTableModel) CuadroTabla.getModel();
    actualModel.setRowCount(0);

        for (int i = 0; i < clase.getNumero_Elementos(); i++) {

            if (clase.getNombre(i) == null || clase.getPeso(i) == 0 || clase.getEdad(i) == 0 || clase.getEstatura(i) == 0 || clase.getSexo(i) == null || clase.getDeportes(i) == null) {
                continue;
            }

            Object[] datosParticipantes = new Object[6];

           
            datosParticipantes[0] = clase.getNombre(i);
            
            datosParticipantes[1] = clase.getEdad(i);
           
            datosParticipantes[2] = clase.getSexo(i);
            
            datosParticipantes[3] = clase.getEstatura(i);
            
            datosParticipantes[4] = clase.getPeso(i);
            
            datosParticipantes[5] = clase.getDeportes(i);

            actualModel.addRow(datosParticipantes);
        }

        CuadroTabla.setModel(actualModel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CuadroTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroTamañoActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CuadroEstatura;
    private javax.swing.JRadioButton CuadroF;
    private javax.swing.JRadioButton CuadroM;
    private javax.swing.JTextField CuadroNombre;
    private javax.swing.JComboBox<String> CuadroPeso;
    private javax.swing.JTable CuadroTabla;
    private javax.swing.JTextField CuadroTamaño;
    private javax.swing.ButtonGroup botongrupo;
    private com.toedter.calendar.JDateChooser cuadronacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}