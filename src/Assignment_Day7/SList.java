package Assignment_Day7;

/**
 * @author Manish Goyal
 * @param <T> Specified object of ListNode
 */
class ListNode<T>{
    T data;
    ListNode<T> next;

    //Constructor creates ListNode which refers to the specified object
    ListNode(T object){
        this(object, null);
    }

    //Constructor creates ListNode which refers to the specified object and to the next ListNode
    ListNode(T object, ListNode<T> node){
        this.data = object;
        this.next = node;
    }
}

/**
 * @author Manish Goyal
 * Main class SList which contains ListNode and iterates through SListIterator
 * @param <T>
 */
public class SList<T>{

    ListNode<T> head;

    // Method which returns a SListIterator for the specified SList
    SListIterator iterator(){
        return new SListIterator(this);
    }

    @Override
    public String toString() {
        if(this.iterator().isEmpty())
            return "Empty List!!!";
        else{
            ListNode<T> curr  = this.head;
            StringBuilder s = new StringBuilder();                  //To store the values of nodes of SList
            while (curr != null){
                s = s.append("\t" + curr.data + "\n");
                curr = curr.next;
            }
            return "List : \n" + s.toString();
        }
    }

    public static void main(String[] args){

        SList<String> sampleList = new SList<>();
        SListIterator<String> it = sampleList.iterator();
        it.insertAtBack("Manish");                          //Inserting object at back of the list
        it.insertAtBack("Shyam");                          //Inserting object at back of the list
        it.insertAtBack("Krsna");                          //Inserting object at back of the list

        System.out.println(sampleList.toString());

        System.out.println("Next String is = " + it.next());

        it.insertAtFront("Govind");                         //Inserting object at front of the list

        System.out.println("Inserting at front \n" + sampleList.toString());

        it.remove();                                                 //Removing object from front of the list

        System.out.println("After Removing from front \n" + sampleList.toString());
    }
}
