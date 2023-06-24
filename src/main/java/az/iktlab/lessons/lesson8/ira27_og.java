package az.iktlab.lessons.lesson8;

public class ira27_og {
    public static void main(String[] args) {
        String word = "anime";

    }

    public static int countVowels(String word){


        int count = 0;
        char[] chars = word.toLowerCase().toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < chars.length; i++) {

            char elem = chars[i];

            for (int j = 0; j < vowels.length; j++) {
                if (elem == vowels[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static boolean contains(char element){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int j = 0; j < vowels.length; j++) {
            if (element == vowels[j]){
                return true;
            }
        }

        return false;
    }
}