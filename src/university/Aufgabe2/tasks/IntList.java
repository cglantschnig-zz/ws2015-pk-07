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

        ListNode reverseR(ListNode node , ListNode next) {
            //TODO add code here
            if (node == null) return null;
            if (node.next == null){ //if this is the end of the list, then this is the new head
                node.next = next;
                return node;
            }
            ListNode r = reverseR(node.next, node);  //call reverse for the next node,
            //using yourself as the previous node
            node.next = next;                     //Set your next node to be the previous node
            return r;                     //Return the head of the new list
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
        while (tmp != head) {
            for (node = head; node != null && node.getNext() != last; node = node.getNext());
            tmp.next = last = node;
            tmp = tmp.next;
        }
        tmp.next = null;
    }

    public void reverseR() {
        //TODO add code here
        this.head =  this.head.reverseR(this.head, null);
    }

    public String toString() {
        return "[" + this.head + "]";
    }
}