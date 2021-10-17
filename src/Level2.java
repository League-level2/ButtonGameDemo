import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Level2 extends Level{
	public Level2() {
		buttons.add(new JButton("Answer 1"));
		buttons.add(new JButton("Answer 2"));
		buttons.add(new JButton("Answer 3"));
		
		for(JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Answer 1")) {
			
		}else if(b.getText().equals("Answer 2")) {
			
		}else if(b.getText().equals("Answer 3")) {
			
		}
	}
}
