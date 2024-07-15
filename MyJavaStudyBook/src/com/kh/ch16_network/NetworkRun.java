package com.kh.ch16_network;

public class NetworkRun {
	/*
	 * 
	 * 네트워크 : 여러 대의 컴퓨터들이 연결되어 있는 통신망
	 * 			=> 네트워크를 통해서 서로 데이터를 주고받음
	 * 
	 * *IP 주소 : 네트워크 상에 각 컴퓨터들을 식별해 줄 수 있는 고유 번호
	 * 	-v4(버전) : x.x.x.x		(0~255)
	 * 	-v6(버전) : x:x:x:x:x:
	 * *포트(port) : 한 컴퓨터 내에 여러 프로세스들을 식별해줄 수 있는 고유 번호
	 * 	-8080/80 : 웹서버포트
	 * 	-21
	 * 	-443
	 * -------------------------
	 * * 서버     : 클라이언트에게  받은 요청을 처리한 후 응답해주는 프로그램(컴퓨터)
	 * * 클라이언트 : 서버에 요청을 하는 프로그램(컴퓨터)
	 * 	=>서버에 요청하기 위해 필요한 정보 : IP 주소,포트번호
	 * 		-localhost (127.0.0.1) : 내  PC (현재PC)
	 * 	=> 서버가 구동중이어야 요청 가능
	 * -------------------------------------
	 * *소캣 : 프로세스(컴퓨터) 간의 동신을 위한 통로
	 * *소캣 프로그래밍(UDP/TCP)
	 * -UDP방식 : 데이터 전승속도가 빠름! 신뢰성이 없는 데이터 전달에 용이
	 * -TCP방식 : 데이터 전승속도가 느림! 데이터가 정확하고 안정적으로 전달에 요이
	 * 
	 * *Socket : 프로세스 간의 통신을 담당 객체
	 * 			InputStream.OutputStream을 가지고 있음
	 * *ServerSocket : 포트와 연결하여 외부의 연결 욫텅을 기다림
	 * 				=>요청이 들어오면 연결 요청 수락(accept())-> Socket 객체를 생성
	 * ------------------------------------------------------ 
	 *
	 */
	

}
