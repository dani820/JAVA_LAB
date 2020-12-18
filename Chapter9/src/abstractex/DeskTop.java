package abstractex;

public abstract class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook display()");
	}

}
