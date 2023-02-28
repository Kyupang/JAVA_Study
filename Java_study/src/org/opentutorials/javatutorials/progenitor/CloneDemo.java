package org.opentutorials.javatutorials.progenitor;

class Student2 implements Cloneable{
	// 이 인터페이스는 원래 구현부가 비어있다. 
	// 그래서 그냥 이렇게 쓴다음에 함수를 만들어줘야한다. 
    String name;
    Student2(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        //사용자에게 에러를 던져야만 한다.
    	return super.clone();
    	// 리턴 super를 하는 이유는 student의 부모클래스에 있는 
    	// 함수를 리턴하는 것이기 때문이다. 
    }
}
 
class CloneDemo {
 
    public static void main(String[] args) {
        Student2 s1 = new Student2("egoing");
        try {
        	//그러면 이 clone이라는 메소드를 예외처리 할것인지 던질것인지를 
        	//결정해야하는데 이번엔 여기서 처리하겠다. 
        	
        	// s1.clone()은 object가 리턴값이기 때문에 명시적 형변환을 해줘야한다. 
            Student2 s2 = (Student2)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
 
}
