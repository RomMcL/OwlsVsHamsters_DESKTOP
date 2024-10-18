package den.rom;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



public class Window  {
	
		
	static JFrame frame = new JFrame("Совы против Хомяков");
	
	static CardLayout cardLayout = new CardLayout();
		
	JPanel panelMain = new JPanel(new BorderLayout());
	JPanel panelFon = new JPanel(new BorderLayout());
	
	static JPanel panelCont = new JPanel();
	JPanel panelStart = new JPanel(new BorderLayout());
	JPanel panelStartModeScore = new JPanel(new BorderLayout());
	JPanel panelMode = new JPanel();
	JPanel panelScore = new JPanel(new BorderLayout());
	JPanel panelScoreGam = new JPanel(new BorderLayout());
	JPanel panelScoreDra = new JPanel(new BorderLayout());
	JPanel panelScoreSov = new JPanel(new BorderLayout());
	JPanel panelScoreHam = new JPanel(new BorderLayout());
	
	JPanel panelLot = new JPanel(new BorderLayout());
	JPanel panelStartLot = new JPanel(new BorderLayout());
	JPanel panelMainN = new JPanel(new BorderLayout());
	JPanel panelMainS = new JPanel(new BorderLayout());
	JPanel panelMainC = new JPanel(new GridLayout(3,3));
	JPanel panelMainW = new JPanel(new BorderLayout());
	JPanel panelMainE = new JPanel(new BorderLayout());
	JPanel panelLotHam = new JPanel(new BorderLayout());
	JPanel panelLotSov = new JPanel(new BorderLayout());
	JPanel panelLotRez = new JPanel(new BorderLayout());
	JPanel panelAvatarHam = new JPanel(new BorderLayout());
	JPanel panelHamPic = new JPanel(new BorderLayout());
	JPanel panelLogHam = new JPanel(new GridLayout(6,1));
	JPanel panelAvatarSov = new JPanel(new BorderLayout());
	JPanel panelSovPic = new JPanel(new BorderLayout());
	JPanel panelLogSov = new JPanel(new GridLayout(6,1));
	JPanel panelMoveExit = new JPanel(new BorderLayout());
	JPanel panelMove = new JPanel(new BorderLayout());
	JPanel panelExit = new JPanel(new BorderLayout());
	JPanel panelZvuk = new JPanel(new BorderLayout());
	JPanel panelZvukOff = new JPanel(new BorderLayout());
	JPanel panelZvukVol = new JPanel(new BorderLayout());
	
	
	JPanel panelHamPol = new JPanel(new BorderLayout());
	JPanel panelSovPol = new JPanel(new BorderLayout());
	
	JPanel dialogPanel = new JPanel(new BorderLayout());	
	JPanel dialogVoprosPanel = new JPanel(new BorderLayout());
	JPanel dialogContentPanel = new JPanel(new BorderLayout());
	JPanel dialogOtvetPanel = new JPanel(new GridLayout(1,2));	

	
	
	static JLabel title = new JLabel("", SwingConstants.CENTER);
	static JLabel info = new JLabel("Испытай свою силу!",  SwingConstants.CENTER);
		
	static JLabel vopros = new JLabel("Кто ты, воин?", SwingConstants.CENTER);
	static JTextArea textSov = new JTextArea();
	static JTextArea textHam = new JTextArea();
	
	static JLabel logo = new JLabel();	
	
	static JLabel modeGame = new JLabel("Режим игры", SwingConstants.CENTER);
	static JLabel modeMuz = new JLabel("Саундтрек", SwingConstants.CENTER);	
	static JLabel scoreGam = new JLabel("Всего битв:   0", SwingConstants.CENTER);
	static JLabel scoreSov = new JLabel("Совы", SwingConstants.CENTER);
	static JLabel scoreSovN = new JLabel("0", SwingConstants.CENTER);
	static JLabel scoreHam = new JLabel("Хомяки", SwingConstants.CENTER);
	static JLabel scoreHamN = new JLabel("0", SwingConstants.CENTER);
	static JLabel scoreDra = new JLabel("Битв в ничью:   0", SwingConstants.CENTER);
					
