

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;

public class Report extends JFrame implements ActionListener,WindowListener
{
	java.util.Date date1,date2;
	JLabel h,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l37,l39;
	JTextField t3,t4,t5,t6,t7,t8,t9,t10,t11,t37;
 	String nm,addr,cont,gender;
        int age;
        String dob;
        int wcnt;
        double tot;
        JButton btnok,btncancel,btnclear,btnprint,btnhome;
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();

	int tempcode,pid;
	Connection con;
	Statement st;
	PreparedStatement pst,pst1;
	ResultSet rs,rs1,rs2;

	JLabel logo = new JLabel("", new ImageIcon(""), JLabel.RIGHT);
	JLabel img = new JLabel("", new ImageIcon(""), JLabel.RIGHT);
	Font f1 = new Font ("Wide Latin",Font.BOLD,22);
	Font b = new Font ("Bodoni MT",Font.BOLD,17);
	Font f = new Font ("Bookman Old Style",Font.BOLD,18);
	Font a = new Font ("Bookman Old Style",Font.BOLD,16);

	public Report()
	{
	   super("WBC Patient Report");
           Container cp = getContentPane();
	   setLayout(null);
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	   h=new JLabel("WBC Patient Report");
	   h.setBounds(350,50,350,25);
	   h.setFont(f1);
	   add(h);

	   l1=new JLabel("!!!!!!!!!!!ORG Name!!!!!!!!");
	   l1.setBounds(130,120,350,25);
	   l1.setFont(f);
	   add(l1);

	   l2=new JLabel("NASIK.");
	   l2.setBounds(130,140,250,25);
	   l2.setFont(f);
	   add(l2);

	   l3=new JLabel("Patient ID   :");
	   l3.setBounds(600,120,200,25);
	   l3.setFont(b);
	   add(l3);
	   t3=new JTextField();
	   t3.setBounds(750,125,100,20);
	   t3.setToolTipText("Enter Patient ID");
	   add(t3);


	   l4=new JLabel("Patient Report For   :");
	   l4.setBounds(600,150,200,25);
	   l4.setFont(b);
	   add(l4);
	   t4 =new JTextField();
	   t4.setBounds(750,150,25,25);
	   add(t4);
	   t4.setEditable(false);

	   date1=new java.util.Date();
	   SimpleDateFormat sdf1= new SimpleDateFormat("MMM");
	   String s1= sdf1.format(date1);
	   t4.setText(s1);

	   t5 =new JTextField();
	   t5.setBounds(774,150,35,25);
	   add(t5);
	   t5.setEditable(false);

	   date2=new java.util.Date();
	   SimpleDateFormat sdf2= new SimpleDateFormat("yyyy");
	   String s2= sdf2.format(date2);
	   t5.setText(s2);

	   l5=new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	   l5.setBounds(100,170,900,25);
	   add(l5);

	   l6=new JLabel("Name   :");
	   l6.setBounds(120,200,100,25);
	   l6.setFont(b);
	   add(l6);
	   t6=new JTextField();
	   t6.setBounds(200,205,140,20);
	   add(t6);
	   t6.setToolTipText("Patient Name");
	   t6.setEditable(false);

	   l7=new JLabel("Address    :");
	   l7.setBounds(400,200,160,25);
	   l7.setFont(b);
	   add(l7);
	   t7=new JTextField();
	   t7.setBounds(530,205,100,20);
	   add(t7);
	   t7.setToolTipText("Address");
	   t7.setEditable(false);

	   l8=new JLabel("Contact No.  :");
	   l8.setBounds(675,200,140,25);
	   l8.setFont(b);
	   add(l8);
	   t8=new JTextField();
	   t8.setBounds(800,205,80,20);
	   add(t8);
	   t8.setToolTipText("Contact Number");
	   t8.setEditable(false);

	   l9=new JLabel("Dieases.   :");
	   l9.setBounds(120,230,140,25);
	   l9.setFont(b);
	  // add(l9);
	   t9=new JTextField();
	   t9.setBounds(240,235,100,20);
	  // add(t9);
	   t9.setToolTipText("Dieases");
	   t9.setEditable(false);

	   l10=new JLabel("Active Status.:");
	   l10.setBounds(400,230,140,25);
	   l10.setFont(b);
	  // add(l10);
	   t10=new JTextField();
	   t10.setBounds(530,235,100,20);
	  // add(t10);
	   t10.setToolTipText("Active Status");
	   t10.setEditable(false);

	   l11=new JLabel("WBC Count.   :");
	   l11.setBounds(675,230,140,25);
	   l11.setFont(b);
	   add(l11);
	   t11=new JTextField();
	   t11.setBounds(800,235,80,20);
	   add(t11);
	   t11.setToolTipText("WBC Count Number");
	   t11.setEditable(false);

	   l12=new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	   l12.setBounds(100,250,900,25);
	   add(l12);

	   l37=new JLabel("Net Paid Rupees    :");
	   l37.setBounds(120,585,350,25);
	   l37.setFont(a);
	   add(l37);
	   t37=new JTextField();
	   t37.setBounds(300,590,120,20);
	   add(t37);
	   t37.setToolTipText("Net Paid Rupees");
	   t37.setEditable(true);


	   l39=new JLabel("Authority Sign. ");
	   l39.setBounds(750,660,300,25);
	   l39.setFont(a);
	   add(l39);


	   btnprint=new JButton("PRINT");
	   btnprint.setBounds(130,660,90,25);
	   btnprint.addActionListener(this);
	   btnprint.setToolTipText("This button Print report");
	   add(btnprint);

	   btncancel=new JButton("CANCEL");
	   btncancel.setBounds(250,660,90,25);
	   btncancel.addActionListener(this);
	   btncancel.setToolTipText("This button cancels report");
	   add(btncancel);

	   btnclear=new JButton("CLEAR");
	   btnclear.setBounds(370,660,90,25);
	   btnclear.addActionListener(this);
	   btnclear.setToolTipText("This button clears all the text of TextBoxes");
	   add(btnclear);

	   btnok=new JButton("OK");
	   btnok.setBounds(490,660,90,25);
	   btnok.addActionListener(this);
	   btnok.setToolTipText("This button extracts all the entries text of TextBoxes using PatientId");
	   add(btnok);

   	   btnhome=new JButton("HOME");
	   btnhome.setBounds(920,675,90,30);
	   btnhome.addActionListener (this);
	   btnhome.setToolTipText("This button go to Main Screen");
	   add(btnhome);


	   cp.add(jPanel1);
	   jPanel1.setBounds(100,100, 800,233);
	   jPanel1.setLayout(null);
	   jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());
	  
