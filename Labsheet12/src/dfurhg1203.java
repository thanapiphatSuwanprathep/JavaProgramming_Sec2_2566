import java.io.*;

public class dfurhg1203 {

	public static void main(String[] args)throws IOException {
		BufferedReader readFile = new BufferedReader (new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0, i = 1;
		while((tmp = readFile.readLine())!=null) {
			String[] date = tmp.split("\t");
			System.out.println(i+"."+date[0]+" ("+date[1]+"), Rating "+date[2]+" publist on"+date[5]);
			countBook++;
			i++;
			
		}
		System.out.println("====================================================================");
		System.out.println("Total number of book :"+ countBook);
		readFile.close();
	}

}
