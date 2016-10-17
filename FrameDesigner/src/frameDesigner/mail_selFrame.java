package frameDesigner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class mail_selFrame extends JFrame {

	private JPanel contentPane;
	public static Integer mailNum=0;//������̬�������ͣ�mailNum��Ϊ�������ͱ�ţ�

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mail_selFrame frame = new mail_selFrame();//������������ѡ����棻
					frame.setVisible(true);//������ӻ���
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mail_selFrame() {
		setTitle("Select Mail");//����ҳ����⣻
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 559, 312);//����ҳ��λ�ü��䳤��
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("163\u90AE\u7BB1");//����163����ѡ��ť��
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����������¼���
				setVisible(false);//���ص�ǰ���ڣ�
				mailNum=1;//163��������Ϊ1��
			
				  new loginframe();
				  loginframe frame = new loginframe();//��ת����¼���棻
					frame.setVisible(true);//������ӻ���
					
			}
		});
		button.setBounds(33, 95, 93, 23);//����163����ѡ��ť��λ���Լ�����
		contentPane.add(button);
		
		JButton btnQq = new JButton("QQ\u90AE\u7BB1");//����qq����ѡ��ť��
		btnQq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����������¼���
				setVisible(false);//���ص�ǰ���ڣ�
				mailNum=2;//qq��������Ϊ2��
				  new loginframe();
				  loginframe frame = new loginframe();//��ת����¼���棻
					frame.setVisible(true);//������ӻ���
					
				
			}
		});
		btnQq.setBounds(157, 95, 93, 23);//����qq����ѡ��ť��λ���Լ�����
		contentPane.add(btnQq);
	
	}	
}
