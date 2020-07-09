/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPS;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lapi
 */
public class voting extends javax.swing.JFrame {
Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    private String user;
  private String pass;

    /**
     * Creates new form voting
     */
    public voting(String usr, String pas){
    this.user=usr;
    this.pass=pas;
    //define the components here {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icon1 = new ImageIcon(getClass().getResource("inc.png"));
        Image img1=icon1.getImage().getScaledInstance(60, 50,Image.SCALE_SMOOTH);
        jlcong.setIcon(new ImageIcon(img1));
        
        ImageIcon icon2 = new ImageIcon(getClass().getResource("bjp.png"));
        Image img2=icon2.getImage().getScaledInstance(60, 50,Image.SCALE_SMOOTH);
        jlbjp.setIcon(new ImageIcon(img2));
        
        ImageIcon icon3 = new ImageIcon(getClass().getResource("ncp.jpg"));
        Image img3=icon3.getImage().getScaledInstance(60, 50,Image.SCALE_SMOOTH);
        jlbsp.setIcon(new ImageIcon(img3));
        
        ImageIcon icon4 = new ImageIcon(getClass().getResource("RJD.png"));
        Image img4=icon4.getImage().getScaledInstance(60, 50,Image.SCALE_SMOOTH);
        jlrjd.setIcon(new ImageIcon(img4));
        
         ImageIcon icon5 = new ImageIcon(getClass().getResource("CPI2.png"));
        Image img5=icon5.getImage().getScaledInstance(60, 50,Image.SCALE_SMOOTH);
        jlcpi.setIcon(new ImageIcon(img5));
    }

