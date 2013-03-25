package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Modern_Map_Window extends JFrame implements IVtegMap {

	private JPanel contentPane;
	private JLayeredPane panelPrincipal;
	private JPanel_Country argentina_country;
	private JPanel_Country sahara_country;
	private JPanel_Country aral_country;
	private JPanel_Country arabia_country;
	private JPanel_Country alemania_country;
	private JPanel_Country alaska_country;
	private JPanel_Country canada_country;
	private JPanel_Country australia_country;
	private JPanel_Country borneo_country;
	private JPanel_Country brasil_country;
	private JPanel_Country california_country;
	private JPanel_Country chile_country;
	private JPanel_Country china_country;
	private JPanel_Country colombia_country;
	private JPanel_Country egipto_country;
	private JPanel_Country espania_country;
	private JPanel_Country etiopia_country;
	private JPanel_Country francia_country;
	private JPanel_Country gobi_country;
	private JPanel_Country gran_bretania_country;
	private JPanel_Country groenlandia_country;
	private JPanel_Country india_country;
	private JPanel_Country iran_country;
	private JPanel_Country islandia_country;
	private JPanel_Country israel_country;
	private JPanel_Country italia_country;
	private JPanel_Country japon_country;
	private JPanel_Country java_country;
	private JPanel_Country katchatka_country;
	private JPanel_Country labrador_country;
	private JPanel_Country madagascar_country;
	private JPanel_Country malasia_country;
	private JPanel_Country mexico_country;
	private JPanel_Country mongolia_country;
	private JPanel_Country nuevayork_country;
	private JPanel_Country oregon_country;
	private JPanel_Country peru_country;
	private JPanel_Country polonia_country;
	private JPanel_Country rusia_country;
	private JPanel_Country siberia_country;
	private JPanel_Country sudafrica_country;
	private JPanel_Country suecia_country;
	private JPanel_Country sumatra_country;
	private JPanel_Country taimir_country;
	private JPanel_Country tartaria_country;
	private JPanel_Country terranova_country;
	private JPanel_Country turquia_country;
	private JPanel_Country uruguay_country;
	private JPanel_Country yukon_country;
	private JPanel_Country zaire_country;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modern_Map_Window frame = new Modern_Map_Window();
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
	/**
	 * 
	 */
	public Modern_Map_Window() {
		setType(Type.UTILITY);
		setTitle("MAPA");
		setBounds(0, 0, 645, 396);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		final Dimension boar_dimension = new Dimension(640, 375);
		final Point board_point = new Point(0, 0);
		
		panelPrincipal = new JLayeredPane();
		panelPrincipal.setSize(boar_dimension);
		panelPrincipal.setLocation(board_point);
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		
		
		JPanel board = new JPanel_Whit_Image("/RESOURCES/Images/board.png");
		board.setSize(boar_dimension);
		board.setLocation(board_point);
		panelPrincipal.add(board);
		panelPrincipal.setLayer(board, 1);

		// CREANDO TODOS LOS PAISES //
		setCountry(alaska_country, "alaska",21, 27, 45, 65);
		setCountry(alemania_country, "alemania",294, 90, 48, 63);
		setCountry(arabia_country, "arabia",389, 170, 60, 33);
		setCountry(aral_country, "aral",401, 34, 41, 60);
		setCountry(argentina_country, "argentina",136, 255, 45, 93);
		setCountry(australia_country, "australia",570, 280, 42, 84);
		setCountry(borneo_country, "borneo",555, 232,61, 45);
		setCountry(brasil_country, "brasil",125, 195, 81, 73);
		setCountry(california_country, "california",57, 102, 60, 33);
		setCountry(canada_country, "canada",80, 13, 90, 69);
		setCountry(chile_country, "chile",120, 258, 23, 87);
		setCountry(china_country, "china",469, 81, 111, 124);
		setCountry(colombia_country, "colombia",93, 178, 64, 52);
		setCountry(egipto_country, "egipto",293, 189, 95, 75);
		setCountry(espania_country, "espania",245, 144, 40, 39);
		setCountry(etiopia_country, "etiopia",284, 229, 80, 67);
		setCountry(francia_country, "francia",266, 117, 37, 40);
		setCountry(gobi_country, "gobi",462, 116, 59, 47);
		setCountry(gran_bretania_country, "gran_bretania",262, 66, 33, 55);
		setCountry(groenlandia_country, "groenlandia",176, 11, 81, 54);
		setCountry(india_country, "india",451, 182, 46, 81);
		setCountry(iran_country, "iran",403, 88, 81, 96);
		setCountry(islandia_country, "islandia",256, 39, 38, 26);
		setCountry(israel_country, "israel",366, 196, 53, 45);
		setCountry(italia_country, "italia",293, 137, 51, 55);
		setCountry(japon_country, "japon",575, 90, 32, 75);
		setCountry(java_country, "java",529, 286, 54, 60);
		setCountry(katchatka_country, "katchatka",534, 34, 83, 71);
		setCountry(labrador_country, "labrador",148, 46, 54, 46);
		setCountry(madagascar_country, "madagascar",350, 287, 34, 47);
		setCountry(malasia_country, "malasia",497, 179, 60, 64);
		setCountry(mexico_country, "mexico",63, 128, 63, 57);
		setCountry(mongolia_country, "mongolia",434, 86, 97, 35);
		setCountry(nuevayork_country, "nuevayork",89, 68, 62, 88);
		setCountry(oregon_country, "oregon",42, 81, 51, 58);
		setCountry(peru_country, "peru",98, 219, 50, 42);
		setCountry(polonia_country, "polonia",328, 86, 48, 93);
		setCountry(rusia_country, "rusia",347, 32, 64, 130);
		setCountry(sahara_country, "sahara",231, 182, 73, 78);
		setCountry(siberia_country, "siberia",438, 44, 102, 50);
		setCountry(sudafrica_country, "sudafrica",292, 277, 61, 69);
		setCountry(suecia_country, "suecia",294, 14, 74, 74);
		setCountry(sumatra_country, "sumatra",510, 251, 50, 37);
		setCountry(taimir_country, "taimir",467, 29, 51, 50);
		setCountry(tartaria_country, "tartaria",426, 10, 52, 69);
		setCountry(terranova_country, "terranova",115, 61, 47, 56);
		setCountry(turquia_country, "turquia",354, 145, 107, 58);
		setCountry(uruguay_country, "uruguay",157, 245, 32, 40);
		setCountry(yukon_country, "yukon",60, 29, 39, 55);
		setCountry(zaire_country, "zaire",278, 249, 49, 62);

//		
//		JPanel panel = new JPanel_Whit_Image("/RESOURCES/Country/zaire.png");
//		panelPrincipal.setLayer(panel, 2);
//		panel.setBounds(278, 249, 49, 62);
//		panelPrincipal.add(panel);
	}
	
	public void setCountry(JPanel_Country country, String name, int x, int y, int width, int height){
		country = new JPanel_Country(name,"/RESOURCES/Country/"+name+".png",x,y,width,height);
		panelPrincipal.add(country);
		panelPrincipal.setLayer(country, 2);
	}

}
