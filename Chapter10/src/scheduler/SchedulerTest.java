package scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		Connection //웹서버에서 디비서버를 소켓포트를 이용해서 연결할 때
		
		// R, L, P
		System.out.println("전화 상담 배분 방식을 선택하세요. R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		//다형성. 똑같은 메소드를 불렀지만 각 인스턴스에 무엇이냐에 따라 해당되는 구현 코드가 달라진다.
	}

}
