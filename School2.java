import java.util.*;

class School2{
	public static void main(String[] args){
		Student s1 = new Student("It's Me");
		s1.setAddress("Basar");
		s1.getName();
		s1.getAddress();
		
	}
}

class Person{
	String name,address;
	/*Person(String name){
		this.name=name;
	}*/
	
	String getName(){
		return this.name;
	}
	
	String getAddress(){
		return this.address;
	}
	
	void setAddress(String address){
		this.address = address;
	}
}

class Student extends Person{
	int n=0;
	String courses[],name;
	int grades[];
	
	Student(String name){
		this.name=name;
	}
	
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
		for(int i=0;i<grades.length;i++){
			System.out.print(grades[i]+" ");
		}
		System.out.println();
	}
	
	double getAverageGrade(){
		double sum = 0;
		for(int i=0;i<grades.length;i++){
			sum += grades[i];
		}
		return (sum/grades.length);
	}
}


class Teacher extends Person{
	int n=0;
	ArrayList<String> courses = new ArrayList();
	//String courses[];
	String name;
	
	Teacher(String name){
		this.name = name;
	}
	
	boolean addCourse(String course){
		if(courses.size()  == 5){
			System.out.println("Courses limit reached!");
			return false;
		}
		else{
			/*boolean isExist = false;
			for(int i=0;i<courses.length;i++){
				if(courses[i].equals(course)){
					isExist = true;
					break;
				}
			}*/
			if(courses.contains(course) == true){
				System.out.println("Course already exist");
				return false;
			}
			else{
				//courses[n] = course;
				courses.add(course);
				n+=1;
				return true;
			}
		}
	}
	
	boolean removeCourse(String course){
		/*boolean isExist = false;
		for(int i=0;i<courses.length;i++){
			if(courses[i].equals(course)){
				isExist = true;
				break;
			}
			 
		}*/
		if(courses.contains(course) == false){
			System.out.println("Course doesnot exist");
			return false;
		}
		else{
			//courses[n] = course;
			courses.remove(course);
			n-=1;
			return true;
		}
	}
}













