package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverWebtoonCrawling {

	public static void main(String[] args) {
		//Jsoup으로 웹페이지에 잇는 소스코드를 긁어와서 
		//관련 항목들의 코드를 긁어올 수 있다. 이게 크롤링 
		//html문서를 분석(parser,파싱)을 해서 내가 원하는 정보를 추출하는 것.
		Connection con = Jsoup.connect("https://comic.naver.com");
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = null;//html 코드를 다 가지고 와서 doc 변수에 넣어놨음. 
		try {
			doc = con.get();
			Elements list = doc.select(".menu a"); //html 안에 <a class="nav"> 이걸 가져왓! 
			System.out.println(list.size());
			//System.out.println(list);
			
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
