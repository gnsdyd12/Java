import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextCut {
/**
 * TXT 파일에 있는 내용으로 SQL삽입문 만들기
 * @param args
 */
	public static void main(String[] args) {
		
		
		File file = new File("D:\\ACTOR.txt");
		try {
			BufferedReader reader = 
					new BufferedReader(new FileReader(file));
			
			String line = null;
			String[] actors = null;
			
			String query =
					"INSERT INTO ACTOR (ACTOR_ID, ACTOR_NAME) ";
			query += "VALUES (ACTOR_ID_SEQ.NEXTVAL, '%s');\n";
			while ( (line = reader.readLine()) != null ) {
				actors = line.split(",");
				for (int i=0; i<actors.length; i++) {
					actors[i] = actors[i].trim();
					System.out.printf(query, actors[i]);
				}
			}
			
			reader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}


/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextCut {
*//**
 * TXT 파일에 있는 내용으로 SQL삽입문 만들기
 * @param args
 *//*
	public static void main(String[] args) {
		
		
		File file = new File("D:\\ACTOR.txt");
		try {
			BufferedReader reader = 
					new BufferedReader(new FileReader(file));
			
			String line = null;
			String[] actors = null;
			
			String query =
					"INSERT INTO ACTOR_LIST (ACTOR_LIST_ID, MOVIE_ID, ACTOR_ID) ";
			query += "VALUES (ACTOR_LIST_ID_SEQ.NEXTVAL, '%d', ";
			query += "(SELECT ACTOR_ID FROM ACTOR WHERE ACTOR_NAME = '%s'));\n";
			
			int movieId = 0;
			
			while ( (line = reader.readLine()) != null ) {
				movieId++;
				
				if(movieId >= 11){
					break;
				}
				actors = line.split(",");
				for (int i=0; i<actors.length; i++) {
					actors[i] = actors[i].trim();
					System.out.printf(query, movieId, actors[i]);
				}
			}
			
			reader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
*/