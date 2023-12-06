import java.util.TreeSet;

public class TreeSetAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> t=new TreeSet<String>();
		t.add("zzz");
		t.add("kakashi");
		t.add("naruto");
		t.add("sasuke");
		t.add("zenitus");
		t.add("sukura");
		System.out.println(t);
		t.descendingIterator();
		System.out.println(t);
		
		//QUESTION 05
		System.out.println("\nQUESTION 05\nOUTPUT : get first name and last name");
		String fn= t.first();
		String ln=t.last();
		System.out.println("first element "+fn);
		System.out.println("last name "+ln);
		

	}

}
