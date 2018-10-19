import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;

public class CountCellJInternalFrame extends javax.swing.JFrame
{

    static ArrayList al = null;
    Connection con;
    Statement st,st1;
    PreparedStatement pst,pst1;
    ResultSet rs,rs1,rs2;
    String s=null;
    int w=0;
    int ss=0;
    public String filename=null;
    public String filename1=null;
    String dir = System.getProperty("user.dir") + "";
    
    MongoClient mongoClient = new MongoClient();
            DB db = mongoClient.getDB("test");
            
            DBCollection coll = db.getCollection("PR");

    /** Creates new form CountCellJInternalFrame */
    public CountCellJInternalFrame()
   throws Exception {
         initComponents();
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel7.setText("");
        BasicDBObject query = new BasicDBObject();
BasicDBObject field = new BasicDBObject();
field.put("Id", 1);
DBCursor cursor = db.getCollection("PR").find(query,field);
while (cursor.hasNext()) {
    BasicDBObject obj = (BasicDBObject) cursor.next();
      ((DefaultComboBoxModel) jComboBox1.getModel()).addElement(obj.getString("Id"));
             }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setTitle("Count Cell");

        jButton1.setMnemonic('P');
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Select Patient");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
       

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Total cell Count :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("WBC cell Count :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("RBC & Plateless cell Count :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("jLabel3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("WBC cell Count in Human Body");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Total");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, 120, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                    .addGap(83, 83, 83))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>
    

 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        if (!jComboBox1.getSelectedItem().toString().equals("Select"))
        {
            BasicDBObject query = new BasicDBObject();
            query.put("Id",Integer.parseInt((String) jComboBox1.getSelectedItem()));
           
            DBCursor cursor = db.getCollection("PR").find(query);   
         
            if(cursor.hasNext())
           {
            BasicDBObject obj = (BasicDBObject) cursor.next();
            filename = obj.getString("ImageFile");
            JOptionPane.showMessageDialog(null,"selected filename =" + filename);
            jLabel11.setIcon(new javax.swing.ImageIcon(filename));
            //JOptionPane.showMessageDialog(this,filename);
            //}
        
            }
        }
        
        
        if (jComboBox1.getSelectedIndex() > 0)
        {
            new Thread() {

                //@Override
                public void run() {
                    BufferedImage imge = null;
                    try {
                        super.run();
                        jProgressBar1.setIndeterminate(true);
                        jLabel3.setText("");
                        jLabel4.setText("");
                        jLabel7.setText("");
                        imge = ImageIO.read(new File(filename));
                        
                    } catch (IOException ex) {
                        Logger.getLogger(CountCellJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (imge != null)
                    {
                          countCell obj = CannyEdgeDetector.getWBCCount(imge);
                        filename1 = "/home/prashant/Desktop/images/Output.png";
                        jLabel3.setText(String.valueOf(obj.getCellcount()));
                        jLabel4.setText(String.valueOf(obj.getWbc()));
                        jLabel7.setText(String.valueOf(obj.getCellcount() - obj.getWbc()));
                        double to=(obj.getWbc() * 20)/(4 * 0.1);
                        jLabel9.setText(Double.toString(to));
                        jLabel12.setIcon(new javax.swing.ImageIcon(filename1));
                        w = obj.getWbc();
                        s = jComboBox1.getSelectedItem().toString();
                       
	                int pid=Integer.parseInt((String) jComboBox1.getSelectedItem());
 
	 BasicDBObject newDocument2 = new BasicDBObject().append("$set",
		new BasicDBObject().append("Wcount", w));
 
	  coll.update(new BasicDBObject().append("Id", pid), newDocument2);
                       
                        }
                    jProgressBar1.setIndeterminate(false);
                }
            }.start();

        } else {
            JOptionPane.showMessageDialog(this, "Please select the Patient");
        }
    }                                        
    

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        // TODO add your handling code here:
        // TODO add your handling code here:
      
    }                                           

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration
}
