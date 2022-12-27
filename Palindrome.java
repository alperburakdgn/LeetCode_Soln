public class Palindrome {
    public boolean isPalindroem(int num){
        String number = String.valueOf(num);
        StringBuilder newNumber= new StringBuilder();

        for (int i = number.length()-1; i >= 0 ; i--) {
            newNumber.append(number.charAt(i));
        }

        int sayac = 0;
        for (int i = 0; i < number.length() ; i++) {
            if (number.charAt(i) == newNumber.charAt(i)){
                sayac++;
            }else{
                sayac = -1;
                break;
            }
        }
        System.out.println(newNumber);

        return sayac > 0;
    }
}
