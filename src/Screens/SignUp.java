/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import java.awt.Color;

/**
 *
 * @author braya
 */
public class SignUp extends javax.swing.JFrame {

    int  xMouse, yMouse;
    
    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        CentroRound = new Clases.PanelRound();
        CreateAccountRound = new Clases.PanelRound();
        CreateAccountTxt = new javax.swing.JLabel();
        IcoSignIn = new javax.swing.JLabel();
        adventureTxt = new javax.swing.JLabel();
        WelcomeTxt = new javax.swing.JLabel();
        EnterEmailTxt = new javax.swing.JLabel();
        IcoMrReboot = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        CreatePasswordTxt = new javax.swing.JLabel();
        EnterUsernameTxt = new javax.swing.JLabel();
        IcoFecha1 = new javax.swing.JLabel();
        IcoFlecha2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        AlreadyAccountTxt = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        IcoFlecha3 = new javax.swing.JLabel();
        Exit_Txt = new javax.swing.JLabel();
        BG_Fondo = new javax.swing.JLabel();
        B_Exit = new javax.swing.JPanel();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CentroRound.setBackground(new java.awt.Color(40, 78, 140));
        CentroRound.setRoundBottomLeft(80);
        CentroRound.setRoundBottomRight(80);
        CentroRound.setRoundTopLeft(80);
        CentroRound.setRoundTopRight(80);

        CreateAccountRound.setBackground(new java.awt.Color(40, 78, 140));
        CreateAccountRound.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        CreateAccountRound.setPreferredSize(new java.awt.Dimension(240, 40));
        CreateAccountRound.setRoundBottomLeft(50);
        CreateAccountRound.setRoundBottomRight(50);
        CreateAccountRound.setRoundTopLeft(50);
        CreateAccountRound.setRoundTopRight(50);

        CreateAccountTxt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        CreateAccountTxt.setForeground(new java.awt.Color(255, 51, 255));
        CreateAccountTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateAccountTxt.setText("Create Account");
        CreateAccountTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CreateAccountRoundLayout = new javax.swing.GroupLayout(CreateAccountRound);
        CreateAccountRound.setLayout(CreateAccountRoundLayout);
        CreateAccountRoundLayout.setHorizontalGroup(
            CreateAccountRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateAccountTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        CreateAccountRoundLayout.setVerticalGroup(
            CreateAccountRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateAccountTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        IcoSignIn.setBackground(new java.awt.Color(40, 78, 140));
        IcoSignIn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        IcoSignIn.setForeground(new java.awt.Color(255, 255, 255));
        IcoSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flecha.png"))); // NOI18N
        IcoSignIn.setText("Sign In");
        IcoSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        adventureTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        adventureTxt.setForeground(new java.awt.Color(204, 204, 204));
        adventureTxt.setText("Let's begin the adventure");

        WelcomeTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        WelcomeTxt.setForeground(new java.awt.Color(204, 204, 204));
        WelcomeTxt.setText("Welcome to Mr.Reboot !");

        EnterEmailTxt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        EnterEmailTxt.setForeground(new java.awt.Color(0, 255, 255));
        EnterEmailTxt.setText("Enter your Email");

        IcoMrReboot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MR.REBOOTFONDOAZUL.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(40, 78, 140));
        jTextField1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        CreatePasswordTxt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        CreatePasswordTxt.setForeground(new java.awt.Color(0, 255, 255));
        CreatePasswordTxt.setText("Create a password");

        EnterUsernameTxt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        EnterUsernameTxt.setForeground(new java.awt.Color(0, 255, 255));
        EnterUsernameTxt.setText("Enter a username");

        IcoFecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flecha.png"))); // NOI18N

        IcoFlecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flecha.png"))); // NOI18N

        jTextField3.setBackground(new java.awt.Color(40, 78, 140));
        jTextField3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);

        AlreadyAccountTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        AlreadyAccountTxt.setForeground(new java.awt.Color(204, 204, 204));
        AlreadyAccountTxt.setText("Already have an account?");

