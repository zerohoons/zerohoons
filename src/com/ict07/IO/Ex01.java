package com.ict07.IO;

public class Ex01 {
	/*	File Ŭ���� - Ư�� ��ġ�� �����ϴ� �����̳� ���丮�� ó���ϴ� class
	 * 	������ - File(File parent, String child), File(String pathname)
	 * 			 File(String parent, String child), File(URI uri)
	 * 			-> parent : �������, child : �������
	 * 			-> parent + child : ��ü���
	 * 			-> pathname : ��ü���
	 * 			-> uri : ���߿� ��Ʈ��ũ�� �� �ʿ� */
	
	/*	�ֿ� �޼ҵ�
	 * 
	 * 1) creatNewFile() : boolean - ������ �����ϸ� true �ƴϸ� flase (���� �̸��� ������ ���� �Ұ�)
	 * 
	 * 2) mkdir(), mkdirs() : boolean - ���丮�� �����ϸ� true (���ϰ� �����ϰ� ���� ���丮 ���� �Ұ�)
	 * 		->mkdir(), mkdirs() ������.
	 * 		mkdir()	: ������� �ϴ� ���丮�� ���� ���丮�� �������� ���� ��� �����Ұ�.
	 * 		ex) c:\base\want -> want ���丮�� ���� ��, base ���丮�� ���� ��� �����Ұ���.
	 * 		mkdirs(): ���� ���丮�� base�� want ���丮���� ���ÿ� �������.
	 * 
	 * 3) delete() : ����, ���丮�� ����
	 * 
	 * 4) isDirectory() : ���丮�̸� true / isFile() : �����̸� true
	 * 	-> �������鿡�� ��ǻ�Ϳ��� ���ϰ� ���丮�� �����Ѵ�. �� ������ �ƴϸ� ���丮.
	 * 
	 * 5) list() : ������ ��ġ�� ���� �� ���丮�� String[]�� ��´�.
	 * 
	 * 6) length() : File class������ ���̰� �ƴ� ������ ũ�⸦ byte�� ǥ���Ѵ�.
	 * 
	 * 7) getAbsolutePath() - ���� ��� ǥ�� : ����� Ǯ����(���ۺ��� ������ )=> ���⼭ ������ ��Ʈ�� ���Ѵ�.
	 * 8) getPath() - ��� ��� ǥ�� : ���� ��ġ���� �ش� ���ϱ��� �����ϱ� ���� ���ľ� �Ǵ� ���
	 * 9) getCanonicalPath() - ����ȭ ���
	 * 
	 * 10) lastModified() - ������ ������¥
	 */
}
