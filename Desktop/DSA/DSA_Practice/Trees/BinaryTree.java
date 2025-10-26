package Trees;

import java.util.Scanner;



public class BinaryTree 
{

    private static class Node
    {

       private int value;
       private  Node left;
       private Node right;

        public Node(int value)
        {
            this.value = value;
        }

    }


    public BinaryTree()
    {

    }

    private Node root;


    //Insert elements into the tree root
    public void populate(Scanner sc)
    {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value); //inserting the value entered by the 

        populate(sc,root);
    }

        //Insert elements into the tree root's left
    public void populate(Scanner sc, Node node)
    {
        System.out.println("Do u want to enter the left node enter true or false " + node.value);
        boolean left = sc.nextBoolean();
        if (left) 
        {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value); //populating the left node
            populate(sc,node.left);
            
        }
        System.out.println("Do u want to enter the right node enter true or false " + node.value);
        boolean right  = sc.nextBoolean();
        if (right)
        {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value); //populating the right node
            populate(sc,node.right);
            
        }

    }

     // Display the binary tree using in-order traversal
     public void display()
     {
         System.out.println("Inorder traversal of the binary tree");
         inOrderTraversal(root);
         System.out.println();
         System.out.println("Preorder traversal of the binry tree");
         preOrderTraversal(root);
         System.out.println();
         System.out.println("PostOrder Traveral of the binary tree");
         postOrderTraversal(root);
     }

     //     // In-order traversal helper method

     private void inOrderTraversal(Node node)
     {
        if (node == null)
        {
            return;
            
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
         
     }

    // Pre-order traversal helper method

    private void preOrderTraversal(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);


    }


        // Post-order traversal helper method

        private void postOrderTraversal(Node node)
        {
            if (node == null)
            {
                return;
                
            }
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }


     public static void main(String[] args) 
     {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        bt.display();
        sc.close();
        
     }


}















