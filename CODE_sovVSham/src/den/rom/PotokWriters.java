package den.rom;



public class PotokWriters {
		
	static boolean stopWrite = false;
	
	String strSov = "Сова – мудрый и расчётливый боец,	способный лишь своим криком	повергнуть противника в ужас.	"
			      + "Молниеносные атаки с воздуха не	оставляют шансов врагам.	Да прибудут с тобой Крылья, Сова!";
	
	String strHam = "Хомяк – маленький храбрый воин,	который готов постоять за себя в	любой ситуации. "
			+ "С древнеиранского	хомяк переводится как		«враг, повергающий на землю».	Да прибудут с тобой Щёки, Хомяк!";

	
	 public class WriterSov extends Thread {
		 		
		public void run() {
				
			while(!isInterrupted()) {	 			 				
				try {
					writeSov();
				}catch (Throwable e) {
					e.printStackTrace();
				}
				interrupt();																										     
			} 			 																			
        }				 
	 }
	 
	 public class WriterHam extends Thread {
	 		
			public void run() {
				
				while(!isInterrupted()) {										
					try {
						writeHam();
					}catch (Throwable e) {							
						e.printStackTrace();
					} 					
					interrupt();													     
			    } 			 																			
	        }				 
		 }
	  
	public void writeSov () throws Throwable {
						
		for(int i=0; i<strSov.length(); i++){
			if(stopWrite == false) {
				Window.textSov.append(strSov.charAt(i)+"");
		         Thread.sleep(100);
			}		         
		}			
	}
	
	public void writeHam () throws Throwable {
		
		for(int j=0; j<strHam.length(); j++){			
			if(stopWrite == false) {
				Window.textHam.append(strHam.charAt(j)+"");
				Thread.sleep(100);	
			}	         	          	          
	    }							
	}
		
		
}
