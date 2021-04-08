package com.ict07.IO;

public class Ex04 {
	/* Stream
	 * - 데이터를 목적지까지 입/출력하기 위한 방법
	 * - 데이터를 쓰는 경우 : 출력스트림 / 데이터를 읽는 경우 : 입력스트림 */
	
	/* Stream의 종류 : byte, 문자, 바이트-문자, 오브젝트
	 * 
	 * 1) byte Stream - 기계중심. 모든 처리를 1byte씩 처리함.
	 * 	  	-> 대상 : 1byte로 이루어진 파일들(영상, 소리, 사진 등 모든 파일) / 영문자, 숫자를 Stream 할 수 있다.
	 * 		-> 최상위 class : InputStream(입력) / OutputStream(출력)
	 * 
	 * 	2) 문자 Stream - 사람중심. 모든 처리를 2byte씩 처리.
	 * 		-> 대상 : 전 세계의 모든 언어로 구성된 문서파일.
	 * 		-> 최상위 class : Reader(입력)/ Writer(출력)
	 * 
	 * 	3) byte-문자 결합 Stream - 기계를 통해 입/출력한 정보를 사람이 사용할 수 있게 입/출력
	 * 		-> 해당 class : InputStreamReader (입력) / OutputStreamWriter (출력)
	 * 
	 * 	4) object Stream - 객체를 직렬화 한 후 객체 단위로 입/출력한다. (객체 직렬화)
	 * 		-> 해당 클래스 : ObjectInputStream(readObject() : 객체 역직렬화 ->받는 쪽)
	 * 					   : ObjectOutputStream(writeObject() : 객체 직렬화 ->보내는 쪽)
	 */
}
