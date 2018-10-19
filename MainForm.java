
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainForm.java
 *
 * Created on Jan 15, 2013, 7:37:38 PM
 */

/**
 *
 * @author Administrator
 */
public class MainForm extends javax.swing.JFrame {

    
    
    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
    }
       
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, java.awt.Color.white));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainForm");
        setBackground(new java.awt.Color(117, 173, 222));
        setForeground(new java.awt.Color(94, 158, 229));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("PATHOLOGY APPLICATION USING IMAGE PROCESSING");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("New Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 1, 255));
        jLabel6.setText("Patient Database Entries ");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Patient Testing &Processing");

        jButton3.setText("CellCount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Patient Bill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner_Services.jpg"))); // NOI18N

        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Quit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imas.jpeg"))); // NOI18N

        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu2.setText("Patient");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setText("Patient Database");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed1(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setText("Blood Cell Count");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reports");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem8.setText("PatientList");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed1(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem9.setText("PatientBill");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(374, 374, 374)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(4084, 4084, 4084)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(jButton2)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6)
                                .addGap(35, 35, 35)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton4)
                                .addGap(29, 29, 29)
                                .addComponent(jButton5)
                                .addGap(31, 31, 31)
                                .addComponent(jButton8)))))
                .addGap(260, 260, 260)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
            // Get the screen dimensions.
            java.awt.Dimension screen = tk.getScreenSize();
            CountCellJInternalFrame f = new CountCellJInternalFrame();
            int fw = (int) (screen.getWidth());
            int fh = (int) (screen.getHeight());
            java.awt.Dimension fs = f.getSize();
            int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
            int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
            f.setLocation(lx, ly);
            //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
            f.show();
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed1
java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        Testpatient f = new Testpatient();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed1

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      
}//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        //Patient Bill
        java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        Report f = new Report();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();
}//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed1
        try {
            java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
            // Get the screen dimensions.
            java.awt.Dimension screen = tk.getScreenSize();
            CountCellJInternalFrame f = new CountCellJInternalFrame();
            int fw = (int) (screen.getWidth());
            int fh = (int) (screen.getHeight());
            java.awt.Dimension fs = f.getSize();
            int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
            int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
            f.setLocation(lx, ly);
            //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
            f.show();
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed1

    private void jMenuItem8ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed1
         //Patient List
        java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        PatientReport f = new PatientReport();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(null, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed1

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
            // Get the screen dimensions.
            java.awt.Dimension screen = tk.getScreenSize();
            Testupdate f = new Testupdate();
            int fw = (int) (screen.getWidth());
            int fh = (int) (screen.getHeight());
            java.awt.Dimension fs = f.getSize();
            int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
            int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
            f.setLocation(lx, ly);
            //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
            f.show();
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        Testpatient f = new Testpatient();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
            // Get the screen dimensions.
            java.awt.Dimension screen = tk.getScreenSize();
            CountCellJInternalFrame f = new CountCellJInternalFrame();
            int fw = (int) (screen.getWidth());
            int fh = (int) (screen.getHeight());
            java.awt.Dimension fs = f.getSize();
            int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
            int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
            f.setLocation(lx, ly);
            //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
            f.show();
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          try {
            java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
            // Get the screen dimensions.
            java.awt.Dimension screen = tk.getScreenSize();
            Search s = new Search();
            int fw = (int) (screen.getWidth());
            int fh = (int) (screen.getHeight());
            java.awt.Dimension fs = s.getSize();
            int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
            int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
            s.setLocation(lx, ly);
            //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
            s.show();
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        PatientReport f = new PatientReport();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(null, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        PBilll f = new PBilll();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
        // Get the screen dimensions.
        java.awt.Dimension screen = tk.getScreenSize();
        Delete f = new Delete();
        int fw = (int) (screen.getWidth());
        int fh = (int) (screen.getHeight());
        java.awt.Dimension fs = f.getSize();
        int lx = (int) (screen.getWidth() / 2 - fs.getWidth() / 2);
        int ly = (int) (screen.getHeight() / 2 - fs.getHeight() / 2);
        f.setLocation(lx, ly);
        //jDesktopPane1.add(f, javax.swing.JDesktopPane.CENTER_ALIGNMENT);
        f.show();// TODO add your handling code here:        // TODO ad
        
 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
                 Date today = new Date();

    //Date format
   
 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}