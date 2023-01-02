public class DetectCapital {
    public boolean detectCapitalUse(String word) {

        int counter = 0;
        int firstCounter = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(0)>=65 && word.charAt(0)<=90){
                firstCounter = 1;
            }

            if (word.charAt(i) >= 65 && word.charAt(i)<=90){
                counter++;
            }
        }

        if (firstCounter == 1 && counter-1 == 0)
            return true;

        if (firstCounter != 1 && counter == 0)
            return true;

        if (counter == word.length())
            return true;



        else
            return false;
    }

}
