import java.util.Date;

public class ControlSleepThread extends Thread{
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("ControlSleepThread --> 1초마다 1번씩 출력");
				Date now = new Date();
				System.out.println(now.toLocaleString());
				/*
				 * 현재 실행되고 있는 스레드를 1000ms 동안 실행중지(sleep)
				 */
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
