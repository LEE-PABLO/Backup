import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilereadAndWrite {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("poem.txt"));BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"))) {
			String line;
			Map<String, Integer> map=new HashMap<>();
		    while ((line = br.readLine()) != null) { // 한 줄씩 읽기
		        for(String word:line.split(" ")) {map.put(word, map.getOrDefault(word, 0)+1);}
		    }
		    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		        String word = entry.getKey();
		        int count = entry.getValue();
		        
		        bw.write(String.format("%s: %d", word, count));
		        bw.newLine();
		    }
			
		} catch (IOException e) {
		    e.printStackTrace();
			}	
	}
}