import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.awt.*;
import java.sql.*;
import java.io.File;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Testupdate.java
 *
 * Created on Mar 4, 2013, 3:52:08 PM
 */

/**
 *
 * @author Akash
 */
public class Testupdate extends javax.swing.JFrame {

    Connection cnn;
    PreparedStatement pstat;
    /** Creates new form Testupdate */
    public Testupdate() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldContactNo1 = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddess = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldContactNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Image File");

        jLabel6.setText("Age");

        jTextFieldContactNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContactNo1ActionPerformed(evt);
            }
        });
        jTextFieldContactNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldContactNo1KeyPressed(evt);
            }
        });

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyPressed(evt);
            }
        });

        jLabel1.setText("Patient Name");

        jLabel3.setText("Contact No");

        jTextAreaAddess.setColumns(20);
        jTextAreaAddess.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddess);

        jLabel2.setText("Address");

        jTextFieldContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldContactNoKeyPressed(evt);
            }
        });

        jLabel8.setText("PID");

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Wcount");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Seacrh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(137, 137, 137)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 91, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int len=0;
            MongoClient mongoClient = new MongoClient();
            DB db = mongoClient.getDB("test");
             DBCollection coll = db.getCollection("PR");
            JOptionPane.showMessageDialog(null, "ok");
             int pid=Integer.parseInt((String) jTextField1.getText());
             
             DBObject query = new BasicDBObject("Id", pid);
        DBObject update = new BasicDBObject();
        update.put("$set", new BasicDBObject("Id",(Integer.parseInt(jTextField1.getText())))
                .append("Name", jTextFieldName.getText())
                .append("Address", jTextAreaAddess.getText())
                 .append("Contactno", jTextFieldContactNo.getText())
         
                .append("Age", jTextFieldContactNo1.getText())
                
                
                .append("ImageFile", jTextFieldFile.getText()));
            
                WriteResult result = coll.update(query, update);
            JOptionPane.showMessageDialog(null, "Record Updated");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Testupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldContactNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContactNo1KeyPressed
        if(evt.getKeyCode()<=47 || evt.getKeyCode()>=58)
            JOptionPane.showMessageDialog(null, "Please Enter only numbers");
}//GEN-LAST:event_jTextFieldContactNo1KeyPressed

    private void jTextFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyPressed
        if(evt.getKeyCode()<=47 || evt.getKeyCode()>=58) {
        } else
            JOptionPane.showMessageDialog(null, "Please Enter only Alphabets");
}//GEN-LAST:event_jTextFieldNameKeyPressed

    private void jTextFieldContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContactNoKeyPressed
        if(evt.getKeyCode()<=47 || evt.getKeyCode()>=58)
            JOptionPane.showMessageDialog(null, "Please Enter only numbers");
}//GEN-LAST:event_jTextFieldContactNoKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.out.println(System.getProperty("/home/prashant/Desktop/images"));
        JFileChooser fc = new JFileChooser(new File("/home/prashant/Desktop/images"));
       // JOptionPane.showMessageDialog(null,System.getProperty("c:\\images"));
        // Show open dialog; this method does not return until the dialog is closed
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        String fname = fc.getSelectedFile().getAbsoluteFile().toString();
        jTextFieldFile.setText(fc.getSelectedFile().getAbsolutePath());
        JOptionPane.showMessageDialog(null,fc.getSelectedFile());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try
			{
                                MongoClient mongoClient = new MongoClient();
            DB db = mongoClient.getDB("test");
            
            DBCollection coll = db.getCollection("PR");
                               BasicDBObject query = new BasicDBObject();
            query.put("Id",Integer.parseInt((String) jTextField1.getText()));
           
              DBCursor cursor = db.getCollection("PR").find(query);   
                                JOptionPane.showMessageDialog(null,"ok" );
                                
                                
				if (cursor.hasNext())
				{
                                    
                                       BasicDBObject obj = (BasicDBObject) cursor.next();
					
                            
				jTextField1.setText(obj.getString("Id"));
                                jTextFieldName.setText(obj.getString("Name"));
				jTextAreaAddess.setText(obj.getString("Address"));
				jTextFieldContactNo.setText(obj.getString("Contactno"));
				jTextFieldContactNo1.setText(obj.getString("Age"));
                               //jTextFieldContactNo2.setText(obj.getString("DateOfBirth"));
                                jTextFieldFile.setText(obj.getString("ImageFile"));
                            JOptionPane.showMessageDialog(null,"Record Found");
                                }
                                else
                                {
                                            jTextField1.setText("");
                                     //jTextField2.setText("");
			jTextFieldName.setText("");
                        jTextAreaAddess.setText("");
			jTextFieldContactNo.setText("");
                        jTextFieldContactNo1.setText("");
                       // jTextFieldContactNo2.setText("");
                        jTextFieldFile.setText(""); 
                                    
                                JOptionPane.showMessageDialog(null,"NO Such entry Exist");
                                }
                                    
                           
			}
			catch (Exception e)
			{
				String dt = " ERROR";
				String dm = " ERROR : " + e;
				int dtype = JOptionPane.ERROR_MESSAGE;

				JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
			}
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldContactNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContactNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContactNo1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddess;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldContactNo1;
    private javax.swing.JTextField jTextFieldFile;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

}