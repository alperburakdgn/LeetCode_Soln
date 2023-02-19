public class BudyString{

    public boolean buddyStrings(String s,String goal) {
        //once ilk stringin tersini elde ettik
        String reverse="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse += s.charAt(i);
        }
        
        //isEqual degiskeni, reverse ile goal bakilinca esit olduklari her yerde bir artiyor.
      
        int isEqual = 0;
        if (s.length() == goal.length()){
            for (int i = 0; i <reverse.length() ; i++) {
                if (reverse.charAt(i) == goal.charAt(i))
                    isEqual++;
            }
        }
        //isEqual ile string uzunlugu esitse true, degilse false donuyor
        if (isEqual == reverse.length())
            return true;
        else
            return false;

    }

}