	static JLabel modeHam = new JLabel();
	static JLabel modeSov = new JLabel();
	static JLabel lotHam = new JLabel();
	static JLabel lotSov = new JLabel();
	static JLabel lotCentr = new JLabel();
	static JLabel brosHam = new JLabel("Б р о с о к   Х о м я к а", SwingConstants.CENTER);
	static JLabel lotHam1 = new JLabel("", SwingConstants.CENTER);
	static JLabel lotHam2 = new JLabel("", SwingConstants.CENTER);
	static JLabel brosSov = new JLabel("Б р о с о к   С о в ы", SwingConstants.CENTER);
	static JLabel lotSov1 = new JLabel("", SwingConstants.CENTER);
	static JLabel lotSov2 = new JLabel("", SwingConstants.CENTER);
	static JLabel lotRezHam = new JLabel("", SwingConstants.CENTER);
	static JLabel lotRezSov = new JLabel("", SwingConstants.CENTER);
	static JLabel lotRez = new JLabel("Результат жребия?", SwingConstants.CENTER);

	static JLabel gameMode = new JLabel("Выбери режим игры и музыкальное сопровождение.", SwingConstants.CENTER);	
	static JLabel hamPic = new JLabel();
	static JProgressBar hpHam = new JProgressBar();
	static JLabel logHam = new JLabel("Х о м я к   п о л у ч а е т", SwingConstants.CENTER);
	static JLabel logHam1 = new JLabel("", SwingConstants.CENTER);
	static JLabel logHam2 = new JLabel("", SwingConstants.CENTER);
	static JLabel logHam3 = new JLabel("", SwingConstants.CENTER);
	static JLabel logHam4 = new JLabel("", SwingConstants.CENTER);
	static JLabel logHam5 = new JLabel("", SwingConstants.CENTER);
	static JLabel logHamCombo = new JLabel("", SwingConstants.CENTER);		
	static JLabel sovPic = new JLabel();
	static JProgressBar hpSov = new JProgressBar();
	static JLabel logSov = new JLabel("С о в а   п о л у ч а е т", SwingConstants.CENTER);
	static JLabel logSov1 = new JLabel("", SwingConstants.CENTER);
	static JLabel logSov2 = new JLabel("", SwingConstants.CENTER);
	static JLabel logSov3 = new JLabel("", SwingConstants.CENTER);
	static JLabel logSov4 = new JLabel("", SwingConstants.CENTER);
	static JLabel logSov5 = new JLabel("", SwingConstants.CENTER);
	static JLabel logSovCombo = new JLabel("", SwingConstants.CENTER);

	
	static JRadioButton pvpRadioButtun = new JRadioButton("PvP режим (офлайн)", true);
	static JRadioButton pveRadioButtun1 = new JRadioButton("PvE режим (легко)");
	static JRadioButton pveRadioButtun2 = new JRadioButton("PvE режим (норма)");
	static JRadioButton pveRadioButtun3 = new JRadioButton("PvE режим (сложно)");
	ButtonGroup rbg = new ButtonGroup();	
		
	static JCheckBox muzCheckBoxCaverL = new JCheckBox("Кавер Lite");
	static JCheckBox muzCheckBoxOrig = new JCheckBox("Оригинал");
	static JCheckBox muzCheckBoxNo = new JCheckBox("Без звука", true);
	ButtonGroup cbbg = new ButtonGroup();	
		
	static JButton goLot = new JGradientButton("Перейти  к  жребию");
	static JButton lotButton = new JGradientButton("Бросить  кости");
	static JButton startGame = new JGradientButton("Начать  битву");
	static JButton restart = new JGradientButton("Начать  всё  заново");
	
	
	static JButton zvukOff = new JGradientButton("");
	static JSlider zvukVol = new JSlider(0, 100, 100);         
	static JProgressBar zvukVolBar= new JProgressBar();
	static JButton moveButton = new JGradientButton("");
	static JButton exitButton = new JGradientButton("");
	
