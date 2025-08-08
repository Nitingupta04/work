package com.jtc.exceptionhandling;


//class JTC{
//	
//}
class Student{
	int sid;
	String sname;
	String scity;

	public Student(int sid, String sname, String scity){
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	public String toString(){
		return "[ sid : "+sid+" | sname : "+sname+" | scity : "+scity+" ]";
	}
}
class Utility{
	static int count = 0;

	static Student database[] = new Student[5];
	
	public static void createStudent(int sid, String sname, String scity){
		if(count < database.length){
			database[count] = new Student(sid,sname,scity);
			count++;
			System.out.println("Student Created");
		}else{
			System.out.println("Database is full");
		}
	}
	
	public static Student searchStudent(int sid) throws StudentNotFoundException{
		Student s1 = null;
		for(int i = 0; i <= database.length-1; i++){
			if(database[i] != null){
				if(database[i].sid == sid){
					s1 = database[i];
				}
			}
		}
		if(s1 == null){
			throw new StudentNotFoundException();
		}else{
			return s1;
		}	
	}
}
class StudentNotFoundException extends Exception{

	public String toString(){
		return "Student Not Found";
	}
}


public class Test {
	
	public static void main(String arg[]){
		Utility.createStudent(101,"Vivek","Noida");
		Utility.createStudent(102,"Rahul","Delhi");
		Utility.createStudent(103,"Amit","Kanpur");
		try{
			Student s1 = Utility.searchStudent(Integer.parseInt(arg[0]));
			System.out.println(s1);
		}catch(StudentNotFoundException e){
			System.out.println(e);
		}
	
	}

}