        PasswordTxt.setBackground(new java.awt.Color(40, 78, 140));
        PasswordTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("**********");
        PasswordTxt.setBorder(null);
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordTxtMousePressed(evt);
            }
        });

        IcoFlecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flecha.png"))); // NOI18N

        javax.swing.GroupLayout CentroRoundLayout = new javax.swing.GroupLayout(CentroRound);
        CentroRound.setLayout(CentroRoundLayout);
        CentroRoundLayout.setHorizontalGroup(
            CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CentroRoundLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CentroRoundLayout.createSequentialGroup()
                        .addComponent(EnterUsernameTxt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentroRoundLayout.createSequentialGroup()
                        .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                .addComponent(EnterEmailTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IcoSignIn))
                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WelcomeTxt)
                                    .addComponent(adventureTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IcoMrReboot))
                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                .addComponent(CreatePasswordTxt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AlreadyAccountTxt)
                                    .addGroup(CentroRoundLayout.createSequentialGroup()
                                        .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                                .addComponent(IcoFlecha2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3))
                                            .addGroup(CentroRoundLayout.createSequentialGroup()
                                                .addComponent(IcoFlecha3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PasswordTxt))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CentroRoundLayout.createSequentialGroup()
                                                .addComponent(IcoFecha1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(167, 167, 167)
                                        .addComponent(CreateAccountRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))))
        );
        CentroRoundLayout.setVerticalGroup(
            CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CentroRoundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(WelcomeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adventureTxt)
                .addGap(33, 33, 33)
                .addComponent(EnterEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CentroRoundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IcoFecha1))
                    .addGroup(CentroRoundLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(EnterUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IcoFlecha2)
                    .addGroup(CentroRoundLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CreatePasswordTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(CentroRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentroRoundLayout.createSequentialGroup()
                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentroRoundLayout.createSequentialGroup()
                        .addComponent(IcoFlecha3)
                        .addGap(17, 17, 17))))
            .addGroup(CentroRoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(IcoMrReboot)
                .addGap(18, 18, 18)
                .addComponent(AlreadyAccountTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IcoSignIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentroRoundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateAccountRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        BG.add(CentroRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 400));

        Exit_Txt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Exit_Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_Txt.setText("X");
        Exit_Txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_Txt.setPreferredSize(new java.awt.Dimension(40, 40));
        Exit_Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_TxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit_TxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit_TxtMouseExited(evt);
            }
        });
        BG.add(Exit_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BG_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FondoCompleto.png"))); // NOI18N
        BG_Fondo.setText("jLabel2");
        BG.add(BG_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        B_Exit.setBackground(new java.awt.Color(255, 255, 255));
        B_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout B_ExitLayout = new javax.swing.GroupLayout(B_Exit);
        B_Exit.setLayout(B_ExitLayout);
        B_ExitLayout.setHorizontalGroup(
            B_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        B_ExitLayout.setVerticalGroup(
            B_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BG.add(B_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BG.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Exit_TxtMouseClicked

    private void Exit_TxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseEntered

        Exit_Txt.setForeground(Color.white);
    }//GEN-LAST:event_Exit_TxtMouseEntered

    private void Exit_TxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseExited

        Exit_Txt.setForeground(Color.black);
    }//GEN-LAST:event_Exit_TxtMouseExited

    private void B_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExitMouseEntered

    }//GEN-LAST:event_B_ExitMouseEntered

    private void B_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExitMouseExited

    }//GEN-LAST:event_B_ExitMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
         xMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void B_CreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CreateAccountMouseEntered
        
    }//GEN-LAST:event_B_CreateAccountMouseEntered

    private void B_CreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CreateAccountMouseExited
        
    }//GEN-LAST:event_B_CreateAccountMouseExited

    private void PasswordTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMousePressed
        PasswordTxt.setText("");
        PasswordTxt.setForeground(Color.gray);
        PasswordTxt.setText("");
        PasswordTxt.setForeground(Color.white);
    }//GEN-LAST:event_PasswordTxtMousePressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlreadyAccountTxt;
    private javax.swing.JPanel BG;
    private javax.swing.JLabel BG_Fondo;
    private javax.swing.JPanel B_Exit;
    private Clases.PanelRound CentroRound;
    private Clases.PanelRound CreateAccountRound;
    private javax.swing.JLabel CreateAccountTxt;
    private javax.swing.JLabel CreatePasswordTxt;
    private javax.swing.JLabel EnterEmailTxt;
    private javax.swing.JLabel EnterUsernameTxt;
    private javax.swing.JLabel Exit_Txt;
    private javax.swing.JLabel IcoFecha1;
    private javax.swing.JLabel IcoFlecha2;
    private javax.swing.JLabel IcoFlecha3;
    private javax.swing.JLabel IcoMrReboot;
    private javax.swing.JLabel IcoSignIn;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel WelcomeTxt;
    private javax.swing.JLabel adventureTxt;
    private javax.swing.JPanel header;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}