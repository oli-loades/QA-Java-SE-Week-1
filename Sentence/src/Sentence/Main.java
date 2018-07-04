package Sentence;

public class Main {

    public static void main(String[] args) {

    }

    public static String condense(String sentence) {
        String words[] = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length - 1; i++) {
words[i].re
           if(compare(words[i], words[i + 1], 1)) {
               System.out.println(words[i+1].substring(1,words[i+1].length()));
            }

            /*
            int c = 2;

            while (compare(words[i], words[i + 1], c)) {
                c--;
            }
            if (c < 2) {
                if (compare(words[i], words[i + 1], c)) {
                    result = result + Swords[i+1].substring(c,words[i+1].length());
                }
            } else {
                result = result + words[i] + " ";
            }
*/
        }
        result = result + words[words.length - 1];
        return result;
    }

    public static boolean compare(String first, String next, int a) {
        return first.endsWith(next.substring(0, a));
    }


}


//if words[1].endsWith(words[i+1]