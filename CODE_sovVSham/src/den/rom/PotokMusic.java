package den.rom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PotokMusic {
	

	String track;
	static Clip clip = null;
	static FloatControl volumeControl = null;
	static double wt;
	static boolean playing = false;
		
	public void setMusic(){
		
		switch(Game.muzon) {
		case 0: System.out.println("Играем в тишине"); 
			break; 
		case 1: track = "resources\\audio\\CaverL.wav";
				startMusic();
				volumChange();
				break;
//		case 3: track = "resources\\audio\\CaverH.wav";				
//				startMusic();
//				volumChange();
//				break;		
		case 2: track = "resources\\audio\\Original.wav";
				startMusic();
				volumChange();
				break;			
		default: System.out.println("произошла неведомая хрень с музоном");	 
		 }		
	}
				
	public void startMusic(){	
						
		File f = new File(this.track);		
		AudioInputStream tr = null;			
		
		try {
			tr = AudioSystem.getAudioInputStream(f);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
						
		try {
			clip = AudioSystem.getClip();
			clip.open(tr);
			volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);			
			clip.setFramePosition(0);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			playing = true;
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public void stopMusic() {		
		clip.stop();
		playing = false;
	}
	
	public void volumChange() {
						
		Window.zvukVol.setMinimum((int)volumeControl.getMinimum()*70);
		Window.zvukVol.setMaximum((int)volumeControl.getMaximum()*100);
		Window.zvukVol.setValue((int)volumeControl.getMaximum()*100);
		
		Window.zvukVol.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				
				volumeControl.setValue(Window.zvukVol.getValue()/100f);				
				Window.zvukVolBar.setValue(Window.zvukVol.getValue());				
				Window.info.setText("Громкость " + ((Window.zvukVolBar.getValue()+5600)/62) + "%");				
			}			
		});
	}
		
	public void checkBoxChangeMusic() {
		
		ActionListener changeMusic = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(PotokMusic.playing == true) {
					stopMusic();		
				}				
			}			
		};				
		Window.muzCheckBoxCaverL.addActionListener(changeMusic);
//		Window.muzCheckBoxCaverH.addActionListener(changeMusic);
		Window.muzCheckBoxOrig.addActionListener(changeMusic);
		Window.muzCheckBoxNo.addActionListener(changeMusic);				
	}
	

}
