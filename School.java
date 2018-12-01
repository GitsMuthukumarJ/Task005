package SingletonClass;

import java.util.ArrayList;

public class School {

	public final static School school = new School();
	private ArrayList<String> teachers;
	public School() {
		teachers = new ArrayList<String>();
		teachers.add("bala");
		teachers.add("raj");
		teachers.add("arun");
		teachers.add("mani");
		teachers.add("muthu");
		teachers.add("satheesh");
		teachers.add("seenu");
		teachers.add("jothi");
	}
public String getTeacher() {
	if(teachers.size()>0)
		return teachers.remove(0);
	return "No Teachers";
}
}
