public class CharStack {

    private CharStackNode top = null;

    // push an element onto the stack
    public void push(char elem) {
        //TODO add code here
        CharStackNode node = new CharStackNode(elem, this.top);
        this.top = node;
    }

    // pop an element from the stack
    public char pop() {
        //TODO add code here
        // if stack is empty throw exception
        if (top == null) {
            return 0;
        }

        CharStackNode node = this.top;
        this.top = this.top.getNext();

        return node.getElem();
    }

    // true if the stack is empty
    public boolean isEmpty() {
        //TODO add code here
        return top == null;
    }
}
