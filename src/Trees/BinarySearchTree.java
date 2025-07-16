package Trees;

import java.util.Scanner;

class BSTNode
{
    BSTNode left,right;
    int data;
    BSTNode(int data)
    {
        this.data=data;
    }
}
class BinarySearchTreeImplementation{
    BSTNode root;
    BSTNode insert(BSTNode t,int data)
    {
        if(t==null)
             t=new BSTNode(data);
        if(data<t.data)
            t.left=insert(t.left,data);
        else if(data>t.data)
            t.right=insert(t.right,data);
        return t;
    }
    void inOrder(BSTNode root)
    {
        if(root==null)return;
        else{
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    boolean search(BSTNode root,int val)
    {
        if(root==null)return false;
     if(root.data==val)return true;
     if(val<root.data)
         return search(root.left,val);
     if(val> root.data)
        return search(root.right,val);
   return false;
    }
    BSTNode delete(BSTNode node,int val)
    {
        if(node==null)
            return null;
        if(val<node.data) node.left= delete(node.left,val);
        else if(val>node.data) node.right=delete(node.right,val);
        else {
            if(node.left==null)return node.right;
            else if (node.right==null) return node.left;
            BSTNode sucessor=findMin(node.right);
            node.data=sucessor.data;
            node.right=delete(node.right,sucessor.data);
        }return node;
    }

    private BSTNode findMin(BSTNode node) {
        while(node.left!=null)
            node=node.left;
        return node;
    }


}
public class BinarySearchTree {
    public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
         int[] a=new int[]{1,3,4,5,6,7,12};
         BinarySearchTreeImplementation bst=new BinarySearchTreeImplementation();
         for(int i:a)
         {
             bst.root=bst.insert(bst.root,i);
         }
         bst.inOrder(bst.root);
         //System.out.println(bst.root.data);
         int val=4;
         if(bst.search(bst.root,0))
             System.out.println("element found");
         else System.out.println("Not found");
         bst.root=bst.delete(bst.root,6);
         bst.inOrder(bst.root);
    }
}
