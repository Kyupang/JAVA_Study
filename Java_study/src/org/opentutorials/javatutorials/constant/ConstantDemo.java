package org.opentutorials.javatutorials.constant;

import java.util.Scanner;

public class ConstantDemo {
    public final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        sc.close();
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}

//interface FRUIT{
//    int APPLE=1, PEACH=2, BANANA=3;
//}
//interface COMPANY{
//    int GOOGLE=1, APPLE=2, ORACLE=3;
//}
// 
//public class ConstantDemo {
//     	
//    public static void main(String[] args) {
//        int type = FRUIT.APPLE;
//        switch(type){
//            case FRUIT.APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case FRUIT.PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case FRUIT.BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

// class 로 정의해서 비교조차 못하게 만들기 

//class Fruit{
//    public static final Fruit APPLE  = new Fruit();
//    public static final Fruit PEACH  = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
//class Company{
//    public static final Company GOOGLE = new Company();
//    public static final Company APPLE = new Company();
//    public static final Company ORACLE = new COMPANY(Company);
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        if(Fruit.APPLE == Company.APPLE){
//            System.out.println("과일 애플과 회사 애플이 같다.");
//        }
//    }
//}


// enum 
// 이것은 위의 클래스와 같다. 
//enum Fruit{
//    APPLE, PEACH, BANANA;
//}
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        /*
//        if(Fruit.APPLE == Company.APPLE){
//            System.out.println("과일 애플과 회사 애플이 같다.");
//        }
//        */
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

