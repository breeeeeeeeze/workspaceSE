package com.itwill.shop.ui.김세연;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class ProductListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ProductListPanel() {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.BLUE);
		add(tabbedPane);

	}

}
