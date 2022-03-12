/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
		// map to hold old node as key and equivalent new node as value
		Map<Node, Node> map = new HashMap<>();
		Node temp = head;
		// prepare map data by creating all new nodes
		while (temp != null) {
			map.put(temp, new Node(temp.val));
			temp = temp.next;
		}
		temp = head;
		// now iterate again to prepare next and random pointers
		while (temp != null) {
			Node newNode = map.get(temp);
			newNode.next = map.get(temp.next);
			newNode.random = map.get(temp.random);
			temp = temp.next;
		}
		// return new node head
		return map.get(head);
	}
}