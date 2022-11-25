public class MyList<E> {
    Node<E> list = new Node<E>();

    public int size() {
        Node<E> object = list;
        int size = 0;
        // next это переход на следующий элемент списка
        //Итерируем пока следующий элемент списка существует
        while (object.next != null) {
            object = object.next;
            size++;
        }
        return size;
    }

    public void add(E item) {
        Node<E> u = new Node<E>(item);
        Node<E> object = list;
        while (object.next != null)
            object = object.next;
        //итерируем до конца, потом добавляем элемент
        object.next = u;
    }
    public final void add(E... a) {
        for (E item : a)
            add(item);
    }
    public void remove(int index) {
        Node<E> object = list;
        int i = 0;
        while (i++ < index)
            // затирание элемента по индексу, значение object ничему не присваивается
            object = object.next;
        object.next = object.next.next;
    }
    public void remove(E item) {
        Node<E> object = list;
        // data конкретное значение данного поля
        // работает по похожему принципу с предыдущим
        // apple orange watermelon
        while (object.next.data != item) {
            if (object.next.next == null)
                return;
            object = object.next;
        }
        object.next = object.next.next;
    }
    public E get(int index) {
        Node<E> object = list;
        int i = 0;
        while (i++ <= index)
            object = object.next;
        return object.data;
    }
    public void clear() {
        list.data = null;
        while (list.next != null) {
            list = list.next;
            list.data = null;
        }
    }
    public void print() {
        Node<E> object = list;
        while (object.next != null) {
            object = object.next;
            System.out.print(object.data + " ");
        }
        System.out.println();
    }
}
