import java.util.*;

class pus implements Runnable{
	
	
	int time;
	String name;
	Random r = new Random();
	
	public pus(String name) {
		
		this.name = name;
		time = r.nextInt(999); //случайное число от 0 до 999
	}

	public void run() {
		System.out.printf("Поток %s спит %d\n", name, time);
		try {
			Thread.sleep(time); //Уходит в сон на милисекунды
		}
		catch(Exception e) {}
		System.out.printf("Поток %s проснулся и закончился\n", name);
	}

}
