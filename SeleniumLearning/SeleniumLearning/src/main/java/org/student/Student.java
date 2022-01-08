package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("student name gee");
	}
	public void studentDept()
	{
		System.out.println("student dept is CS");
	}
	public void studentId()
	{
		System.out.println("student id is 24");
	}
	public static void main(String args[])
	{
		Student stObject=new Student();
		stObject.studentDept();
		stObject.studentId();
		stObject.studentName();
		stObject.collegeCode();
		stObject.collegeRank();
		stObject.deptName();
		stObject.collegeName();

	}
}
