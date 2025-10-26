package Trees;

public class AVL {


    public class Node
    {
        private int value;
        private int height;
        private Node left;
        private Node right;


        private Node(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }

    }
    
    private Node root;

    public  AVL()
    {

    }

    public void insert(int value)
    {
        root = insert(value,root);

    }

    private Node insert(int value, Node node)
    {
        if (node == null)
        {
            node = new Node(value);
            return node;
            
        }
        if (value < node.value)
        {
            node.left = insert(value, node.left);
            
        }

        if (value > node.value)
        {
            node.right = insert(value, node.right);
            
        }

        node.height = Math.max((height(node.left)), height(node.right)) + 1;


        return rotate(node);
    }


    private Node rotate(Node node) 
    {
            //left heavy like skewed left
        if (height(node.left) - height(node.right) > 1) //for LL and LR imbalance cases
        {
            
            if (height(node.left.left) - height(node.left.right) > 0) //Left Left Case
            {
                return rightRotate(node);

                
            }
            if (height(node.left.left) - height(node.left.right) < 0)  // left right case
            {
                node.left = leftRotate(node);
                return rightRotate(node);
                
            }
        }

            //right heavy like skewed right
        if (height(node.left) - height(node.right) < -1) //for RR and RL imbalance cases
        {
            // for subtree imbalance checking
            if (height(node.right.left) - height(node.right.right) < 0)
            {
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0)
            {
                node.right = rightRotate(node);
                return leftRotate(node);
                
            }
            
        }

        
        return node;

    }


    //Right rotation code
    private Node rightRotate(Node p) 
    {
        // we will only code for the elements that will change and not touch those who won't change

        Node c = p.left;
        Node t = c.right;

        //rotate
        c.right = p;
        p.left = t;
        
        // calculating the new heights
        p.height = Math.max(height(p.left), height(t.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
        
    }
    
    //Left rotation code
    private Node leftRotate(Node c) 
    {

    // we will only code for the elements that will change and not touch those who won't change.
    Node p = c.right;
    Node t = c.left;

    //rotate
    p.left = c;
    c.right = t;

    //calculating the new heights.

    p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left),height(c.right) + 1);

        return p;
    }


    

    public boolean isEmpty()
    {
        return root == null; //if the root is empty
    }

    public int height()
    {
        return height(root);
    }

    private int height(Node node)
    {
        if (node == null)
        {
            return -1;

        }
        return node.height;

    }


    public boolean balanced()
    {
        return balanced(root);
    }

    private boolean balanced(Node node)
    {
        if (node == null)
        {
            return true;
            
        }
                          // for whole tree left - right             and for subtree left and sub tree right as well checking the imbalance
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right); // 
    } 


    //displaying the bst tree
    public void display()
    {
        display(this.root, "Root Node :" );
    }

    private void display(Node node, String details)
    {
        if (node == null)
        {
            return;
            
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right,"Right child of " + node.value + ": ");
    }


    // If given sorted array
    public void populateSorted(int[] arr)
    {
        populateSorted( arr ,  0,  arr.length); 
    }


    private void populateSorted(int [] arr,int start,int end)
    {
        if (start >= end)
         {
            return;
            
        }
        int mid = (start + end) / 2 ;

        this.insert(arr[mid]); //inserting the element
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    public void populate(int [] arr) // for inserting the values intot he tree
    {
        for(int i=0; i< arr.length; i++)
        {
            this.insert(arr[i]);
        }
    }



    public static void main(String[] args) 
    {

        AVL avl = new AVL();
        int[] arr = { 5,2,7,1,4,6,9,8,3,10};
        avl.populate(arr);
       // int[] arr1 = {1,2,3,4,5,6,7,8,9};
        //avl.populateSorted(arr1);
       
        avl.display();


    //    for(int i=0; i <1000; i++)
    //    {
    //     avl.insert(i);
    //    }
    //    System.out.println(avl.height());
    }
    
}



















    

