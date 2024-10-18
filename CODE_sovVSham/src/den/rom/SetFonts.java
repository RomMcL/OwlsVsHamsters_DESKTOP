package den.rom;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;


public class SetFonts extends Window{

	
	Font SpriteGraffiti;
	Font AnotherDanger;
	Font boozy2;
	Font hitchhike;
	
	public void RegFonts() {
		
		
		try {
			SpriteGraffiti = Font.createFont(Font.TRUETYPE_FONT, new File("resources\\font\\SpriteGraffiti.ttf")).deriveFont(46f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(SpriteGraffiti);									
		} catch (FontFormatException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		}
		
			
		try {
			AnotherDanger = Font.createFont(Font.TRUETYPE_FONT, new File("resources\\font\\AnotherDanger.ttf")).deriveFont(16f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(AnotherDanger);									
		} catch (FontFormatException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		}
		
		try {
			boozy2 = Font.createFont(Font.TRUETYPE_FONT, new File("resources\\font\\boozy2.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(boozy2);									
		} catch (FontFormatException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		}
		
		try {
			hitchhike = Font.createFont(Font.TRUETYPE_FONT, new File("resources\\font\\hitchhike.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(hitchhike);									
		} catch (FontFormatException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("Шрифт не найден");
		}
		
		
		
		title.setFont(SpriteGraffiti);
		info.setFont(boozy2.deriveFont(30f));
		

		
		modeGame.setFont(hitchhike.deriveFont(24f).deriveFont(1));
		modeMuz.setFont(hitchhike.deriveFont(24f).deriveFont(1));
		
		pvpRadioButtun.setFont(hitchhike.deriveFont(1));
		pveRadioButtun1.setFont(hitchhike.deriveFont(1));
		pveRadioButtun2.setFont(hitchhike.deriveFont(1));
		pveRadioButtun3.setFont(hitchhike.deriveFont(1));		
		muzCheckBoxCaverL.setFont(hitchhike.deriveFont(1));
		muzCheckBoxOrig.setFont(hitchhike.deriveFont(1));
		muzCheckBoxNo.setFont(hitchhike.deriveFont(1));
		
		scoreGam.setFont(SpriteGraffiti.deriveFont(30f));
		scoreSov.setFont(SpriteGraffiti.deriveFont(36f));
		scoreHam.setFont(SpriteGraffiti.deriveFont(36f));
		scoreSovN.setFont(SpriteGraffiti);
		scoreHamN.setFont(SpriteGraffiti);
		scoreDra.setFont(SpriteGraffiti.deriveFont(30f));
		

		vopros.setFont(SpriteGraffiti);
		textSov.setFont(hitchhike.deriveFont(24f));
		textHam.setFont(hitchhike.deriveFont(24f));

		hpHam.setFont(boozy2);
		hpSov.setFont(boozy2);
		
		logSov.setFont(AnotherDanger);
		logSov1.setFont(boozy2);
		logSov2.setFont(boozy2);
		logSov3.setFont(boozy2);
		logSov4.setFont(boozy2);
		logSov5.setFont(boozy2);
		logSovCombo.setFont(boozy2);
		logHam.setFont(AnotherDanger);
		logHam1.setFont(boozy2);
		logHam2.setFont(boozy2);
		logHam3.setFont(boozy2);
		logHam4.setFont(boozy2);
		logHam5.setFont(boozy2);
		logHamCombo.setFont(boozy2);
		
		
		
		brosHam.setFont(AnotherDanger);
		brosSov.setFont(AnotherDanger);
		lotRezSov.setFont(SpriteGraffiti.deriveFont(72f));
		lotRezHam.setFont(SpriteGraffiti.deriveFont(72f));
		lotRez.setFont(boozy2.deriveFont(26f));
		
		gameMode.setFont(hitchhike.deriveFont(18f));
		
		
		buttonHam.setFont(SpriteGraffiti);
		buttonSov.setFont(SpriteGraffiti);
		goLot.setFont(SpriteGraffiti);
		lotButton.setFont(SpriteGraffiti);
		startGame.setFont(SpriteGraffiti);
		restart.setFont(SpriteGraffiti.deriveFont(36f));
		
		
	}
	

	
	
	
	
}
