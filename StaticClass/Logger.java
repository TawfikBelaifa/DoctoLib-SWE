package StaticClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	
	private static String filePath = "C:\\Users\\TOUFI\\Ecplise 2022-09 Workspace\\SDE Practices\\ProjectMN-WS\\src\\loggerFile\\log.txt";
	
	public Logger() {
		super();
	}

	public static void whriteLog(String log) throws IOException{
		File f = new File(filePath);
		FileWriter fr = new FileWriter(f, true); // true permet d'ajouter du contenu texte en fin de fichier 
		BufferedWriter bfr = new BufferedWriter(fr);
		bfr.newLine(); // permet de ajoyter une nouvelle ligne 
		log = log + " --- " + new Date();
		if(f.exists()) {
			bfr.write(log);
		}
		bfr.close();
	}
	
	public static void readLog() throws IOException {
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String c;
		if(f.exists()) {
			while((c= bfr.readLine()) != null) {
				System.out.println(c);
			}
		}
		bfr.close();
	}
	
}
