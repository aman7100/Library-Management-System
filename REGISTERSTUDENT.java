
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class REGISTERSTUDENT extends javax.swing.JFrame {
String a;
    /**
     * Creates new form REGISTERSTUDENT
     */
    public REGISTERSTUDENT() {
        initComponents();
    }

    REGISTERSTUDENT(String a) {
     
        this.a=a;// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        c2 = new javax.swing.JComboBox<String>();
        c1 = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 110, 17);

        a1.setColumns(20);
        a1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 290, 240, 81);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 137, 88, 20);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 385, 110, 25);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 380, 73, 25);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(178, 21, 426, 40);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 430, 65, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 320, 48, 17);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Issue Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(390, 430, 91, 23);

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(230, 90, 205, 23);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Return Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(500, 420, 101, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stream");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 190, 44, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Class");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 240, 50, 20);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(110, 430, 137, 23);

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Book Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(270, 430, 99, 23);

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(230, 130, 205, 23);

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " ", " ", " " }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2);
        c2.setBounds(230, 240, 205, 23);

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Stream", "Commerce", "Science", "arts" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1);
        c1.setBounds(230, 180, 205, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\images (4).jpeg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, -30, 700, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int c=0,d=0;
      String m=t1.getText();
       String g=t2.getText();
       if(t1.equals("") || t2.equals("") || c1.equals("") || c2.equals(""))
       {
           JOptionPane.showMessageDialog(this,"ALL THE OPTIONS ARE MANDATORY");
       }
        if( c1.getSelectedItem()==("SCIENCE"));
        {
            c++;
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
            
           // JOptionPane.showMessageDialog(this,"REGISTERED");
        }
        if(c1.getSelectedItem().equals("Commers"))
        {
            c++; 
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
           // JOptionPane.showMessageDialog(this,"REGISTERED");
        }
        if(c1.getSelectedItem()==("ARTS"))
        {
            c++;
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
          //  JOptionPane.showMessageDialog(this,"REGISTERED"); 
        }
        
           ADDNewBook rr=new ADDNewBook(m,g);
           rr.show();
           this.hide();
      /*   int c=0,d=0;
      String m=t1.getText();
       String g=t2.getText();
       if(t1.equals("") || t2.equals("") || c1.equals("") || c2.equals(""))
       {
           JOptionPane.showMessageDialog(this,"ALL THE OPTIONS ARE MANDATORY");
       }
        if( c1.getSelectedItem()==("SCIENCE"));
        {
            c++;
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
            
           // JOptionPane.showMessageDialog(this,"REGISTERED");
        }
        if(c1.getSelectedItem().equals("Commers"))
        {
            c++; 
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
           // JOptionPane.showMessageDialog(this,"REGISTERED");
        }
        if(c1.getSelectedItem()==("ARTS"))
        {
            c++;
             if(c2.getSelectedItem()==("2"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("3"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("4"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("5"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("6"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("7"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("8"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("9"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("10"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("11"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
         if(c2.getSelectedItem()==("12"))
        {
            d++;
            JOptionPane.showMessageDialog(this,"REGISTERED");
        }   
          //  JOptionPane.showMessageDialog(this,"REGISTERED"); 
        }
        
           ADDNewBook rr=new ADDNewBook(m,g);
           rr.show();
           this.hide();*/
        
        
        
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainLayer mn=new mainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainLayer mn=new mainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ISSUEBOOK ib=new ISSUEBOOK();
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
         if(a=="112" || a=="1234" || a=="12345" || a=="111" || a=="222")
       {
           JOptionPane.showMessageDialog(this, "STUDENTS WITH THIS ID HAVE ALREADY BEEN REGISTERED"); 
           ADDNewBook ac=new ADDNewBook();
           ac.show();
           this.hide();
       }      
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        RETURNBOOK rb=new RETURNBOOK();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ISSUEDBOOKS ibs=new ISSUEDBOOKS();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DISPLAYADDEDBOOK bd=new DISPLAYADDEDBOOK();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
       
    }//GEN-LAST:event_c1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTERSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTERSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTERSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTERSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTERSTUDENT().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
