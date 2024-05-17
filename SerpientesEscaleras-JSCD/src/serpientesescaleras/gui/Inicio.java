package serpientesescaleras.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    private String selectedBoardSize = "";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLJugador1 = new javax.swing.JLabel();
        jLJugador2 = new javax.swing.JLabel();
        jLJugador3 = new javax.swing.JLabel();
        jLJugador4 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador3 = new javax.swing.JTextField();
        txtJugador4 = new javax.swing.JTextField();
        jPJugador1 = new javax.swing.JPanel();
        jPJugador2 = new javax.swing.JPanel();
        jPJugador3 = new javax.swing.JPanel();
        jPJugador4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrb2Jug = new javax.swing.JRadioButton();
        jrb3Jug = new javax.swing.JRadioButton();
        jrb4Jug = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jrb10x10 = new javax.swing.JRadioButton();
        jrb13x13 = new javax.swing.JRadioButton();
        jrb15x15 = new javax.swing.JRadioButton();
        rbtIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLJugador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLJugador1.setText("Jugador 1");

        jLJugador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLJugador2.setText("Jugador 2");

        jLJugador3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLJugador3.setText("Jugador 3");

        jLJugador4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLJugador4.setText("Jugador 4");

        jPJugador1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPJugador1Layout = new javax.swing.GroupLayout(jPJugador1);
        jPJugador1.setLayout(jPJugador1Layout);
        jPJugador1Layout.setHorizontalGroup(
            jPJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPJugador1Layout.setVerticalGroup(
            jPJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPJugador2.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPJugador2Layout = new javax.swing.GroupLayout(jPJugador2);
        jPJugador2.setLayout(jPJugador2Layout);
        jPJugador2Layout.setHorizontalGroup(
            jPJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPJugador2Layout.setVerticalGroup(
            jPJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPJugador3.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPJugador3Layout = new javax.swing.GroupLayout(jPJugador3);
        jPJugador3.setLayout(jPJugador3Layout);
        jPJugador3Layout.setHorizontalGroup(
            jPJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPJugador3Layout.setVerticalGroup(
            jPJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jPJugador4.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPJugador4Layout = new javax.swing.GroupLayout(jPJugador4);
        jPJugador4.setLayout(jPJugador4Layout);
        jPJugador4Layout.setHorizontalGroup(
            jPJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPJugador4Layout.setVerticalGroup(
            jPJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Escribe acá los nombres de los jugadores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLJugador1)
                .addGap(141, 141, 141)
                .addComponent(jLJugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLJugador3)
                .addGap(120, 120, 120)
                .addComponent(jLJugador4)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(txtJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLJugador4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPJugador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPJugador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLJugador1)
                            .addComponent(jLJugador2)
                            .addComponent(jLJugador3))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Cuantos jugadores desean jugar?");

        buttonGroup1.add(jrb2Jug);
        jrb2Jug.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb2Jug.setText("2 Jugadores");
        jrb2Jug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb2JugActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb3Jug);
        jrb3Jug.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb3Jug.setText("3 Jugadores");
        jrb3Jug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb3JugActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb4Jug);
        jrb4Jug.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb4Jug.setText("4 Jugadores");
        jrb4Jug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb4JugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb4Jug)
                    .addComponent(jrb3Jug)
                    .addComponent(jrb2Jug)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jrb2Jug)
                .addGap(38, 38, 38)
                .addComponent(jrb3Jug)
                .addGap(44, 44, 44)
                .addComponent(jrb4Jug)
                .addGap(44, 44, 44))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Escoja su tablero");

        buttonGroup2.add(jrb10x10);
        jrb10x10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb10x10.setText("10 x 10");
        jrb10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb10x10ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrb13x13);
        jrb13x13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb13x13.setText("13 x 13");
        jrb13x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb13x13ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrb15x15);
        jrb15x15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrb15x15.setText("15 x 15");
        jrb15x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb15x15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb13x13)
                            .addComponent(jrb10x10)
                            .addComponent(jrb15x15))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jrb10x10)
                .addGap(32, 32, 32)
                .addComponent(jrb13x13)
                .addGap(42, 42, 42)
                .addComponent(jrb15x15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbtIniciar.setBackground(new java.awt.Color(102, 204, 255));
        rbtIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtIniciar.setText("Iniciar Juego");
        rbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(rbtIniciar)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtIniciar)
                        .addGap(87, 87, 87)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIniciarActionPerformed
        // TODO add your handling code here:  
    if (!selectedBoardSize.isEmpty()) {
        // Obtiene los nombres de los jugadores
        String jugador1 = txtJugador1.getText();
        String jugador2 = txtJugador2.getText();
        String jugador3 = txtJugador3.getText();
        String jugador4 = txtJugador4.getText();
        
        // Selecciona el tablero y ejecuta el juego correspondiente
        if (selectedBoardSize.equals("10x10")) {
            SerpientesEscaleras10 juego10x10 = new SerpientesEscaleras10();
            Main.main(new String[] { selectedBoardSize }); 
        } else if (selectedBoardSize.equals("13x13")) {
            SerpientesEscaleras13 juego13x13 = new SerpientesEscaleras13();
            Main.main(new String[] { selectedBoardSize });
        } else if (selectedBoardSize.equals("15x15")) {
            SerpientesEscaleras15 juego15x15 = new SerpientesEscaleras15();
            Main.main(new String[] { selectedBoardSize });
        }
        
    } else {
        // Muestra un mensaje de error si no se ha seleccionado un tamaño de tablero
        JOptionPane.showMessageDialog(this, "Por favor selecciona el tamaño del tablero", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_rbtIniciarActionPerformed

    private void jrb10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb10x10ActionPerformed
        // TODO add your handling code here:
        selectedBoardSize = "10x10";
    }//GEN-LAST:event_jrb10x10ActionPerformed

    private void jrb13x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb13x13ActionPerformed
       selectedBoardSize = "13x13";
    }//GEN-LAST:event_jrb13x13ActionPerformed

    private void jrb15x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb15x15ActionPerformed
        selectedBoardSize = "15x15";
    }//GEN-LAST:event_jrb15x15ActionPerformed

    private void jrb2JugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb2JugActionPerformed
        // TODO add your handling code here:
        if (jrb2Jug.isSelected()) {
        txtJugador1.setEnabled(true);
        txtJugador2.setEnabled(true);
        txtJugador3.setEnabled(false);
        txtJugador4.setEnabled(false);
    }
    }//GEN-LAST:event_jrb2JugActionPerformed

    private void jrb3JugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb3JugActionPerformed
        // TODO add your handling code here:
        if (jrb3Jug.isSelected()) {
            txtJugador1.setEnabled(true);
            txtJugador2.setEnabled(true);
            txtJugador3.setEnabled(true);
            txtJugador4.setEnabled(false);
        }
    }//GEN-LAST:event_jrb3JugActionPerformed

    private void jrb4JugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb4JugActionPerformed
        // TODO add your handling code here:
        if(jrb4Jug.isSelected()){
            txtJugador1.setEnabled(true);
            txtJugador2.setEnabled(true);
            txtJugador3.setEnabled(true);
            txtJugador4.setEnabled(true);
        }
    }//GEN-LAST:event_jrb4JugActionPerformed

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLJugador1;
    private javax.swing.JLabel jLJugador2;
    private javax.swing.JLabel jLJugador3;
    private javax.swing.JLabel jLJugador4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPJugador1;
    private javax.swing.JPanel jPJugador2;
    private javax.swing.JPanel jPJugador3;
    private javax.swing.JPanel jPJugador4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jrb10x10;
    private javax.swing.JRadioButton jrb13x13;
    private javax.swing.JRadioButton jrb15x15;
    private javax.swing.JRadioButton jrb2Jug;
    private javax.swing.JRadioButton jrb3Jug;
    private javax.swing.JRadioButton jrb4Jug;
    private javax.swing.JButton rbtIniciar;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    private javax.swing.JTextField txtJugador3;
    private javax.swing.JTextField txtJugador4;
    // End of variables declaration//GEN-END:variables
}