	static JButton b1 = new JGradientButton("");
	static JButton b2 = new JGradientButton("");
	static JButton b3 = new JGradientButton("");
	static JButton b4 = new JGradientButton("");
	static JButton b5 = new JGradientButton("");
	static JButton b6 = new JGradientButton("");
	static JButton b7 = new JGradientButton("");
	static JButton b8 = new JGradientButton("");
	static JButton b9 = new JGradientButton("");
	static JButton buttonHam = new JGradientButton("<html><div align=\"center\">Я храбрый<br>Хомяк</div></html>");
	static JButton buttonSov = new JGradientButton("<html><div align=\"center\">Я мудрая<br>Сова</div></html>");
	
	

public void createWindow()  {
	

		SetImages img = new SetImages();
		img.imageComponent();
		img.createGraph();
		SetFonts fnt = new SetFonts();
		fnt.RegFonts();

		frame.setSize(1050, 850);                                 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		frame.setUndecorated(true);
						
		frame.setContentPane(panelFon = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
	         public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.drawImage(img.mainFon, 0, 0, 1050, 850, null );	            
	         }
	      });
			
		
		panelFon.add(panelMain, BorderLayout.CENTER);
				
		panelMain.add(panelMainN, BorderLayout.NORTH);
		panelMain.add(panelMainS, BorderLayout.SOUTH);
		panelMain.add(panelCont, BorderLayout.CENTER);
		panelMain.add(panelMainW, BorderLayout.WEST);
		panelMain.add(panelMainE, BorderLayout.EAST);
		panelMain.setOpaque(false);
		
		
		panelCont.setLayout(cardLayout);
		panelCont.add(panelStart, "1");
		panelCont.add(panelLot, "2");
		panelCont.add(panelMainC, "3");
		panelCont.add(dialogPanel, "dialog");
		cardLayout.show(panelCont, "1");
		panelCont.setOpaque(false);

		panelStart.add(logo, BorderLayout.NORTH);	
		
		panelStart.add(panelStartModeScore, BorderLayout.CENTER);
		panelStart.setOpaque(false);
		

		panelStartModeScore.add(panelMode);
		panelMode.setLayout(new BoxLayout(panelMode, BoxLayout.PAGE_AXIS));		
		panelMode.add(Box.createRigidArea(new Dimension(20,10)));		
		panelMode.add(modeGame);
		panelMode.add(pvpRadioButtun);
		panelMode.add(pveRadioButtun1);
		panelMode.add(pveRadioButtun2);
		panelMode.add(pveRadioButtun3);			
		panelMode.add(Box.createVerticalGlue());		
		panelMode.add(modeMuz);
		panelMode.add(muzCheckBoxCaverL);
		panelMode.add(muzCheckBoxOrig);
		panelMode.add(muzCheckBoxNo);		
		panelMode.add(Box.createRigidArea(new Dimension(20,10)));
		panelMode.setOpaque(false);
				
		pvpRadioButtun.setOpaque(false);
		pveRadioButtun1.setOpaque(false);
		pveRadioButtun2.setOpaque(false);
		pveRadioButtun3.setOpaque(false);
		pvpRadioButtun.setFocusPainted(false);
		pveRadioButtun1.setFocusPainted(false);
		pveRadioButtun2.setFocusPainted(false);
		pveRadioButtun3.setFocusPainted(false);
		
		muzCheckBoxCaverL.setOpaque(false);
		muzCheckBoxOrig.setOpaque(false);
		muzCheckBoxNo.setOpaque(false);
		muzCheckBoxCaverL.setFocusPainted(false);
		muzCheckBoxOrig.setFocusPainted(false);
		muzCheckBoxNo.setFocusPainted(false);
		
				
		modeGame.setPreferredSize(new Dimension (0, 30));		
		modeGame.setMaximumSize(new Dimension (150, 0));		
		pvpRadioButtun.setPreferredSize(new Dimension (0, 25));
		pveRadioButtun1.setPreferredSize(new Dimension (0, 25));
		pveRadioButtun2.setPreferredSize(new Dimension (0, 25));
		pveRadioButtun3.setPreferredSize(new Dimension (0, 25));
		modeMuz.setPreferredSize(new Dimension (0, 30));		
		modeMuz.setMaximumSize(new Dimension (130, 0));		
		muzCheckBoxCaverL.setPreferredSize(new Dimension (0, 25));
		muzCheckBoxOrig.setPreferredSize(new Dimension (0, 25));
		muzCheckBoxNo.setPreferredSize(new Dimension (0, 25));

		
		
		
		panelStartModeScore.add(panelScore, BorderLayout.EAST);
		panelStartModeScore.setOpaque(false);
		panelScore.add(panelScoreGam, BorderLayout.NORTH);
		panelScore.setOpaque(false);
		panelScoreGam.add(scoreGam, BorderLayout.CENTER);
		panelScoreGam.setOpaque(false);
		panelScoreDra.add(scoreDra, BorderLayout.CENTER);
		panelScoreDra.setOpaque(false);
		
		panelScore.add(panelScoreSov, BorderLayout.WEST);
		panelScoreSov.add(scoreSov, BorderLayout.NORTH);
		panelScoreSov.add(scoreSovN, BorderLayout.SOUTH);
		panelScoreSov.setOpaque(false);
		panelScore.add(panelScoreHam, BorderLayout.EAST);
		panelScoreHam.add(scoreHam, BorderLayout.NORTH);
		panelScoreHam.add(scoreHamN, BorderLayout.SOUTH);
		panelScoreHam.setOpaque(false);
		panelScore.add(panelScoreDra, BorderLayout.SOUTH);
		
				
		panelStart.add(modeHam, BorderLayout.EAST);
		panelStart.add(modeSov, BorderLayout.WEST);
		panelStart.add(goLot, BorderLayout.SOUTH);	
		goLot.setBorder(null);
