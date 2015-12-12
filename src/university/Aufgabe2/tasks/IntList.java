public class IntList {

    private class ListNode {
        int elem;
        ListNode next = null;

        ListNode(int elem, ListNode next) {
            //TODO add code here
            this.next = next;
            this.elem = elem;
        }

        int getElem() {
            return this.elem;
        }

        ListNode getNext() {
            return this.next;
        }

        void add(int elem) {
            //TODO add code here
            if (this.next == null) {
                this.next = new ListNode(elem, null);
                return;
            }
            this.next.add(elem);
        }

        ListNode reverseR() {
            //TODO add code here
            return null;
        }

        public String toString() {
            return this.elem + ((this.next == null) ? "-|" : "->" + this.next);
        }

    }

    private ListNode head = null;

    public boolean empty() {
        return this.head == null;
    }

    public void add(int elem) {
        //TODO add code here
        if (head == null) {
            head = new ListNode(elem, null);
        }
        else {
            head.add(elem);
        };
    }

    public boolean search(int value) {
        //TODO add code here
        for (ListNode node = this.head; node != null && node.getNext() != null; node = node.getNext()) {
            if (node.getElem() == value) {
                return true;
            }
        }
        return false;
    }

    public void reverseI() {
        //TODO add code here
        ListNode head = this.head;
        ListNode last = null;
        ListNode node = null;

        this.head = null;

        for (node = head; node != null && node.getNext() != last; node = node.getNext());
        this.head = last = node;

        ListNode tmp = last;
        while (tmp == head) {
            for (node = head; node != null && node.getNext() != last; node = node.getNext()) ;
            tmp.next = last = node;
            tmp = tmp.next;
        }
        tmp.next = null;
    }

    public void reverseR() {
        //TODO add code here
    }

    public String toString() {
        return "[" + this.head + "]";
    }
}