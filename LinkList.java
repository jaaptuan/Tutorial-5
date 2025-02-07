package Tutorial5;

public class LinkList {
    Node head ;
    private int size ;
    
    public LinkList() {
        this.head = null ;
        this.size = 0 ;
    }
    
    // Insert at the end of the list
    public void insert(CovidVaccine data) {
        Node newNode = new Node(data) ;
        if (head == null) {
            head = newNode ;
        }
        else {
            Node temp = head ;
            while (temp.next != null) {
                temp = temp.next ;
            }
            temp.next = newNode ;
        }
        size++ ;
    }

    // Delete a node with given SID
    public boolean delete(String SID) {
        if (head == null) {
            return false;
        }

        if (head.data.SID.equals(SID)) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        Node prev = null;
        while (current != null && !current.data.SID.equals(SID)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            size--;
            return true;
        }
        return false;
    }

    // Delete all nodes
    public void deleteAll() {
        head = null;
        size = 0;
    }

    // Get size of the list
    public int getSize() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Print all nodes
    public void traversal() {
        Node current = head;
        while (current != null) {
            CovidVaccine vaccine = (CovidVaccine) current.data;
            System.out.println(vaccine.toString());
            current = current.next;
        }
        System.out.println();
    }
}
