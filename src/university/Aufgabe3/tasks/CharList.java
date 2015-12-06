class CharList {

    private class ListNode {
        char elem;
        ListNode next = null;
        ListNode prev = null;

        ListNode(char elem, ListNode next, ListNode prev) {
            //TODO add code here
        }

        int getElem() {
            return this.elem;
        }
        ListNode getNext() {
            return this.next;
        }
        ListNode getPrev() {
            return this.prev;
        }

        void add(char elem) {
            //TODO add code here
        }

        public String toString() {
            return this.elem + ((this.next == null) ? "-|" : "->" + this.next);
        }

    }

    private ListNode head = null;

    public boolean empty() {
        return this.head == null;
    }

    public void add(char elem) {
        //TODO add code here}
    }

    public boolean search(char value) {
        //TODO add code here
        return false;
    }

    public boolean insert(char value) {
        //TODO add code here
        return false;
    }

    public String toString() {
        return "[" + this.head + "]";
    }
}
