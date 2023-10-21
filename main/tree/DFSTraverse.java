package main.tree;

import java.util.ArrayList;
import java.util.List;

public class DFSTraverse implements Traverse{
    @Override
    public List<Integer> run(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode node, ArrayList<Integer> list) {
        if(node == null) return;
        list.add(node.value);
        dfs(node.left, list);
        dfs(node.right, list);
    }
}
