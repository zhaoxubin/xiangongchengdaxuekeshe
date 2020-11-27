package java15_20201126;

import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
    public Node compareTwo(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        Node cur1 = n1;
        Node cur2 = n2;
        Node newHead = new Node(-1);
        Node newTail = newHead;
        while (cur1 != null && cur2 != null) {
            if (cur1.value < cur2.value) {
                newTail.next = cur1;
                newTail = newTail.next;
                cur1 = cur1.next;
            }else{
                newTail.next = cur2;
                newTail = newTail.next;
                cur2 = cur2.next;
            }
        }
        if(cur1 != null){
            newTail.next = cur2;
        }else{
            newTail.next = cur1;
        }
        return newHead.next;
    }
    public Node compareMore(Node[] heads){
        List<Node> list = arrayToList(heads);
        if(list.isEmpty()){
            return null;
        }
        Node newHead = new Node(-1);
        Node newTail = newHead;
        while(list.size() >= 2){
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                Node head = list.get(i);
                if(index == -1 || head.value < list.get(index).value){
                    index = i;
                }
            }
            Node cur = list.get(index);
            list.remove(index);
            if(cur.next != null){
                list.add(cur.next);
            }
           newTail.next = cur;
            newTail = cur;
        }
        newTail.next = list.get(0);
        return newHead.next;
    }

    private List<Node> arrayToList(Node[] heads) {
        List<Node> list = new LinkedList<>();
        for (int i = 0; i < heads.length; i++) {
            list.add(heads[i]);
        }
        return list;
    }
}