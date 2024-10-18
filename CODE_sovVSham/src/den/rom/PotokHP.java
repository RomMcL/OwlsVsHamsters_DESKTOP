package den.rom;

public class PotokHP {
	
	static boolean stopFatality = true;	
	
	
	public class PotokHPstartHum extends Thread {
		public void run() {
			try {			
				phStartHum();			
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}			
		public void phStartHum() throws Throwable {		
			for (int i = Window.hpHam.getMinimum(); i <= Window.hpHam.getMaximum(); i++) {
				Thread.sleep(10);  
				Window.hpHam.setValue(i);
			}		
		}	
	}
	
	public class PotokHPstartSov extends Thread {
		public void run() {
			try {			
				phStartSov();			
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}			
		public void phStartSov() throws Throwable {		
			for (int i = Window.hpSov.getMinimum(); i <= Window.hpSov.getMaximum(); i++) {
				Thread.sleep(10);  
				Window.hpSov.setValue(i);
			}		
		}	
	}	

	public class PotokHPbattleHam extends Thread {
		
		double n = 0.0;	
			
		public void run() {
			try {			
				phInfo();			
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
				
		public void phInfo() throws Throwable {
							
			if(Window.logHam1.getText() != "" && Window.logHam2.getText() == "") n = 1.1;
			if(Window.logHam2.getText() != "" && Window.logHam3.getText() == "") n = 1.2;
			if(Window.logHam3.getText() != "" && Window.logHam4.getText() == "") n = 1.3;
			if(Window.logHam4.getText() != "" && Window.logHam5.getText() == "") n = 1.4;
			if(Window.logHam5.getText() != "") n = 1.5;
															
			if(n == 1.1) {			
				for (int i = Window.hpHam.getMaximum(); i >= 0.8*Window.hpHam.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpHam.setValue(i);
				}
			} else
			if(n == 1.2) { 
				for (int i = (int) (0.8*Window.hpHam.getMaximum()); i >= 0.6*Window.hpHam.getMaximum(); i--) {                       
				Thread.sleep(30);  
				Window.hpHam.setValue(i);
				}
			} else
			if(n == 1.3) {
				for (int i = (int) (0.6*Window.hpHam.getMaximum()); i >= 0.4*Window.hpHam.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpHam.setValue(i);
				}
			} else
			if(n == 1.4) {
				for (int i = (int) (0.4*Window.hpHam.getMaximum()); i >= 0.2*Window.hpHam.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpHam.setValue(i);
				}
			} else
			if(n == 1.5) {
				for (int i = (int) (0.2*Window.hpHam.getMaximum()); i >= 0.1*Window.hpHam.getMaximum(); i--) {
				Thread.sleep(55);  
				Window.hpHam.setValue(i);
				}
			} 			
		}
	}
	
	public class PotokHPbattleSov extends Thread {
		
		double n = 0.0;	
			
		public void run() {
			try {			
				phInfo();			
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
				
		public void phInfo() throws Throwable {
																	
			if(Window.logSov1.getText() != "" && Window.logSov2.getText() == "") n = 2.1;
			if(Window.logSov2.getText() != "" && Window.logSov3.getText() == "") n = 2.2;
			if(Window.logSov3.getText() != "" && Window.logSov4.getText() == "") n = 2.3;
			if(Window.logSov4.getText() != "" && Window.logSov5.getText() == "") n = 2.4;
			if(Window.logSov5.getText() != "") n = 2.5;
												
			if(n == 2.1) {			
				for (int i = Window.hpSov.getMaximum(); i >= 0.8*Window.hpSov.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpSov.setValue(i);
				}
			} else 
			if(n == 2.2) { 
				for (int i = (int) (0.8*Window.hpSov.getMaximum()); i >= 0.6*Window.hpSov.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpSov.setValue(i);
				}
			} else
			if(n == 2.3) {
				for (int i = (int) (0.6*Window.hpSov.getMaximum()); i >= 0.4*Window.hpSov.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpSov.setValue(i);
				}
			} else
			if(n == 2.4) {
				for (int i = (int) (0.4*Window.hpSov.getMaximum()); i >= 0.2*Window.hpSov.getMaximum(); i--) {
				Thread.sleep(30);  
				Window.hpSov.setValue(i);
				}
			} else
			if(n == 2.5) {
				for (int i = (int) (0.2*Window.hpSov.getMaximum()); i >= 0.1*Window.hpSov.getMaximum(); i--) {
				Thread.sleep(55);  
				Window.hpSov.setValue(i);
				}
			}			
		}
	}

	
			
	public class PotokHPfatality extends Thread {
				
		public void run() {
			try {			
				phFatalityHam();
				phFatalitySov();
			} catch (Throwable e) {
				e.printStackTrace();
			}		
		}			
		
		public boolean comboHPhum() {
			if (Window.logHam4.getText() == "КОМБО!!!" || Window.logHam5.getText() == "КОМБО!!!" || 
					Window.logHamCombo.getText() == "КОМБО!!!") {
				return true;
			}
			else {
				return false;
			}				
		}
		
		public boolean comboHPsov() {
			if (Window.logSov4.getText() == "КОМБО!!!" || Window.logSov5.getText() == "КОМБО!!!" || 
					Window.logSovCombo.getText() == "КОМБО!!!") {
				return true;
			}
			else {
				return false;
			}				
		}

		
		public void phFatalityHam() throws Throwable {		
					
			if(comboHPhum()) {
				Window.hpHam.setString("Это фиаско, Хомяк");
				Thread.sleep(600);				
					for (int i = Window.hpHam.getValue(); i >= 0; i--) {
						Thread.sleep(40);  
						Window.hpHam.setValue(i);				
					}									
				if(Window.hpHam.getValue() == 0) {
					interrupt();
					stopFatality = !isInterrupted();
				}												
			}			
		}	
		
					   		
		public void phFatalitySov() throws Throwable {		
					
			if(comboHPsov()) {
				Window.hpSov.setString("Это фиаско, Сова");
				Thread.sleep(600);
				for (int i = Window.hpSov.getValue(); i >= 0; i--) {
					Thread.sleep(40);  
					Window.hpSov.setValue(i);
					}				
				if(Window.hpSov.getValue() == 0) {
					interrupt();
					stopFatality = !isInterrupted();
				}								
			}
		}
		
								
	}
				
}
	



