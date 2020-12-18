package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Comuter c1 = new Computer();
		Computer c2 = new DeskTop(); //업캐스팅 관계 
		//Computer c3 = new NoteBook();
		
		Computer c4 = new MyNoteBook();  // Computer - NoteBook 타입 내포 (상속)
		
		c2.display();
		c4.display();
	}
}
