// Name: Jonathan Stone
// Class: CS 3305/Section 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: IntelliJ

/*
  This class define a linked list that stores integer values.
  The class does NOT use Head and Tail pointer as the textbook class deos.
*/

public class LinkedList_No_HT
{
    public Node ListName;

    //constructor method to create a list object with a specifc name.
    public LinkedList_No_HT()
    {
        ListName = null;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (ListName == null)
            ListName = new Node(data); //one node list
        else
        {
            Node temp = ListName;
            while (temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = new Node(data); //link new node as last node
        }
    }

    //======== Your part to complete for this assignment =========

    //method #1: add first node
    public void addFirstNode(int data) {
        //complete this method

        // Create New node
        Node newNode = new Node(data);

        // Create Pointer to List
        newNode.next = ListName;

        // Declare newNode as front of List
        ListName = newNode;

    }


    //method #2: add node at index
    public void addAtIndex(int index, int data)
    {
        //complete this method

        // Incase index == 0 ;
        if(index == 0){
            addFirstNode(data);
        }

        //Handles index !=0
        else{
            // Declare Temp
            Node Temp = ListName;

            // Iterates till one before index (so we can use Temp.next within our node replacement
            for (int i = 0; i < index-1; i++) {
                Temp = Temp.next;
            }

            // Create and replace node
            Node newNode = new Node(data);
            newNode.next = Temp.next;
            Temp.next = newNode;
        }
    }


    //method #3: remove first node
    public void removeFirstNode()
    {
        //complete this method

        if(ListName != null){

            // Makes our new first variable our now second variable (uses garbage collector to clear old first)
            ListName = ListName.next;

        }




    }


    //method #4: remove last node
    public void removeLastNode()
    {
        //complete this method

        // Temp Declaration
        Node Temp = ListName;

        // Checks for empty list, if not empty begins process
        if (ListName != null){

            if(Temp.next == null){
                ListName = null;
                return;
            }

            // If List is not empty forwards nodes until we hit our final node
            while(Temp.next.next != null){
                Temp = Temp.next;
            }
            Temp.next = null;

        }


    }


    //method #5: remove node at index
    public void removeAtIndex(int index)
    {
        //complete this method


        // Checks for empty list then exits if List is empyu
        if (ListName == null){
            return;
        }

        // Checks for removal of first element
        if (index == 0){
            removeFirstNode();
            return;
        }

        // Standard Temp declaration
        Node Temp = ListName;

        // Iterates till 1 before index of node
        for (int i = 1; i < index; i++){
            if (Temp.next == null){
                return;
            }

            Temp = Temp.next;
        }

        // Covers for the indexed node being our last node
        if (Temp.next.next == null){
            Temp.next = null;
            return;
        }

        // removes indexed node if not last node
        Temp.next = Temp.next.next;
    }

    //method #6: countNodes
    public int countNodes()
    {
        int listSize= 0;

        //complete this method to return the list size.

        // Declare Temp to iterate
        Node Temp = ListName;

        // iterate through list counting list size
        while(Temp != null){
            Temp = Temp.next;
            listSize +=1;
        }

        return listSize;
    }


    //method #7: pritnInReverse (must be a Recursive method)
    public void printInReverseRecursive(Node L)
    {
        //complete this method as recursive method to print the list in reverse order.

        // Base case
        if(L == null){
            System.out.print(" ");
        }

        // Recursive case
        else{

            // Adds to the top of the stack till hitting null
            printInReverseRecursive(L.next);

            // Once we hit null it prints each item as the method resolves from the stack
            System.out.print(L.data + " " );

    }
    }

    // Could not get it to run without this wrapper
    public void printInReverse() {
        printInReverseRecursive(ListName);
    }


    //================= end of your part ==============

    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = ListName;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}


