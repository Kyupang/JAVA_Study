package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverFinanceCrawling3 {

	public static void main(String[] args) {
//		주식 코드를 불러오기 위한 crawling
		Connection con2;
		con2 = Jsoup.connect("https://finance.naver.com/sise/lastsearch2.naver");
		//System.out.println("성공" + con2);
		Document doc2 = null;
		String[] code2 = new String[30];
		String[] name2 = new String[30];
		try {
			doc2 = con2.get();
			Elements codeList2 = doc2.select("a.tltle");
			for (int i=0 ;i<codeList2.size();i++) {
				//System.out.println(i + " " + codeList2.get(i));
				Element tmp = codeList2.get(i);
				String name = tmp.text();
				String href = tmp.attr("href");
				//System.out.println(href.length());
				String tmpCodeStr = href.substring(22);
				code2[i] = tmpCodeStr;
				name2[i] = name;
//				System.out.println(code2[i]);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
// =======================================================================		
		//위에 정리된 코드들을 밑의 code string에 저장하려고 합니다.
		//String[] code = new String[] {"005930","263750","035720"};
		
		Connection con;
		for (int i=0; i<code2.length; i++) {
			con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2[i]);
			//System.out.println("1.네트워크 연결 성공." + con);
			
			Document doc = null;//html 코드를 다 가지고 와서 doc 변수에 넣어놨음. 
			try {
				doc = con.get();
				Elements codeList = doc.select("span.blind"); //html 안에 <a class="nav"> 이걸 가져왓! 
				//System.out.println(codeList.size());
				System.out.println(name2[i]+ " 의 현 주식 정보는 ");
				
				Element tag1 = codeList.get(12);
				String today = tag1.text();
				System.out.println("현재가 :" + today);
				
				Element tag2 = codeList.get(20);
				String low = tag2.text();
				System.out.println("최저가 :" + low);
				
				Element tag3 = codeList.get(16);
				String high = tag3.text();
				System.out.println("최고가 :" + high);
				System.out.println();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
}
