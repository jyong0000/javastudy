package snippet;

public class Snippet {
	@Override
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();	//비프음 발생시키기 위한 객체
					for(int i=0; i<5; i++) {
						toolkit.beep();	//비프음 발생
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							
						}
					}
}

