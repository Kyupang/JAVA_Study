package network1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 1. 승인용 소켓을 만들어주자.
		// 2. 서버는 계속 살아있게 하기 위해 무한루프 돌림
		// 3. 요청이 있으면 승인을 해주고, 
		// 	  통신할 수 있는 소켓을 만들어주자.!
		
		ServerSocket server = new ServerSocket(9100); //port// ip는 서버에서 알아서 가져감.
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중.");
		int count = 0;
		while(true) {
			Socket socket = server.accept();
			count++; //클라이언트가 요청한 만큼!!
			System.out.println(count + " >> 승인완료! Socket생성됨.!");
			
		}
	}

}
