public class DeleteColumns {
    // delete columns make sorted number 944

    public int minDeletionSize(String[] strs) {

        int satir = 0; ;

        for (int i = 0; i < strs.length ; i++) {

            for (int j = 1; j <strs[i].length() ; j++) {

                if ((strs[j].charAt(i) < strs[j-1].charAt(i))){
                   satir++;
                   break;
                }
            }
        }

        return satir;
    }
}
