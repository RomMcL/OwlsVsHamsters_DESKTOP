package den.rom;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class SetImages extends Window {
	
	
	Image hamStart, hamWin, hamLos, hamNi, sovStart, sovWin, sovLos, sovNi;

	Image  mainFon, logoFon; 
		
	BufferedImage hamLot1Fon, hamLot2Fon, sovLot1Fon, sovLot2Fon;
	BufferedImage cub1, cub2, cub3, cub4, cub5, cub6;

	Image stopMusFon, moveButtonFon, exitButtonFon, restartFon, goLotFon, lotStartButtonFon, dialogSovFon, dialogHamFon;
	
	BufferedImage gb1, gb2, gb3, gb4, gb5, gb6, gb7, gb8, gb9, hamHead, sovHead;
	
	static BufferedImage fatality;
	
	
	public void imageComponent() {
		try {
			mainFon = ImageIO.read(new File("resources\\pic\\MainFon.png"));
					
				
			logoFon = ImageIO.read(new File("resources\\pic\\LogoFon.png"));

			hamLot1Fon = ImageIO.read(new File("resources\\pic\\HamLot1.png"));
			hamLot2Fon = ImageIO.read(new File("resources\\pic\\HamLot2.png"));
			sovLot1Fon = ImageIO.read(new File("resources\\pic\\SovLot1.png"));
			sovLot2Fon = ImageIO.read(new File("resources\\pic\\SovLot2.png"));		
	
			

			dialogSovFon = ImageIO.read(new File("resources\\pic\\DialogSov.png"));
			dialogHamFon = ImageIO.read(new File("resources\\pic\\DialogHam.png"));
			

		
			stopMusFon = ImageIO.read(new File("resources\\pic\\StopMusFon.png"));
			moveButtonFon = ImageIO.read(new File("resources\\pic\\MoveFon.png"));
			exitButtonFon = ImageIO.read(new File("resources\\pic\\ExitFon.png"));	
			goLotFon = ImageIO.read(new File("resources\\pic\\GoLotFon.png"));
			lotStartButtonFon = ImageIO.read(new File("resources\\pic\\LotStartButtonFon.png"));
			restartFon = ImageIO.read(new File("resources\\pic\\RestartFon.png"));
			
			gb1 = ImageIO.read(new File("resources\\pic\\B1.png"));
			gb2 = ImageIO.read(new File("resources\\pic\\B2.png"));
			gb3 = ImageIO.read(new File("resources\\pic\\B3.png"));
			gb4 = ImageIO.read(new File("resources\\pic\\B4.png"));
			gb5 = ImageIO.read(new File("resources\\pic\\B5.png"));
			gb6 = ImageIO.read(new File("resources\\pic\\B6.png"));
			gb7 = ImageIO.read(new File("resources\\pic\\B7.png"));
			gb8 = ImageIO.read(new File("resources\\pic\\B8.png"));
			gb9 = ImageIO.read(new File("resources\\pic\\B9.png"));
			
			
			
			hamStart = ImageIO.read(new File("resources\\pic\\HamStart.png"));
			hamWin = ImageIO.read(new File("resources\\pic\\HamWin.png"));
			hamLos = ImageIO.read(new File("resources\\pic\\HamLos.png"));
			hamNi = ImageIO.read(new File("resources\\pic\\HamNi.png"));			
			sovStart = ImageIO.read(new File("resources\\pic\\SovStart.png"));
			sovWin = ImageIO.read(new File("resources\\pic\\SovWin.png"));
			sovLos = ImageIO.read(new File("resources\\pic\\SovLos.png"));
			sovNi = ImageIO.read(new File("resources\\pic\\SovNi.png"));
					
			hamHead = ImageIO.read(new File("resources\\pic\\HamHead.png"));
			sovHead = ImageIO.read(new File("resources\\pic\\SovHead.png"));
			
			fatality = ImageIO.read(new File("resources\\pic\\Fatality.png"));
			
			
		} catch (IOException e) {
			System.out.println("файл не найден");
			
		}
		
	}
	
	public void createGraph() {
		

		logo.setIcon(new ImageIcon(logoFon));
	
		
		buttonSov.setIcon(new ImageIcon(dialogSovFon));
		buttonSov.setIconTextGap(-300);
		buttonSov.setHorizontalTextPosition(JLabel.CENTER);
		buttonSov.setVerticalTextPosition(JLabel.CENTER);
		
		buttonHam.setIcon(new ImageIcon(dialogHamFon));		
		buttonHam.setIconTextGap(-300);
		buttonHam.setHorizontalTextPosition(JLabel.CENTER);
		buttonHam.setVerticalTextPosition(JLabel.CENTER);

		
		hamPic.setIcon(new ImageIcon(hamStart));
		sovPic.setIcon(new ImageIcon(sovStart));
									
		zvukOff.setIcon(new ImageIcon(stopMusFon));
		moveButton.setIcon(new ImageIcon(moveButtonFon));
		exitButton.setIcon(new ImageIcon(exitButtonFon));
				
		goLot.setIcon(new ImageIcon(goLotFon));
		goLot.setIconTextGap(-600);
		goLot.setHorizontalTextPosition(JLabel.CENTER);
		goLot.setVerticalTextPosition(JLabel.CENTER);
		lotButton.setIcon(new ImageIcon(lotStartButtonFon));
	//	lotButton.setIconTextGap(-500);
		lotButton.setHorizontalTextPosition(JLabel.CENTER);
		lotButton.setVerticalTextPosition(JLabel.CENTER);
		startGame.setIcon(new ImageIcon(goLotFon));
		startGame.setIconTextGap(-600);
		startGame.setHorizontalTextPosition(JLabel.CENTER);
		startGame.setVerticalTextPosition(JLabel.CENTER);
						
		restart.setIcon(new ImageIcon(restartFon));
		restart.setIconTextGap(-1000);
		restart.setHorizontalTextPosition(JLabel.CENTER);
		restart.setVerticalTextPosition(JLabel.CENTER);
		
		gameButtonFon();
				
//		ShowWin.label.setIcon(new ImageIcon(fatality));
		
		
	
	}
	
	public void changeAvatar() {
		Game g = new Game();
		
		imageComponent();
			
		if(g.findThreeInARow()) {
			if(Game.winnerName == "Хомяк") {
				hamPic.setIcon(new ImageIcon(hamWin));
				sovPic.setIcon(new ImageIcon(sovLos));				
			} else if(Game.winnerName == "Сова") {
				sovPic.setIcon(new ImageIcon(sovWin));
				hamPic.setIcon(new ImageIcon(hamLos));				
			}			
		}else if(g.findDrawnGame()) {
			hamPic.setIcon(new ImageIcon(hamNi));
			sovPic.setIcon(new ImageIcon(sovNi));
			}		
    }
	

		
	public void brosokCubFon(int cubS1, int cubS2, int cubH1, int cubH2) {
		
		int s1 = cubS1;
		int s2 = cubS2;
		int h1 = cubH1;
		int h2 = cubH2;
		BufferedImage numCubS1 = null;
		BufferedImage numCubS2 = null;
		BufferedImage numCubH1 = null;
		BufferedImage numCubH2 = null;
		
		try {
			hamLot1Fon = ImageIO.read(new File("resources\\pic\\HamLot1.png"));
			hamLot2Fon = ImageIO.read(new File("resources\\pic\\HamLot2.png"));
			sovLot1Fon = ImageIO.read(new File("resources\\pic\\SovLot1.png"));
			sovLot2Fon = ImageIO.read(new File("resources\\pic\\SovLot2.png"));			
			cub1 = ImageIO.read(new File("resources\\pic\\Cub1.png"));
			cub2 = ImageIO.read(new File("resources\\pic\\Cub2.png"));
			cub3 = ImageIO.read(new File("resources\\pic\\Cub3.png"));
			cub4 = ImageIO.read(new File("resources\\pic\\Cub4.png"));
			cub5 = ImageIO.read(new File("resources\\pic\\Cub5.png"));
			cub6 = ImageIO.read(new File("resources\\pic\\Cub6.png"));			
		} catch (IOException e) {
			System.out.println("img кубика не найден");			
		}	
						
		switch(s1) {
		case 1: numCubS1 = cub1; break;
		case 2: numCubS1 = cub2; break;
		case 3: numCubS1 = cub3; break;
		case 4: numCubS1 = cub4; break;
		case 5: numCubS1 = cub5; break;
		case 6: numCubS1 = cub6; break;
		default: System.out.println("произошла неведомая хрень");	 
		 }
		
		switch(s2) {
		case 1: numCubS2 = cub1; break;
		case 2: numCubS2 = cub2; break;
		case 3: numCubS2 = cub3; break;
		case 4: numCubS2 = cub4; break;
		case 5: numCubS2 = cub5; break;
		case 6: numCubS2 = cub6; break;
		default: System.out.println("произошла неведомая хрень");	 
		 }
		
		switch(h1) {
		case 1: numCubH1 = cub1; break;
		case 2: numCubH1 = cub2; break;
		case 3: numCubH1 = cub3; break;
		case 4: numCubH1 = cub4; break;
		case 5: numCubH1 = cub5; break;
		case 6: numCubH1 = cub6; break;
		default: System.out.println("произошла неведомая хрень");	 
		 }
		
		switch(h2) {
		case 1: numCubH2 = cub1; break;
		case 2: numCubH2 = cub2; break;
		case 3: numCubH2 = cub3; break;
		case 4: numCubH2 = cub4; break;
		case 5: numCubH2 = cub5; break;
		case 6: numCubH2 = cub6; break;
		default: System.out.println("произошла неведомая хрень");	 
		 }
		
//--------------------------------------------------------Рандомное место падения кубиков		
		int xMax = sovLot1Fon.getWidth()-cub1.getWidth();
        int yMax = sovLot1Fon.getHeight()-cub1.getHeight();		
        Random random = new Random();        
        int x1 = random.nextInt(xMax);
        int y1 = random.nextInt(yMax);        
        int x2 = random.nextInt(xMax);
        int y2 = random.nextInt(yMax);      
        int x3 = random.nextInt(xMax);
        int y3 = random.nextInt(yMax);       
        int x4 = random.nextInt(xMax);
        int y4 = random.nextInt(yMax);
//-----------------------------------------------------------------------------------------		
		
		BufferedImage combinedImage11 = new BufferedImage(sovLot1Fon.getWidth(), sovLot1Fon.getHeight(), BufferedImage.TYPE_INT_ARGB );         
        Graphics2D g11 = combinedImage11.createGraphics();
        g11.drawImage(sovLot1Fon,0,0,null);
        g11.drawImage(numCubS1,x1,y1,null);
        g11.dispose();		
        lotSov1.setIcon(new ImageIcon(combinedImage11));
				
        BufferedImage combinedImage12 = new BufferedImage(sovLot2Fon.getWidth(), sovLot2Fon.getHeight(), BufferedImage.TYPE_INT_ARGB );         
        Graphics2D g12 = combinedImage12.createGraphics();
        g12.drawImage(sovLot2Fon,0,0,null);
        g12.drawImage(numCubS2,x2,y2,null);
        g12.dispose();		
        lotSov2.setIcon(new ImageIcon(combinedImage12));
        
        BufferedImage combinedImage21 = new BufferedImage(hamLot1Fon.getWidth(), hamLot1Fon.getHeight(), BufferedImage.TYPE_INT_ARGB );         
        Graphics2D g21 = combinedImage21.createGraphics();
        g21.drawImage(hamLot1Fon,0,0,null);
        g21.drawImage(numCubH1,x3,y3,null);
        g21.dispose();		
        lotHam1.setIcon(new ImageIcon(combinedImage21));
        
        BufferedImage combinedImage22 = new BufferedImage(hamLot2Fon.getWidth(), hamLot2Fon.getHeight(), BufferedImage.TYPE_INT_ARGB );         
        Graphics2D g22 = combinedImage22.createGraphics();
        g22.drawImage(hamLot2Fon,0,0,null);
        g22.drawImage(numCubH2,x4,y4,null);
        g22.dispose();		
        lotHam2.setIcon(new ImageIcon(combinedImage22));
                       
//        System.out.println("1 кубик Совы = " + s1);
//        System.out.println("2 кубик Совы = " + s2);
//        System.out.println("1 кубик Хомяка = " + h1);
//        System.out.println("2 кубик Хомяка = " + h2);
        
    }
	
	
	public void gameButtonFon() {
		b1.setIcon(new ImageIcon(gb1));
		b1.setIconTextGap(-200);
		b1.setHorizontalTextPosition(JLabel.CENTER);
		b1.setVerticalTextPosition(JLabel.CENTER);		
		b2.setIcon(new ImageIcon(gb2));
		b2.setIconTextGap(-200);
		b2.setHorizontalTextPosition(JLabel.CENTER);
		b2.setVerticalTextPosition(JLabel.CENTER);		
		b3.setIcon(new ImageIcon(gb3));
		b3.setIconTextGap(-200);
		b3.setHorizontalTextPosition(JLabel.CENTER);
		b3.setVerticalTextPosition(JLabel.CENTER);		
		b4.setIcon(new ImageIcon(gb4));
		b4.setIconTextGap(-200);
		b4.setHorizontalTextPosition(JLabel.CENTER);
		b4.setVerticalTextPosition(JLabel.CENTER);		
		b5.setIcon(new ImageIcon(gb5));
		b5.setIconTextGap(-200);
		b5.setHorizontalTextPosition(JLabel.CENTER);
		b5.setVerticalTextPosition(JLabel.CENTER);		
		b6.setIcon(new ImageIcon(gb6));
		b6.setIconTextGap(-200);
		b6.setHorizontalTextPosition(JLabel.CENTER);
		b6.setVerticalTextPosition(JLabel.CENTER);		
		b7.setIcon(new ImageIcon(gb7));
		b7.setIconTextGap(-200);
		b7.setHorizontalTextPosition(JLabel.CENTER);
		b7.setVerticalTextPosition(JLabel.CENTER);		
		b8.setIcon(new ImageIcon(gb8));
		b8.setIconTextGap(-200);
		b8.setHorizontalTextPosition(JLabel.CENTER);
		b8.setVerticalTextPosition(JLabel.CENTER);		
		b9.setIcon(new ImageIcon(gb9));
		b9.setIconTextGap(-200);
		b9.setHorizontalTextPosition(JLabel.CENTER);
		b9.setVerticalTextPosition(JLabel.CENTER);
	}
		
	public void gameButtonFon1() {
		imageComponent();		
		if(b1.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb1.getWidth(), gb1.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb1,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b1.setIcon(new ImageIcon(hodHead));			
		} else if(b1.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb1.getWidth(), gb1.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb1,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b1.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon2() {
		imageComponent();		
		if(b2.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb2.getWidth(), gb2.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb2,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b2.setIcon(new ImageIcon(hodHead));			
		} else if(b2.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb2.getWidth(), gb2.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb2,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b2.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon3() {
		imageComponent();		
		if(b3.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb3.getWidth(), gb3.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb3,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b3.setIcon(new ImageIcon(hodHead));			
		} else if(b3.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb3.getWidth(), gb3.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb3,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b3.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon4() {
		imageComponent();		
		if(b4.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb4.getWidth(), gb4.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb4,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b4.setIcon(new ImageIcon(hodHead));			
		} else if(b4.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb4.getWidth(), gb4.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb4,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b4.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon5() {
		imageComponent();		
		if(b5.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb5.getWidth(), gb5.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb5,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b5.setIcon(new ImageIcon(hodHead));			
		} else if(b5.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb5.getWidth(), gb5.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb5,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b5.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon6() {
		imageComponent();		
		if(b6.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb6.getWidth(), gb6.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb6,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b6.setIcon(new ImageIcon(hodHead));			
		} else if(b6.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb6.getWidth(), gb6.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb6,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b6.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon7() {
		imageComponent();		
		if(b7.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb7.getWidth(), gb7.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb7,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b7.setIcon(new ImageIcon(hodHead));			
		} else if(b7.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb7.getWidth(), gb7.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb7,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b7.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon8() {
		imageComponent();		
		if(b8.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb8.getWidth(), gb8.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb8,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b8.setIcon(new ImageIcon(hodHead));			
		} else if(b8.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb8.getWidth(), gb8.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb8,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b8.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	public void gameButtonFon9() {
		imageComponent();		
		if(b9.getText() == "X") {
			BufferedImage hodHead = new BufferedImage(gb9.getWidth(), gb9.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb9,0,0,null);
	        g.drawImage(hamHead,25,25,null);
	        g.dispose();		
	        b9.setIcon(new ImageIcon(hodHead));			
		} else if(b9.getText() == "O") {
			BufferedImage hodHead = new BufferedImage(gb9.getWidth(), gb9.getHeight(), BufferedImage.TYPE_INT_ARGB );         
	        Graphics2D g = hodHead.createGraphics();
	        g.drawImage(gb9,0,0,null);
	        g.drawImage(sovHead,25,25,null);
	        g.dispose();		
	        b9.setIcon(new ImageIcon(hodHead));			
		}			
	}
	
	
}

