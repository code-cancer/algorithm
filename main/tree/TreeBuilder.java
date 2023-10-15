package main.tree;

import java.util.HashMap;
import java.util.Map;

public class TreeBuilder {

    private int[] preTraverse;
    private int[] middleTraverse;
    private int[] lastTraverse;

    private Map<Integer, Integer> middleIndexMap;

    public TreeBuilder setPreTraverse(int[] traverse) {
        this.preTraverse = traverse;
        return this;
    }

    public TreeBuilder setMiddleTraverse(int[] traverse) {
        this.middleTraverse = traverse;
        if(middleIndexMap != null) {
            middleIndexMap.clear();
        } else {
            middleIndexMap = new HashMap<>();
        }
        for (int i = 0; i < middleTraverse.length; i++) {
            middleIndexMap.put(middleTraverse[i], i);
        }
        return this;
    }

    public TreeBuilder setLastTraverse(int[] traverse) {
        this.lastTraverse = traverse;
        return this;
    }

    public TreeNode build() {
        if (middleTraverse == null) {
            System.out.println("缺乏中序遍历列表");
            return null;
        }
        if (preTraverse != null) {
            return buildNodeByPre(
                    0,
                    preTraverse.length - 1,
                    0,
                    middleTraverse.length - 1
            );
        }
        if (lastTraverse != null) {
            return buildTreeByLast(
                    0,
                    lastTraverse.length - 1,
                    0,
                    middleTraverse.length - 1
            );
        }
        System.out.println("请设置前序或后序遍历");
        return null;
    }


    //前序 + 中序
    private TreeNode buildNodeByPre(
            int preStartIndex,
            int preEndIndex,
            int midStartIndex,
            int midEndIndex
    ) {
        if (preStartIndex > preEndIndex) return null;
        TreeNode root = new TreeNode(preTraverse[preStartIndex]);
        int rootIndexInMiddle = middleIndexMap.get(root.value);
        int leftNum = rootIndexInMiddle - midStartIndex;
        root.left = buildNodeByPre(preStartIndex + 1,
                preStartIndex + leftNum,
                midStartIndex,
                rootIndexInMiddle - 1);
        root.right = buildNodeByPre(preStartIndex + leftNum + 1,
                preEndIndex,
                rootIndexInMiddle + 1,
                midEndIndex);
        return root;

    }

    //中序 + 后序
    private TreeNode buildTreeByLast(
            int lastStartIndex,
            int lastEndIndex,
            int midStartIndex,
            int midEndIndex
    ) {
        if (lastStartIndex > lastEndIndex) return null;
        TreeNode root = new TreeNode(lastTraverse[lastEndIndex]);
        int rootIndexInMid = middleIndexMap.get(root.value);
        int leftNum = rootIndexInMid - midStartIndex;
        root.left = buildTreeByLast(
                lastStartIndex,
                lastStartIndex + leftNum - 1,
                midStartIndex,
                rootIndexInMid - 1
        );
        root.right = buildTreeByLast(
                lastStartIndex + leftNum,
                lastEndIndex - 1,
                rootIndexInMid + 1,
                midEndIndex
        );
        return root;
    }



}
