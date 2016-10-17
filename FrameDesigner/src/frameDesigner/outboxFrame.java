package frameDesigner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class outboxFrame extends JFrame {

	private JPanel contentPane;

	/**
	 *������������棻
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					outboxFrame frame = new outboxFrame();
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
	public outboxFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 140, 1230, 550);//���÷�����ҳ��λ���Լ�����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton returnButton = new JButton("\u8FD4\u56DE");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//�������ذ�ť������¼���
				setVisible(false);//���ط�������棻
			}
		});
		returnButton.setBounds(10, 10, 93, 23);
		contentPane.add(returnButton);
	}

}
