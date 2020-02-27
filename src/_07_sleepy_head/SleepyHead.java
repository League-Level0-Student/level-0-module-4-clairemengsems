package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    
    	int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
    	if(result == JOptionPane.NO_OPTION) {	
    		
    	JOptionPane.showMessageDialog(null, "Okay you can sleep in!");			
    	}else {
    	int vacation = JOptionPane.showConfirmDialog(null, "Are you on vacation", "Sleepy Head", JOptionPane.YES_NO_OPTION);		
    	
    	if (vacation == JOptionPane.YES_OPTION) {
    		JOptionPane.showMessageDialog(null, "Okay you can sleep in!");		
    	}else {
    	JOptionPane.showMessageDialog(null, "GGEEEEEETTTT UUPPPPP!!! ...or sleep in its your choice");	
    	}
    	}

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
