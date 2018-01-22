import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class Mineswiffer extends JFrame{
public Mineswiffer() {
	initGUI();
	setTitle("Mineswiffer Game     Creator Erica Davis");
	setSize(200, 100); //pixels
	setResizable(true);
	pack();
	setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

		
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}

private void initGUI() {
	// TODO Auto-generated method stub
	JPanel titlePanel = new JPanel();
	add(titlePanel, BorderLayout.PAGE_START);
	titlePanel.setBackground(Color.BLACK);
	JLabel titleLabel = new JLabel("Mineswiffer Game");
	titlePanel.add(titleLabel);
	titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
	Font titleFont = new Font("Times New Roman", Font.BOLD, 50);
	titleLabel.setForeground(new Color(83, 22, 226));
	titleLabel.setFont(titleFont);
}

public static void main(String[] args) {
	try {
        String className = UIManager.getCrossPlatformLookAndFeelClassName();
        UIManager.setLookAndFeel(className);
    } catch ( Exception e) {}
    
    EventQueue.invokeLater(new Runnable (){
        @Override
        public void run() {
            new Mineswiffer();
        }   
    });
    
}
}
