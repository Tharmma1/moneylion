package project1;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author tharmma
 */

public class MainPage extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public MainPage() 
    {
        initComponents();
        lbl_answer.setVisible(false);
        lbl_name.setText(String.valueOf(UserDetails.username).toString());
        
        try
        {
            conn = Phpmyadmin.ConnectDB();
            String sql = "SELECT * FROM login WHERE username='"+UserDetails.username+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next())
            {
                txt_firstname.setText(rs.getString("firstname"));
                txt_lastname.setText(rs.getString("lastname"));
                txt_email.setText(rs.getString("email"));
                txt_ssn.setText(rs.getString("ssn"));
                lbl_answer.setText(rs.getString("securityanswer"));
            }
        }
        catch(Exception e)
        {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ssn = new javax.swing.JTextField();
        txt_answer = new javax.swing.JTextField();
        cb_securityquestion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_edit = new javax.swing.JLabel();
        lbl_answer = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Main Page");

        lbl_name.setText("Username");

        txt_firstname.setEditable(false);
        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyTyped(evt);
            }
        });

        txt_lastname.setEditable(false);
        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyTyped(evt);
            }
        });

        jLabel9.setText("Email");

        txt_email.setEditable(false);

        jLabel10.setText("Change SSN");

        txt_ssn.setEditable(false);
        txt_ssn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ssnKeyTyped(evt);
            }
        });

        txt_answer.setEditable(false);
        txt_answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_answerKeyTyped(evt);
            }
        });

        cb_securityquestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hometown", "Fav Car", "School" }));

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel8.setText("Security Question");

        jLabel11.setText("Answer");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Change User Details");

        lbl_edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_edit.setText("Click here to edit");
        lbl_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_editMouseClicked(evt);
            }
        });

        lbl_answer.setText("answer");

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46)
                        .addComponent(lbl_edit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cb_securityquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_answer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_name)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(202, 202, 202)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_edit))
                .addGap(16, 16, 16)
                .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_securityquestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_exit))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(138, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyTyped
        char logininput = evt.getKeyChar();
        if(!(Character.isDigit(logininput) || (logininput==KeyEvent.VK_BACKSPACE || logininput==KeyEvent.VK_DELETE) || Character.isAlphabetic(logininput)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_firstnameKeyTyped

    private void txt_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyTyped
        char logininput = evt.getKeyChar();
        if(!(Character.isDigit(logininput) || (logininput==KeyEvent.VK_BACKSPACE || logininput==KeyEvent.VK_DELETE) || Character.isAlphabetic(logininput)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_lastnameKeyTyped

    private void txt_ssnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ssnKeyTyped
        char num = evt.getKeyChar();
        if(!(Character.isDigit(num) || (num==KeyEvent.VK_BACKSPACE || num==KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ssnKeyTyped

    private void txt_answerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_answerKeyTyped
        char logininput = evt.getKeyChar();
        if(!(Character.isDigit(logininput) || (logininput==KeyEvent.VK_BACKSPACE || logininput==KeyEvent.VK_DELETE) || Character.isAlphabetic(logininput)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_answerKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            if(!txt_answer.getText().isEmpty())
            {
                if(!txt_answer.getText().equals(lbl_answer.getText()))
                {
                try
                {
                    conn = Phpmyadmin.ConnectDB();
                    //String update="UPDATE login SET firstname='"+txt_firstname.getText()+"',lastname='"+txt_lastname.getText()+"',email='"+txt_email.getText()+"',ssn='"+txt_ssn.getText()+"',securityquestion='"+md5(cb_securityquestion.getSelectedItem().toString().toCharArray())+"',securityanswer'"+md5(txt_answer.getText().toCharArray())+"' WHERE username='"+lbl_name.getText()+"'";
                    String update="UPDATE login SET firstname='"+txt_firstname.getText()+"', lastname='"+txt_lastname.getText()+"', email='"+txt_email.getText()+"', ssn='"+txt_ssn.getText()+"', securityquestion='"+md5(cb_securityquestion.getSelectedItem().toString().toCharArray())+"', securityanswer='"+md5(txt_answer.getText().toCharArray())+"' WHERE username='"+lbl_name.getText()+"'";
                    try
                    {
                        pst = conn.prepareStatement(update);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog (null, "Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog (null, "Cant update", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch (Exception e)
                {

                }
                }
            else
            {
                String update="UPDATE login SET securityanswer='"+md5(txt_answer.getText().toCharArray())+"' WHERE username='"+lbl_name.getText()+"'";
            }     
            }
            else
            {
                if(!txt_answer.getText().equals(lbl_answer.getText()))
                {
                try
                {
                    conn = Phpmyadmin.ConnectDB();
                    String update="UPDATE login SET firstname='"+txt_firstname.getText()+"', lastname='"+txt_lastname.getText()+"', email='"+txt_email.getText()+"', ssn='"+txt_ssn.getText()+"' WHERE username='"+lbl_name.getText()+"'";
                    try
                    {
                        pst = conn.prepareStatement(update);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog (null, "Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog (null, "Cant update", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch (Exception e)
                {

                }
                }
            else
            {
                String update="UPDATE login SET securityanswer='"+md5(txt_answer.getText().toCharArray())+"' WHERE username='"+lbl_name.getText()+"'";
            }     
            }
                    

        }
        catch (Exception e)
        {
                    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editMouseClicked
        txt_firstname.setEditable(true);
        txt_lastname.setEditable(true);
        txt_email.setEditable(true);
        txt_ssn.setEditable(true);
        txt_answer.setEditable(true);
    }//GEN-LAST:event_lbl_editMouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed
    private String md5(char[] c)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((new String(c)).getBytes());
            String str = new String (md.digest());
            return str;
        }
        catch(Exception e)
        {
            
        }
        return "";
    }
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox<String> cb_securityquestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_answer;
    private javax.swing.JLabel lbl_edit;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_ssn;
    // End of variables declaration//GEN-END:variables
}
