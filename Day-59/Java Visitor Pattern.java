import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sum=0;
    public int getResult() {
      	//implement this
        return sum;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        sum+=leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long product =1;
    private static final int MOD=1000000007;
    public int getResult() {
      	//implement this
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor()==Color.RED){
            product =(product*node.getValue())% MOD;
        }
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        if(leaf.getColor()==Color.RED){
            product=(product*leaf.getValue())%MOD;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthSum=0;
    private int greenLeafSum=0;
    public int getResult() {
      	//implement this
        return Math.abs(evenDepthSum-greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth()%2==0){
            evenDepthSum+=node.getValue();
        }
    	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor()==Color.GREEN){
            greenLeafSum+=leaf.getValue();
        }
    	//implement this
    }
}

public class Solution {
  
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] values=new int[n];
        for(int i=0; i<n; i++){
            values[i]=sc.nextInt();
        }
        Color[] colors =new Color[n];
        for(int i=0; i<n; i++){
            int color=sc.nextInt();
            if(color==0){
                colors[i]=Color.RED;
            }else{
                colors[i]=Color.GREEN;
            }
        }
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            
            graph[u].add(v);
            graph[v].add(u);
        }
        return buildTree(0,-1,0,values,colors,graph);
    }
    private static Tree buildTree(
        int current,
        int parent,
        int depth,
        int[] values,
        Color[] colors,
        ArrayList<Integer>[] graph){
            boolean isLeaf=true;
            
            for(int child:graph[current]){
                if(child!=parent){
                    isLeaf=false;
                    break;
                }
                
            }
            Tree tree;
            if(isLeaf){
                tree=new TreeLeaf(
                    values[current],
                    colors[current],
                    depth
                );
            }else{
                TreeNode node=new TreeNode(values[current], colors[current], depth);
                for(int child :graph[current]){
                    if(child!=parent){
                        node.addChild(
                            buildTree(child, current, depth+1, values, colors, graph
                            )
                        );
                    }
                }
                tree=node;
            }
            return tree;
        }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}