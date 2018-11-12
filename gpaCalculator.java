import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/*
 * Jhonathan Nivar (jn3hb)
 * Homework 5: GUI
 */
public class gpaCalculator extends JFrame{
	
	   private JLabel messageLabel;    // To display a message
	   private JButton addCourse;      // 
	   private JButton removeCourse;     // Changes color to blue
	   private JButton removeAllCourses;   // Changes color to yellow
	   private JPanel coursePanel;           // A panel to hold components
	   private JPanel panel_2;
	   private JPanel panel_3;
	   private JTextArea courseList;
	   private JTextArea addedCourses;
	   private final int WINDOW_WIDTH = 400; // Window width
	   private final int WINDOW_HEIGHT = 400; // Window height
	   
	   
	public gpaCalculator() {
		setTitle("GPA Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Let's calculate your GPA"
				                + " based on the classes given and credits taken/received");
		
		addCourse = new JButton("Add Course");
		removeCourse = new JButton("Remove Course");
		removeAllCourses = new JButton("Remove All");
		
		final int rows = 10;
		final int columns = 30;
		courseList = new JTextArea(rows, columns);
		addedCourses = new JTextArea(rows, columns);
		// JScrollPane scrollBar = new JScrollPane(courseList);
		
		addCourse.addActionListener(new AddCourseListener());
		removeCourse.addActionListener(new RemoveCourseListener());
		
		coursePanel = new JPanel();
		coursePanel.setLayout(new BorderLayout());
		coursePanel.add(courseList, BorderLayout.NORTH);
		coursePanel.add(addCourse, BorderLayout.CENTER);
		coursePanel.add(removeCourse, BorderLayout.EAST);
		coursePanel.add(removeAllCourses, BorderLayout.SOUTH);
		panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout());
		panel_2.add(messageLabel, BorderLayout.NORTH);
		panel_2.add(addedCourses, BorderLayout.CENTER);
		// coursePanel.add(scrollBar);
		panel_3 = new JPanel();
		panel_3.setLayout(new BorderLayout());
		panel_3.add(coursePanel, BorderLayout.WEST);
		panel_3.add(panel_2, BorderLayout.CENTER);
		
		// panel_3.add(removeCourse);
		
		add(panel_3);
		
		setVisible(true);
	}
	
	private class AddCourseListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			addedCourses.setText(courseList.getText());
			courseList.setText("");
		}
		
	}
	
	private class RemoveCourseListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/*for (String line : addedCourses.getText().split("\\n")) {
				if (courseList.getText() == line) {
					addedCourses.setText("");
				}
			}*/
			addedCourses.setText("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new gpaCalculator();
	}

}
