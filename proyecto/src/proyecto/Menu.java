package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(0, 0, 200, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 136, 180, 2);
		separator.setForeground(new Color(255, 255, 255));
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 214, 125, 2);
		separator_1.setForeground(Color.WHITE);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(39, 283, 125, 2);
		separator_2.setForeground(Color.WHITE);
		panel.add(separator_2);
		
		JLabel lblTbSystems = new JLabel("TB Systems");
		lblTbSystems.setBounds(24, 79, 151, 46);
		lblTbSystems.setForeground(new Color(255, 255, 255));
		lblTbSystems.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTbSystems.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTbSystems);
		
		JLabel lblSalir = new JLabel("Salir");
		lblSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSalir.setBounds(63, 303, 49, 30);
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setForeground(Color.WHITE);
		lblSalir.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(lblSalir);
		
		JLabel lblAsistencia = new JLabel("Sistema");
		lblAsistencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAsistencia.setBounds(63, 164, 71, 30);
		lblAsistencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsistencia.setForeground(Color.WHITE);
		lblAsistencia.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(lblAsistencia);
		
		JLabel lblContacto = new JLabel("Soporte");
		lblContacto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblContacto.setBounds(63, 236, 71, 30);
		lblContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto.setForeground(Color.WHITE);
		lblContacto.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(lblContacto);
		
		JLabel Logo = new JLabel("");
		Logo.setBounds(71, 35, 55, 46);
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Logo);
		Logo.setIcon(new ImageIcon(Menu.class.getResource("/proyecto_assets/Vector.png")));
		
		JLabel PNGProductos = new JLabel("");
		PNGProductos.setBounds(20, 161, 43, 36);
		panel.add(PNGProductos);
		PNGProductos.setHorizontalAlignment(SwingConstants.CENTER);
		PNGProductos.setIcon(new ImageIcon(Menu.class.getResource("/proyecto_assets/mdi_face-agent.png")));
		
		JLabel PNGSoporte = new JLabel("");
		PNGSoporte.setHorizontalAlignment(SwingConstants.CENTER);
		PNGSoporte.setBounds(25, 233, 33, 36);
		panel.add(PNGSoporte);
		PNGSoporte.setIcon(new ImageIcon(Menu.class.getResource("/proyecto_assets/bx_support.png")));
		
		JLabel PNGSalir = new JLabel("");
		PNGSalir.setBounds(25, 303, 33, 30);
		panel.add(PNGSalir);
		PNGSalir.setIcon(new ImageIcon(Menu.class.getResource("/proyecto_assets/solar_exit-bold.png")));
		PNGSalir.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(200, 0, 584, 138);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblComprobante = new JLabel("Comprobante:");
		lblComprobante.setBounds(179, 23, 95, 15);
		panel_1.add(lblComprobante);
		lblComprobante.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblComprobante.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormaDePago.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblFormaDePago.setBounds(179, 46, 112, 20);
		panel_1.add(lblFormaDePago);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblUsuario.setBounds(38, 23, 63, 15);
		panel_1.add(lblUsuario);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setHorizontalAlignment(SwingConstants.LEFT);
		lblDni.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblDni.setBounds(38, 49, 38, 15);
		panel_1.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNombre.setBounds(38, 101, 63, 15);
		panel_1.add(lblNombre);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblDireccin.setBounds(38, 75, 71, 15);
		panel_1.add(lblDireccin);
		
		txtUser = new JTextField();
		txtUser.setText("User");
		txtUser.setBounds(96, 20, 65, 20);
		panel_1.add(txtUser);
		txtUser.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(75, 46, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 72, 292, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 100, 292, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(284, 20, 120, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(283, 46, 121, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		panel_2.setBounds(200, 386, 584, 75);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblTotal.setBounds(214, 15, 63, 15);
		panel_2.add(lblTotal);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setBounds(22, 15, 63, 15);
		panel_2.add(lblSubtotal);
		lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtotal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		JLabel lblIgv = new JLabel("I.G.V.");
		lblIgv.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgv.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblIgv.setBounds(22, 45, 63, 15);
		panel_2.add(lblIgv);
		
		JLabel label = new JLabel("%");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		label.setBounds(180, 15, 24, 15);
		panel_2.add(label);
		
		textField_5 = new JTextField();
		textField_5.setBounds(91, 12, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(91, 42, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(301, 12, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblS = new JLabel("s/.");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		lblS.setBounds(273, 15, 24, 15);
		panel_2.add(lblS);
		
		JButton btnConvertirPdf = new JButton("Calcular");
		btnConvertirPdf.setBounds(413, 11, 161, 23);
		panel_2.add(btnConvertirPdf);
		
		JButton btnBorar = new JButton("Borrar Todo");
		btnBorar.setBounds(413, 41, 161, 23);
		panel_2.add(btnBorar);
		
		JButton button = new JButton("Convertir a PDF");
		button.setBounds(226, 41, 161, 23);
		panel_2.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 149, 584, 226);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"SKU", "Cant.", "Descripci\u00F3n", "Precio"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(350);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		scrollPane.setViewportView(table);
	}
}
