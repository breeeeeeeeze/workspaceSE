
public class MainThreadCalled {
	public void main_thread_called_method() {
		System.out.println("A."+Thread.currentThread().getName()+" 쓰레드실행");
		System.out.println("B."+Thread.currentThread().getName()+" 쓰레드반환");
		return;
	}
}
