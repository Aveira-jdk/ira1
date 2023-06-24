package az.iktlab.lessons.lesson8;

public class ira27 {
    public static void main(String[] args) {
        String word = "anime";

        int count = countVowels(word);
        System.out.println(count);
    }

////////////////////
    public static int countVowels(String word){
        int count = 0;
        char[] chars = word.toLowerCase().toCharArray();

        for (char elem : chars) {

            if (contains(elem)) {
                count++;
            }
        }
        return count;
    }
////////////////////
    public static boolean contains(char element){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (element == vowel) {
                return true;
            }
        }

        return false;
    }
}