//		goLot.setBackground(Color.WHITE);
		
		panelLot.add(lotButton, BorderLayout.NORTH);
		lotButton.setBorder(null);
		panelLot.add(startGame, BorderLayout.SOUTH);
		startGame.setBorder(null);
		panelLot.add(lotHam, BorderLayout.EAST);
		panelLot.add(lotSov, BorderLayout.WEST);		
		panelLot.add(panelStartLot, BorderLayout.CENTER);
		panelLot.setOpaque(false);
		panelStartLot.add(panelLotHam, BorderLayout.EAST);
		panelStartLot.add(panelLotSov, BorderLayout.WEST);
		panelStartLot.add(lotCentr, BorderLayout.CENTER);
		panelStartLot.add(panelLotRez, BorderLayout.SOUTH);
		panelStartLot.setOpaque(false);
		panelLotHam.add(brosHam, BorderLayout.NORTH);
		panelLotHam.add(lotHam1, BorderLayout.WEST);
		panelLotHam.add(lotHam2, BorderLayout.EAST);
		panelLotHam.add(lotRezHam, BorderLayout.SOUTH);
		panelLotHam.setOpaque(false);
		panelLotSov.add(brosSov, BorderLayout.NORTH);
		panelLotSov.add(lotSov1, BorderLayout.WEST);
		panelLotSov.add(lotSov2, BorderLayout.EAST);
		panelLotSov.add(lotRezSov, BorderLayout.SOUTH);
		panelLotSov.setOpaque(false);
		panelLotRez.add(lotRez, BorderLayout.CENTER);
		panelLotRez.setOpaque(false);
		
		panelMainN.add(title, BorderLayout.CENTER);
		panelMainN.add(info, BorderLayout.SOUTH);
		panelMainN.add(panelZvuk, BorderLayout.WEST);
		panelMainN.add(panelMoveExit, BorderLayout.EAST);
		panelMainN.setOpaque(false);
	
		
//---------------------------------------перемещение окна---------		
		new WindowMove(frame);
    	panelMove.add(Window.moveButton);
