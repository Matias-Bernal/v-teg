package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JPanel_Country extends JLayeredPane{
	
	private String name;
	private JPanel country_pix;
	private JLayeredPane country_army_JLpanel;
	private JLayeredPane country_army_score_JLpanel;
	private JPanel country_army_select;
	private JPanel country_army_color;
	private JLabel country_army_score;

	boolean select;
	boolean reagroup;
	boolean addtrops;
	
    public JPanel_Country(String name,String path_image, int x, int y, int width, int height) {
    	super();
    	select = true;
    	this.name = name;
    	setBounds(x, y, width, height);
        if (path_image != null) {
        	
        	country_pix = new JPanel_Whit_Image(path_image);
        	country_pix.setVisible(true);
        	country_pix.setBounds(0, 0, width, height);
        	this.setLayer(country_pix, 1);
        	this.add(country_pix);
    	
        	country_army_JLpanel = new JLayeredPane();
        	this.setLayer(country_army_JLpanel, 2);
        	country_army_JLpanel.setBounds(width/2, height/2, 17, 17);
        	this.add(country_army_JLpanel);
        	
	    		country_army_select = new JPanel_Whit_Image("/RESOURCES/Icons/disc_over.png");
	    		country_army_select.setVisible(false);
	    		country_army_select.setBounds(0, 0, 17, 17);
	    		country_army_JLpanel.setLayer(country_army_select, 1);
	    		country_army_JLpanel.add(country_army_select);
	    	    		
        		country_army_score_JLpanel = new JLayeredPane();
        		country_army_score_JLpanel.setBounds(1, 1, 15, 15);
        		country_army_JLpanel.setLayer(country_army_score_JLpanel, 2);
        		country_army_JLpanel.add(country_army_score_JLpanel);
        		
	        		country_army_color = new JPanel_Whit_Image("/RESOURCES/Icons/disc_grey.png");
	        		country_army_color.setBounds(0, 0, 15, 15);
	        		country_army_score_JLpanel.setLayer(country_army_color, 1);
	        		country_army_score_JLpanel.add(country_army_color);
	
	        		country_army_score = new JLabel("1");
	        		country_army_score.setBounds(0, 0, 15, 15);
	        		country_army_score.setForeground(Color.WHITE);
	        		country_army_score.setFont(new Font("Arial Narrow", Font.BOLD, 12));
	        		country_army_score.setHorizontalAlignment(SwingConstants.CENTER);
	        		country_army_score_JLpanel.setLayer(country_army_score, 2);
	        		country_army_score_JLpanel.add(country_army_score);
	        		

    		country_army_score.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent arg0) {
    				if (arg0.getButton() == MouseEvent.BUTTON1 && select)
    					selectCountry();
    				if (arg0.getButton() == MouseEvent.BUTTON1 && addtrops)
    					upScore();
    				if (arg0.getButton() == MouseEvent.BUTTON3 && addtrops)
    					downScore();
    			}
    		});
        }
    }

    public void upScore(){
    	Integer score = Integer.parseInt(country_army_score.getText())+1;
    	country_army_score.setText(score.toString());
    }

    public void selectCountry(){
    	country_army_select.setVisible(! country_army_select.isVisible());
    }
    
	public void downScore() {
    	Integer score = Integer.parseInt(country_army_score.getText())-1;
    	if (score <0)
    		country_army_score.setText("0");
    	else
    		country_army_score.setText(score.toString());
		
	}
    
    public void update_bounds(){
    	country_pix.setBounds(0, 0, getSize().width, getSize().height);
    	country_army_JLpanel.setBounds(getSize().width/2, getSize().height/2, 15, 15);
    	repaint();
    	
    }
    
    public void setCountry_Army_panel(Point p, Dimension d){
    	country_army_JLpanel.setSize(d);
    	country_army_JLpanel.setLocation(p);
    }
    
    public JPanel_Whit_Image getCountry_pix() {
		return (JPanel_Whit_Image) country_pix;
	}

	public void setCountry_pix(String path_image) {
		country_pix = new JPanel_Whit_Image(path_image);
	}

	public JPanel_Whit_Image getCountry_army_color() {
		return (JPanel_Whit_Image) country_army_color;
	}

	public void setCountry_army_color(String path_image) {
		this.country_army_color = new JPanel_Whit_Image(path_image);;
	}

	public String getCountry_army_score() {
		return country_army_score.getText();
	}

	public void setCountry_army_score(String country_army_score) {
		this.country_army_score.setText(country_army_score);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}   
}
