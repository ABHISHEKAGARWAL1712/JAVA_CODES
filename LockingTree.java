import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Node {
    String name;
    int lockedBy = -1; // -1 means unlocked
    Node parent = null;
    List<Node> children = new ArrayList<>();
    int descendantsLocked = 0; // Keep track of locked descendants

    Node(String name) {
        this.name = name;
    }
}

public class LockingTree {
    static Map<String, Node> nodeMap = new HashMap<>();

    public static boolean isLocked(Node node) {
        return node.lockedBy != -1;
    }

    public static boolean canLockOrUnlock(Node node) {
        // Check if the node or any of its ancestors is locked or if any descendants are
        // locked
        if (isLocked(node) || node.descendantsLocked > 0) {
            return false;
        }

        // Check ancestors
        Node current = node.parent;
        while (current != null) {
            if (isLocked(current)) {
                return false;
            }
            current = current.parent;
        }
        return true;
    }

    public static boolean lock(Node node, int uid) {
        if (!canLockOrUnlock(node)) {
            return false;
        }

        node.lockedBy = uid;
        // Update the ancestors to reflect that this node is now locked
        Node current = node.parent;
        while (current != null) {
            current.descendantsLocked++;
            current = current.parent;
        }
        return true;
    }

    public static boolean unlock(Node node, int uid) {
        if (node.lockedBy != uid) {
            return false;
        }
        node.lockedBy = -1;

        // Update the ancestors to reflect that this node is now unlocked
        Node current = node.parent;
        while (current != null) {
            current.descendantsLocked--;
            current = current.parent;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of nodes
        int m = scanner.nextInt(); // max number of children per node
        int q = scanner.nextInt(); // number of queries

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; ++i) {
            String name = scanner.next();
            nodes[i] = new Node(name);
            nodeMap.put(name, nodes[i]);
        }

        // Build tree hierarchy
        for (int i = 1; i < n; ++i) {
            int parentIdx = (i - 1) / m; // Calculate parent index
            nodes[parentIdx].children.add(nodes[i]);
            nodes[i].parent = nodes[parentIdx];
        }

        for (int i = 0; i < q; ++i) {
            int opType = scanner.nextInt();
            String nodeName = scanner.next();
            int uid = scanner.nextInt();

            Node node = nodeMap.get(nodeName);
            if (opType == 1) { // Lock operation
                System.out.println(lock(node, uid) ? "true" : "false");
            } else if (opType == 2) { // Unlock operation
                System.out.println(unlock(node, uid) ? "true" : "false");
            }
        }

        scanner.close();
    }
}
