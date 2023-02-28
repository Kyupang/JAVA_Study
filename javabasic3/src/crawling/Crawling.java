package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) throws Exception {
		//Jsoup 은 자바에서 네이버에게 연결해~ 하면 스트림이 만들어짐.
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = null;//html 코드를 다 가지고 와서 doc 변수에 넣어놨음. 
		try {
			doc = con.get();
			Elements list = doc.select(".nav"); //html 안에 <a class="nav"> 이걸 가져왓! 
			System.out.println(list.size());
//			System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
				//System.out.println(tag1);
				String text1 = tag1.text();
				System.out.println(text1);
				//클래스가 nav인 태그를 다 가지고 와서 
				//ArrayList를 상속받은 Elments에 자동으로 넣어준다.
				//[Element, Element, Element(tag)]
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
		
		
		
	}

}
