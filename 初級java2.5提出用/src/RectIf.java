
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
<<<<<<< HEAD
		setColor(0,128,0);
		
		int i;
		for(i=0; i<9;i++) {
			if(i == 0) {
				fillRect(x,100,10,100);
			}
			else if(i==8) {
				fillRect(x,60,10,100);
			}
			else {
				fillRect(x,80,10,100);				
			}
			x+=20;
=======
		int h =20;
		setColor(0,128,0);

		int i;
		for(i=0; i<10;i++) {
			fillRect(x,100,10,150 - h);
			fillRect(x,300 - h,10,h);
			x+=20;
			h+=10;
			
>>>>>>> main
		}
	}
}