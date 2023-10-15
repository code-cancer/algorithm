package main.tree;

import java.util.ArrayList;
import java.util.List;

public class PreTraverse implements Traverse{
    @Override
    public List<Integer> run(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        searchNode(res, root);
        return res;
    }

    private void searchNode(List<Integer> list, TreeNode node) {
        if(node == null) return;
        list.add(node.value);
        searchNode(list, node.left);
        searchNode(list, node.right);
    }
}
