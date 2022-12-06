package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 현재파일경로[기준경로]
		 *    eclise--> C:\2022-11-JAVA-DEVELOPER\workspaceSE\20.입출력[IO]
		 * 
		 * 상대경로(relative)경로
		 * 		현재경로를 기준으로 경로를기술
		 * 		sample\a.txt
		 * 		.\sample\a.txt
		 * 절대경로(absolute)경로
		 *      C:,D: 드라이브를 기준으로 경로기술
		 * 
		 */
		System.out.println(File.separatorChar);
		File file1 = new File("데미안.txt");
		File file2 = new File("sample\\car1.jpg");
		File file3 = new File("sample/subSample/00.VariableDeclare.txt");
		File file4 = new File(
				"C:\\2022-11-JAVA-DEVELOPER\\workspaceSE\\20.입출력[IO]\\sample\\subSample2\\19.Overriding[재정의].txt");

		System.out.println("---------1.file path[relative]------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("---------2.file absolute path------");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("---------3.file name------");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("---------4.file parent------");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
	}

}
