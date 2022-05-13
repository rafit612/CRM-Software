import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Form extends JFrame {
	private static final String COMMIT_ACTION = "commit";
	List<String> keywords;
	private JFrame frmBrSalesShee;
	static JProgressBar progressBar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JPanel contentPane;
	Boolean flag,flag2,flag3,flag4,flag5,flag6,flag7,flag8;
	Calendar calender;
	SimpleDateFormat timeFormat;
	String time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 public static void fill()
	    {
	        int i = 0;
	        try {
	            while (i <= 100) {
	                // fill the menu bar
	            	progressBar.setValue(i + 10);
	 
	                // delay the thread
	                Thread.sleep(1000);
	                i += 20;
	            }
	        }
	        catch (Exception e) {
	        }
	    }
		Connection con,con1,con2,don1;
		PreparedStatement pst,pst1,pst2,pst3,sst1,cc1,cc2,pst4,pst5,pst6; 
		private JTextField textField_18;
		private JTextField textField_19;
		private JTextField textField_2;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_20;
		private JTextField textField_21;
		public void Connect()
	    {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://192.168.10.103:3306/2022"
	            		+ ""
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
		public void Connect1()
	    {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            SimpleDateFormat formatDate12 = new SimpleDateFormat(
			            "yyyy_MM");
			    
			        Date date12 = new Date();
	            con1 = DriverManager.getConnection(("jdbc:mysql://192.168.10.103:3306/"+formatDate12.format(date12))
	            	, "root","pass");
	        }
	        catch (ClassNotFoundException ex)
	        {
	          ex.printStackTrace();
	          JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
	        }
	        catch (SQLException ex)
	        
	        {
						
				        
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
	        }
	 
	    }
		public void Connect3()
	    {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con2 = DriverManager.getConnection("jdbc:mysql://192.168.10.103:3306/bry"
	            	, "root","pass");
	        }
	        catch (ClassNotFoundException ex)
	        {
	          ex.printStackTrace();
	          JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
	        }
	        catch (SQLException ex)
	        
	        {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Failed!!!!!"+ex);
	        }
	 
	    }
	/**
	 * Create the frame.
	 */
	public Form() {
		
		Connect();
		Connect1();
		//Connect3();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1121, 626);
		contentPane = new JPanel();
		
		contentPane.setFont(new Font("Agency FB", Font.BOLD, 12));
		setType(Type.UTILITY);
		setTitle("BR Sales Sheet Software");
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 10, 1069, 626);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  
		  textField_21 = new JTextField();
		  textField_21.setBounds(579, 225, 167, 22);
		  contentPane.add(textField_21);
		  textField_21.setColumns(10);
		  textField_21.setFocusTraversalKeysEnabled(false);
		  
		  // Our words to complete
		  keywords = new ArrayList<String>(500);
		          keywords.add("hodge_financial");
		          keywords.add("recomlet");
		          keywords.add("palm_tree_capital");
		          keywords.add("tclawx");
		          keywords.add("pegasus_online_mart");
		          keywords.add("fastcity");
		          keywords.add("pure_alpine");
		          keywords.add("johnston_family_services");
		          keywords.add("da_wang");
		          keywords.add("revity");
		          keywords.add("peak_distribution");
		          keywords.add("linclone");
		          keywords.add("strive_marketplace");
		          keywords.add("jax_market");
		          keywords.add("midkiff_and_associate");
		          keywords.add("m14_ventures");
		          keywords.add("cpg_tech");
		          keywords.add("bangbazar");
		          keywords.add("eastwood_and_associates");
		          keywords.add("raw_assets");
		          keywords.add("cologic");
		          keywords.add("shurid_enterprise");
		          keywords.add("peak_pro");
		          
		          keywords.add("e_online_nation");
		          keywords.add("philly_fast");
		          keywords.add("yoga_mama");
		          keywords.add("priment");
		          keywords.add("bestpath");
		          keywords.add("bclawx");
		          keywords.add("sanfords");
		          keywords.add("item_depot_unlimited");
		          keywords.add("fast_and_easy_items");
		          keywords.add("lott_store");
		          keywords.add("cc18_estore");
		          keywords.add("m_and_d_joint_ventures");
		          keywords.add("apex");
		          
		  Autocomplete autoComplete = new Autocomplete(textField_21, keywords);
		  textField_21.getDocument().addDocumentListener(autoComplete);

		  // Maps the tab key to the commit action, which finishes the autocomplete
		  // when given a suggestion
		  textField_21.getInputMap().put(KeyStroke.getKeyStroke("TAB"), COMMIT_ACTION);
		  textField_21.getActionMap().put(COMMIT_ACTION, autoComplete.new CommitAction());
		
	
		  progressBar = new JProgressBar();
			progressBar.setBounds(492, 0, 146, 14);
			getContentPane().add(progressBar);
			progressBar.setVisible(false);
			
			JLabel lblNewLabel = new JLabel("");
			Image img = new ImageIcon(this.getClass().getResource("/br.jpg")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(262, 11, 507, 106);
			getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(170, 159, 280, 22);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Product");
			lblNewLabel_1.setBounds(170, 142, 46, 14);
			getContentPane().add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					String value = textField_1.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.' || ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		            	textField_1.setEditable(true);
		               
		            } else {
		            	textField_1.setEditable(false);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_1.setEditable(true);
	          
				}
			});
			textField_1.setColumns(10);
			textField_1.setBounds(708, 286, 96, 22);
			getContentPane().add(textField_1);
		
			
			JLabel lblNewLabel_1_1 = new JLabel("Amazon Tax");
			lblNewLabel_1_1.setBounds(708, 269, 122, 14);
			getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_1_1_1 = new JLabel("Shipping Status");
			lblNewLabel_1_1_1_1.setBounds(772, 208, 79, 14);
			getContentPane().add(lblNewLabel_1_1_1_1);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(170, 225, 174, 22);
			getContentPane().add(textField_3);
			
			JLabel lblNewLabel_1_2 = new JLabel("Order ID");
			lblNewLabel_1_2.setBounds(170, 208, 86, 14);
			getContentPane().add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_4 = new JLabel("Customer Name");
			lblNewLabel_1_2_4.setBounds(460, 142, 137, 14);
			getContentPane().add(lblNewLabel_1_2_4);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(460, 159, 219, 22);
			getContentPane().add(textField_7);
			
			JLabel lblNewLabel_1_2_5 = new JLabel("Date");
			lblNewLabel_1_2_5.setBounds(407, 269, 46, 14);
			getContentPane().add(lblNewLabel_1_2_5);
			
			textField_8 = new JTextField();
			textField_8.setBackground(Color.ORANGE);
			textField_8.setColumns(10);
			 SimpleDateFormat formatDate = new SimpleDateFormat(
			            "yyyy/MM/dd");
			    
			        Date date = new Date();
			        textField_8.setText(formatDate.format(date))   ;
			    	
			textField_8.setBounds(409, 286, 174, 22);
			getContentPane().add(textField_8);
			textField_8.setEditable(false);
			
			
			JLabel lblNewLabel_1_2_4_1 = new JLabel("Product Cost");
			lblNewLabel_1_2_4_1.setBounds(361, 208, 79, 14);
			getContentPane().add(lblNewLabel_1_2_4_1);
			
			textField_11 = new JTextField();
		
			textField_11.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					String value = textField_11.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.'  || ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		            	textField_11.setEditable(true);
		               
		            } else {
		            	textField_11.setEditable(false);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_11.setEditable(true);

				}
			
				public void keyReleased(KeyEvent ke) {


				


					
				}
			});
			textField_11.setColumns(10);
			textField_11.setBounds(354, 225, 96, 22);
			getContentPane().add(textField_11);
			
			JLabel lblNewLabel_1_2_4_2 = new JLabel("QTY");
			lblNewLabel_1_2_4_2.setBounds(474, 208, 36, 14);
			getContentPane().add(lblNewLabel_1_2_4_2);
			
			textField_12 = new JTextField();
			textField_12.setText("1");
			textField_12.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					String value = textField_12.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.' ||  ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		             } else {
		            	textField_12.setEditable(false);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_12.setEditable(true);
				}
				public void keyReleased(KeyEvent ke) {
			
					

		            
				}
			});
			textField_12.setColumns(10);
			textField_12.setBounds(474, 225, 75, 22);
			getContentPane().add(textField_12);
			
			JLabel lblNewLabel_1_2_4_3 = new JLabel("Notes");
			lblNewLabel_1_2_4_3.setBounds(811, 323, 137, 14);
			getContentPane().add(lblNewLabel_1_2_4_3);
			
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(811, 340, 232, 113);
			getContentPane().add(textField_13);
			
			JLabel lblNewLabel_1_2_4_4 = new JLabel("Purchase Order ID");
			lblNewLabel_1_2_4_4.setBounds(708, 142, 137, 14);
			getContentPane().add(lblNewLabel_1_2_4_4);
			
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(708, 159, 248, 22);
			getContentPane().add(textField_14);
			
			textField_15 = new JTextField();
			textField_15.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					String value = textField_15.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.' || ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		            	textField_15.setEditable(true);
		              } else {
		            	textField_15.setEditable(false);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_15.setEditable(true);
				}
				public void keyReleased(KeyEvent ke) {
			
				}
			});
			textField_15.setColumns(10);
			textField_15.setBounds(170, 286, 102, 22);
			getContentPane().add(textField_15);
			
			JLabel lblNewLabel_1_2_4_4_1 = new JLabel("Sale Price + Shipping");
			lblNewLabel_1_2_4_4_1.setBounds(170, 269, 137, 14);
			getContentPane().add(lblNewLabel_1_2_4_4_1);
			
			textField_16 = new JTextField();
			textField_16.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent ke) {
					String value = textField_16.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.' || ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V  || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		              textField_16.setEditable(false);
		               
		            } else {
		            	textField_16.setEditable(true);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_16.setEditable(true);
				}
			});
			textField_16.setColumns(10);
			textField_16.setBounds(822, 286, 105, 22);
			getContentPane().add(textField_16);
			
			JLabel lblNewLabel_1_2_4_2_1 = new JLabel("Supply Shipping Cost");
			lblNewLabel_1_2_4_2_1.setBounds(822, 269, 151, 14);
			getContentPane().add(lblNewLabel_1_2_4_2_1);
			
			textField_17 = new JTextField();
			textField_17.addKeyListener(new KeyAdapter() {
				@SuppressWarnings({ "deprecation", "static-access" })
				public void keyPressed(KeyEvent ke) {
					String value = textField_17.getText();
		            int l = value.length();
		            KeyStroke ctrlV = null;
		            if (ke.getKeyChar() == '0' || ke.getKeyChar() == '1' || ke.getKeyChar() == '2' || ke.getKeyChar() == '3' ||
		            		ke.getKeyChar() == '4' || ke.getKeyChar() == '5' || ke.getKeyChar() == '6' || ke.getKeyChar() == '7' ||
		            		ke.getKeyChar() == '8' || ke.getKeyChar() == '9' || ke.getKeyChar() == '.' || ke.isControlDown() || ke.getKeyCode() == KeyEvent.VK_V || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		            		textField_17.setEditable(true);
		               
		            } else {
		            	textField_17.setEditable(false);
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter only numeric digits(0-9)",
		            		    
		            		    value, JOptionPane.PLAIN_MESSAGE);
		            }
		            textField_17.setEditable(true);
				}
			});
			textField_17.setColumns(10);
			textField_17.setBounds(938, 286, 105, 22);
			getContentPane().add(textField_17);

			
			
			
			JLabel lblNewLabel_1_2_4_2_1_1 = new JLabel("Supply Tax");
			lblNewLabel_1_2_4_2_1_1.setBounds(938, 269, 105, 14);
			getContentPane().add(lblNewLabel_1_2_4_2_1_1);
			
			final JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Amazon", "Prime", "Wallmart"}));
			comboBox_1.setBounds(921, 225, 122, 22);
			getContentPane().add(comboBox_1);
			
			final JComboBox comboBox_1_1 = new JComboBox();
			 comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"On Process", "Shipped", "FS", "OS", "Cancel"}));
			comboBox_1_1.setBounds(772, 225, 122, 22);
			contentPane.add(comboBox_1_1);
			
			JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Supplier");
			lblNewLabel_1_1_1_1_1.setBounds(921, 208, 79, 14);
			getContentPane().add(lblNewLabel_1_1_1_1_1);
			

			JButton btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.addMouseListener(new MouseAdapter() {
				

				public void mouseClicked(MouseEvent e) {
					String str1=textField_11.getText().trim();
					
					for(int i=0; i < str1.length(); i++) {
						flag = Character.isDigit(str1.charAt(i));
					}
					String str2=textField_12.getText().trim();
					for(int i=0; i < str2.length(); i++) {
						flag2 = Character.isDigit(str2.charAt(i));
					}
					String str3=textField_15.getText().trim();
					for(int i=0; i < str3.length(); i++) {
						flag3 = Character.isDigit(str3.charAt(i));
					}

					String str5=textField_1.getText().trim();
					for(int i=0; i < str5.length(); i++) {
						flag5 = Character.isDigit(str5.charAt(i));
					}
					String str6=textField_16.getText().trim();
					for(int i=0; i < str6.length(); i++) {
						flag6 = Character.isDigit(str6.charAt(i));
					}
					String str7=textField_17.getText().trim();
					for(int i=0; i < str7.length(); i++) {
						flag7 = Character.isDigit(str7.charAt(i));
					}
					String str8=textField_9.getText().trim();
					for(int i=0; i < str8.length(); i++) {
						flag8 = Character.isDigit(str8.charAt(i));
					}
					if(flag==false || flag2==false || flag3==false || flag5==false||flag6 == false||flag7 == false || flag8 == false) {
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter Decimal Value in Calculation Boxes",
		            		    
		            		    "input is character. please chech there is a character,comma,or space", JOptionPane.PLAIN_MESSAGE);
					}
					if((textField.getText().isEmpty())||(textField_11.getText().isEmpty())||(textField_12.getText().isEmpty())||
							(textField_15.getText().isEmpty())||
							(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||(textField_1.getText().isEmpty())||
							(textField_3.getText().isEmpty())||(textField_14.getText().isEmpty())||
							(textField_13.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_21.getText().isEmpty())||(textField_17.getText().isEmpty())||
							(textField_18.getText().isEmpty())||(textField_18.getText().isEmpty())) {
		            	JOptionPane.showMessageDialog(frmBrSalesShee,
		            		    "Enter Value in all BOX",
		            		    
		            		    "Some input Missing", JOptionPane.PLAIN_MESSAGE);
					}
				
					else {
						progressBar.setVisible(true);
						String pro,PC,QTY,SPS,Supplier,oi,tax,bef,sta,np,cn,date,af,fee,add,mail,tracking_num,po,amz_tax,note
						,ssc,shipping_status,order_status,delivery_status,addre,gross,st,cogs,gp,time,editor,store,pur_order_id,amazon_administrative,email;
						pro = textField.getText();
						
						QTY = textField_12.getText().trim();
						SPS = textField_15.getText().trim();
						pur_order_id = textField_14.getText().trim();
						Supplier = String.valueOf(comboBox_1.getSelectedItem());
						oi = textField_3.getText().trim();
					
						amazon_administrative = textField_9.getText().trim();
						tracking_num = textField_2.getText().trim();
						shipping_status = String.valueOf(comboBox_1_1.getSelectedItem());
						PC = textField_11.getText().trim();
						cn = textField_7.getText();
						date = textField_8.getText();
					
						
						email=textField_5.getText().trim();
						addre = textField_11.getText();
						po = textField_6.getText().trim();
						note = textField_13.getText();
						ssc = textField_16.getText().trim();
						st = textField_17.getText().trim();
						order_status=textField_10.getText().trim();
						delivery_status=textField_20.getText().trim();
						amz_tax =textField_1.getText().trim();
						time =textField_18.getText().trim();
						editor =textField_19.getText() ;
						
						
						double COGS = (Double.parseDouble(textField_11.getText())*(Double.parseDouble(textField_12.getText())));
						
						
						double gross_p = Double.parseDouble(textField_15.getText())-COGS;
						double ama_fee =(Double.parseDouble(textField_15.getText())/100)*15;
						
					    double net_prof = gross_p-Double.parseDouble(textField_16.getText())-ama_fee;
					    double beffrugal = (COGS/100)*1;
						double total =net_prof+beffrugal;
						store= textField_21.getText().trim();
					
						cogs =Double. toString(COGS);
						gross =Double. toString(gross_p);
						np =Double. toString(net_prof);
						bef=Double. toString(beffrugal);
						fee=Double. toString(ama_fee);
						String total_profit = Double.toString(total);
						try {
							
							fill();
							cc1=con.prepareStatement("CREATE TABLE IF NOT EXISTS "+store+" ( id INT(50) UNSIGNED AUTO_INCREMENT PRIMARY KEY, date DATE NOT NULL, product_name LONGTEXT NOT NULL, qty INT(50), product_cost DOUBLE, sale_price_shipping DOUBLE, cogs DOUBLE, gross_profit DOUBLE, amazon_fee DOUBLE, supplier_tax DOUBLE, supplier_shipping_cost DOUBLE, amazon_administrative DOUBLE, net_profit DOUBLE, befrugal DOUBLE, cash_back_profit DOUBLE, total_profit DOUBLE, shipping_status VARCHAR(20), ordered_status VARCHAR(20), after_delivery_status VARCHAR(50), supplier_name VARCHAR(50), customer_name VARCHAR (50), purchase_order_id VARCHAR(50) UNIQUE KEY, amazon_order_id VARCHAR(50) UNIQUE KEY, amazon_tax DOUBLE, tracking_number VARCHAR(50) UNIQUE KEY, o_a_email_address VARCHAR(50), po INT(50) UNIQUE KEY, notes VARCHAR(100), editor VARCHAR(100));");
							cc1.executeUpdate();
							cc2=con1.prepareStatement("CREATE TABLE IF NOT EXISTS "+store+" ( id INT(50) UNSIGNED AUTO_INCREMENT PRIMARY KEY, date DATE NOT NULL, product_name LONGTEXT NOT NULL, qty INT(50), product_cost DOUBLE, sale_price_shipping DOUBLE, cogs DOUBLE, gross_profit DOUBLE, amazon_fee DOUBLE, supplier_tax DOUBLE, supplier_shipping_cost DOUBLE, amazon_administrative DOUBLE, net_profit DOUBLE, befrugal DOUBLE, cash_back_profit DOUBLE, total_profit DOUBLE, shipping_status VARCHAR(20), ordered_status VARCHAR(20), after_delivery_status VARCHAR(50), supplier_name VARCHAR(50), customer_name VARCHAR (50), purchase_order_id VARCHAR(50) UNIQUE KEY, amazon_order_id VARCHAR(50) UNIQUE KEY, amazon_tax DOUBLE, tracking_number VARCHAR(50) UNIQUE KEY, o_a_email_address VARCHAR(50), po INT(50) UNIQUE KEY, notes VARCHAR(100), editor VARCHAR(100));");
							cc2.executeUpdate();	
								pst = con.prepareStatement("insert into `all_store` (id,store_name,date,product_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,shipping_status,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_order_id,amazon_tax,tracking_number,o_a_email_address,po,notes,editor)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
								pst.setString(1, store);
								pst.setString(2, date);
							    pst.setString(3, pro);
							    pst.setString(4, QTY);
								pst.setString(5, PC);
								pst.setString(6, SPS);
							    pst.setString(7, cogs);
								pst.setString(8, gross);
								pst.setString(9, fee);
							    pst.setString(10, st);
								pst.setString(11, ssc);
								pst.setString(12, amazon_administrative);
							    pst.setString(13, np);
								pst.setString(14, bef);
								pst.setString(15, bef);
							    pst.setString(16, total_profit);
								pst.setString(17, shipping_status);
								pst.setString(18, order_status);
							    pst.setString(19, delivery_status);
								pst.setString(20, Supplier);
								pst.setString(21,cn );
								pst.setString(22, pur_order_id);
							    pst.setString(23, oi);
							    pst.setString(24, amz_tax);
							    pst.setString(25, tracking_num);
								pst.setString(26, email);
							    pst.setString(27, po);
							    pst.setString(28, note);
							    pst.setString(29, editor);
								pst.executeUpdate();
								
								pst6 = con.prepareStatement("insert into `all_store_backup` (id,store_name,date,time,product_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,shipping_status,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_order_id,amazon_tax,tracking_number,o_a_email_address,po,notes,editor)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
								pst6.setString(1, store);
								pst6.setString(2, date);
								pst6.setString(3, time);
							    pst6.setString(4, pro);
							    pst6.setString(5, QTY);
								pst6.setString(6, PC);
								pst6.setString(7, SPS);
							    pst6.setString(8, cogs);
								pst6.setString(9, gross);
								pst6.setString(10, fee);
							    pst6.setString(11, st);
								pst6.setString(12, ssc);
								pst6.setString(13, amazon_administrative);
							    pst6.setString(14, np);
								pst6.setString(15, bef);
								pst6.setString(16, bef);
							    pst6.setString(17, total_profit);
								pst6.setString(18, shipping_status);
								pst6.setString(19, order_status);
							    pst6.setString(20, delivery_status);
								pst6.setString(21, Supplier);
								pst6.setString(22,cn );
								pst6.setString(23, pur_order_id);
							    pst6.setString(24, oi);
							    pst6.setString(25, amz_tax);
							    pst6.setString(26, tracking_num);
								pst6.setString(27, email);
							    pst6.setString(28, po);
							    pst6.setString(29, note);
							    pst6.setString(30, editor);
								pst6.executeUpdate();
								
								pst4 = con.prepareStatement("insert into `"+store+"` (id,date,product_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,shipping_status,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_order_id,amazon_tax,tracking_number,o_a_email_address,po,notes,editor)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
								
								pst4.setString(1, date);
							    pst4.setString(2, pro);
							    pst4.setString(3, QTY);
								pst4.setString(4, PC);
								pst4.setString(5, SPS);
							    pst4.setString(6, cogs);
								pst4.setString(7, gross);
								pst4.setString(8, fee);
							    pst4.setString(9, st);
								pst4.setString(10, ssc);
								pst4.setString(11, amazon_administrative);
							    pst4.setString(12, np);
								pst4.setString(13, bef);
								pst4.setString(14, bef);
							    pst4.setString(15, total_profit);
								pst4.setString(16, shipping_status);
								pst4.setString(17, order_status);
							    pst4.setString(18, delivery_status);
								pst4.setString(19, Supplier);
								pst4.setString(20,cn );
								pst4.setString(21, pur_order_id);
							    pst4.setString(22, oi);
							    pst4.setString(23, amz_tax);
							    pst4.setString(24, tracking_num);
								pst4.setString(25, email);
							    pst4.setString(26, po);
							    pst4.setString(27, note);
							    pst4.setString(28, editor);
								pst4.executeUpdate();
			
								  SimpleDateFormat formatDate45 = new SimpleDateFormat(
								            "MM_yyyy");
								    
								        Date date45 = new Date();
								pst3 = con.prepareStatement("Select store_name from all_store_individual where store_name=?");
								pst3.setString(1, store);
								ResultSet rs = pst3.executeQuery();
								if (rs.next()) {
									pst = con.prepareStatement("UPDATE all_store_individual SET qty=qty+? , product_cost = product_cost+?, sale_price_shipping = sale_price_shipping + ? , cogs = cogs + ? , gross_profit = gross_profit + ? , amazon_fee = amazon_fee + ? , supplier_tax = supplier_tax + ? , supplier_shipping_cost = supplier_shipping_cost + ?,amazon_administrative=amazon_administrative+?,net_profit=net_profit+?,befrugal=befrugal+?,cash_back_profit=cash_back_profit+?,total_profit=total_profit+?,amazon_tax=amazon_tax+? WHERE store_name = '"+store+"';");
									
								    pst.setString(1, QTY);
									pst.setString(2, PC);
									pst.setString(3, SPS);
								    pst.setString(4, cogs);
									pst.setString(5, gross);
									pst.setString(6, fee);
								    pst.setString(7, st);
									pst.setString(8, ssc);
									pst.setString(9, amazon_administrative);
								    pst.setString(10, np);
									pst.setString(11, bef);
									pst.setString(12, bef);
								    pst.setString(13, total_profit);
								    pst.setString(14, amz_tax);
									pst.executeUpdate();
									
								}else {
									pst = con.prepareStatement("INSERT INTO all_store_individual (id,store_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,amazon_tax)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
										pst.setString(1, store);
								    pst.setString(2, QTY);
									pst.setString(3, PC);
									pst.setString(4, SPS);
								    pst.setString(5, cogs);
									pst.setString(6, gross);
									pst.setString(7, fee);
								    pst.setString(8, st);
									pst.setString(9, ssc);
									pst.setString(10, amazon_administrative);
								    pst.setString(11, np);
									pst.setString(12, bef);
									pst.setString(13, bef);
								    pst.setString(14, total_profit);
								    pst.setString(15, amz_tax);
									pst.executeUpdate();
			                    }
								
								pst1 = con1.prepareStatement("insert into `all_store` (id,store_name,date,product_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,shipping_status,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_order_id,amazon_tax,tracking_number,o_a_email_address,po,notes,editor)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
								pst1.setString(1, store);
								pst1.setString(2, date);
							    pst1.setString(3, pro);
							    pst1.setString(4, QTY);
								pst1.setString(5, PC);
								pst1.setString(6, SPS);
							    pst1.setString(7, cogs);
								pst1.setString(8, gross);
								pst1.setString(9, fee);
							    pst1.setString(10, st);
								pst1.setString(11, ssc);
								pst1.setString(12, amazon_administrative);
							    pst1.setString(13, np);
								pst1.setString(14, bef);
								pst1.setString(15, bef);
							    pst1.setString(16, total_profit);
								pst1.setString(17, shipping_status);
								pst1.setString(18, order_status);
							    pst1.setString(19, delivery_status);
								pst1.setString(20, Supplier);
								pst1.setString(21,cn );
								pst1.setString(22, pur_order_id);
							    pst1.setString(23, oi);
							    pst1.setString(24, amz_tax);
							    pst1.setString(25, tracking_num);
								pst1.setString(26, email);
							    pst1.setString(27, po);
							    pst1.setString(28, note);
							    pst1.setString(29, editor);
								pst1.executeUpdate();
								
							
								
								pst5 = con1.prepareStatement("insert into `"+store+"` (id,date,product_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,shipping_status,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_order_id,amazon_tax,tracking_number,o_a_email_address,po,notes,editor)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
								
								pst5.setString(1, date);
							    pst5.setString(2, pro);
							    pst5.setString(3, QTY);
								pst5.setString(4, PC);
								pst5.setString(5, SPS);
							    pst5.setString(6, cogs);
								pst5.setString(7, gross);
								pst5.setString(8, fee);
							    pst5.setString(9, st);
								pst5.setString(10, ssc);
								pst5.setString(11, amazon_administrative);
							    pst5.setString(12, np);
								pst5.setString(13, bef);
								pst5.setString(14, bef);
							    pst5.setString(15, total_profit);
								pst5.setString(16, shipping_status);
								pst5.setString(17, order_status);
							    pst5.setString(18, delivery_status);
								pst5.setString(19, Supplier);
								pst5.setString(20,cn );
								pst5.setString(21, pur_order_id);
							    pst5.setString(22, oi);
							    pst5.setString(23, amz_tax);
							    pst5.setString(24, tracking_num);
								pst5.setString(25, email);
							    pst5.setString(26, po);
							    pst5.setString(27, note);
							    pst5.setString(28, editor);
								pst5.executeUpdate();
								
								pst3 = con1.prepareStatement("Select store_name from all_store_individual where store_name=?");
								pst3.setString(1, store);
								ResultSet rs1 = pst3.executeQuery();
								if (rs1.next()) {
									pst1 = con1.prepareStatement("UPDATE all_store_individual SET qty=qty+? , product_cost = product_cost+?, sale_price_shipping = sale_price_shipping + ? , cogs = cogs + ? , gross_profit = gross_profit + ? , amazon_fee = amazon_fee + ? , supplier_tax = supplier_tax + ? , supplier_shipping_cost = supplier_shipping_cost + ?,amazon_administrative=amazon_administrative+?,net_profit=net_profit+?,befrugal=befrugal+?,cash_back_profit=cash_back_profit+?,total_profit=total_profit+?,amazon_tax=amazon_tax+? WHERE store_name = '"+store+"';");
									
								    pst1.setString(1, QTY);
									pst1.setString(2, PC);
									pst1.setString(3, SPS);
								    pst1.setString(4, cogs);
									pst1.setString(5, gross);
									pst1.setString(6, fee);
								    pst1.setString(7, st);
									pst1.setString(8, ssc);
									pst1.setString(9, amazon_administrative);
								    pst1.setString(10, np);
									pst1.setString(11, bef);
									pst1.setString(12, bef);
								    pst1.setString(13, total_profit);
								    pst1.setString(14, amz_tax);
									pst1.executeUpdate();
									
								}else {
									pst1 = con1.prepareStatement("INSERT INTO all_store_individual (id,store_name,qty,product_cost,sale_price_shipping,cogs,gross_profit,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profit,befrugal,cash_back_profit,total_profit,amazon_tax)values(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
										pst1.setString(1, store);
								    pst1.setString(2, QTY);
									pst1.setString(3, PC);
									pst1.setString(4, SPS);
								    pst1.setString(5, cogs);
									pst1.setString(6, gross);
									pst1.setString(7, fee);
								    pst1.setString(8, st);
									pst1.setString(9, ssc);
									pst1.setString(10, amazon_administrative);
								    pst1.setString(11, np);
									pst1.setString(12, bef);
									pst1.setString(13, bef);
								    pst1.setString(14, total_profit);
								    pst1.setString(15, amz_tax);
									pst1.executeUpdate();
			                    }
									//	pst1 = con1.prepareStatement("UPDATE "+formatDate45.format(date45).toString()+" SET PC = PC + ?, QTY = QTY + ?, SPS=SPS+?,  tax = tax + ? , bef = bef + ? , np = np + ? , af = af +? , fee = fee + ? , ssc = ssc+? , st = st + ? , cogs = cogs + ? , gross =gross + ? WHERE store = '"+store+"' ;");
							 //   pst1.setString(1, PC);
					
							//	pst1.setString(2, QTY);
							//	pst1.setString(3, SPS);
							//	pst1.setString(4, tax);
							//    pst1.setString(5, bef);
							
							//	pst1.setString(6, np);
							//	pst1.setString(7, fee);
							 //   pst1.setString(8, fee);
							 //   pst1.setString(9, ssc);
							//	pst1.setString(10, st);
							//	pst1.setString(11, cogs);
							   // pst1.setString(12, gross);
							
								//pst1.executeUpdate();
								
								//  SimpleDateFormat formatDate46 = new SimpleDateFormat(
								    //        "yyyy");
								    
								   //     Date date46 = new Date();
			
								
								textField.requestFocus();
								JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!"+store);
								textField_11.setText("");
								textField_12.setText("");
								textField_13.setText("");
								textField_14.setText("");
								textField_15.setText("");
								textField_16.setText("");
								textField_17.setText("");
							
								textField_19.setText("");
								textField.setText("");
								textField_1.setText("");
								
								textField_3.setText("");
							
							
								textField_7.setText("");
							
		
								progressBar.setVisible(true);
							
								SimpleDateFormat formatDate3 = new SimpleDateFormat(
							            "HH:mm:ss z");
							        Date date3 = new Date();
							        formatDate3.setTimeZone(TimeZone.getTimeZone("BD"));
							       
							        textField_18.setText(formatDate3.format(date3));
							        
							        SimpleDateFormat formatDate4 = new SimpleDateFormat(
								            "yyyy/MM/dd");
								    
								        Date date4 = new Date();
								        textField_8.setText(formatDate4.format(date4))   ;
						
						   }
						 
						catch (SQLException e1)
						       {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Record Failed!!!!!"+e1);
						progressBar.setVisible(true);
						}
				
					}
				}
			});
			btnNewButton.setBackground(Color.YELLOW);
			btnNewButton.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
			btnNewButton.setBounds(869, 522, 174, 54);
			getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("Time");
			lblNewLabel_1_1_2.setBounds(593, 269, 105, 14);
			getContentPane().add(lblNewLabel_1_1_2);
			
			textField_18 = new JTextField();
			SimpleDateFormat formatDate1 = new SimpleDateFormat(
		            "HH:mm:ss z");
		        Date date1 = new Date();
		        formatDate.setTimeZone(TimeZone.getTimeZone("BD"));
		       
		        textField_18.setText(formatDate1.format(date1));
		  
			textField_18.setBackground(Color.ORANGE);
			textField_18.setColumns(10);
			textField_18.setBounds(593, 286, 96, 22);
			getContentPane().add(textField_18);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(599, 539, 251, 37);
			getContentPane().add(textField_19);
			
			JLabel lblNewLabel_1_2_4_5 = new JLabel("Data Entry By");
			lblNewLabel_1_2_4_5.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1_2_4_5.setBounds(599, 496, 137, 32);
			getContentPane().add(lblNewLabel_1_2_4_5);
			

			
			JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Store Name");
			lblNewLabel_1_1_1_1_2.setBounds(579, 208, 79, 14);
			getContentPane().add(lblNewLabel_1_1_1_1_2);
			
			JButton btnRefresh = new JButton("Refresh");
			btnRefresh.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					SimpleDateFormat formatDate3 = new SimpleDateFormat(
				            "HH:mm:ss z");
				        Date date3 = new Date();
				        formatDate3.setTimeZone(TimeZone.getTimeZone("BST"));
				       
				        textField_18.setText(formatDate3.format(date3));
				        
				        SimpleDateFormat formatDate4 = new SimpleDateFormat(
					            "yyyy/MM/dd");
					    
					        Date date4 = new Date();
					        textField_8.setText(formatDate4.format(date4))   ;
					    	
				}
			});
			btnRefresh.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
			btnRefresh.setBackground(Color.GREEN);
			btnRefresh.setBounds(10, 161, 151, 32);
			getContentPane().add(btnRefresh);
			
			JButton btnRefresh_1_1 = new JButton("Admin Panel");
			btnRefresh_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
	                MidAdminLogin ah = new MidAdminLogin();
	                ah.setVisible(true);
				}
			});
			btnRefresh_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
			btnRefresh_1_1.setBackground(Color.GREEN);
			btnRefresh_1_1.setBounds(10, 198, 150, 32);
			contentPane.add(btnRefresh_1_1);
			
			JLabel lblNewLabel_1_2_4_4_2 = new JLabel("Tracking Number");
			lblNewLabel_1_2_4_4_2.setBounds(170, 336, 137, 14);
			contentPane.add(lblNewLabel_1_2_4_4_2);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(170, 353, 248, 22);
			contentPane.add(textField_2);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(170, 403, 248, 22);
			contentPane.add(textField_5);
			
			JLabel lblNewLabel_1_2_4_4_2_1 = new JLabel("Email");
			lblNewLabel_1_2_4_4_2_1.setBounds(170, 386, 137, 14);
			contentPane.add(lblNewLabel_1_2_4_4_2_1);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(443, 353, 96, 22);
			contentPane.add(textField_6);
			
			JLabel lblNewLabel_1_2_4_1_1 = new JLabel("PO");
			lblNewLabel_1_2_4_1_1.setBounds(443, 336, 79, 14);
			contentPane.add(lblNewLabel_1_2_4_1_1);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(443, 403, 154, 22);
			contentPane.add(textField_9);
			
			JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Amazon Administrative");
			lblNewLabel_1_2_4_1_2.setBounds(443, 386, 140, 14);
			contentPane.add(lblNewLabel_1_2_4_1_2);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(549, 353, 123, 22);
			contentPane.add(textField_10);
			
			JLabel lblNewLabel_1_2_4_4_2_2 = new JLabel("Order Status");
			lblNewLabel_1_2_4_4_2_2.setBounds(549, 336, 137, 14);
			contentPane.add(lblNewLabel_1_2_4_4_2_2);
			
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(623, 403, 123, 22);
			contentPane.add(textField_20);
			
			JLabel lblNewLabel_1_2_4_4_2_2_1 = new JLabel("After Delivery");
			lblNewLabel_1_2_4_4_2_2_1.setBounds(623, 386, 137, 14);
			contentPane.add(lblNewLabel_1_2_4_4_2_2_1);
			
			

		
		
	}
	public void setTime() {
		// TODO Auto-generated method stub
		while(true) {
			timeFormat = new SimpleDateFormat("HH:mm:ss");
			time = timeFormat.format(Calendar.getInstance().getTime());	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