	   cp.add(img);
	   img.setBounds(-20,-30, 150,150);
	   cp.add(logo);
	   logo.setBounds(865,-40, 150,150);
	   setSize(1034, 776);
	   setLocation(-4,-5);
	   setVisible(true);
	  }


	public static void main(String args[])
	  {
	     Report b=new Report();
          }

	

	public void actionPerformed(ActionEvent a)
	{
		String s1 = a.getActionCommand();

		if (s1.equals("CANCEL"))
		{
			System.exit(0);
		}
		else
		if (s1.equals("CLEAR"))
		{
			t3.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t37.setText("");
			
		}
		else
		if (s1.equals("HOME"))
		{
		              setVisible(false);
		}
               else
                   if(s1.equals("PRINT"))
                   {
                    PrintUtilities.printComponent(this);
                   }
		else
		if (s1.equals("OK"))
		{
         	                        
		        try
			{
                                MongoClient mongoClient = new MongoClient();
            DB db = mongoClient.getDB("test");
            
            DBCollection coll = db.getCollection("PR");
                               BasicDBObject query = new BasicDBObject();
            query.put("Id",Integer.parseInt((String) t3.getText()));
           
              DBCursor cursor = db.getCollection("PR").find(query);   
                                JOptionPane.showMessageDialog(null,"ok" );
                                
                                
				if (cursor.hasNext())
				{
                                    
                                       BasicDBObject obj = (BasicDBObject) cursor.next();
					JOptionPane.showMessageDialog(null,"ok");
                                        pid=Integer.parseInt(obj.getString("Id"));
                                        nm=obj.getString("Name");
					addr=obj.getString("Address");
					cont=obj.getString("Contactno");
					wcnt=Integer.parseInt(obj.getString("Wcount"));
                                         tot = (wcnt * 20) / (4 * 0.1);
                            }
				t3.setText(String.valueOf(pid));
                                t6.setText(String.valueOf(nm));
				t7.setText(String.valueOf(addr));
				t8.setText(String.valueOf(cont));
				t11.setText(String.valueOf(tot));
                            
                           
                                
                                    
                           
			}
			catch (Exception e)
			{
				String dt = " ERROR";
				String dm = " ERROR : " + e;
				int dtype = JOptionPane.ERROR_MESSAGE;

				JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
			}
                }
	}
	public void windowClosing(WindowEvent w)
	{
		setVisible(false);
	}

	public void windowClosed(WindowEvent w) { }
	public void windowOpened(WindowEvent w) { }
	public void windowActivated(WindowEvent w) { }
	public void windowDeactivated(WindowEvent w) { }
	public void windowIconified(WindowEvent w) { }
	public void windowDeiconified(WindowEvent w) { }
}