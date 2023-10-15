package main.tree;

import main.common.PrintHelper;

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

        System.out.println(preTraverse.run(preAndMidRoot));
        System.out.println(lastTraverse.run(preAndMidRoot));
        System.out.println(middleTraverse.run(preAndMidRoot));
        System.out.println(levelTraverse.run(preAndMidRoot));

        System.out.println(preTraverse.run(lastAndMidRoot));
        System.out.println(lastTraverse.run(lastAndMidRoot));
        System.out.println(middleTraverse.run(lastAndMidRoot));
        System.out.println(levelTraverse.run(lastAndMidRoot));
    }
}
