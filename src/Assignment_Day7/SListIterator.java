package Assignment_Day7;

/**
 * @author Manish Goyal
 * A class defining the methods containing operations which can be perofrmed on
 * Singly linked list class 'SList'.
 * @param <T> It defines the Non-Primitive data type of SList and SListIterator
 */
public class SListIterator<T>{

    SList<T> list;

    //Constructor creates SListIterator which refers to the specified SList
    SListIterator(SList<T> li){
        list = li;
    }

    /**
     * A method to insert data from the front of a singly linked list
     * @param insertData A specified object of Non-Primitive data type to insert in ListNode of SList
     */
    public void insertAtFront(T insertData){
        if(isEmpty()){                                          //Checking for empty SList
            list.head = new ListNode<T>(insertData);
        }
        else{
            list.head = new ListNode<T>(insertData,list.head);
        }
    }

    /**
     * A method to insert data from back of singly linked list
     * @param insertData A specified object of Non-Primitive data type to insert in ListNode of SList.
     */
    public void insertAtBack(T insertData){
        if(isEmpty()){
            list.head = new ListNode<T>(insertData);
        }
        else{                                                   //loop while current node does not refer to lastNode
            ListNode<T> curr = list.head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = new ListNode<T>(insertData);
        }
    }

    /**
     * A method to return data of the next ListNode of SList
     * @return Specified object of SList
     */
    public T next(){
        return list.head.next.data;
    }

    //Method to remove front ListNode of SList
    public void remove(){
        if(!isEmpty()){
            list.head = list.head.next;
        }
    }

    /**
     * A method to check whether the SList is empty or not.
     * @return true if list is empty else false.
     */
    boolean isEmpty(){
        return list.head == null;
    }
}

