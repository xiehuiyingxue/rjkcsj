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
					mainFrame frame = new mainFrame();//创建主界面；
					frame.setVisible(true);//界面可视化；
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建主界面；
	 */
	public mainFrame() {
		setBackground(new Color(0, 255, 255));
		setTitle("My Mail");//设置页面标题；
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1376, 700);//设置页面的位置及其长宽；
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new MatteBorder(2, 2, 3, 3, (Color) new Color(0, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton exitButton = new JButton("\u9000\u51FA\u5F53\u524D\u767B\u5F55");//设置退出当前登录按钮
		//exitButton.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {	
		//	}
		//});
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//建立邮箱点击事件；
				setVisible(false);//隐藏当前窗口；
				  new mail_selFrame();
				  mail_selFrame frame = new mail_selFrame();//跳到邮箱选择界面；
					frame.setVisible(true);//界面可视化；
			}
		});
		exitButton.setBounds(1188, 10, 156, 23);//设置退出当前登录按钮的位置及其长宽；
		contentPane.add(exitButton);
		
		JButton inboxButton = new JButton("\u6536\u4EF6\u7BB1");//设置收件箱按钮；
		inboxButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//创建收件箱按钮鼠标点击事件；
				new inboxFrame();
				  inboxFrame frame = new inboxFrame();//跳到收件箱界面；
					frame.setVisible(true);//界面可视化；
			}
		});
		inboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		inboxButton.setBounds(10, 120, 93, 23);//设置收件箱按钮的位置以及长宽；
		contentPane.add(inboxButton);
		
		JButton outboxButton = new JButton("\u53D1\u4EF6\u7BB1");//设置发件箱按钮；
		outboxButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new outboxFrame();
			  outboxFrame outframe = new outboxFrame();//跳到发件箱界面；
				outframe.setVisible(true);//界面可视化；
			}
		});
		outboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		outboxButton.setBounds(10, 161, 93, 23);//设置发件箱按钮的位置以及长宽；
		contentPane.add(outboxButton);
		
		JButton draftsButton = new JButton("\u8349\u7A3F\u7BB1");//设置草稿箱按钮；
		draftsButton.setBounds(10, 183, 93, 23);//设置草稿箱的位置以及长宽；
		contentPane.add(draftsButton);
		
		JButton writeMailButton = new JButton("\u5199\u90AE\u4EF6");//设置写邮件按钮;
		writeMailButton.setBounds(10, 141, 93, 23);//设置写邮件按钮的位置以及长宽；
		contentPane.add(writeMailButton);
	}
}
