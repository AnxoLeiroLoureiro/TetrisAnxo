package IU;

import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author thicc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Tetris
     */
    int segundos;
    int minutos;
    boolean pausa;

//    TimerTask speedGame;
//
//    Timer timer = new Timer();
//
//    speedGame  = new TimerTask() {
//        @Override
//        public void run() {
//            boolean flag = false;
//
//            Iterator<Cadrado> itera = fichaactual.getCadrados().iterator();
//            while (itera.hasNext()) {
//                JLabel ca = itera.next().getLblCadrado();
//                if (ca.getY() >= 825) {
//                    flag = true;
//
//                }
//
//            }
//            Iterator<Cadrado> iter = fichaactual.getCadrados().iterator();
//            while (iter.hasNext() && flag == false) {
//                JLabel c = iter.next().getLblCadrado();
//                int y = c.getY() + 50;
//                c.setLocation(c.getX(), y);
//
//            }
//        }
//    };
//
//    timer.schedule (speedGame, 
//
//    1500, 2000);
//
//    

    
    public VentanaPrincipal() {
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

        panelXogo = new javax.swing.JPanel();
        lblCadrado = new javax.swing.JLabel();
        panelPuntos = new javax.swing.JPanel();
        lblPuntos = new javax.swing.JLabel();
        panelTempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelNextFicha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bPausar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 900, 900));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 900, 900));
        setMaximumSize(new java.awt.Dimension(900, 800));
        setMinimumSize(new java.awt.Dimension(900, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelXogo.setBackground(new java.awt.Color(0, 0, 0));
        panelXogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.lightGray));
        panelXogo.setPreferredSize(new java.awt.Dimension(500, 700));
        panelXogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadrado.setText("jLabel1");
        panelXogo.add(lblCadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 28, -1, -1));

        getContentPane().add(panelXogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 6, -1, -1));

        panelPuntos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPuntos.setPreferredSize(new java.awt.Dimension(100, 100));

        lblPuntos.setText("PUNTOS");

        javax.swing.GroupLayout panelPuntosLayout = new javax.swing.GroupLayout(panelPuntos);
        panelPuntos.setLayout(panelPuntosLayout);
        panelPuntosLayout.setHorizontalGroup(
            panelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblPuntos)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelPuntosLayout.setVerticalGroup(
            panelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblPuntos)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(panelPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        panelTempo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTempo.setPreferredSize(new java.awt.Dimension(200, 100));

        labelTiempo.setText("TIEMPO");

        jLabel1.setText("LINEAS");

        javax.swing.GroupLayout panelTempoLayout = new javax.swing.GroupLayout(panelTempo);
        panelTempo.setLayout(panelTempoLayout);
        panelTempoLayout.setHorizontalGroup(
            panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTempoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelTiempo))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelTempoLayout.setVerticalGroup(
            panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        getContentPane().add(panelTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        panelNextFicha.setBackground(new java.awt.Color(0, 0, 0));
        panelNextFicha.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout panelNextFichaLayout = new javax.swing.GroupLayout(panelNextFicha);
        panelNextFicha.setLayout(panelNextFichaLayout);
        panelNextFichaLayout.setHorizontalGroup(
            panelNextFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );
        panelNextFichaLayout.setVerticalGroup(
            panelNextFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        getContentPane().add(panelNextFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel2.setText("PRÓXIMA FICHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        bPausar.setText("PAUSA");
        bPausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPausarMouseClicked(evt);
            }
        });
        bPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPausarActionPerformed(evt);
            }
        });
        bPausar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bPausarKeyPressed(evt);
            }
        });
        getContentPane().add(bPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        bSalir.setText("SALIR");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(bSalir)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(bSalir)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPausarActionPerformed

    private void bPausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPausarMouseClicked

    }//GEN-LAST:event_bPausarMouseClicked

    private void bPausarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bPausarKeyPressed
        // TODO add your handling code here:
        VentanaPrincipal.;
    }//GEN-LAST:event_bPausarKeyPressed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalirActionPerformed

    public void pintarCadado(JLabel lblCadrado) {

    }

    public void borrarCadrado(JLabel lblCadrado) {
        panelXogo.add(lblCadrado);
    }

    public void mostrarNumeroLinas(int numeroLinas) {

    }

    public void mostrarFinDoXogo() {

    }

//    private void iniciarPartida(){
//        time.start();
//    }
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
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPausar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel lblCadrado;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel panelNextFicha;
    private javax.swing.JPanel panelPuntos;
    private javax.swing.JPanel panelTempo;
    private javax.swing.JPanel panelXogo;
    // End of variables declaration//GEN-END:variables
}
