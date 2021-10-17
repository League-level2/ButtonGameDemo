import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGame implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton level1;
	JButton level2;
	JButton level3;
	JButton back;
	public MainGame() {
		window = new JFrame();
		
		panel = new JPanel();
		level1 = new JButton("LEVEL 1");
		level2 = new JButton("LEVEL 2");
		level3 = new JButton("LEVEL 3");
		level1.addActionListener(this);
		level2.addActionListener(this);
		level3.addActionListener(this);
		panel.add(level1);
		panel.add(level2);
		panel.add(level3);

		back = new JButton("GO BACK");
		back.addActionListener(this);
		window.add(panel);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(window.getContentPane() != null) {
			window.remove(panel);
			panel = new JPanel();
		}
		if(e.getSource() == level1) {
			panel.add(new Level1());
			panel.add(back);
		}else if(e.getSource() == level2) {
			panel.add(new Level2());
			panel.add(back);
		}else if(e.getSource() == level3) {
			panel.add(new Level3());
			panel.add(back);
		}else if(e.getSource() == back) {
			panel.add(level1);
			panel.add(level2);
			panel.add(level3);
		}
		window.add(panel);
		window.pack();
		
	}
}
