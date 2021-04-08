package com.ict07.IO;

public class Ex01 {
	/*	File 클래스 - 특정 위치에 존재하는 파일이나 디렉토리를 처리하는 class
	 * 	생성자 - File(File parent, String child), File(String pathname)
	 * 			 File(String parent, String child), File(URI uri)
	 * 			-> parent : 상위경로, child : 하위경로
	 * 			-> parent + child : 전체경로
	 * 			-> pathname : 전체경로
	 * 			-> uri : 나중에 네트워크할 때 필요 */
	
	/*	주요 메소드
	 * 
	 * 1) creatNewFile() : boolean - 파일을 생성하면 true 아니면 flase (같은 이름의 파일은 생성 불가)
	 * 
	 * 2) mkdir(), mkdirs() : boolean - 디렉토리를 생성하면 true (파일과 동일하게 동명 디렉토리 생성 불가)
	 * 		->mkdir(), mkdirs() 차이점.
	 * 		mkdir()	: 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우 생성불가.
	 * 		ex) c:\base\want -> want 디렉토리를 만들 때, base 디렉토리가 없는 경우 생성불가능.
	 * 		mkdirs(): 상위 디렉토리인 base와 want 디렉토리까지 동시에 만들어줌.
	 * 
	 * 3) delete() : 파일, 디렉토리를 삭제
	 * 
	 * 4) isDirectory() : 디렉토리이면 true / isFile() : 파일이면 true
	 * 	-> 저장측면에서 컴퓨터에는 파일과 디렉토리만 존재한다. 즉 파일이 아니면 디렉토리.
	 * 
	 * 5) list() : 지정한 위치의 파일 및 디렉토리를 String[]에 담는다.
	 * 
	 * 6) length() : File class에서는 길이가 아닌 파일의 크기를 byte로 표현한다.
	 * 
	 * 7) getAbsolutePath() - 절대 경로 표시 : 경로의 풀네임(시작부터 끝까지 )=> 여기서 시작은 루트를 말한다.
	 * 8) getPath() - 상대 경로 표시 : 현재 위치에서 해당 파일까지 접근하기 위해 거쳐야 되는 경로
	 * 9) getCanonicalPath() - 정규화 경로
	 * 
	 * 10) lastModified() - 마지막 수정날짜
	 */
}
