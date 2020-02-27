package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = JOptionPane.showInputDialog("What is your test score?");
		
		double score = Double.parseDouble(test);
		
		if (score <= 100 && score >= 90 ) {
		JOptionPane.showMessageDialog(null,"Good Job! Your score is a A.");
		}else if (score <= 89 && score >= 80 ) {
		JOptionPane.showMessageDialog(null,"Not too bad! Your score is a B.");
		}else if (score <= 79 && score >= 70 ) {
			JOptionPane.showMessageDialog(null,"Hmm, maybe you could study a little harder. Your score is a C.");
			}else if (score <= 69 && score >= 60 ) {
				JOptionPane.showMessageDialog(null,"Don't worry, just study harder next time! Your score is a D.");
			}else if (score <= 59) {
				JOptionPane.showMessageDialog(null,"Yikes! Maybe you should study alot harder. Your score is a F.");
			}
					
					
					
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
