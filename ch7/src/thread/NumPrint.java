package thread;
// 동일한 작업인데 상속이 2개로 나눠져 있어서 Runnable
public class NumPrint implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.print(i);
		}
	}

}
