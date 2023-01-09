package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.JTabbedPane;
import java.awt.Component;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel globalSouthMenuTab = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenuTab.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		globalSouthMenuTab.setOpaque(false);
		globalSouthMenuTab.setBorder(null);
		globalSouthMenuTab.setBackground(Color.GRAY);
		contentPane.add(globalSouthMenuTab, BorderLayout.SOUTH);
		
		JButton globalSerchMenu = new JButton("");
		globalSerchMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSerchMenu.setBorderPainted(false);
		globalSerchMenu.setOpaque(false);
		globalSerchMenu.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMenuTab.add(globalSerchMenu);
		
		JButton globalMainMenu = new JButton("");
		globalMainMenu.setBorderPainted(false);
		globalMainMenu.setOpaque(false);
		globalMainMenu.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/cart50.png")));
		globalMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		globalSouthMenuTab.add(globalMainMenu);
		
		JButton globalMemberMenu = new JButton("");
		globalMemberMenu.setBorderPainted(false);
		globalMemberMenu.setOpaque(false);
		globalMemberMenu.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/50dachshund.jpg")));
		globalSouthMenuTab.add(globalMemberMenu);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		productTPane.addTab("인기상품", null, popularProductPanel, null);
		
		JTabbedPane memberTPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("member", null, memberTPane, null);
	}

}
