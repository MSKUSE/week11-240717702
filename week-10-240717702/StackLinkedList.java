public class StackLinkedList {
    StackItem top = null;


        @Override
        public void push(Object item) {
            StackItem temp_box = new StackItem(item);
            StackItem previous_top = top;
            top = temp_box;
            top.setNext(previous_top);
        }

        @Override
        public Object pop() throws MyEmptyStackException {
            if (this.top==null){
                throw new MyEmptyStackException("Stack is empty ");
            Object data = top.getItem();
            top = top.getNext();
            return data ;
        }

        @Override
        public void peek() {
            System.out.println("the top is "+ top.getItem());
        }

        @Override
        public boolean isEmpty() {
            return this.top =null;
        }

    }

}