    private voting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbjp = new javax.swing.JLabel();
        jlcong = new javax.swing.JLabel();
        jlbsp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlrjd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlcpi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbNcp = new javax.swing.JButton();
        jbRjd = new javax.swing.JButton();
        jbCpi = new javax.swing.JButton();
        jbBjp = new javax.swing.JButton();
        jbInc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(58, 83, 155));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REPS img2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(238, 150));
        jLabel1.setMinimumSize(new java.awt.Dimension(238, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(238, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("START ELECTION");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelClose)
                            .addComponent(jLabelMin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));

        jlbjp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BJP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));

        jlcong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "INC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));

        jlbsp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "NCP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("INC");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NCP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("BJP");

        jlrjd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "RJD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("RJD");

        jlcpi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CPI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CPI");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jbNcp.setBackground(new java.awt.Color(0, 0, 153));
        jbNcp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbNcp.setForeground(new java.awt.Color(204, 204, 204));
        jbNcp.setText("SELECT");
        jbNcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNcpActionPerformed(evt);
            }
        });

        jbRjd.setBackground(new java.awt.Color(0, 0, 153));
        jbRjd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbRjd.setForeground(new java.awt.Color(204, 204, 204));
        jbRjd.setText("SELECT");
        jbRjd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRjdActionPerformed(evt);
            }
        });

        jbCpi.setBackground(new java.awt.Color(0, 0, 153));
        jbCpi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCpi.setForeground(new java.awt.Color(204, 204, 204));
        jbCpi.setText("SELECT");
        jbCpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCpiActionPerformed(evt);
            }
        });

        jbBjp.setBackground(new java.awt.Color(0, 0, 153));
        jbBjp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbBjp.setForeground(new java.awt.Color(204, 204, 204));
        jbBjp.setText("SELECT");
        jbBjp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBjpActionPerformed(evt);
            }
        });

        jbInc.setBackground(new java.awt.Color(0, 0, 153));
        jbInc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbInc.setForeground(new java.awt.Color(204, 204, 204));
        jbInc.setText("SELECT");
        jbInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNcp)
                    .addComponent(jbRjd)
                    .addComponent(jbCpi)
                    .addComponent(jbBjp)
                    .addComponent(jbInc))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbInc)
                .addGap(51, 51, 51)
                .addComponent(jbBjp)
                .addGap(56, 56, 56)
                .addComponent(jbNcp)
                .addGap(56, 56, 56)
                .addComponent(jbRjd)
                .addGap(56, 56, 56)
                .addComponent(jbCpi)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcpi)
                    .addComponent(jlcong)
                    .addComponent(jlbjp)
                    .addComponent(jlbsp)
                    .addComponent(jlrjd))
                .addGap(77, 77, 77)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlcong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbjp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlrjd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlcpi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jbIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncActionPerformed
        // TODO add your handling code here:
        conn=MySqlConnect.ConnectDB();
        String Sql="update cd_register,voter set cd_register.no_of_votes=cd_register.no_of_votes+1, voter.has_voted=1 where cd_register.c_id='YAN4509992' and voter.v_id=? and voter.password=?";
      
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure want to vote to INC.");
        if(dialogResult==JOptionPane.YES_OPTION)
        {
             try
        {
          PreparedStatement pst=conn.prepareStatement(Sql);
            pst.setString(1,user);
          pst.setString(2,pass);  
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Your vote has been casted to INC.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
          UserInterface u = new UserInterface();
        u.show();
        this.hide();
        }
        else
        {
            voting v=new voting(user,pass);
            v.show();
            this.hide();}
        
    }//GEN-LAST:event_jbIncActionPerformed

    private void jbBjpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBjpActionPerformed
        // TODO add your handling code here:
         conn=MySqlConnect.ConnectDB();
        String Sql="update cd_register,voter set cd_register.no_of_votes=cd_register.no_of_votes+1, voter.has_voted=1 where cd_register.c_id='HAG9388484' and voter.v_id=? and voter.password=?";
      
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure want to vote to BJP.");
        if(dialogResult==JOptionPane.YES_OPTION)
        {
             try
        {
          PreparedStatement pst=conn.prepareStatement(Sql);
            pst.setString(1,user);
          pst.setString(2,pass);  
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Your vote has been casted to BJP.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
          UserInterface u = new UserInterface();
        u.show();
        this.hide();
        }
        else
        {
            voting v=new voting(user,pass);
            v.show();
            this.hide();}
    }//GEN-LAST:event_jbBjpActionPerformed

    private void jbNcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNcpActionPerformed
        // TODO add your handling code here:
         conn=MySqlConnect.ConnectDB();
        String Sql="update cd_register,voter set cd_register.no_of_votes=cd_register.no_of_votes+1, voter.has_voted=1 where cd_register.c_id='PRY5574838' and voter.v_id=? and voter.password=?";
      
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure want to vote to NCP.");
        if(dialogResult==JOptionPane.YES_OPTION)
        {
             try
        {
          PreparedStatement pst=conn.prepareStatement(Sql);
            pst.setString(1,user);
          pst.setString(2,pass);  
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Your vote has been casted to NCP.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
          UserInterface u = new UserInterface();
        u.show();
        this.hide();
        }
        else
        {
            voting v=new voting(user,pass);
            v.show();
            this.hide();}
    }//GEN-LAST:event_jbNcpActionPerformed

    private void jbRjdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRjdActionPerformed
        // TODO add your handling code here:
         conn=MySqlConnect.ConnectDB();
        String Sql="update cd_register,voter set cd_register.no_of_votes=cd_register.no_of_votes+1, voter.has_voted=1 where cd_register.c_id='RCH5612345' and voter.v_id=? and voter.password=?";
      
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure want to vote to RJD.");
        if(dialogResult==JOptionPane.YES_OPTION)
        {
             try
        {
          PreparedStatement pst=conn.prepareStatement(Sql);
            pst.setString(1,user);
          pst.setString(2,pass);  
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Your vote has been casted to RJD.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
          UserInterface u = new UserInterface();
        u.show();
        this.hide();
        }
        else
        {
            voting v=new voting(user,pass);
            v.show();
            this.hide();}
    }//GEN-LAST:event_jbRjdActionPerformed

    private void jbCpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCpiActionPerformed
        // TODO add your handling code here:
           conn=MySqlConnect.ConnectDB();
       String Sql="update cd_register,voter set cd_register.no_of_votes=cd_register.no_of_votes+1, voter.has_voted=1 where cd_register.c_id='TIW7441233' and voter.v_id=? and voter.password=?";
      
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure want to vote to CPI.");
        if(dialogResult==JOptionPane.YES_OPTION)
        {
             try
        {
          PreparedStatement pst=conn.prepareStatement(Sql);
            pst.setString(1,user);
          pst.setString(2,pass);  
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Your vote has been casted to CPI.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
          UserInterface u = new UserInterface();
        u.show();
        this.hide();
        }
        else
        {
            voting v=new voting(user,pass);
            v.show();
            this.hide();}
    }//GEN-LAST:event_jbCpiActionPerformed

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
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBjp;
    private javax.swing.JButton jbCpi;
    private javax.swing.JButton jbInc;
    private javax.swing.JButton jbNcp;
    private javax.swing.JButton jbRjd;
    private javax.swing.JLabel jlbjp;
    private javax.swing.JLabel jlbsp;
    private javax.swing.JLabel jlcong;
    private javax.swing.JLabel jlcpi;
    private javax.swing.JLabel jlrjd;
    // End of variables declaration//GEN-END:variables
}