public class PalindromeLinkedList {
    ListNode bas;

    public boolean isPalindrome(ListNode head){
        ListNode tmp =  head;
        int uzunluk = 0;

        while (tmp.next != null){
            uzunluk++;
            tmp = tmp.next;
        }

        System.out.println("length = "+uzunluk);
        System.out.println("tail = "+tmp.val);

        tmp = head;
        ListNode[] arr = new ListNode[uzunluk+1];
        for (int i = 0; i <= uzunluk; i++) {
            arr[i] =  tmp;
            tmp = tmp.next;
        }

        ListNode[] reverseArr =  new ListNode[uzunluk+1];
        for (int i = 0, j = arr.length-1; i <= arr.length+1 && j>=0; i++, j--) {
                reverseArr[i] = arr[j];
        }

        int sayac = 0;
        for (int i = 0; i <uzunluk+1 ; i++) {
            if (reverseArr[i].val == arr[i].val){
                sayac++;
            }
            else{
                sayac = -1;
                break;
            }
        }


        return sayac >0;

    }

    public void add (ListNode n){
        if(bas == null){
            bas = n;
        }
        else {
            ListNode tmp = bas;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
    }

}

