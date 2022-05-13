import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MidAdminLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	static JProgressBar progressBar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MidAdminLogin frame = new MidAdminLogin();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con,con1,con2;
	PreparedStatement pst,pst1,pst2; 
	private JTextField textField;
	public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.10.103:3306/userlogin"
            	, "root","pass");
        }
        catch (ClassNotFoundException ex)
        {
          ex.printStackTrace();
          JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
          System.exit(0);
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
            System.exit(0);
        }
 
    }
    void getMAC(InetAddress addr) throws SocketException
    {
        // create a variable of type NetworkInterface and
        // assign it with the value returned by the
        // getByInetAddress() method

    }
    
    public MidAdminLogin() {
    	
    	Connect();
		setType(Type.UTILITY);
		setTitle("BR MID ADMIN LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 10, 1069, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		Image img = new ImageIcon(this.getClass().getResource("/login.jpg")).getImage();
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                String userid = textField.getText();
                @SuppressWarnings("deprecation")
				String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/userlogin",
                        "root", "");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select userid, password from miduser where userid=? and password=?");

                    st.setString(1, userid);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                 
                     
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                        StringBuilder sb = new StringBuilder();
                        InetAddress addr = null;
                        dispose();
                        Edit ah = new Edit();
                        ah.setVisible(true);
                        try {
                        	
                        	  
							try {
								addr = InetAddress.getLocalHost();
							} catch (UnknownHostException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
                            NetworkInterface iface
                            = NetworkInterface.getByInetAddress(addr);
                  
                        // create a byte array and store the value returned
                        // by the NetworkInterface.getHardwareAddress()
                        // method
                        byte[] mac = iface.getHardwareAddress();
                        
                        // convert the obtained byte array into a printable
                        // String
                        
                        for (int i = 0; i < mac.length; i++) {
                            sb.append(String.format(
                                "%02X%s", mac[i],
                                (i < mac.length - 1) ? "-" : ""));
                        }
                        
                        // print the final String containing the MAC Address
                        System.out.println(sb.toString());  
                            

                        }
                        catch (SocketException e2) {
                            e2.printStackTrace();
                        }
                        
                        
    					try {
    						
    				        InetAddress localhost = null;
							try {
								localhost = InetAddress.getLocalHost();
							} catch (UnknownHostException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							//	JOptionPane.showMessageDialog(null, "Device is not connect to internet");
							}
    				        System.out.println("System IP Address : " +
    				                      (localhost.getHostAddress()).trim());
    				 
    				        // Find public IP address
    				        String systemipaddress = "";
    				        try
    				        {
    				            URL url_name = new URL("http://bot.whatismyipaddress.com");
    				 
    				            BufferedReader sc =
    				            new BufferedReader(new InputStreamReader(url_name.openStream()));
    				 
    				            // reads system IPAddress
    				            systemipaddress = sc.readLine().trim();
    				        }
    				        catch (Exception e3)
    				        {
    				        	//JOptionPane.showMessageDialog(null, "Device is not connect to internet");
    				            systemipaddress = "Cannot Execute Properly = ";
    				        }
    				        System.out.println("Public IP Address: " + systemipaddress +"\n");
    						
    						
    						
    						
							SimpleDateFormat formatDate3 = new SimpleDateFormat(
						            "HH:mm:ss z");
						        Date date3 = new Date();
						        formatDate3.setTimeZone(TimeZone.getTimeZone("BST"));
						       
						    
						        
						        SimpleDateFormat formatDate4 = new SimpleDateFormat(
							            "yyyy/MM/dd");
							    
							        Date date4 = new Date();
							      
    							pst = con.prepareStatement("insert into userdetail (username,mac,p_ip,s_ip,time,date)values(?,?,?,?,?,?)");
    							pst.setString(1, userid);
    							pst.setString(2, sb.toString());
    						    pst.setString(3, (localhost.getHostAddress()).trim());
    							pst.setString(4, systemipaddress);
    							pst.setString(5, formatDate3.format(date3) );
    						    pst.setString(6, formatDate4.format(date4));
    					
    		
    							pst.executeUpdate();
    		
    						
    							progressBar.setVisible(true);
    						
    						    
    					
    					   }
    					 
    					catch (SQLException e1)
    					       {
    					e1.printStackTrace();
    					JOptionPane.showMessageDialog(null, "Record Failed!!!!!"+e1);
    					progressBar.setVisible(true);
    					}
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
			
		});
		
		textField = new JTextField();
		textField.setBounds(373, 301, 293, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		btnNewButton.setBounds(533, 423, 133, 38);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 358, 292, 38);
		contentPane.add(passwordField);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 1053, 587);
		contentPane.add(lblNewLabel);
    }

}
