import java.util.Arrays;

public class prac_2 {
    public static void main(String[] args) {
        char[] vowels = {'e','u','a','o','i'};
//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
////        vowels[3] = 'o';
////        vowels[4] = 'u';
        Arrays.sort(vowels);
        char[] cpVowels = vowels; //this cpVowel points to same memory location
        char[] someVowels = Arrays.copyOf(vowels,5);
        vowels[0] = '@';
//        char key = 'a';
//        int foundIndex = Arrays.binarySearch(vowels,key);
//        System.out.println(foundIndex);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(cpVowels));
        System.out.println(Arrays.toString(someVowels));
    }
}
