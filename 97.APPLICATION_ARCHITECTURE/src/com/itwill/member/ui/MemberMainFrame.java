package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MemberMainFrame extends JFrame {
	/*********1.MemberService멤버필드선언*********/
	private MemberService memberService;
	/*
	ProductService productService;
	....
	*/
	/************ 로그인한 회원 ******************/
	private Member loginMember = null;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JPasswordField passTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JComboBox ageCB;
	private JCheckBox marriedCK;
	private JLabel idMsgLB;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JTextField infoIdTF;
	private JPasswordField infoPassTF;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JTabbedPane memberTabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame()throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 561);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMemu = new JMenu("회원");
		menuBar.add(memberMemu);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		memberMemu.add(loginMenuItem);
		
		JMenuItem joinMenuItem = new JMenuItem("가입");
		memberMemu.add(joinMenuItem);
		
		JMenuItem logoutMenuItem = new JMenuItem("로그아웃");
		memberMemu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMemu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		memberMemu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(Color.PINK);
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		JLabel passwordLB = new JLabel("아이디");
		passwordLB.setBounds(36, 111, 57, 15);
		memberLoginPanel.add(passwordLB);
		
		JLabel lblNewLabel_6 = new JLabel("패쓰워드");
		lblNewLabel_6.setBounds(36, 173, 57, 15);
		memberLoginPanel.add(lblNewLabel_6);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(136, 108, 116, 21);
		memberLoginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(136, 170, 116, 21);
		memberLoginPanel.add(loginPassTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********회원로그인************/
				try {
					String id = loginIdTF.getText();
					String pass=new String(loginPassTF.getPassword());
					
					int result = memberService.login(id, pass);
					if(result==0) {
						//로그인성공
						loginProcess(id);
						
					}else {
						JOptionPane.showMessageDialog(null, "아이디또는 비밀번호를 확인하세요");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
					
					
					
				}catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		loginBtn.setBounds(38, 232, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		joinBtn.setBounds(155, 232, 97, 23);
		memberLoginPanel.add(joinBtn);
		
		JPanel memberJoinPanel = new JPanel();
		memberJoinPanel.setBackground(SystemColor.activeCaption);
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(53, 60, 57, 15);
		memberJoinPanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(131, 57, 116, 21);
		memberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel 패쓰워드 = new JLabel("패쓰워드");
		패쓰워드.setBounds(53, 109, 57, 15);
		memberJoinPanel.add(패쓰워드);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(53, 162, 57, 15);
		memberJoinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(53, 205, 57, 15);
		memberJoinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(53, 264, 57, 15);
		memberJoinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(53, 326, 57, 15);
		memberJoinPanel.add(lblNewLabel_5);
		
		passTF = new JPasswordField();
		passTF.setBounds(131, 107, 116, 18);
		memberJoinPanel.add(passTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(131, 159, 116, 21);
		memberJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(131, 202, 116, 21);
		memberJoinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"}));
		ageCB.setBounds(131, 260, 116, 23);
		memberJoinPanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(131, 322, 27, 19);
		memberJoinPanel.add(marriedCK);
		
		JButton memberJoinBtn = new JButton("가입");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********** 회원가입 ************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = idTF.getText();
					String password=new String(passTF.getPassword());
					String name=nameTF.getText();
					String address=addressTF.getText();
					/***********유효성체크****************/
					if(id.equals("")) {
						 idMsgLB.setText("아이디를 입력하세요.");
						 idTF.requestFocus();
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married="";
					if(marriedCK.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					
					
					Member newMember=new Member(id,password,name,address,age,married,null);
					boolean isAdd = memberService.addMember(newMember);
					if(isAdd) {
						//로그인화면전환
						 memberTabbedPane.setSelectedIndex(1);
					}else {
						JOptionPane.showMessageDialog(null, "이미사용하고있는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
				}catch (Exception e1) {
					System.out.println("회원가입-->"+e1.getMessage());
				}
			}
		});
		memberJoinBtn.setBounds(47, 391, 97, 23);
		memberJoinPanel.add(memberJoinBtn);
		
		JButton memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(160, 391, 97, 23);
		memberJoinPanel.add(memberCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(131, 88, 116, 15);
		memberJoinPanel.add(idMsgLB);
		
		JPanel memberInfoPanel = new JPanel();
		memberInfoPanel.setBackground(Color.LIGHT_GRAY);
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(45, 48, 57, 15);
		memberInfoPanel.add(lblNewLabel_1);
		
		infoIdTF = new JTextField();
		infoIdTF.setEnabled(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(123, 45, 116, 21);
		memberInfoPanel.add(infoIdTF);
		
		JLabel 패쓰워드_1 = new JLabel("패쓰워드");
		패쓰워드_1.setBounds(45, 97, 57, 15);
		memberInfoPanel.add(패쓰워드_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setEditable(false);
		infoPassTF.setBounds(123, 95, 116, 18);
		memberInfoPanel.add(infoPassTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(45, 150, 57, 15);
		memberInfoPanel.add(lblNewLabel_2_1);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(123, 147, 116, 21);
		memberInfoPanel.add(infoNameTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(45, 193, 57, 15);
		memberInfoPanel.add(lblNewLabel_3_1);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(123, 190, 116, 21);
		memberInfoPanel.add(infoAddressTF);
		
		JLabel lblNewLabel_4_1 = new JLabel("나이");
		lblNewLabel_4_1.setBounds(45, 252, 57, 15);
		memberInfoPanel.add(lblNewLabel_4_1);
		
		JComboBox infoAgeCB = new JComboBox();
		infoAgeCB.setBounds(123, 248, 116, 23);
		memberInfoPanel.add(infoAgeCB);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(45, 314, 57, 15);
		memberInfoPanel.add(lblNewLabel_5_1);
		
		JCheckBox infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(123, 310, 27, 19);
		memberInfoPanel.add(infoMarriedCK);
		
		/******2.MemberService멤버필드객체생성*********/
		memberService=new MemberService();
	}//생성자끝
	
	
	
	
	private void loginProcess(String id) throws Exception {
		/***********로그인성공시 해야할일***********
		 1.로그인성공한 멤버객체 멤버필드에저장
		 2.MemberMainFrame타이틀변경
		 3.로그인,회원가입탭 불활성화
		 4.회원정보보기 화면전환
		 
		********************************************/
		//1.로그인 성공
		this.loginMember = memberService.memberDetail(id);
		//2.MemberMainFrame타이틀변경
		setTitle(id+" 님 로그인");
		// 3.로그인,회원가입탭 불활성화
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		// 4.회원정보보기 화면전환
		memberTabbedPane.setSelectedIndex(2);
		
		/**************회원상세데이타 보여주기*******************/
		infoIdTF.setText(loginMember.getM_id());
		infoIdTF.setText(loginMember.getM_password());
		infoIdTF.setText(loginMember.getM_address());
		
	}
}
