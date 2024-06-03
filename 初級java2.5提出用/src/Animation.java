
public class Animation extends MyFrame  {
	public void run() {
		int x= 30;
		while(x<=170) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillOval(x,80,100,100);
			x+=20;
			sleep(1);
		}
	}

}
