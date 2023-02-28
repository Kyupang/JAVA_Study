package org.opentutorials.javatutorials.scope;

class C {
    int v = 10;
    int a, b;
    
    void SetOprands(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    void sum() {
    	int a =10, b=20;
    	System.out.println(this.a + this.b);
    }
    
    void m() {
    	int v = 20;
        System.out.println(v);
        //this는 인스턴스 변수
        System.out.println(this.v);
    }
}
 
public class ScopeDemo2 {
 
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
        
        c1.SetOprands(1, 2);
        c1.sum();
    }
 
}