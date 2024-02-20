package stringpractice.program1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendStringtext {

	public static void main(String[] args) {
	try{
		String data="i love my india";
		File file=new File("D:\\questions\\lovely.txt");
		if (!file.exists()){	
			file.createNewFile();
				}
		FileWriter  fw=new FileWriter(file.getName(),true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		System.out.println("done");
	}
		catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}


