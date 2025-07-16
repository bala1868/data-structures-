package Trees;

class AvlNode{
    int val,height;
    AvlNode left,right;
    AvlNode(int val)
    {
        this.val=val;
        this.height=1;
    }
}

public class AVLTREE {
      AvlNode root;
      int height(AvlNode node)
      {
          if(node==null)
              return 0;
          return node.height;
      }
      int max(int a,int b)
      {
          return a>b?a:b;
      }
      int getBalance(AvlNode node)
      {
          if(node==null)return 0;
          return height(node.left)-height(node.right);
      }
       void inorder(AvlNode node)
       {
           if(node==null)return;

           inorder(node.left);
           System.out.print(node.val+" ");
           inorder(node.right);
       }

      AvlNode insert(AvlNode node, int v)
      {
          if(node==null)
              return new AvlNode(v);
          if(v<node.val)
            node.left=insert(node.left,v);
          else if (v> node.val) {
              node.right=insert(node.right,v);
          }
          else return node;
        //  System.out.println(node.val+" "+v);
         // update height of root
          ;
          node.height=1+max(height(node.left),height(node.right));
          int balance=getBalance(node);
          //left  left case
          if(balance>1&&v< node.left.val){
              return rightrotate(node);
          }
          //right case
          if (balance<-1&& v>node.right.val)
              return leftRotate(node);
          //Lr case
          if(balance>1&&v>node.left.val)
          {
              node.left=leftRotate(node.left);
              return rightrotate(node);
          }
          if(balance<-1&&v<node.right.val)
          {
              node.right=rightrotate(node.right);
              return leftRotate(node);
          }
          return node;
      }
      private AvlNode leftRotate(AvlNode node)
      {
          AvlNode rigthchild=node.right;
          AvlNode temp=rigthchild.left;
          //rotations
          rigthchild.left=node;
          node.right=temp;
          node.height=max(height(node.left),height(node.right))+1;
          rigthchild.height=max(height(rigthchild.left),height(rigthchild.right))+1;
          return rigthchild;
      }


    private AvlNode rightrotate(AvlNode root) {
          AvlNode leftchild=root.left;
          AvlNode temp=leftchild.right;
        //rotation
          leftchild.right=root;
          root.left=temp;
          //update heights
           root.height=max(height(root.left),height(root.right))+1;
           leftchild.height=max(height(leftchild.left),height(leftchild.right))+1;

          return leftchild;
    }

    public static void main(String[] args) {
        int[] ar={10,20,30,40,50,25};
        AVLTREE avltree=new AVLTREE();
        for(int i:ar)
            avltree.root=avltree.insert(avltree.root,i);
        avltree.inorder(avltree.root);

    }
}
