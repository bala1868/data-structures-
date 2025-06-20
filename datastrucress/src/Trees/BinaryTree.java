package Trees;

//THIS IS AN BASIC IMPLEMENTATION OF BINARY TREEE with in,pre ,postorder traversal

import java.util.Scanner;

class TNode
{
    int data;
    TNode left,right;
    TNode(int data)
    {
        this.data=data;
    }

}
class BinaryTrees{
    TNode root;
    BinaryTrees(int data)
    {
       root=new TNode(data);
    }
    void insertleft(TNode t,int data)
    {
        t.left=new TNode(data);
    }
    void insertright(TNode t,int data)
    {
        t.right=new TNode(data);
    }
    void display(TNode node)//inorder
    {
       if(node==null)
           return;
       else
       {
           display(node.left);
           System.out.println(node.data);
           display(node.right);
       }
    }
    void postorder(TNode node)
    {
        if(node==null)
            return;
        else{
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }
    void preorder(TNode node)
    {
        if(node==null)return;
        else {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

}
public class BinaryTree {
    public static void main(String[] args) {
        BinaryTrees binaryTrees=new BinaryTrees(1);
        binaryTrees.insertright(binaryTrees.root,9);
        binaryTrees.insertleft(binaryTrees.root,0);
    }
}
