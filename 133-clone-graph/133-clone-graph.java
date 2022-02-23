class Solution {
    private Map<Node, Node> map = new HashMap<>();
        
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        
        ArrayList<Node> neighbors = new ArrayList<>();
        Node newNode = new Node(node.val, neighbors);
        map.put(node, newNode);
        for (Node nNode: node.neighbors) {
            neighbors.add(cloneGraph(nNode));
        }
        
        return newNode;
    }
}