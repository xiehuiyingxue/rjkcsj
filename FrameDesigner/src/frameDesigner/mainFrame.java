package frameDesigner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();//���������棻
					frame.setVisible(true);//������ӻ���
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * ���������棻
	 */
	public mainFrame() {
		setBackground(new Color(0, 255, 255));
		setTitle("My Mail");//����ҳ����⣻
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1376, 700);//����ҳ���λ�ü��䳤��
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new MatteBorder(2, 2, 3, 3, (Color) new Color(0, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton exitButton = new JButton("\u9000\u51FA\u5F53\u524D\u767B\u5F55");//�����˳���ǰ��¼��ť
		//exitButton.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {	
		//	}
		//});
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//�����������¼���
				setVisible(false);//���ص�ǰ���ڣ�
				  new mail_selFrame();
				  mail_selFrame frame = new mail_selFrame();//��������ѡ����棻
					frame.setVisible(true);//������ӻ���
			}
		});
		exitButton.setBounds(1188, 10, 156, 23);//�����˳���ǰ��¼��ť��λ�ü��䳤��
		contentPane.add(exitButton);
		
		JButton inboxButton = new JButton("\u6536\u4EF6\u7BB1");//�����ռ��䰴ť��
		inboxButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//�����ռ��䰴ť������¼���
				new inboxFrame();
				  inboxFrame frame = new inboxFrame();//�����ռ�����棻
					frame.setVisible(true);//������ӻ���
			}
		});
		inboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		inboxButton.setBounds(10, 120, 93, 23);//�����ռ��䰴ť��λ���Լ�����
		contentPane.add(inboxButton);
		
		JButton outboxButton = new JButton("\u53D1\u4EF6\u7BB1");//���÷����䰴ť��
		outboxButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new outboxFrame();
			  outboxFrame outframe = new outboxFrame();//������������棻
				outframe.setVisible(true);//������ӻ���
			}
		});
		outboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		outboxButton.setBounds(10, 161, 93, 23);//���÷����䰴ť��λ���Լ�����
		contentPane.add(outboxButton);
		
		JButton draftsButton = new JButton("\u8349\u7A3F\u7BB1");//���òݸ��䰴ť��
		draftsButton.setBounds(10, 183, 93, 23);//���òݸ����λ���Լ�����
		contentPane.add(draftsButton);
		
		JButton writeMailButton = new JButton("\u5199\u90AE\u4EF6");//����д�ʼ���ť;
		writeMailButton.setBounds(10, 141, 93, 23);//����д�ʼ���ť��λ���Լ�����
		contentPane.add(writeMailButton);
	}
}
