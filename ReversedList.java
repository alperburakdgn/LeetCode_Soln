
public class ReversedList {
    ListNode bas;
    public ListNode reverseList(ListNode head){
        ListNode crr =  head;
        ListNode prev = null;
        ListNode next= null;

        while(crr != null){
            next = crr.next;
            crr.next = prev;
            prev =crr;
            crr = next;
        }
        return prev;
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
