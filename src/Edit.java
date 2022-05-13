import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Edit extends JFrame {
	private static final String COMMIT_ACTION = "commit";
	List<String> keywords;
	private JFrame editframe;
	Connection con,con1,con2;
	PreparedStatement pst,pst1,pst2,pst3,pst4,pst5;
	String store,aoi,shipping_status,date,product_name,qty,product_cost,sale_price_shipping,cog,gross_profits,amazon_fee,supplier_tax,supplier_shipping_cost,amazon_administrative,net_profits,befrugals,cash_back_profit,total_profit,ordered_status,after_delivery_status,supplier_name,customer_name,purchase_order_id,amazon_tax,tracking_number
	,email,po,note,editor;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	String cogs,gross_profit,net_profit,befrugal,cash_b_p,total_p;
	private JTextField textField_23;
	public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.10.103:80/2022"
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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Edit() {
		Connect();
		Connect1();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1121, 626);
		contentPane = new JPanel();
		
		contentPane.setFont(new Font("Agency FB", Font.BOLD, 12));
		setType(Type.UTILITY);
		setTitle("BR Sales Sheet Software");
		setForeground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 10, 1069, 626);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnRefresh = new JButton("Home");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRefresh.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
                Form ah = new Form();
                ah.setVisible(true);
				    	
			}
		});
		btnRefresh.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh.setBackground(Color.GREEN);
		btnRefresh.setBounds(10, 421, 151, 32);
		getContentPane().add(btnRefresh);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/br.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(262, 11, 507, 106);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(737, 206, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(737, 225, 280, 22);
		contentPane.add(textField);
		textField.setEditable(false);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Customer Name");
		lblNewLabel_1_2_4.setBounds(275, 262, 137, 14);
		contentPane.add(lblNewLabel_1_2_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(283, 287, 219, 22);
		contentPane.add(textField_1);
		textField_1.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_4 = new JLabel("Purchase Order ID");
		lblNewLabel_1_2_4_4.setBounds(437, 142, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(437, 161, 248, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Order ID");
		lblNewLabel_1_2.setBounds(775, 142, 86, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(775, 161, 174, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("Product Cost");
		lblNewLabel_1_2_4_1.setBounds(164, 262, 79, 14);
		contentPane.add(lblNewLabel_1_2_4_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 287, 96, 22);
		contentPane.add(textField_4);
		textField_4.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_2 = new JLabel("QTY");
		lblNewLabel_1_2_4_2.setBounds(284, 340, 36, 14);
		contentPane.add(lblNewLabel_1_2_4_2);
		
		textField_5 = new JTextField();
		
		textField_5.setColumns(10);
		textField_5.setBounds(285, 356, 75, 22);
		contentPane.add(textField_5);
		textField_5.setEditable(false);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Store Name");
		lblNewLabel_1_1_1_1_2.setBounds(164, 142, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Shipping Status");
		lblNewLabel_1_1_1_1.setBounds(164, 206, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(164, 225, 123, 22);
		contentPane.add(textField_6);
		textField_6.setEditable(false);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Supplier");
		lblNewLabel_1_1_1_1_1.setBounds(318, 206, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_4_4_1 = new JLabel("Sale Price + Shipping");
		lblNewLabel_1_2_4_4_1.setBounds(164, 340, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(164, 356, 102, 22);
		contentPane.add(textField_7);
		textField_7.setEditable(false);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Fee");
		lblNewLabel_1_2_1.setBounds(164, 389, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(170, 414, 96, 22);
		contentPane.add(textField_8);
		textField_8.setEditable(false);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Date");
		lblNewLabel_1_2_5.setBounds(845, 262, 46, 14);
		contentPane.add(lblNewLabel_1_2_5);
		
		textField_9 = new JTextField();
		
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.ORANGE);
		textField_9.setBounds(843, 287, 174, 22);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Time");
		lblNewLabel_1_1_2.setBounds(636, 340, 105, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_10 = new JTextField();
	
		textField_10.setColumns(10);
		textField_10.setBackground(Color.ORANGE);
		textField_10.setBounds(645, 356, 96, 22);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Amazon Tax");
		lblNewLabel_1_1.setBounds(517, 340, 122, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(520, 356, 96, 22);
		contentPane.add(textField_11);
		//textField_11.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_2_1 = new JLabel("Supply Shipping Cost");
		lblNewLabel_1_2_4_2_1.setBounds(526, 270, 151, 14);
		contentPane.add(lblNewLabel_1_2_4_2_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(548, 287, 105, 22);
		contentPane.add(textField_12);
		textField_12.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_2_1_1 = new JLabel("Supply Tax");
		lblNewLabel_1_2_4_2_1_1.setBounds(678, 270, 105, 14);
		contentPane.add(lblNewLabel_1_2_4_2_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(678, 287, 105, 22);
		contentPane.add(textField_13);
		textField_13.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_4_2 = new JLabel("Tracking Number");
		lblNewLabel_1_2_4_4_2.setBounds(448, 206, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(448, 225, 248, 22);
		contentPane.add(textField_14);
		textField_14.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_1_1 = new JLabel("PO");
		lblNewLabel_1_2_4_1_1.setBounds(283, 389, 79, 14);
		contentPane.add(lblNewLabel_1_2_4_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(283, 414, 96, 22);
		contentPane.add(textField_15);
		textField_15.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_4_2_2 = new JLabel("Order Status");
		lblNewLabel_1_2_4_4_2_2.setBounds(516, 389, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4_2_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(516, 414, 123, 22);
		contentPane.add(textField_16);
		textField_16.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_3 = new JLabel("Notes");
		lblNewLabel_1_2_4_3.setBounds(771, 323, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_3);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(771, 340, 232, 113);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel_1_2_4_4_2_1 = new JLabel("Email");
		lblNewLabel_1_2_4_4_2_1.setBounds(171, 447, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4_2_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(170, 472, 248, 22);
		contentPane.add(textField_18);
		textField_18.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Amazon Administrative");
		lblNewLabel_1_2_4_1_2.setBounds(561, 447, 140, 14);
		contentPane.add(lblNewLabel_1_2_4_1_2);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(561, 472, 154, 22);
		contentPane.add(textField_19);
		textField_19.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_4_2_2_1 = new JLabel("After Delivery");
		lblNewLabel_1_2_4_4_2_2_1.setBounds(771, 464, 137, 14);
		contentPane.add(lblNewLabel_1_2_4_4_2_2_1);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(771, 489, 123, 22);
		contentPane.add(textField_20);
		textField_20.setEditable(false);
		
		JLabel lblNewLabel_1_2_4_5 = new JLabel("Data Edit By");
		lblNewLabel_1_2_4_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_4_5.setBounds(559, 505, 137, 32);
		contentPane.add(lblNewLabel_1_2_4_5);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(559, 539, 251, 37);
		contentPane.add(textField_21);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		btnEdit.setBackground(Color.YELLOW);
		btnEdit.setBounds(829, 522, 174, 54);
		contentPane.add(btnEdit);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(318, 225, 105, 22);
		contentPane.add(textField_22);
		textField_22.setEditable(false);
		
		//textField_6.setText(rs.getString("shipping_status"));

//	//	textField_9.setText(rs.getString("date"));
		//textField.setText(rs.getString("product_name"));
		//textField_5.setText(rs.getString("qty"));
		//textField_4.setText(rs.getString("product_cost"));
	//	textField_7.setText(rs.getString("sale_price_shipping"));
	///	cogs=(rs.getString("cogs"));
	//	gross_profit=(rs.getString("gross_profit"));
	//	textField_8.setText(rs.getString("amazon_fee"));
	///	textField_13.setText(rs.getString("supplier_tax"));
		//textField_12.setText(rs.getString("supplier_shipping_cost"));
	//	textField_19.setText(rs.getString("amazon_administrative"));
	//	net_profit=(rs.getString("net_profit"));
	//	befrugal=(rs.getString("befrugal"));
	//	cash_b_p=(rs.getString("cash_back_profit"));
	//	total_p=(rs.getString("total_profit"));
	//	textField_16.setText(rs.getString("ordered_status"));
	//	textField_20.setText(rs.getString("after_delivery_status"));
	//	textField_22.setText(rs.getString("supplier_name"));
	//	textField_1.setText(rs.getString("customer_name"));
	//	textField_2.setText(rs.getString("purchase_order_id"));
		
	//	textField_11.setText(rs.getString("amazon_tax"));
	//	textField_14.setText(rs.getString("tracking_number"));
	//	textField_18.setText(rs.getString("o_a_email_address"));
	//	textField_15.setText(rs.getString("po"));
	//	textField_17.setText(rs.getString("notes"));
	//	textField_21.setText(rs.getString("editor"));
		
		JButton btnGo = new JButton("GO");
		btnGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 
		            SimpleDateFormat formatDate12 = new SimpleDateFormat(
				            "yyyy");
				    
				        Date date12 = new Date();
				try {
					aoi=textField_3.getText().trim();
					store=textField_23.getText().trim();
					pst1=con.prepareStatement("SELECT * FROM all_store WHERE amazon_order_id = ?");
					
					pst1.setString(1,aoi);
					//pst1.setString(2,store_n);
					ResultSet rs =pst1.executeQuery();
					
					if (rs.next()) {
						textField_23.setText(rs.getString("store_name"));
							textField_6.setText(rs.getString("shipping_status"));
						textField_9.setText(rs.getString("date"));
						textField.setText(rs.getString("product_name"));
						textField_5.setText(rs.getString("qty"));
						textField_4.setText(rs.getString("product_cost"));
						textField_7.setText(rs.getString("sale_price_shipping"));
						cogs=(rs.getString("cogs"));
						gross_profit=(rs.getString("gross_profit"));

						textField_8.setText(rs.getString("amazon_fee"));
						textField_13.setText(rs.getString("supplier_tax"));
						textField_12.setText(rs.getString("supplier_shipping_cost"));
						textField_19.setText(rs.getString("amazon_administrative"));
						net_profit=(rs.getString("net_profit"));
						befrugal=(rs.getString("befrugal"));
						cash_b_p=(rs.getString("cash_back_profit"));
						total_p=(rs.getString("total_profit"));
						textField_16.setText(rs.getString("ordered_status"));
						textField_20.setText(rs.getString("after_delivery_status"));
						textField_22.setText(rs.getString("supplier_name"));
						textField_1.setText(rs.getString("customer_name"));
						textField_2.setText(rs.getString("purchase_order_id"));

						textField_11.setText(rs.getString("amazon_tax"));
						textField_14.setText(rs.getString("tracking_number"));
						textField_18.setText(rs.getString("o_a_email_address"));
						textField_15.setText(rs.getString("po"));
						textField_17.setText(rs.getString("notes"));
						textField_21.setText(rs.getString("editor"));
					}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Not Found"+e1);
				}
				
			}
		});

		
		btnGo.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnGo.setBackground(Color.GREEN);
		btnGo.setBounds(959, 160, 67, 22);
		contentPane.add(btnGo);
		
		JButton btnGo_1 = new JButton("GO");
		btnGo_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnGo_1.setBackground(Color.GREEN);
		btnGo_1.setBounds(693, 160, 67, 22);
		contentPane.add(btnGo_1);
		
		JButton btnOs = new JButton("OS");
		btnOs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((textField_6.getText().isEmpty())||(textField_22.getText().isEmpty())||(textField_14.getText().isEmpty())||
						(textField.getText().isEmpty())||(textField_4.getText().isEmpty())||
						(textField_1.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_12.getText().isEmpty())||
						(textField_13.getText().isEmpty())||(textField_11.getText().isEmpty())||
						(textField_9.getText().isEmpty())||(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||
						(textField_15.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_18.getText().isEmpty())||(textField_19.getText().isEmpty())||(textField_16.getText().isEmpty())) {
	            	JOptionPane.showMessageDialog(editframe,
		    "First Find product entering Order ID and Select Store",
	            		    
	            		    "Give Data", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					shipping_status=textField_6.getText().toString();
					qty=textField_5.getText().toString();
					product_cost=textField_4.getText().toString();
					sale_price_shipping=textField_7.getText().toString();
					cog=cogs;
					gross_profits=gross_profit;

					amazon_fee=textField_8.getText().toString();
					supplier_tax=textField_13.getText().toString();
					supplier_shipping_cost=textField_12.getText().toString();
					amazon_administrative = textField_19.getText().toString();
					net_profits=net_profit;
					befrugals=befrugal;
					cash_back_profit=cash_b_p;
					total_profit = total_p;
					ordered_status = textField_16.getText().toString();
					after_delivery_status =textField_20.getText().toString();
					supplier_name = textField_22.getText().toString();
					customer_name =textField_1.getText().toString();
					purchase_order_id = textField_2.getText().toString();
					amazon_tax=textField_11.getText().toString();
					tracking_number=textField_14.getText().toString();
					email=textField_18.getText().toString();
					po=textField_15.getText().toString();
					note=textField_17.getText().toString();
					editor=textField_21.getText().toString();
					try {
						pst = con.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						pst1 = con1.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit -?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						
						pst2 = con.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE  amazon_order_id = '"+aoi+"' ;");
						pst3 = con1.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE amazon_order_id = '"+aoi+"' ;");
					
						pst4=con.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? ,shipping_status = 'OS',editor ='"+editor+"' ,notes = '"+note+"' WHERE  amazon_order_id = '"+aoi+"' ;");
						
						pst5=con1.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ?, shipping_status = 'OS' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");
					
						pst.setString(1, qty);
						pst.setString(2, product_cost);
						pst.setString(3, sale_price_shipping);
					    pst.setString(4, cog);
						pst.setString(5, gross_profits);
						pst.setString(6, amazon_fee);
					    pst.setString(7, supplier_tax);
						pst.setString(8, supplier_shipping_cost);
						pst.setString(9, amazon_administrative);
				    pst.setString(10, net_profits);
				    pst.setString(11, amazon_administrative);
						pst.setString(12, befrugals);
					pst.setString(13, cash_back_profit);
					    pst.setString(14, total_profit);
					    pst.setString(15, amazon_tax);
						
						
						pst1.setString(1, qty);
						pst1.setString(2, product_cost);
						pst1.setString(3, sale_price_shipping);
					    pst1.setString(4, cog);
						pst1.setString(5, gross_profits);
						pst1.setString(6, amazon_fee);
					    pst1.setString(7, supplier_tax);
						pst1.setString(8, supplier_shipping_cost);
						pst1.setString(9, amazon_administrative);
				    pst1.setString(10, net_profits);
				    pst1.setString(11, amazon_administrative);
						pst1.setString(12, befrugals);
					pst1.setString(13, cash_back_profit);
					    pst1.setString(14, total_profit);
					    pst1.setString(15, amazon_tax);
					    
						pst2.setString(1, qty);
						pst2.setString(2, product_cost);
						pst2.setString(3, sale_price_shipping);
					    pst2.setString(4, cog);
						pst2.setString(5, gross_profits);
						pst2.setString(6, amazon_fee);
					    pst2.setString(7, supplier_tax);
						pst2.setString(8, supplier_shipping_cost);
						pst2.setString(9, amazon_administrative);
				    pst2.setString(10, net_profits);
				    pst2.setString(11, amazon_administrative);
						pst2.setString(12, befrugals);
					pst2.setString(13, cash_back_profit);
					    pst2.setString(14, total_profit);
					    pst2.setString(15, amazon_tax);
						
						pst3.setString(1, qty);
						pst3.setString(2, product_cost);
						pst3.setString(3, sale_price_shipping);
					    pst3.setString(4, cog);
						pst3.setString(5, gross_profits);
						pst3.setString(6, amazon_fee);
					    pst3.setString(7, supplier_tax);
						pst3.setString(8, supplier_shipping_cost);
						pst3.setString(9, amazon_administrative);
				    pst3.setString(10, net_profits);
				    pst3.setString(11, amazon_administrative);
						pst3.setString(12, befrugals);
					pst3.setString(13, cash_back_profit);
					    pst3.setString(14, total_profit);
					    pst3.setString(15, amazon_tax);

						pst5.setString(1, qty);
						pst5.setString(2, product_cost);
						pst5.setString(3, sale_price_shipping);
					    pst5.setString(4, cog);
						pst5.setString(5, gross_profits);
						pst5.setString(6, amazon_fee);
					    pst5.setString(7, supplier_tax);
						pst5.setString(8, supplier_shipping_cost);
						pst5.setString(9, amazon_administrative);
				    pst5.setString(10, net_profits);
				    pst5.setString(11, amazon_administrative);
						pst5.setString(12, befrugals);
					pst5.setString(13, cash_back_profit);
					    pst5.setString(14, total_profit);
					    pst5.setString(15, amazon_tax);
						
						
						pst4.setString(1, qty);
						pst4.setString(2, product_cost);
						pst4.setString(3, sale_price_shipping);
					    pst4.setString(4, cog);
						pst4.setString(5, gross_profits);
						pst4.setString(6, amazon_fee);
					    pst4.setString(7, supplier_tax);
						pst4.setString(8, supplier_shipping_cost);
						pst4.setString(9, amazon_administrative);
				    pst4.setString(10, net_profits);
				    pst4.setString(11, amazon_administrative);
						pst4.setString(12, befrugals);
					pst4.setString(13, cash_back_profit);
					    pst4.setString(14, total_profit);
					    pst4.setString(15, amazon_tax);
					    
					    pst.executeUpdate();
						pst1.executeUpdate();
					    pst2.executeUpdate();
						pst3.executeUpdate();
					    pst4.executeUpdate();
						pst5.executeUpdate();
						JOptionPane.showMessageDialog(null, "Updated");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found"+e1);
					}
					
				}
				try {
					aoi=textField_3.getText().trim();
					store=textField_23.getText().trim();
					pst1=con.prepareStatement("SELECT * FROM all_store WHERE amazon_order_id = ?");
					
					pst1.setString(1,aoi);
					//pst1.setString(2,store_n);
					ResultSet rs =pst1.executeQuery();
					
					if (rs.next()) {
						textField_23.setText(rs.getString("store_name"));
							textField_6.setText(rs.getString("shipping_status"));
						textField_9.setText(rs.getString("date"));
						textField.setText(rs.getString("product_name"));
						textField_5.setText(rs.getString("qty"));
						textField_4.setText(rs.getString("product_cost"));
						textField_7.setText(rs.getString("sale_price_shipping"));
						cogs=(rs.getString("cogs"));
						gross_profit=(rs.getString("gross_profit"));

						textField_8.setText(rs.getString("amazon_fee"));
						textField_13.setText(rs.getString("supplier_tax"));
						textField_12.setText(rs.getString("supplier_shipping_cost"));
						textField_19.setText(rs.getString("amazon_administrative"));
						net_profit=(rs.getString("net_profit"));
						befrugal=(rs.getString("befrugal"));
						cash_b_p=(rs.getString("cash_back_profit"));
						total_p=(rs.getString("total_profit"));
						textField_16.setText(rs.getString("ordered_status"));
						textField_20.setText(rs.getString("after_delivery_status"));
						textField_22.setText(rs.getString("supplier_name"));
						textField_1.setText(rs.getString("customer_name"));
						textField_2.setText(rs.getString("purchase_order_id"));

						textField_11.setText(rs.getString("amazon_tax"));
						textField_14.setText(rs.getString("tracking_number"));
						textField_18.setText(rs.getString("o_a_email_address"));
						textField_15.setText(rs.getString("po"));
						textField_17.setText(rs.getString("notes"));
						textField_21.setText(rs.getString("editor"));
					}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Not Found"+e1);
				}
			}
		});
		btnOs.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnOs.setBackground(Color.MAGENTA);
		btnOs.setBounds(437, 541, 96, 32);
		contentPane.add(btnOs);
		
		JButton btnRefresh_1_1 = new JButton("FS");
		btnRefresh_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((textField_6.getText().isEmpty())||(textField_22.getText().isEmpty())||(textField_14.getText().isEmpty())||
						(textField.getText().isEmpty())||(textField_4.getText().isEmpty())||
						(textField_1.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_12.getText().isEmpty())||
						(textField_13.getText().isEmpty())||(textField_11.getText().isEmpty())||
						(textField_9.getText().isEmpty())||(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||
						(textField_15.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_18.getText().isEmpty())||(textField_19.getText().isEmpty())||(textField_16.getText().isEmpty())) {
	            	JOptionPane.showMessageDialog(editframe,
	            		    "First Find product entering Order ID and Select Store",
	            		    
	            		    "Enter Data", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					shipping_status=textField_6.getText().toString();
					qty=textField_5.getText().toString();
					product_cost=textField_4.getText().toString();
					sale_price_shipping=textField_7.getText().toString();
					cog=cogs;
					gross_profits=gross_profit;

					amazon_fee=textField_8.getText().toString();
					supplier_tax=textField_13.getText().toString();
					supplier_shipping_cost=textField_12.getText().toString();
					amazon_administrative = textField_19.getText().toString();
					net_profits=net_profit;
					befrugals=befrugal;
					cash_back_profit=cash_b_p;
					total_profit = total_p;
					ordered_status = textField_16.getText().toString();
					after_delivery_status =textField_20.getText().toString();
					supplier_name = textField_22.getText().toString();
					customer_name =textField_1.getText().toString();
					purchase_order_id = textField_2.getText().toString();
					amazon_tax=textField_11.getText().toString();
					tracking_number=textField_14.getText().toString();
					email=textField_18.getText().toString();
					po=textField_15.getText().toString();
					note=textField_17.getText().toString();
					editor=textField_21.getText().toString();
					
					try {
						pst = con.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						pst1 = con1.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						
						pst2 = con.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE  amazon_order_id = '"+aoi+"' ;");
						pst3 = con1.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE amazon_order_id = '"+aoi+"' ;");
					
						pst4=con.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ?,shipping_status = 'FS' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE  amazon_order_id = '"+aoi+"' ;");
						
						pst5=con1.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ?,shipping_status = 'FS' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");
					
						pst.setString(1, qty);
						pst.setString(2, product_cost);
						pst.setString(3, sale_price_shipping);
					    pst.setString(4, cog);
						pst.setString(5, gross_profits);
						pst.setString(6, amazon_fee);
					    pst.setString(7, supplier_tax);
						pst.setString(8, supplier_shipping_cost);
						pst.setString(9, amazon_administrative);
				    pst.setString(10, net_profits);
				    pst.setString(11, amazon_administrative);
						pst.setString(12, befrugals);
					pst.setString(13, cash_back_profit);
					    pst.setString(14, total_profit);
					    pst.setString(15, amazon_tax);
						
						
						pst1.setString(1, qty);
						pst1.setString(2, product_cost);
						pst1.setString(3, sale_price_shipping);
					    pst1.setString(4, cog);
						pst1.setString(5, gross_profits);
						pst1.setString(6, amazon_fee);
					    pst1.setString(7, supplier_tax);
						pst1.setString(8, supplier_shipping_cost);
						pst1.setString(9, amazon_administrative);
				    pst1.setString(10, net_profits);
				    pst1.setString(11, amazon_administrative);
						pst1.setString(12, befrugals);
					pst1.setString(13, cash_back_profit);
					    pst1.setString(14, total_profit);
					    pst1.setString(15, amazon_tax);
					    
						pst2.setString(1, qty);
						pst2.setString(2, product_cost);
						pst2.setString(3, sale_price_shipping);
					    pst2.setString(4, cog);
						pst2.setString(5, gross_profits);
						pst2.setString(6, amazon_fee);
					    pst2.setString(7, supplier_tax);
						pst2.setString(8, supplier_shipping_cost);
						pst2.setString(9, amazon_administrative);
				    pst2.setString(10, net_profits);
				    pst2.setString(11, amazon_administrative);
						pst2.setString(12, befrugals);
					pst2.setString(13, cash_back_profit);
					    pst2.setString(14, total_profit);
					    pst2.setString(15, amazon_tax);
						
						pst3.setString(1, qty);
						pst3.setString(2, product_cost);
						pst3.setString(3, sale_price_shipping);
					    pst3.setString(4, cog);
						pst3.setString(5, gross_profits);
						pst3.setString(6, amazon_fee);
					    pst3.setString(7, supplier_tax);
						pst3.setString(8, supplier_shipping_cost);
						pst3.setString(9, amazon_administrative);
				    pst3.setString(10, net_profits);
				    pst3.setString(11, amazon_administrative);
						pst3.setString(12, befrugals);
					pst3.setString(13, cash_back_profit);
					    pst3.setString(14, total_profit);
					    pst3.setString(15, amazon_tax);

						pst5.setString(1, qty);
						pst5.setString(2, product_cost);
						pst5.setString(3, sale_price_shipping);
					    pst5.setString(4, cog);
						pst5.setString(5, gross_profits);
						pst5.setString(6, amazon_fee);
					    pst5.setString(7, supplier_tax);
						pst5.setString(8, supplier_shipping_cost);
						pst5.setString(9, amazon_administrative);
				    pst5.setString(10, net_profits);
				    pst5.setString(11, amazon_administrative);
						pst5.setString(12, befrugals);
					pst5.setString(13, cash_back_profit);
					    pst5.setString(14, total_profit);
					    pst5.setString(15, amazon_tax);
						
						
						pst4.setString(1, qty);
						pst4.setString(2, product_cost);
						pst4.setString(3, sale_price_shipping);
					    pst4.setString(4, cog);
						pst4.setString(5, gross_profits);
						pst4.setString(6, amazon_fee);
					    pst4.setString(7, supplier_tax);
						pst4.setString(8, supplier_shipping_cost);
						pst4.setString(9, amazon_administrative);
				    pst4.setString(10, net_profits);
				    pst4.setString(11, amazon_administrative);
						pst4.setString(12, befrugals);
					pst4.setString(13, cash_back_profit);
					    pst4.setString(14, total_profit);
					    pst4.setString(15, amazon_tax);
					    pst.executeUpdate();
						pst1.executeUpdate();
					    pst2.executeUpdate();
						pst3.executeUpdate();
					    pst4.executeUpdate();
						pst5.executeUpdate();
						JOptionPane.showMessageDialog(null, "Updated");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found"+e1);
					}
					
				   
				
				}
			}
		});
		btnRefresh_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_1.setBackground(Color.CYAN);
		btnRefresh_1_1.setBounds(435, 505, 96, 32);
		contentPane.add(btnRefresh_1_1);
		
		JButton btnRefresh_1_2 = new JButton("Cancel");
		btnRefresh_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((textField_6.getText().isEmpty())||(textField_22.getText().isEmpty())||(textField_14.getText().isEmpty())||
						(textField.getText().isEmpty())||(textField_4.getText().isEmpty())||
						(textField_1.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_12.getText().isEmpty())||
						(textField_13.getText().isEmpty())||(textField_11.getText().isEmpty())||
						(textField_9.getText().isEmpty())||(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||
						(textField_15.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_18.getText().isEmpty())||(textField_19.getText().isEmpty())||(textField_16.getText().isEmpty())) {
	            	JOptionPane.showMessageDialog(editframe,
	            		    "First Find product entering Order ID and Select Store",
	            		    
	            		    "Give Data", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					shipping_status=textField_6.getText().toString();
					qty=textField_5.getText().toString();
					product_cost=textField_4.getText().toString();
					sale_price_shipping=textField_7.getText().toString();
					cog=cogs;
					gross_profits=gross_profit;

					amazon_fee=textField_8.getText().toString();
					supplier_tax=textField_13.getText().toString();
					supplier_shipping_cost=textField_12.getText().toString();
					amazon_administrative = textField_19.getText().toString();
					net_profits=net_profit;
					befrugals=befrugal;
					cash_back_profit=cash_b_p;
					total_profit = total_p;
					ordered_status = textField_16.getText().toString();
					after_delivery_status =textField_20.getText().toString();
					supplier_name = textField_22.getText().toString();
					customer_name =textField_1.getText().toString();
					purchase_order_id = textField_2.getText().toString();
					amazon_tax=textField_11.getText().toString();
					tracking_number=textField_14.getText().toString();
					email=textField_18.getText().toString();
					po=textField_15.getText().toString();
					note=textField_17.getText().toString();
					editor=textField_21.getText().toString();
					try {
						pst = con.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						pst1 = con1.prepareStatement("UPDATE all_store_individual SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						
						pst2 = con.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE  amazon_order_id = '"+aoi+"' ;");
						pst3 = con1.prepareStatement("UPDATE "+store+" SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE amazon_order_id = '"+aoi+"' ;");
					pst4=con.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ?,shipping_status = 'Cancel' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE  amazon_order_id = '"+aoi+"' ;");
					
							pst5=con1.prepareStatement("UPDATE all_store SET qty=qty-? , product_cost = product_cost-?, sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? , gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,amazon_tax=amazon_tax - ?,shipping_status = 'Cancel' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");

							pst.setString(1, qty);
							pst.setString(2, product_cost);
							pst.setString(3, sale_price_shipping);
						    pst.setString(4, cog);
							pst.setString(5, gross_profits);
							pst.setString(6, amazon_fee);
						    pst.setString(7, supplier_tax);
							pst.setString(8, supplier_shipping_cost);
							pst.setString(9, amazon_administrative);
					    pst.setString(10, net_profits);
					    pst.setString(11, amazon_administrative);
							pst.setString(12, befrugals);
						pst.setString(13, cash_back_profit);
						    pst.setString(14, total_profit);
						    pst.setString(15, amazon_tax);
							
							
							pst1.setString(1, qty);
							pst1.setString(2, product_cost);
							pst1.setString(3, sale_price_shipping);
						    pst1.setString(4, cog);
							pst1.setString(5, gross_profits);
							pst1.setString(6, amazon_fee);
						    pst1.setString(7, supplier_tax);
							pst1.setString(8, supplier_shipping_cost);
							pst1.setString(9, amazon_administrative);
					    pst1.setString(10, net_profits);
					    pst1.setString(11, amazon_administrative);
							pst1.setString(12, befrugals);
						pst1.setString(13, cash_back_profit);
						    pst1.setString(14, total_profit);
						    pst1.setString(15, amazon_tax);
						    
							pst2.setString(1, qty);
							pst2.setString(2, product_cost);
							pst2.setString(3, sale_price_shipping);
						    pst2.setString(4, cog);
							pst2.setString(5, gross_profits);
							pst2.setString(6, amazon_fee);
						    pst2.setString(7, supplier_tax);
							pst2.setString(8, supplier_shipping_cost);
							pst2.setString(9, amazon_administrative);
					    pst2.setString(10, net_profits);
					    pst2.setString(11, amazon_administrative);
							pst2.setString(12, befrugals);
						pst2.setString(13, cash_back_profit);
						    pst2.setString(14, total_profit);
						    pst2.setString(15, amazon_tax);
							
							pst3.setString(1, qty);
							pst3.setString(2, product_cost);
							pst3.setString(3, sale_price_shipping);
						    pst3.setString(4, cog);
							pst3.setString(5, gross_profits);
							pst3.setString(6, amazon_fee);
						    pst3.setString(7, supplier_tax);
							pst3.setString(8, supplier_shipping_cost);
							pst3.setString(9, amazon_administrative);
					    pst3.setString(10, net_profits);
					    pst3.setString(11, amazon_administrative);
							pst3.setString(12, befrugals);
						pst3.setString(13, cash_back_profit);
						    pst3.setString(14, total_profit);
						    pst3.setString(15, amazon_tax);

							pst5.setString(1, qty);
							pst5.setString(2, product_cost);
							pst5.setString(3, sale_price_shipping);
						    pst5.setString(4, cog);
							pst5.setString(5, gross_profits);
							pst5.setString(6, amazon_fee);
						    pst5.setString(7, supplier_tax);
							pst5.setString(8, supplier_shipping_cost);
							pst5.setString(9, amazon_administrative);
					    pst5.setString(10, net_profits);
					    pst5.setString(11, amazon_administrative);
							pst5.setString(12, befrugals);
						pst5.setString(13, cash_back_profit);
						    pst5.setString(14, total_profit);
						    pst5.setString(15, amazon_tax);
							
							
							pst4.setString(1, qty);
							pst4.setString(2, product_cost);
							pst4.setString(3, sale_price_shipping);
						    pst4.setString(4, cog);
							pst4.setString(5, gross_profits);
							pst4.setString(6, amazon_fee);
						    pst4.setString(7, supplier_tax);
							pst4.setString(8, supplier_shipping_cost);
							pst4.setString(9, amazon_administrative);
					    pst4.setString(10, net_profits);
					    pst4.setString(11, amazon_administrative);
							pst4.setString(12, befrugals);
						pst4.setString(13, cash_back_profit);
						    pst4.setString(14, total_profit);
						    pst4.setString(15, amazon_tax);
					    pst.executeUpdate();
						pst1.executeUpdate();
					    pst2.executeUpdate();
						pst3.executeUpdate();
					    pst4.executeUpdate();
						pst5.executeUpdate();
						JOptionPane.showMessageDialog(null, "Updated");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found"+e1);
					}
					
				}
				try {
					aoi=textField_3.getText().trim();
					store=textField_23.getText().trim();
					pst1=con.prepareStatement("SELECT * FROM all_store WHERE amazon_order_id = ?");
					
					pst1.setString(1,aoi);
					//pst1.setString(2,store_n);
					ResultSet rs =pst1.executeQuery();
					
					if (rs.next()) {
						textField_23.setText(rs.getString("store_name"));
							textField_6.setText(rs.getString("shipping_status"));
						textField_9.setText(rs.getString("date"));
						textField.setText(rs.getString("product_name"));
						textField_5.setText(rs.getString("qty"));
						textField_4.setText(rs.getString("product_cost"));
						textField_7.setText(rs.getString("sale_price_shipping"));
						cogs=(rs.getString("cogs"));
						gross_profit=(rs.getString("gross_profit"));

						textField_8.setText(rs.getString("amazon_fee"));
						textField_13.setText(rs.getString("supplier_tax"));
						textField_12.setText(rs.getString("supplier_shipping_cost"));
						textField_19.setText(rs.getString("amazon_administrative"));
						net_profit=(rs.getString("net_profit"));
						befrugal=(rs.getString("befrugal"));
						cash_b_p=(rs.getString("cash_back_profit"));
						total_p=(rs.getString("total_profit"));
						textField_16.setText(rs.getString("ordered_status"));
						textField_20.setText(rs.getString("after_delivery_status"));
						textField_22.setText(rs.getString("supplier_name"));
						textField_1.setText(rs.getString("customer_name"));
						textField_2.setText(rs.getString("purchase_order_id"));

						textField_11.setText(rs.getString("amazon_tax"));
						textField_14.setText(rs.getString("tracking_number"));
						textField_18.setText(rs.getString("o_a_email_address"));
						textField_15.setText(rs.getString("po"));
						textField_17.setText(rs.getString("notes"));
						textField_21.setText(rs.getString("editor"));
					}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Not Found"+e1);
				}
			}
		});
		btnRefresh_1_2.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_2.setBackground(Color.YELLOW);
		btnRefresh_1_2.setBounds(316, 544, 96, 32);
		contentPane.add(btnRefresh_1_2);
		
		JButton btnRefresh_1_2_1 = new JButton("Shipped");
		btnRefresh_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((textField_6.getText().isEmpty())||(textField_22.getText().isEmpty())||(textField_14.getText().isEmpty())||
						(textField.getText().isEmpty())||(textField_4.getText().isEmpty())||
						(textField_1.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_12.getText().isEmpty())||
						(textField_13.getText().isEmpty())||(textField_11.getText().isEmpty())||
						(textField_9.getText().isEmpty())||(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||
						(textField_15.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_18.getText().isEmpty())||(textField_19.getText().isEmpty())||(textField_16.getText().isEmpty())) {
	            	JOptionPane.showMessageDialog(editframe,
		    "First Find product entering Order ID and Select Store",
	            		    
	            		    "Give Data", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					shipping_status=textField_6.getText().toString();
					qty=textField_5.getText().toString();
					product_cost=textField_4.getText().toString();
					sale_price_shipping=textField_7.getText().toString();
					cog=cogs;
					gross_profits=gross_profit;

					amazon_fee=textField_8.getText().toString();
					supplier_tax=textField_13.getText().toString();
					supplier_shipping_cost=textField_12.getText().toString();
					amazon_administrative = textField_19.getText().toString();
					net_profits=net_profit;
					befrugals=befrugal;
					cash_back_profit=cash_b_p;
					total_profit = total_p;
					ordered_status = textField_16.getText().toString();
					after_delivery_status =textField_20.getText().toString();
					supplier_name = textField_22.getText().toString();
					customer_name =textField_1.getText().toString();
					purchase_order_id = textField_2.getText().toString();
					amazon_tax=textField_11.getText().toString();
					tracking_number=textField_14.getText().toString();
					email=textField_18.getText().toString();
					po=textField_15.getText().toString();
					note=textField_17.getText().toString();
					editor=textField_21.getText().toString();
					try {
						
						pst4=con.prepareStatement("UPDATE all_store SET shipping_status = 'Shipped' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");
						
						pst5=con1.prepareStatement("UPDATE all_store SET shipping_status = 'Shipped' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");
					
					
					    pst4.executeUpdate();
						pst5.executeUpdate();
						JOptionPane.showMessageDialog(null, "Updated");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found"+e1);
					}
					
				}
				try {
					aoi=textField_3.getText().trim();
					store=textField_23.getText().trim();
					pst1=con.prepareStatement("SELECT * FROM all_store WHERE amazon_order_id = ?");
					
					pst1.setString(1,aoi);
					//pst1.setString(2,store_n);
					ResultSet rs =pst1.executeQuery();
					
					if (rs.next()) {
						textField_23.setText(rs.getString("store_name"));
							textField_6.setText(rs.getString("shipping_status"));
						textField_9.setText(rs.getString("date"));
						textField.setText(rs.getString("product_name"));
						textField_5.setText(rs.getString("qty"));
						textField_4.setText(rs.getString("product_cost"));
						textField_7.setText(rs.getString("sale_price_shipping"));
						cogs=(rs.getString("cogs"));
						gross_profit=(rs.getString("gross_profit"));

						textField_8.setText(rs.getString("amazon_fee"));
						textField_13.setText(rs.getString("supplier_tax"));
						textField_12.setText(rs.getString("supplier_shipping_cost"));
						textField_19.setText(rs.getString("amazon_administrative"));
						net_profit=(rs.getString("net_profit"));
						befrugal=(rs.getString("befrugal"));
						cash_b_p=(rs.getString("cash_back_profit"));
						total_p=(rs.getString("total_profit"));
						textField_16.setText(rs.getString("ordered_status"));
						textField_20.setText(rs.getString("after_delivery_status"));
						textField_22.setText(rs.getString("supplier_name"));
						textField_1.setText(rs.getString("customer_name"));
						textField_2.setText(rs.getString("purchase_order_id"));

						textField_11.setText(rs.getString("amazon_tax"));
						textField_14.setText(rs.getString("tracking_number"));
						textField_18.setText(rs.getString("o_a_email_address"));
						textField_15.setText(rs.getString("po"));
						textField_17.setText(rs.getString("notes"));
						textField_21.setText(rs.getString("editor"));
					}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Not Found"+e1);
				}
			}
		});
		btnRefresh_1_2_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_2_1.setBackground(Color.YELLOW);
		btnRefresh_1_2_1.setBounds(318, 506, 96, 32);
		contentPane.add(btnRefresh_1_2_1);
		
		textField_23 = new JTextField();
		textField_23.setBounds(164, 161, 168, 22);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		textField_23.setEditable(false);
		
		JButton btnRefresh_1_1_1_1 = new JButton("Dash Board");
		btnRefresh_1_1_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_1_1_1.setBackground(Color.GREEN);
		btnRefresh_1_1_1_1.setBounds(10, 548, 151, 32);
		contentPane.add(btnRefresh_1_1_1_1);
		
		JButton btnRefresh_1_1_1 = new JButton("STORE");
		btnRefresh_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
                Read ah = new Read();
                ah.setVisible(true);
			}
		});
		btnRefresh_1_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_1_1.setBackground(Color.GREEN);
		btnRefresh_1_1_1.setBounds(10, 502, 150, 32);
		contentPane.add(btnRefresh_1_1_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnDelete.setBackground(Color.GREEN);
		btnDelete.setBounds(10, 462, 150, 32);
		contentPane.add(btnDelete);
		
		JButton btnRefresh_1_2_1_1 = new JButton("Auto Refund");
		btnRefresh_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((textField_6.getText().isEmpty())||(textField_22.getText().isEmpty())||(textField_14.getText().isEmpty())||
						(textField.getText().isEmpty())||(textField_4.getText().isEmpty())||
						(textField_1.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_12.getText().isEmpty())||
						(textField_13.getText().isEmpty())||(textField_11.getText().isEmpty())||
						(textField_9.getText().isEmpty())||(textField_7.getText().isEmpty())||(textField_8.getText().isEmpty())||
						(textField_15.getText().isEmpty())||(textField_16.getText().isEmpty())||(textField_18.getText().isEmpty())||(textField_19.getText().isEmpty())||(textField_16.getText().isEmpty())) {
	            	JOptionPane.showMessageDialog(editframe,
	            		    "First Find product entering Order ID and Select Store",
	            		    
	            		    "Give Data", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					shipping_status=textField_6.getText().toString();
					qty=textField_5.getText().toString();
					product_cost=textField_4.getText().toString();
					sale_price_shipping=textField_7.getText().toString();
					cog=cogs;
					gross_profits=gross_profit;

					amazon_fee=textField_8.getText().toString();
					supplier_tax=textField_13.getText().toString();
					supplier_shipping_cost=textField_12.getText().toString();
					amazon_administrative = textField_19.getText().toString();
					net_profits=net_profit;
					befrugals=befrugal;
					cash_back_profit=cash_b_p;
					total_profit = total_p;
					ordered_status = textField_16.getText().toString();
					after_delivery_status =textField_20.getText().toString();
					supplier_name = textField_22.getText().toString();
					customer_name =textField_1.getText().toString();
					purchase_order_id = textField_2.getText().toString();
					amazon_tax=textField_11.getText().toString();
					tracking_number=textField_14.getText().toString();
					email=textField_18.getText().toString();
					po=textField_15.getText().toString();
					note=textField_17.getText().toString();
					editor=textField_21.getText().toString();
					try {
						pst = con.prepareStatement("UPDATE all_store_individual SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? ,"
								+ " cogs = cogs - ? , gross_profit = gross_profit - ? ,"
								+ " amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? , "
								+ "supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,"
								+ "net_profit=net_profit - ?-?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,"
								+ "amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						pst1 = con1.prepareStatement("UPDATE all_store_individual SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? ,"
								+ " cogs = cogs - ? , gross_profit = gross_profit - ? ,"
								+ " amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? ,"
								+ " supplier_shipping_cost = supplier_shipping_cost - ?,"
								+ "amazon_administrative=amazon_administrative - ?,"
								+ "net_profit=net_profit - ?-?-?,"
								+ "befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,"
								+ "total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE store_name = '"+store+"' ;");
						
						pst2 = con.prepareStatement("UPDATE "+store+" SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? ,"
								+ " cogs = cogs - ? , gross_profit = gross_profit - ? ,"
								+ " amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? "
								+ ", supplier_shipping_cost = supplier_shipping_cost - ?,amazon_administrative=amazon_administrative - ?,"
								+ "net_profit=net_profit - ?-?-?,befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,"
								+ "total_profit=total_profit - ?,amazon_tax=amazon_tax - ? WHERE  amazon_order_id = '"+aoi+"' ;");
						pst3 = con1.prepareStatement("UPDATE "+store+" SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? "
								+ ", gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? ,"
								+ " supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,"
								+ "amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?-?,"
								+ "befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,"
								+ "total_profit=total_profit - ?,"
								+ "amazon_tax=amazon_tax - ? WHERE amazon_order_id = '"+aoi+"' ;");
					pst4=con.prepareStatement("UPDATE all_store SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? ,"
							+ " cogs = cogs - ? , gross_profit = gross_profit - ? ,"
							+ " amazon_fee = amazon_fee - ? , supplier_tax = supplier_tax - ? ,"
							+ " supplier_shipping_cost = supplier_shipping_cost - ?,"
							+ "amazon_administrative=amazon_administrative - ?,"
							+ "net_profit=net_profit - ?-?-?,befrugal=befrugal - ?,"
							+ "cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,"
							+ "amazon_tax=amazon_tax - ?,"
							+ "shipping_status = 'Cancel' ,editor ='"+editor+"' ,notes = '"+note+"' WHERE  amazon_order_id = '"+aoi+"' ;");
					
							pst5=con1.prepareStatement("UPDATE all_store SET qty=qty-? ,  sale_price_shipping = sale_price_shipping - ? , cogs = cogs - ? ,"
									+ " gross_profit = gross_profit - ? , amazon_fee = amazon_fee - ? ,"
									+ " supplier_tax = supplier_tax - ? , supplier_shipping_cost = supplier_shipping_cost - ?,"
									+ "amazon_administrative=amazon_administrative - ?,net_profit=net_profit - ?-?-?,"
									+ "befrugal=befrugal - ?,cash_back_profit=cash_back_profit - ?,total_profit=total_profit - ?,"
									+ "amazon_tax=amazon_tax - ?,shipping_status = 'Cancel' ,"
									+ "editor ='"+editor+"' ,notes = '"+note+"' WHERE amazon_order_id = '"+aoi+"' ;");

							pst.setString(1, qty);
							
							pst.setString(2, sale_price_shipping);
						    pst.setString(3, cog);
							pst.setString(4, gross_profits);
							pst.setString(5, amazon_fee);
						    pst.setString(6, supplier_tax);
							pst.setString(7, supplier_shipping_cost);
							pst.setString(8, amazon_administrative);
					    pst.setString(9, net_profits);
					    pst.setString(10, amazon_administrative);
						pst.setString(11, product_cost);
							pst.setString(12, befrugals);
						pst.setString(13, cash_back_profit);
						    pst.setString(14, total_profit);
						    pst.setString(15, amazon_tax);
							
							
							pst1.setString(1, qty);
							
							pst1.setString(2, sale_price_shipping);
						    pst1.setString(3, cog);
							pst1.setString(4, gross_profits);
							pst1.setString(5, amazon_fee);
						    pst1.setString(6, supplier_tax);
							pst1.setString(7, supplier_shipping_cost);
							pst1.setString(8, amazon_administrative);
							pst1.setString(9, product_cost);
					    pst1.setString(10, net_profits);
					    pst1.setString(11, amazon_administrative);
							pst1.setString(12, befrugals);
						pst1.setString(13, cash_back_profit);
						    pst1.setString(14, total_profit);
						    pst1.setString(15, amazon_tax);
						    
							pst2.setString(1, qty);
							
							pst2.setString(2, sale_price_shipping);
						    pst2.setString(3, cog);
							pst2.setString(4, gross_profits);
							pst2.setString(5, amazon_fee);
						    pst2.setString(6, supplier_tax);
							pst2.setString(7, supplier_shipping_cost);
							pst2.setString(8, amazon_administrative);
					    pst2.setString(9, net_profits);
					    pst2.setString(10, amazon_administrative);
						pst2.setString(11, product_cost);
							pst2.setString(12, befrugals);
						pst2.setString(13, cash_back_profit);
						    pst2.setString(14, total_profit);
						    pst2.setString(15, amazon_tax);
							
							pst3.setString(1, qty);
						
							pst3.setString(2, sale_price_shipping);
						    pst3.setString(3, cog);
							pst3.setString(4, gross_profits);
							pst3.setString(5, amazon_fee);
						    pst3.setString(6, supplier_tax);
							pst3.setString(7, supplier_shipping_cost);
							pst3.setString(8, amazon_administrative);
					    pst3.setString(9, net_profits);
					    pst3.setString(10, amazon_administrative);
						pst3.setString(11, product_cost);
							pst3.setString(12, befrugals);
						pst3.setString(13, cash_back_profit);
						    pst3.setString(14, total_profit);
						    pst3.setString(15, amazon_tax);

							pst5.setString(1, qty);
							
							pst5.setString(2, sale_price_shipping);
						    pst5.setString(3, cog);
							pst5.setString(4, gross_profits);
							pst5.setString(5, amazon_fee);
						    pst5.setString(6, supplier_tax);
							pst5.setString(7, supplier_shipping_cost);
							pst5.setString(8, amazon_administrative);
					    pst5.setString(9, net_profits);
					    pst5.setString(10, amazon_administrative);
						pst5.setString(11, product_cost);
							pst5.setString(12, befrugals);
						pst5.setString(13, cash_back_profit);
						    pst5.setString(14, total_profit);
						    pst5.setString(15, amazon_tax);
							
							
							pst4.setString(1, qty);
							
							pst4.setString(2, sale_price_shipping);
						    pst4.setString(3, cog);
							pst4.setString(4, gross_profits);
							pst4.setString(5, amazon_fee);
						    pst4.setString(6, supplier_tax);
							pst4.setString(7, supplier_shipping_cost);
							pst4.setString(8, amazon_administrative);
					    pst4.setString(9, net_profits);
					    pst4.setString(10, amazon_administrative);
						pst4.setString(11, product_cost);
							pst4.setString(12, befrugals);
						pst4.setString(13, cash_back_profit);
						    pst4.setString(14, total_profit);
						    pst4.setString(15, amazon_tax);
					    pst.executeUpdate();
						pst1.executeUpdate();
					    pst2.executeUpdate();
						pst3.executeUpdate();
					    pst4.executeUpdate();
						pst5.executeUpdate();
						JOptionPane.showMessageDialog(null, "Updated");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found"+e1);
					}
					
				}
				try {
					aoi=textField_3.getText().trim();
					store=textField_23.getText().trim();
					pst1=con.prepareStatement("SELECT * FROM all_store WHERE amazon_order_id = ?");
					
					pst1.setString(1,aoi);
					//pst1.setString(2,store_n);
					ResultSet rs =pst1.executeQuery();
					
					if (rs.next()) {
						textField_23.setText(rs.getString("store_name"));
							textField_6.setText(rs.getString("shipping_status"));
						textField_9.setText(rs.getString("date"));
						textField.setText(rs.getString("product_name"));
						textField_5.setText(rs.getString("qty"));
						textField_4.setText(rs.getString("product_cost"));
						textField_7.setText(rs.getString("sale_price_shipping"));
						cogs=(rs.getString("cogs"));
						gross_profit=(rs.getString("gross_profit"));

						textField_8.setText(rs.getString("amazon_fee"));
						textField_13.setText(rs.getString("supplier_tax"));
						textField_12.setText(rs.getString("supplier_shipping_cost"));
						textField_19.setText(rs.getString("amazon_administrative"));
						net_profit=(rs.getString("net_profit"));
						befrugal=(rs.getString("befrugal"));
						cash_b_p=(rs.getString("cash_back_profit"));
						total_p=(rs.getString("total_profit"));
						textField_16.setText(rs.getString("ordered_status"));
						textField_20.setText(rs.getString("after_delivery_status"));
						textField_22.setText(rs.getString("supplier_name"));
						textField_1.setText(rs.getString("customer_name"));
						textField_2.setText(rs.getString("purchase_order_id"));

						textField_11.setText(rs.getString("amazon_tax"));
						textField_14.setText(rs.getString("tracking_number"));
						textField_18.setText(rs.getString("o_a_email_address"));
						textField_15.setText(rs.getString("po"));
						textField_17.setText(rs.getString("notes"));
						textField_21.setText(rs.getString("editor"));
					}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Not Found"+e1);
				}
				
			}
		});
		btnRefresh_1_2_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_2_1_1.setBackground(Color.YELLOW);
		btnRefresh_1_2_1_1.setBounds(199, 505, 109, 32);
		contentPane.add(btnRefresh_1_2_1_1);

	}
}
