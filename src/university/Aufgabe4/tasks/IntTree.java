class IntTree {

    private class Node {

        int elem;
        Node left = null;
        Node right = null;

        Node(int elem) {
            this.elem = elem;
        }

        void add(int elem) {
            //TODO add code here
            if (elem < this.elem) {
                if (left == null) {
                    left = new Node(elem);
                } else {
                    left.add(elem);
                }
            } else if (elem > this.elem) {
                if (right == null) {
                    right = new Node(elem);
                } else {
                    right.add(elem);
                }
            }
        }

        int countNodes() {
            //TODO add code here
            return 1 + (this.right == null ? 0 : this.right.countNodes()) + (this.left == null ? 0 : this.left.countNodes());
        }

        int countLeaves() {
            //TODO add code here
            if (this.right == null && this.left == null) {
                return 1;
            }
            return (this.left == null ? 0 : this.left.countLeaves()) + (this.right == null ? 0 : this.right.countLeaves());
        }

        int height() {
            //TODO add code here
            int leftHeight = 0;
            int rightHeight = 0;
            if (this.left != null) {
                leftHeight = this.left.height();
            }
            if (this.right != null) {
                rightHeight = this.right.height();
            }

            return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
        }
    }

    private Node root = null;

    public void add(int elem) {
        //TODO add code here
        if (this.root == null) {
            this.root = new Node(elem);
        } else {
            this.root.add(elem);
        }
    }

    public boolean empty() {
        return this.root == null;
    }

    public int countNodes() {
        //TODO add code here
        return this.empty() ? 0 : this.root.countNodes();
    }

    public int countLeaves() {
        //TODO add code here
        return this.empty() ? 0 : this.root.countLeaves();
    }

    public int height() {
        //TODO add code here
        return this.empty() ? 0 : this.root.height();
    }
}