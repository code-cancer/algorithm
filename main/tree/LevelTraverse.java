package main.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraverse implements Traverse {
    @Override
    public List<Integer> run(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            res.add(node.value);
            if (node.left != null) que.offer(node.left);
            if (node.right != null) que.offer(node.right);
        }
        return res;
    }
}
