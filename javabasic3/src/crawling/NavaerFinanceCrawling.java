package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NavaerFinanceCrawling {

	public static void main(String[] args) {
		//Jsoup으로 웹페이지에 잇는 소스코드를 긁어와서 
		//관련 항목들의 코드를 긁어올 수 있다. 이게 크롤링 
		//html문서를 분석(parser,파싱)을 해서 내가 원하는 정보를 추출하는 것.
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = null;//html 코드를 다 가지고 와서 doc 변수에 넣어놨음. 
		try {
			doc = con.get();
			Elements codeList = doc.select(".rate_info"); //html 안에 <a class="nav"> 이걸 가져왓! 
			System.out.println(codeList);
			
			Element tag = codeList.get(0);
			String code = tag.text();
			
			System.out.println("거래량 : "+ code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
		
		
		
	}
	

}
