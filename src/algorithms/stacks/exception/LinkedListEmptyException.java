package algorithms.stacks.exception;


/*Exception to indicate that LinkedList is empty*/
public class LinkedListEmptyException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public LinkedListEmptyException() {
        super();
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }
}
