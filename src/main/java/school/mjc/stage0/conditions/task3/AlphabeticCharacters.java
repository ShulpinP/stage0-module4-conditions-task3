package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        //A, E, I, O, U, Y, a,e,i,o,u,y
        if (character == 41 || character == 69 ||character ==73 ||character == 79 ||character == 85||character == 89||character ==97||character == 101||character == 105||character == 111||character == 113||character == 117||character == 121) {
            System.out.println("Vowel");
        } else if ((character >41 && character <91) || (character>97 || character <123)) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
