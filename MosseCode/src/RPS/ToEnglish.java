package RPS;

import java.util.HashMap;

public class ToEnglish
{
    private HashMap<String, Character> mosseMap;

    public ToEnglish()
    {
        this.mosseMap = new HashMap<>();
        setUp();
    }

    private void setUp()
    {
        mosseMap.put(".-",'A');
        mosseMap.put("-...",'B');
        mosseMap.put("-.-.",'C');
        mosseMap.put("-...",'D');
        mosseMap.put(".",'E');
        mosseMap.put("..-.",'F');
        mosseMap.put("--.",'G');
        mosseMap.put("....",'H');
        mosseMap.put("..",'I');
        mosseMap.put(".---",'J');
        mosseMap.put("-.-",'K');
        mosseMap.put(".-..",'L');
        mosseMap.put("--",'M');
        mosseMap.put("-.",'N');
        mosseMap.put("--.",'O');
        mosseMap.put(".--.",'P');
        mosseMap.put("--.-",'Q');
        mosseMap.put(".-.",'R');
        mosseMap.put("...",'G');
        mosseMap.put("....",'S');
        mosseMap.put("-",'T');
        mosseMap.put("..-",'U');
        mosseMap.put("...-",'V');
        mosseMap.put(".--",'W');
        mosseMap.put("-..-",'X');
        mosseMap.put("-.--",'Y');
        mosseMap.put("--..",'Z');
    }

    public String translate(String mossCode)
    {
         String result ="";
        String words[] = mossCode.split(" / ");
        for (String word : words)
        {
           String leters[] = word.split(" ");
            for (String leter: leters)
            {
              result += mosseMap.get(leter);

            }
            result += " ";
        }
        return result;
    }

}

