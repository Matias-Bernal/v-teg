package GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JPanel_Country extends JLayeredPane{
	
	private String name;
	private JPanel country_pix;
	private JLayeredPane country_army_JLpanel;
	private JPanel country_army_color;
	private JLabel country_army_score;
	
    public JPanel_Country(String name,String path_image, int x, int y, int width, int height) {
    	super();
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
        	country_army_JLpanel.setBounds(width/2, height/2, 15, 15);
        	this.add(country_army_JLpanel);
    	
        	country_army_color = new JPanel_Whit_Image("/RESOURCES/Icons/disc_over.png");
        	country_army_color.setBounds(0, 0, 15, 15);
        	country_army_JLpanel.setLayer(country_army_color, 1);
        	country_army_JLpanel.add(country_army_color);
	
    		country_army_score = new JLabel("1");
    		country_army_score.setBounds(0, 0, 15, 15);
    		country_army_score.setFont(new Font("Arial Narrow", Font.BOLD, 12));
    		country_army_score.setHorizontalAlignment(SwingConstants.CENTER);
    		country_army_JLpanel.setLayer(country_army_score, 2);
    		country_army_JLpanel.add(country_army_score);
        }
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
