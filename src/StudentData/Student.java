package StudentData;

public class Student {
	private int math;
	private int science;
	private int history;
	private int english;
	private int compSci;
	public Student(String m, String s, String h, String e, String c)
	{
		math = Integer.parseInt(m);
		science = Integer.parseInt(s);
		history = Integer.parseInt(h);
		english = Integer.parseInt(e);
		compSci = Integer.parseInt(c);
	}
}
