package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NavaerFinanceCrawling2 {

	public void Naver(String code2) {
		//Jsoup으로 웹페이지에 잇는 소스코드를 긁어와서 
		//관련 항목들의 코드를 긁어올 수 있다. 이게 크롤링 
		//html문서를 분석(parser,파싱)을 해서 내가 원하는 정보를 추출하는 것.
		
		
		
		//순서: connection으로 웹사이트 연결 
		//	   document로 주소에 있는 코드 변수에 넣기 
		//		그 코드 에서 Elements list에 select를 통해 원하는 정보를 저장한다.
		//     요소에서 택스트만 떼어서 저장  
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+code2);
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = null;//html 코드를 다 가지고 와서 doc 변수에 넣어놨음. 
		try {
			doc = con.get();
			Elements codeList = doc.select("span.blind"); //html 안에 <a class="nav"> 이걸 가져왓! 
			//System.out.println(codeList.size());
			//System.out.println(codeList);
			//System.out.println();
			
			Element tag1 = codeList.get(12);
			String today = tag1.text();
			System.out.println("현재가 :" + today);
			//System.out.println();
			
			Element tag2 = codeList.get(15);
			String high = tag2.text();
			System.out.println("최고가 :" + high);
			//System.out.println();
			
			Element tag3 = codeList.get(16);
			String low = tag3.text();
			System.out.println("최저가 :" + low);
			//System.out.println();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
		
		
		
	}
	

}
