package commontest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimeTask {
	
	public static void main(String[] args) {
		taskHere();
	}

	public static void taskHere(){
		Timer timer = new Timer();
		System.out.println("��ʼǰ��"+new Date());
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
			
				System.out.println("22222");
				System.out.println("�����У�"+new Date());

			}
		},2000l);
		System.out.println("�����ˣ�"+new Date());
	}
}
