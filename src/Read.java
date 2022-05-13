import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Read extends JFrame {
	private static final String COMMIT_ACTION = "commit";
	List<String> keywords;
	private JPanel contentPane;
	private JTable table;
	Connection con,con1,con2,don1;
	PreparedStatement pst,pst1,pst2,pst3,sst1,cc1,cc2,pst4,pst5; 
	private JTextField textField;
	private JTextField textField_1;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Read frame = new Read();
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
	public Read() {
		Connect();
		Connect1();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1874, 819);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRefresh = new JButton("Home");
		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
                Form ah = new Form();
                ah.setVisible(true);
			}
		});
		btnRefresh.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh.setBackground(Color.GREEN);
		btnRefresh.setBounds(10, 150, 96, 32);
		contentPane.add(btnRefresh);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/br.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(262, 0, 507, 106);
		contentPane.add(lblNewLabel);
		
		JButton btnRefresh_1_1 = new JButton("Update");
		btnRefresh_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
                Edit ah = new Edit();
                ah.setVisible(true);
			
			}
		});
		btnRefresh_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnRefresh_1_1.setBackground(Color.GREEN);
		btnRefresh_1_1.setBounds(10, 193, 96, 32);
		contentPane.add(btnRefresh_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Store Name");
		lblNewLabel_1_1_1_1_2.setBounds(10, 236, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(199, 129, 1649, 640);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat formatDate12 = new SimpleDateFormat(
			            "yyyy");
			    
			        Date date12 = new Date();
			    	String store_n=textField.getText();
					try {
						pst1=con1.prepareStatement("SELECT * FROM "+store_n+" ;");
					
					//	pst1.setString(1,store_n);
						ResultSet rs =pst1.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Not Found");
					}
				
					//pst1.setString(2,store_n);
					
			}
		});
		btnLoad.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		btnLoad.setBackground(Color.GREEN);
		btnLoad.setBounds(93, 293, 96, 32);
		contentPane.add(btnLoad);
		
		textField = new JTextField();
		textField.setBounds(10, 255, 179, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		keywords = new ArrayList<String>(500);
		keywords.add("all_store");
		keywords.add("suggasweets");
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
Autocomplete autoComplete = new Autocomplete(textField, keywords);
final JComboBox comboBox_1_1 = new JComboBox();
comboBox_1_1.setBounds(10, 354, 122, 22);
comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"On Process", "Shipped", "FS", "OS", "Cancel"}));
contentPane.add(comboBox_1_1);
JLabel lblNewLabel_1_1_1_1 = new JLabel("Shipping Status");
lblNewLabel_1_1_1_1.setBounds(10, 337, 79, 14);
contentPane.add(lblNewLabel_1_1_1_1);
JButton btnLoad_1 = new JButton("Load");
btnLoad_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Date date12 = new Date();
    	String store_n=textField.getText().trim();
		try {
			pst1=con1.prepareStatement("SELECT * FROM "+store_n+" WHERE shipping_status = '"+String.valueOf(comboBox_1_1.getSelectedItem())+"' ;");
		
		//	pst1.setString(1,store_n);
			ResultSet rs =pst1.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Not Found");
		}
		
	}
});
btnLoad_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
btnLoad_1.setBackground(Color.GREEN);
btnLoad_1.setBounds(93, 387, 96, 32);
contentPane.add(btnLoad_1);
JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Editor");
lblNewLabel_1_1_1_1_1.setBounds(10, 433, 79, 14);
contentPane.add(lblNewLabel_1_1_1_1_1);
JButton btnLoad_1_1 = new JButton("Load");
btnLoad_1_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Date date12 = new Date();
    	String store_n=textField.getText().trim();
		try {
		pst1=con1.prepareStatement("SELECT * FROM "+store_n+" WHERE editor = '"+textField_1.getText().toString()+"' ;");
		
	//	pst1.setString(1,store_n);
		ResultSet rs =pst1.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null, "Not Found");
	}
	}
});
btnLoad_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
btnLoad_1_1.setBackground(Color.GREEN);
btnLoad_1_1.setBounds(93, 483, 96, 32);
contentPane.add(btnLoad_1_1);
textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(10, 451, 179, 32);
contentPane.add(textField_1);
textField.getDocument().addDocumentListener(autoComplete);
	}
}
