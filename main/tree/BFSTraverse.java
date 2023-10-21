package main.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 广度优先遍历
 */
public class BFSTraverse implements Traverse{
    @Override
    public List<Integer> run(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            res.add(node.value);
            if(node.left != null) que.offer(node.left);
            if(node.right != null) que.offer(node.right);
        }
        return res;
    }
}
