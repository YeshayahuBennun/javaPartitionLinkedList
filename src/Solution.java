public class Solution {

    public static void main(String[] args) {
        //3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]
        MyLinkedList mll = new MyLinkedList();

        mll.insetNode(3);
        mll.insetNode(5);
        mll.insetNode(8);
        mll.insetNode(5);
        mll.insetNode(10);
        mll.insetNode(2);
        mll.insetNode(1);

        Solution solution = new Solution();

        solution.partition(mll, 5);
        mll.traversalLikedList();


    }

    private MyLinkedList partition(MyLinkedList ll, int x) {
        Node currentNode = ll.getHead();
        ll.setTail(ll.getHead());
        while (currentNode!=null){
            Node next = currentNode.getNext();
            if(currentNode.getValue()<x){
                currentNode.setNext(ll.getHead());
                ll.setHead(currentNode);
            }else {
                ll.getTail().setNext(currentNode);
                ll.setTail(currentNode);
            }
            currentNode = next;
        }
        ll.getTail().setNext(null);
        return ll;
    }
}
