/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.*;

public class PatientReport extends JFrame implements WindowListener
{
	int count = 0;
	java.util.Date date3;
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	Font f = new Font ("Bodoni MT",Font.BOLD,17);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	Font h1 = new Font ("Wide Latin",Font.BOLD,22);


	PatientReport()
	{
		super("WBC Report of Patient");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();

		JLabel l4=new JLabel("DATE:");
	   	l4.setBounds(840,90,100,25);
	   	l4.setFont(f);
	   	add(l4);

		JTextField t4 =new JTextField();
		t4.setBounds(900,90,90,25);
		add(t4);
		t4.setEditable(false);

		date3=new java.util.Date();
	   	SimpleDateFormat sdf3= new SimpleDateFormat("dd MMM yyyy");
	   	String s3= sdf3.format(date3);
	   	t4.setText(s3);

		JLabel h2=new JLabel(" Report of Patient");
	  	h2.setBounds(300,50,500,30);
	   	h2.setFont(h1);
	   	add(h2);

		c.add(p1);
		c.add(p2);
		setSize(1024, 776);
		setLocation(-4,-5);

		try
		{
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:DELTA");*/
			

			p1.setBounds(0,130, 1024, 500);
			p2.setBounds(0, 648, 0, 0);


			p1.setLayout(new BorderLayout());
			p2.setLayout(null);



			String[] colHeads = { "Pid","PatientName", "Address", "ContactNo", "Gender", "Age", "wcount"};

                        MongoClient mongoClient = new MongoClient();
                          DB db = mongoClient.getDB("test");
            
                           DBCollection coll = db.getCollection("PR");
			   BasicDBObject query = new BasicDBObject();
                            BasicDBObject field = new BasicDBObject();
                             field.put("Id", 1);
                             field.put("Name", 2);
                             field.put("Address", 3);
                             field.put("Contactno", 4);
                             field.put("Gender", 5);
                             field.put("Age", 6);
                            // field.put("DateOfBirth", 7);
                             field.put("Wcount", 9);
                           DBCursor cursor = db.getCollection("PR").find(query,field);
                           
                           count=cursor.count();
			/*while (cursor.hasNext())
			{
                            
				
			}*/

			Object[][] results = new Object[count][7];
			

			for (int i = 0; i < count; i++)
			{      
                               BasicDBObject obj = (BasicDBObject) cursor.next();
				results[i][0] = obj.getString("Id");
                                results[i][1] = obj.getString("Name");
				results[i][2] = obj.getString("Address");
				results[i][3] = obj.getString("Contactno");
				results[i][4] = obj.getString("Gender");
				results[i][5] = obj.getString("Age");
				//results[i][6] = obj.getString("DateOfBirth");
				results[i][6] = obj.getString("Wcount");
				
			}

			JTable table = new JTable(results, colHeads);

			int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

			JScrollPane jsp = new JScrollPane(table, v, h);

			p1.add(jsp, BorderLayout.CENTER);
		}
		catch (Exception e)
		{
			String dt = " ERROR";
			String dm = " ERROR : " + e;
			int dtype = JOptionPane.ERROR_MESSAGE;

			JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
		}


		setVisible(true);
		addWindowListener(this);
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