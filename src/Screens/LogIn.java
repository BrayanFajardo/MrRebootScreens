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
public class LogIn extends javax.swing.JFrame {

    int  xMouse, yMouse;
    
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BG = new javax.swing.JPanel();
        ImagenLadoDerecho = new javax.swing.JLabel();
        LetreroSignIn = new javax.swing.JLabel();
        LetreroPassword = new javax.swing.JLabel();
        LetreroUsername = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordTxt = new javax.swing.JPasswordField();
        B_SignIn = new javax.swing.JPanel();
        SignIn_Txt = new javax.swing.JLabel();
        ImagenCopas = new javax.swing.JLabel();
        B_Exit = new javax.swing.JPanel();
        Exit_Txt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        SignUpTxt = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenLadoDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SidePanel.png"))); // NOI18N
        ImagenLadoDerecho.setText("jLabel2");
        BG.add(ImagenLadoDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        LetreroSignIn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        LetreroSignIn.setText("Sign In");
        BG.add(LetreroSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 240, 40));

        LetreroPassword.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        LetreroPassword.setText("Password");
        BG.add(LetreroPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, -1));

        LetreroUsername.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        LetreroUsername.setText("Username or email address");
        BG.add(LetreroUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, -1));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Enter your username or email");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        BG.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, 20));

        PasswordTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTxt.setText("**********");
        PasswordTxt.setBorder(null);
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordTxtMousePressed(evt);
            }
        });
        BG.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 280, -1));

        B_SignIn.setBackground(new java.awt.Color(0, 51, 102));
        B_SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_SignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_SignInMouseExited(evt);
            }
        });

        SignIn_Txt.setBackground(new java.awt.Color(255, 255, 255));
        SignIn_Txt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        SignIn_Txt.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignIn_Txt.setText("Sign In");
        SignIn_Txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignIn_Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIn_TxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B_SignInLayout = new javax.swing.GroupLayout(B_SignIn);
        B_SignIn.setLayout(B_SignInLayout);
        B_SignInLayout.setHorizontalGroup(
            B_SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_SignInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SignIn_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        B_SignInLayout.setVerticalGroup(
            B_SignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignIn_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        BG.add(B_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 280, 30));

        ImagenCopas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Copas.png"))); // NOI18N
        ImagenCopas.setText("jLabel7");
        BG.add(ImagenCopas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 70));

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

        Exit_Txt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Exit_Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_Txt.setText("X");
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

        javax.swing.GroupLayout B_ExitLayout = new javax.swing.GroupLayout(B_Exit);
        B_Exit.setLayout(B_ExitLayout);
        B_ExitLayout.setHorizontalGroup(
            B_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        B_ExitLayout.setVerticalGroup(
            B_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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

        SignUpTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SignUpTxt.setForeground(new java.awt.Color(0, 51, 204));
        SignUpTxt.setText("Sign Up");
        SignUpTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseEntered(evt);
            }
        });
        BG.add(SignUpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

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

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        userTxt.setText("");
        PasswordTxt.setText("**********");
    }//GEN-LAST:event_userTxtActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void Exit_TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Exit_TxtMouseClicked

    private void Exit_TxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseEntered
        B_Exit.setBackground(Color.red);
        Exit_Txt.setForeground(Color.white);
    }//GEN-LAST:event_Exit_TxtMouseEntered

    private void B_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExitMouseExited
        B_Exit.setBackground(Color.white);
    }//GEN-LAST:event_B_ExitMouseExited

    private void Exit_TxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_TxtMouseExited
        B_Exit.setBackground(Color.white);
        Exit_Txt.setForeground(Color.black);
    }//GEN-LAST:event_Exit_TxtMouseExited

    private void B_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ExitMouseEntered
        B_Exit.setBackground(Color.red);
    }//GEN-LAST:event_B_ExitMouseEntered

    private void B_SignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SignInMouseEntered
        B_SignIn.setBackground(new Color (0, 51, 153));
    }//GEN-LAST:event_B_SignInMouseEntered

    private void B_SignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SignInMouseExited
        B_SignIn.setBackground(new Color (0, 51, 102));
    }//GEN-LAST:event_B_SignInMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        userTxt.setText("");
        userTxt.setForeground(Color.black);
        PasswordTxt.setText("**********");
        PasswordTxt.setForeground(Color.gray);
    }//GEN-LAST:event_userTxtMousePressed

    private void PasswordTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMousePressed
        userTxt.setText("Enter your Username or Email");
        userTxt.setForeground(Color.gray);
        PasswordTxt.setText("");
        PasswordTxt.setForeground(Color.black);
    }//GEN-LAST:event_PasswordTxtMousePressed

    private void SignIn_TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_TxtMouseClicked
        
    }//GEN-LAST:event_SignIn_TxtMouseClicked

    private void SignUpTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseEntered
      
    }//GEN-LAST:event_SignUpTxtMouseEntered

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel B_Exit;
    private javax.swing.JPanel B_SignIn;
    private javax.swing.JLabel Exit_Txt;
    private javax.swing.JLabel ImagenCopas;
    private javax.swing.JLabel ImagenLadoDerecho;
    private javax.swing.JLabel LetreroPassword;
    private javax.swing.JLabel LetreroSignIn;
    private javax.swing.JLabel LetreroUsername;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel SignIn_Txt;
    private javax.swing.JLabel SignUpTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
