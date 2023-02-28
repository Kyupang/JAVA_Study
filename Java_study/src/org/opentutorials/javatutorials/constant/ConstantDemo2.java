package org.opentutorials.javatutorials.constant;
 
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor() {
    	return this.color;
    }
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo2 {
     
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
                break;
        }
        
        // enum 은 기본 class와는 다르게 배열로써의 역할도 할 수 있다. 
        for (Fruit f : Fruit.values()) {
        	System.out.println(f);
        }
        
    }
}