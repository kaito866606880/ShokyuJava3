
public class Animation extends MyFrame{
	public void run() {
		int x = 10;
		int a = 0;
		
		
		int i =0;
		for (i=0; i<9;i++) {
							
			fillRect(x,100,10,100);
			setColor(a,a,a);
			a+=20;
			x += 20;
			
			//横縦幅高さ
		}
	}
}