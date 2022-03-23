package fis.topic.practive_01;

import java.util.Date;

public class Student  implements Comparable<StudentList>{
	int code;
	String name;
	Date birthDay;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Student(int code, String name, Date birthDay) {
		super();
		this.code = code;
		this.name = name;
		this.birthDay = birthDay;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", birthDay=" + birthDay + "]";
	}
	
	@Override
	public int compareTo(StudentList o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