//----------------------------------------------------------------    	
    	
    	panelZvuk.add(panelZvukOff, BorderLayout.EAST);
    	panelZvuk.add(panelZvukVol, BorderLayout.WEST);
    	panelZvukOff.add(zvukOff);
    	panelZvukVol.add(zvukVolBar, BorderLayout.NORTH);
    	panelZvukVol.add(zvukVol, BorderLayout.SOUTH);
    	
    	panelMoveExit.add(panelExit, BorderLayout.EAST);
		panelMoveExit.add(panelMove, BorderLayout.WEST);
		panelExit.add(exitButton);		
		
		panelMainS.add(gameMode, BorderLayout.NORTH);		
		panelMainS.add(restart, BorderLayout.SOUTH);
		restart.setBorder(null);
		panelMainS.setOpaque(false);
				
		dialogPanel.add(dialogVoprosPanel, BorderLayout.NORTH);
		dialogPanel.add(dialogOtvetPanel, BorderLayout.CENTER);
		dialogPanel.add(dialogContentPanel, BorderLayout.SOUTH);
		
		dialogVoprosPanel.add(vopros);
		

		
		dialogContentPanel.add(textSov, BorderLayout.WEST);		
		textSov.setPreferredSize(new Dimension (300, 250));
		textSov.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		textSov.setLineWrap(true);
		textSov.setWrapStyleWord(true);
		textSov.setEditable(false);
		textSov.setHighlighter(null);		
		textSov.setOpaque(false);
		
		dialogContentPanel.add(textHam, BorderLayout.EAST);		
		textHam.setPreferredSize(new Dimension (300, 250));
		textHam.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		textHam.setLineWrap(true);
		textHam.setWrapStyleWord(true);
		textHam.setEditable(false);
		textHam.setHighlighter(null);		
		textHam.setOpaque(false);
		
		dialogOtvetPanel.add(buttonSov);
		dialogOtvetPanel.add(buttonHam);
		buttonSov.setBorder(null);
		buttonHam.setBorder(null);
		
		dialogPanel.setOpaque(false);
		dialogVoprosPanel.setOpaque(false);
		dialogContentPanel.setOpaque(false);
		
		
		dialogVoprosPanel.setPreferredSize(new Dimension (600, 200));
		dialogOtvetPanel.setPreferredSize(new Dimension (600, 150));
		dialogContentPanel.setPreferredSize(new Dimension (600, 250));
		
		
		panelMainE.add(panelAvatarHam, BorderLayout.NORTH);
		panelMainE.setOpaque(false);
		panelAvatarHam.add(hpHam, BorderLayout.NORTH);
		panelAvatarHam.add(panelHamPic, BorderLayout.CENTER);
		panelHamPic.add(hamPic, BorderLayout.CENTER);
		panelAvatarHam.add(panelHamPol, BorderLayout.SOUTH);
		panelAvatarHam.setOpaque(false);
		panelHamPol.add(logHam, BorderLayout.CENTER);
		panelHamPol.setOpaque(false);
		panelMainE.add(panelLogHam, BorderLayout.CENTER);
		panelLogHam.add(logHam1);
		panelLogHam.add(logHam2);
		panelLogHam.add(logHam3);
		panelLogHam.add(logHam4);
		panelLogHam.add(logHam5);
		panelLogHam.add(logHamCombo);
		panelLogHam.setOpaque(false);
		panelMainW.add(panelAvatarSov, BorderLayout.NORTH);
		panelMainW.setOpaque(false);
		panelAvatarSov.add(hpSov, BorderLayout.NORTH);				
		panelAvatarSov.add(panelSovPic, BorderLayout.CENTER);
		panelSovPic.add(sovPic, BorderLayout.CENTER);
		panelAvatarSov.add(panelSovPol, BorderLayout.SOUTH);
		panelAvatarSov.setOpaque(false);
		panelSovPol.add(logSov, BorderLayout.CENTER);
		panelSovPol.setOpaque(false);
		panelMainW.add(panelLogSov, BorderLayout.CENTER);
		panelLogSov.add(logSov1);
		panelLogSov.add(logSov2);
		panelLogSov.add(logSov3);
		panelLogSov.add(logSov4);
		panelLogSov.add(logSov5);
		panelLogSov.add(logSovCombo);
		panelLogSov.setOpaque(false);
		
		rbg.add(pvpRadioButtun);
		rbg.add(pveRadioButtun1);
		rbg.add(pveRadioButtun2);
		rbg.add(pveRadioButtun3);
		cbbg.add(muzCheckBoxCaverL);
		cbbg.add(muzCheckBoxOrig);
		cbbg.add(muzCheckBoxNo);
		
		
		panelMainC.add(b1);
		panelMainC.add(b2);
		panelMainC.add(b3);
		panelMainC.add(b4);
		panelMainC.add(b5);
		panelMainC.add(b6);
		panelMainC.add(b7);
		panelMainC.add(b8);
		panelMainC.add(b9);
		
		
		
		hpHam.setMinimum(0);
		hpHam.setMaximum(100);
		hpHam.setStringPainted(true);
		hpHam.setString("Хомячиное здоровье");
		hpHam.setBorderPainted(false);
		hpHam.setBorder(null);

		hpSov.setMinimum(0);
		hpSov.setMaximum(100);
		hpSov.setStringPainted(true);
		hpSov.setString("Совиное здоровье");
		hpSov.setBorderPainted(false);
		hpSov.setBorder(null);
		
		zvukVolBar.setMinimum(-5600);
		zvukVolBar.setMaximum(600);
		zvukVolBar.setValue(600);
		zvukVolBar.setStringPainted(true);
		zvukVolBar.setString(">>> >>> >>>");
		zvukVolBar.setOrientation(JProgressBar.VERTICAL);		
		zvukVolBar.setBorderPainted(false);
		zvukVolBar.setBorder(null);
		zvukVolBar.setForeground(Color.BLACK);				

		zvukVol.setMinimum(0);
		zvukVol.setMaximum(100);
		zvukVol.setValue(100);
		zvukVol.setBackground(zvukVolBar.getForeground());
		
		
		
		
		ListenersButtons listenButton = new ListenersButtons();	
		goLot.addMouseListener(listenButton.new ListenerButtonGoLot());
		lotButton.addMouseListener(listenButton.new ListenerButtonStartLot());
		startGame.addMouseListener(listenButton.new ListenerButtonStartGame());	
		restart.addMouseListener(listenButton.new ListenerButtonRestart());
		exitButton.addMouseListener(listenButton.new ListenerButtonExit());
		zvukOff.addMouseListener(listenButton.new ListenerButtonZvukOff());
		ListenersGameButtons listenGameButton = new ListenersGameButtons();
		b1.addMouseListener(listenGameButton.new ListenerGameButton1());
		b2.addMouseListener(listenGameButton.new ListenerGameButton2());
		b3.addMouseListener(listenGameButton.new ListenerGameButton3());
		b4.addMouseListener(listenGameButton.new ListenerGameButton4());
		b5.addMouseListener(listenGameButton.new ListenerGameButton5());
		b6.addMouseListener(listenGameButton.new ListenerGameButton6());
		b7.addMouseListener(listenGameButton.new ListenerGameButton7());
		b8.addMouseListener(listenGameButton.new ListenerGameButton8());
		b9.addMouseListener(listenGameButton.new ListenerGameButton9());		
		buttonHam.addMouseListener(listenButton.new ListenerButtonIamHam());
		buttonSov.addMouseListener(listenButton.new ListenerButtonIamSov());		
		Score s = new Score();
		s.radioButtunChangeScore();
		PotokMusic pm = new PotokMusic();
		pm.checkBoxChangeMusic();
				
	
		panelMain.setPreferredSize(new Dimension (1000, 800));

		panelMainC.setPreferredSize(new Dimension (600, 600));
		panelMainN.setPreferredSize(new Dimension (1000, 130));
		panelMainS.setPreferredSize(new Dimension (1000, 70));
		panelMainW.setPreferredSize(new Dimension (200, 800));
		panelMainE.setPreferredSize(new Dimension (200, 800));
		
		
		logo.setPreferredSize(new Dimension (600, 200));
		modeHam.setPreferredSize(new Dimension (30, 300));
		modeSov.setPreferredSize(new Dimension (30, 300));
		
		panelMode.setPreferredSize(new Dimension (240, 300));
		panelScore.setPreferredSize(new Dimension (300, 300));
		
		panelScoreGam.setPreferredSize(new Dimension (300, 75));		
		panelScoreSov.setPreferredSize(new Dimension (150, 150));
		panelScoreHam.setPreferredSize(new Dimension (150, 150));
		panelScoreDra.setPreferredSize(new Dimension (300, 75));		
		scoreSov.setPreferredSize(new Dimension (150, 75));
		scoreSovN.setPreferredSize(new Dimension (150, 75));
		scoreHam.setPreferredSize(new Dimension (150, 75));
		scoreHamN.setPreferredSize(new Dimension (150, 75));
		goLot.setPreferredSize(new Dimension (600, 100));
		

		
		lotButton.setPreferredSize(new Dimension (600, 100));
		startGame.setPreferredSize(new Dimension (600, 100));
		
		lotHam.setPreferredSize(new Dimension (100, 400));
		lotSov.setPreferredSize(new Dimension (100, 400));
		panelLotHam.setPreferredSize(new Dimension (180, 180));
		panelLotSov.setPreferredSize(new Dimension (180, 180));
		lotRez.setPreferredSize(new Dimension (400, 100));
		
		
		
		brosHam.setPreferredSize(new Dimension (300, 50));
		brosSov.setPreferredSize(new Dimension (300, 50));
		lotHam1.setPreferredSize(new Dimension (90, 90));
		lotHam2.setPreferredSize(new Dimension (90, 90));
		lotSov1.setPreferredSize(new Dimension (90, 90));
		lotSov2.setPreferredSize(new Dimension (90, 90));
		lotRezHam.setPreferredSize(new Dimension (300, 100));
		lotRezSov.setPreferredSize(new Dimension (300, 100));
		
		zvukOff.setPreferredSize(new Dimension (100, 100));		
		panelZvuk.setPreferredSize(new Dimension (200, 100));
		panelZvukOff.setPreferredSize(new Dimension (100, 100));
		panelZvukVol.setPreferredSize(new Dimension (100, 100));
		zvukVol.setPreferredSize(new Dimension (100, 20));
		zvukVolBar.setPreferredSize(new Dimension (100, 80));
		panelMoveExit.setPreferredSize(new Dimension (200, 100));
		panelExit.setPreferredSize(new Dimension (100, 100));
		panelMove.setPreferredSize(new Dimension (100, 100));		
		info.setPreferredSize(new Dimension (1000, 30));
		
		gameMode.setPreferredSize(new Dimension (1000, 20));
		restart.setPreferredSize(new Dimension (1000, 50));
		
		
		panelAvatarHam.setPreferredSize(new Dimension (200, 300));
		panelAvatarSov.setPreferredSize(new Dimension (200, 300));
		hpHam.setPreferredSize(new Dimension (200, 20));
		hpSov.setPreferredSize(new Dimension (200, 20));
		panelHamPol.setPreferredSize(new Dimension (200, 30));
		panelSovPol.setPreferredSize(new Dimension (200, 30));
				
		
		panelFon.setBorder(BorderFactory.createEmptyBorder(20, 25, 30, 25));
		

		
		Font buttonFont = new Font("Times New Roman", Font.PLAIN, 1);
		b1.setFont(buttonFont);
		b2.setFont(buttonFont);
		b3.setFont(buttonFont);
		b4.setFont(buttonFont);
		b5.setFont(buttonFont);
		b6.setFont(buttonFont);
		b7.setFont(buttonFont);
		b8.setFont(buttonFont);
		b9.setFont(buttonFont);

		
		
		frame.setVisible(true);
		
		PotokHP hp = new PotokHP();
		PotokHP.PotokHPstartHum hpStartHum = hp.new PotokHPstartHum();
		PotokHP.PotokHPstartSov hpStartSov = hp.new PotokHPstartSov();
		hpStartHum.start();
		hpStartSov.start();
		
		LogBattle list = new LogBattle();
		list.listUdarov();
		list.listButtons();
				
	
		
	}

	private static class JGradientButton extends JButton {
	   
		private static final long serialVersionUID = 1L;

		private JGradientButton(String text) {
	        super(text);
	        setContentAreaFilled(false);
	        setFocusPainted(false); 
	        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
	        	        	        
	    }
	
	    @Override
	    protected void paintComponent(Graphics g) {
	    	        	
	    	final Graphics2D g2 = (Graphics2D)g.create();
	        g2.setPaint(new GradientPaint(
	                new Point(0, 0), 
	                getBackground(), 
	                new Point(0, getHeight()/3), 
	                Color.LIGHT_GRAY));
	        g2.fillRect(0, 0, getWidth(), getHeight()/3);
	        g2.setPaint(new GradientPaint(
	                new Point(0, getHeight()/3), 
	                Color.LIGHT_GRAY, 
	                new Point(0, getHeight()), 
	                getBackground()));
	        g2.fillRect(0, getHeight()/3, getWidth(), getHeight());
	        g2.dispose();
	    	        		
	/*
	    //------------------ 1 вариант --------------------------	
	    	final Graphics2D g2 = (Graphics2D) g.create();
	        g2.setPaint(new GradientPaint(
	                new Point(0, 0), 
	                Color.WHITE, 
	                new Point(0, getHeight()), 
	                Color.LIGHT_GRAY.darker()));
	        g2.fillRect(0, 0, getWidth(), getHeight());
	        g2.dispose();
	    //--------------------------------------------------------
	*/           
	        	        
	        super.paintComponent(g);
	    }

	}
 
}
