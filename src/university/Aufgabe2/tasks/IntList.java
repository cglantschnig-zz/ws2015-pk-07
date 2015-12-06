public class IntList {

    private class ListNode {
        int elem;
        ListNode next = null;

        ListNode(int elem, ListNode next) {
            //TODO add code here
        }

        int getElem() {
            return this.elem;
        }

        ListNode getNext() {
            return this.next;
        }

        void add(int elem) {
            //TODO add code here
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
    }

    public boolean search(int value) {
        //TODO add code here
        return false;
    }

    public void reverseI() {
        //TODO add code here
    }

    public void reverseR() {
        //TODO add code here
    }

    public String toString() {
        return "[" + this.head + "]";
    }
}