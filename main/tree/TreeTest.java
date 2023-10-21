package main.tree;

public class TreeTest {

    /*
                1
              /   \
             2     3
              \     \
               4     5
                    /
                   6

     */
    public static void main(String[] args) {
        PreTraverse preTraverse = new PreTraverse();
        MiddleTraverse middleTraverse = new MiddleTraverse();
        LastTraverse lastTraverse = new LastTraverse();
        LevelTraverse levelTraverse = new LevelTraverse();
        BFSTraverse bfsTraverse = new BFSTraverse();
        DFSTraverse dfsTraverse = new DFSTraverse();

        int[] preTraverseArr = {1, 2, 4, 3, 5, 6};
        int[] lastTraverseArr = {4, 2, 6, 5,3, 1};
        int[] midTraverseArr = {2, 4, 1, 3, 6, 5};
        TreeNode preAndMidRoot = new TreeBuilder()
                .setPreTraverse(preTraverseArr)
                .setMiddleTraverse(midTraverseArr)
                .build();

        TreeNode lastAndMidRoot = new TreeBuilder()
                .setLastTraverse(lastTraverseArr)
                .setMiddleTraverse(midTraverseArr)
                .build();

        System.out.println("前序遍历：" + preTraverse.run(preAndMidRoot));
        System.out.println("后序遍历：" + lastTraverse.run(preAndMidRoot));
        System.out.println("中序遍历：" + middleTraverse.run(preAndMidRoot));
        System.out.println("层次遍历：" + levelTraverse.run(preAndMidRoot));
        System.out.println("广度优先：" + bfsTraverse.run(preAndMidRoot));
        System.out.println("深度优先：" + dfsTraverse.run(preAndMidRoot));
        System.out.println();
        System.out.println("前序遍历：" + preTraverse.run(lastAndMidRoot));
        System.out.println("后序遍历：" + lastTraverse.run(lastAndMidRoot));
        System.out.println("中序遍历：" + middleTraverse.run(lastAndMidRoot));
        System.out.println("层次遍历：" + levelTraverse.run(lastAndMidRoot));
        System.out.println("广度优先：" + bfsTraverse.run(lastAndMidRoot));
        System.out.println("深度优先：" + dfsTraverse.run(lastAndMidRoot));
    }
}
