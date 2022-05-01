package Interview_Q9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class readFileTxt {
    public static void main(String[] args) throws IOException {
        // 1 dosyaya git oradaki kelimeleri okut.
        //kelimeri say . kac kez kullanildigin yazdir. .

        Map<String,Integer> wordCounter=new HashMap<>();

        List<String>satirlar= Files.readAllLines(Path.of("src/Interview_Q9/Q08FileText")
                , StandardCharsets.UTF_8);
        for (String w:satirlar
             ) {
            String kelimeler[]=w.split(" ");

            for (String q:kelimeler
                 ) {
                if (q.endsWith(",")||q.endsWith(".")||q.endsWith("?")){
                    q=q.substring(0,q.length()-1);
                }

                if (wordCounter.containsKey(q)){
                    wordCounter.put(q,wordCounter.get(q)+1);
                }else{
                    wordCounter.put(q,1);
                }
            }



        }
        System.out.println(wordCounter);





    }
}
