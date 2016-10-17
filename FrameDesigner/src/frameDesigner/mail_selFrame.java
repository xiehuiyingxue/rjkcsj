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
	public static Integer mailNum=0;//建立静态整数类型，mailNum作为邮箱类型编号；

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mail_selFrame frame = new mail_selFrame();//建立邮箱类型选择界面；
					frame.setVisible(true);//界面可视化；
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
		setTitle("Select Mail");//设置页面标题；
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 559, 312);//设置页面位置及其长宽；
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("163\u90AE\u7BB1");//设置163邮箱选择按钮；
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//建立鼠标点击事件；
				setVisible(false);//隐藏当前窗口；
				mailNum=1;//163邮箱的序号为1；
			
				  new loginframe();
				  loginframe frame = new loginframe();//跳转到登录界面；
					frame.setVisible(true);//界面可视化；
					
			}
		});
		button.setBounds(33, 95, 93, 23);//设置163邮箱选择按钮的位置以及长宽；
		contentPane.add(button);
		
		JButton btnQq = new JButton("QQ\u90AE\u7BB1");//设置qq邮箱选择按钮；
		btnQq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//建立鼠标点击事件；
				setVisible(false);//隐藏当前窗口；
				mailNum=2;//qq邮箱的序号为2；
				  new loginframe();
				  loginframe frame = new loginframe();//跳转到登录界面；
					frame.setVisible(true);//界面可视化；
					
				
			}
		});
		btnQq.setBounds(157, 95, 93, 23);//设置qq邮箱选择按钮的位置以及长宽；
		contentPane.add(btnQq);
	
	}	
}
