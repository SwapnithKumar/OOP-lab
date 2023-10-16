import java.util.*;

class School{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("It's Me");
		s1.setAddress("Basar");
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		s1.addCourseGrade("JAVA",10);
		s1.addCourseGrade("C",9);
		s1.printGrades();
		System.out.println(s1.getAverageGrade());
		
		Teacher t1 = new Teacher();
		t1.setName("Nanda Kishore");
		t1.setAddress("Basar");
		System.out.println(t1.addCourse("JAVA"));
		System.out.println(t1.removeCourse("C"));
		System.out.println(t1.getName());
		System.out.println(t1.getAddress());	
	}
}

class Person{
	String name,address;
	 
	
	String getName(){
		return this.name;
	}
	
	String getAddress(){
		return this.address;
	}
	void setAddress(String address){
		this.address = address;
	}
	void setName(String name){
		this.name = name;
	}
}

class Student extends Person{
	int n=0;
	String name;
	//ArrayList<String> courses = new ArrayList();
	//ArrayList<int> grades = new ArrayList();
	String courses[] = new String[30];
	int grades[] = new int[30];
	
	void addCourseGrade(String course,int grade){
		if(n<30){
			courses[n] = course;
			grades[n] = grade;
			n+=1;
			
		}
		else{
			System.out.println("Courses limit reached!");
		}	
	}
	
	void printGrades(){
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(grades[i]+" ");
		}
		System.out.println();
	}
	
	double getAverageGrade(){
		double sum = 0;
		for(int i=0;i<n;i++){
			sum += grades[i];
		}
		return (sum/n);
	}
}


class Teacher extends Person{
	int n=0;
	String courses[] = new String[5];
	String name;
	
	boolean addCourse(String course){
		if(n  == 5){
			System.out.println("Courses limit reached!");
			return false;
		}
		else{
			boolean isExist = false;
			for(int i=0;i<n;i++){
				if(courses[i].equals(course)){
					isExist = true;
					break;
				}
			}
			if(isExist == true){
				System.out.print("Course already exist --> ");
				return false;
			}
			else{
				courses[n] = course;
				//courses.add(course);
				n+=1;
				return true;
			}
		}
	}
	
	boolean removeCourse(String course){
		boolean isExist = false;
		for(int i=0;i<n;i++){
			if(courses[i].equals(course)){
				isExist = true;
				break;
			}
			 
		}
		if(isExist == false){
			System.out.print("Course doesnot exist --> ");
			return false;
		}
		else{
			courses[n] = " ";
			System.out.println("Course removed");
			//courses.remove(course);
			n-=1;
			return true;
		}
	}
}



/*
boolean isExist = false;
			for(int i=0;i<courses.length;i++){
				if(courses[i].equals(course)){
					isExist = true;
					break;
				}
			}
*/



/*boolean isExist = false;
		for(int i=0;i<courses.length;i++){
			if(courses[i].equals(course)){
				isExist = true;
				break;
			}
			 
		}*/








