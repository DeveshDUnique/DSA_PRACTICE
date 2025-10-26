package Trees;

public class SegmentTree 
{

    private static class  Node 
    {
        private int data;
        private int startInterval;
        private int endInterval;
        Node left;
        Node right;

        private Node(int startInterval, int endInterval)
        {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    private Node root;


    public SegmentTree(int[] arr)
    {
        //create tree using the array passed in the method parameters.

        this.root = constructTree(arr,0,arr.length - 1);
    }


    private Node constructTree(int[] arr, int start, int end) 
    {
        if (start == end)
        {
            //leaf node which will be only node bcause no other nodes
            Node leaf = new Node(start, end);
            leaf.data = arr[start];  // putting the data into the node
            return leaf;
        }

        // create new node at index you are at
        Node node = new Node(start, end);

        int mid = (start + end) /2;

        node.left = this.constructTree(arr, start, mid); // left node for recursion
        node.right = this.constructTree(arr, mid +1, end); // right node for recursion

        //adding the left and right 
        node.data = node.left.data + node.right.data;
        

        return node;
        

    }

    //Display

    public void display()
    {
        display(this.root);
    }

    private void display(Node node)
    {
        String str = "";

        //for left node
        if (node.left !=null)
        {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
 
        }
        else
        {
            str = str + "No Left Child";
        }

        //for current node

        str = str + "Interval=[" +node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " => "; 

        //for right node

        if (node.right != null)
        {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data + " => ";
            
        }
        else
        {
            str = str + "No right Child";
        }

        System.out.println(str + '\n');


        //call recursion
        if (node.left != null)
        {
            display(node.left);
            
        }

        if (node.right !=null)
        {
            display(node.right);
            
        }



    }



    //query

    public int query(int qsi, int qei)  //qsi = query start index,   qei = query end index
    {
        return this.query(this.root ,qsi, qei);

    }

    private int query(Node node, int qsi, int qei)
    {

        if (node.startInterval >= qsi && node.endInterval <=qei) // completely inside the array indexes
        {
            return node.data;
            
        }
        else if(node.startInterval > qei || node.endInterval < qsi) //completely outside the array indexes
        {
            return 0;
        }
        else
        {
            return this.query(node.left, qsi,qei) + this.query(node.right,qsi, qei);
        }

    }





    //UPDATE

    public void update( int index, int value)
    {
        this.root.data = update(this.root,index ,value);
    }

    private int update(Node node,int index, int value)
    {
        if (index >= node.startInterval && index <= node.endInterval)
        {
            if (index == node.startInterval && index == node.endInterval) 
            {
                node.data = value;
                return node.data;
                
            }
            else
            {
                int left = update(node.left, index, value);
                int right = update(node.right, index, value);
                node.data = left + right;
                return node.data;

            }
            
        }

        return node.data;
    }


    public static void main(String[] args) 
    {
        int arr []= {3,8,6,7,-2,-8,4,9};
        SegmentTree st = new SegmentTree(arr);

        st.display();


        
    }



}
