/**
 * 
 */
package viewsGameMenus;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utilities.PropertiesManager;

/**
 * @author Esteban
 *
 */
public class WindowResults extends WindowGame{
	
	private JPanel jPanelHeader,jPanelAux,jPanelAux2;

	public WindowResults() {
		super();
		init();
	}
	
	@Override
	protected void init() {
		super.init();		
		jPanelAux = new JPanel();
		jPanelHeader = new JPanel();		
		jPanelAux2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		setPropertiesPanels();
	}
	
	/**
	 * Añadimos las propiedades a cada panel 
	 */
	private void setPropertiesPanels() {
		JLabel textHeader = new JLabelTextGame();
		jPanelBody.setLayout(new GridLayout(4,3));
		jPanelHeader.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanelAux.add(jPanelHeader);
		jPanelAux.setOpaque(false);
		textHeader.setText("Top 3");
		jPanelAux.add(jPanelBody);
		this.add(jPanelAux);
		jPanelHeader.add(textHeader);
		jPanelHeader.setOpaque(false);
		jPanelAux.setLayout(new BoxLayout(jPanelAux,BoxLayout.Y_AXIS));
		jPanelAux2.setOpaque(false);
		this.setSize(dimension.width/3,dimension.height/2);
		jPanelAux2.add(new JButtonOption(jPanelAux, PropertiesManager.getPropertiesManager().getBtnReturnMessage(),"btnReturn"));
		jPanelAux.add(jPanelAux2);
	}
	
	

	@Override
	public void verifyCorrectSize() {
		this.setSize(dimension.width/3,dimension.height/2);
		
	}
	
	/**
	 * Añade los textos con la propiedad de la orientacion en el panel
	 * @param headerText
	 */
	private void setPropertiesLabels(String headerText, int orientation) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(orientation));
		JLabelTextGame jLabelTextGame1 = new JLabelTextGame();
		jLabelTextGame1.setText(headerText);
		panel.add(jLabelTextGame1);		
		panel.setOpaque(false);
		jPanelBody.add(panel);
	}
	
	/**
	 * Construimos la matriz de los resultados que quedremos mostrar
	 * @param top3Results
	 */
	
	private void addResults(ArrayList<String> top3Results) {
		for (String result : top3Results) {
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.CENTER));
			String[] list = result.split(",");
			String name = list[0];
			String levelName = list[1];
			String time = list[2];
			jPanelBody.add(new JPanelResult(name));
			jPanelBody.add(new JPanelResult(levelName));
			jPanelBody.add(new JPanelResult(time));
		}
	}

	

}
