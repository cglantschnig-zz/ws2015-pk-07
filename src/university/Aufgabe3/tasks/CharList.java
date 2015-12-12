class CharList {

    private class ListNode {
        char elem;
        ListNode next = null;
        ListNode prev = null;

        ListNode(char elem, ListNode next, ListNode prev) {
            //TODO add code here
            this.elem = elem;
            this.next = next;
            this.prev = prev;
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
            if (this.next == null) {
                this.next = new ListNode(elem, null, this);
            }
            else {
                this.next.add(elem);
            }
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
        //TODO add code here
        if (this.head == null) {
            this.head = new ListNode(elem, null, null);
        }
        else {
            this.head.add(elem);
        }
    }

    public boolean search(char value) {
        for (ListNode node = this.head; node != null; node = node.getNext()) {
            if (node.getElem() == value) {
                return true;
            }
            if (node.getElem() > value) {
                return false;
            }
        }
        //TODO add code here
        return false;
    }

    public boolean insert(char value) {
        // in case it is the first element
        if (this.head == null) {
            this.add(value);
            return true;
        }
        // for an element in the middle
        for (ListNode node = this.head; node != null; node = node.getNext()) {
            if (node.getElem() >= value) {
                if (node.prev == null) {
                    this.head = new ListNode(value, node, null);
                    return true;
                } else {
                    ListNode prev = node.prev;
                    node.prev = prev.next = new ListNode(value, node, prev);
                    return true;
                }
            }
        }
        // in case it is the last element
        this.add(value);
        return true;
    }

    public String toString() {
        return "[" + this.head + "]";
    }
}
