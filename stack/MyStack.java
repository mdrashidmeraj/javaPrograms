package stack;

public class MyStack {
	private int top;
	private int[] st;
	private int maxsize;
	MyStack(int s){
		maxsize = s;
		st = new int[maxsize];
		top = -1;
	}
	public void pushin(int e) {
		if(top>=maxsize) {
			System.out.println("OverFlow");
			return;
		}else {
			st[++top] = e;
		}
	}
	public int popout() {
		if(top == -1) {
			System.out.println("UnderFlow");
			return -1;
		}
		else {
			int x = top--;
			return st[x--];
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("UnderFlow");
			return;
		
		}else {
			for(int i = 0;i<=top;i++) {
				System.out.print(st[i]+" ");
			}
			System.out.println();
		}
	}
	public int peek() {
		if(top == -1) {
			System.out.println("UnderFlow");
			return -1;
		}
		else {
			return st[top];
		}
	}
	

}
