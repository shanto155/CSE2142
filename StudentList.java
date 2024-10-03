import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList 
{
	public static void main(String[] args) 
	{

//		Check if provided argument is valid
		if(args[].length == 0)
		{
			System.out.println(Constant.INVALID_MESSAGE);
		}
			String operation = args[0];

		if(operation.equals("a"))
		 {
			System.out.println(Constant.LOADING);			
			try {

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(Constant.FILE_NAME))); 
			
			String dataline = reader.readLine();
			String students[] = dataline.split(",");			
			for(String student : students) { System.out.println(student); }
			
			} catch (Exception e){} 
			System.out.println(Constant.LOADED);
			}
			
			else if(operation.equals("r")) 
			{
			System.out.println(Constant.LOADING);			
			try {

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStreamConstant.FILE_NAME))); 
			String dataline = reader.readLine();
		//	System.out.println(r);
			String students[] = dataline.split(",");	
			Random random = new Random();
				int bound = students.length;
				int randomIndex = random.nextInt(bound);
					System.out.println(students[randomIndex]);
			
				} catch (Exception e){} 
				System.out.println(Constant.LOADED);			
		}
		
		else if(operation.contains("+"))
		{
			System.out.println(Constant.LOADING);			
			try {

			BufferedWriter writer = new BufferedWriter(
					new FileWriter(Constant.FILE_NAME));
			String newStudent = operation.substring(1);
	        Date currenDate = new Date();
	        String dateFormatPattern = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
	        String formattedDate= dateFormat.format(currenDate);
			writer.write(", "+t+"\nList last updated on "+formattedDate);
			writer.close();
			} catch (Exception e){}
							
			System.out.println(Constant.LOADED);	
		}

		else if(operation.contains("?")) 
		{
			System.out.println(Constant.LOADING);			
			try {

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(Constant.FILE_NAME))); 
			String dataline = reader.readLine();
			String students[] = dataline.split(",");	
			boolean done = false;
			String newStudent = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(newStudent)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){} 
			System.out.println(Constant.LOADED);				
		}
		
		else if(operation.contains("c")) 
		{
			System.out.println(Constant.LOADING);			
			try {
				
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(Constant.FILE_NAME))); 
			String dataline = reader.readLine();
			char a[] = dataline.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}			
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){} 
			System.out.println(Constant.LOADED);				
		}
	}
}