package org.opentutorials.javatutorials.progenitor;

import java.util.Objects;

class Student{
    String name;
    Student(){};
    Student(String name){
        this.name = name;
    }
//    public boolean equals(Object obj) { //Object 는 모든 class의 부모 
//        Student s = (Student)obj; //명시적 형변환 이걸 안해주면 부모입장에서는 자식이 무엇을 가지고 있는지 모르기 때문에 
//        return this.name == s.name;
//    }
	@Override
	// hashcode()는 메소드를 실행해서 리턴된 해시코드 값이 같은지를 본다. 해시 코드값이 다르면 다른 객체로 판단하고, 
	//해시 코드값이 같으면 equals() 메소드로 다시 비교한다.
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	//equals를 사용하는 이유 : 원시데이터형 int , boolean, long ,short, double,char 
	// 비교를 할때는 ==를 하지만 string이나 object간의 비교일 때는 equals를 써야한다.
	// ==를 사용하면 주소값을 비교하기 때문이다. 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	// 둘 다 있어야 다른 객체의 같은 값을 같은지 비교할 때 정확한 비교를 할 수 있다.
	// 안그러면 원하지 않는 결과가 나올 수도 있다. 해시코드가 달라서. 
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
 
    }
 
}