package yael.ao.p04;

import java.util.Random;

public class SinglyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(T element) {
        head = new Node<>(element, head);
        size++;
    }

    public void addLast(T element) {
        var newNode = new Node<>(element);
        if (head == null) {
            newNode.setNext(null);
            head = newNode;
        }
        Node auxiliarNode = head;
        while (auxiliarNode.getNext() != null)
            auxiliarNode = auxiliarNode.getNext();

        auxiliarNode.setNext(newNode);
        newNode.setNext(null);
        size++;

    }

    public T removeFirst() {
        T deletedElement = head.getElement();
        if (head == null) {
            System.out.println("Lista Vacía");
            return null;
        }
        head = head.getNext();
        size--;
        return deletedElement;
    }

    public T removeLast() {
        T deletedElement;
        if (head == null) {
            System.out.println("Lista vacía");
            return null;
        }
        if (head.getNext() == null) {
            deletedElement = head.getElement();
            head = null;
        } else {
            var auxiliarNode = head;
            Node<T> previousNode = null;

            while (auxiliarNode.getNext() != null) {
                previousNode = auxiliarNode;
                auxiliarNode = auxiliarNode.getNext();
            }
            deletedElement = auxiliarNode.getElement();
            previousNode.setNext(null);
            size--;
        }
        return deletedElement;
    }
    
     /**
     * Este método ordena la lista en orden ascendente
     * utilizando el método de ordenamiento Selección.
     * */
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (getNodeAt(j).getElement().compareTo(getNodeAt(minIndex).getElement()) < 0)
                    minIndex = j;
            }
            swap(i, minIndex);
        }
    }

    /**
     * Este método intercambia los elementos
     * de los nodos que se encuentran en las posiciones i y j.
     * */
    private void swap(int i, int j) {
        T aux = getNodeAt(i).getElement();
        getNodeAt(i).setElement(getNodeAt(j).getElement());
        getNodeAt(j).setElement(aux);
    }
    
    /**
     * Este método retorna el nodo que se encuentra
     * en la posición index (los indices comienzan en 0).
     * */
    private Node<T> getNodeAt(int index) {
        var auxiliarNode = head;
        //
        if (index > 0 || index < this.size - 1) {
            for (int i = 0; i < index; i++)
                auxiliarNode = auxiliarNode.getNext();

            return auxiliarNode;
        }

        return null;
    }


    // return the element at the specified index position.
    public T get(int index) {
        if (index < 0 || index > size - 1)
            return null;

        var node = head;
        for (int i = 0; i < index; i++)
            node = node.getNext();

        return node.getElement();
    }

    public void shuffle() {
        Random random = new Random();
        // start from the end of the list
        for (int i = getSize() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swap(i, j);
        }
    }

    public boolean contains(T element){
        var node = head;
        while(node != null){
            if(node.getElement().equals(element))
                return true;
            node = node.getNext();
        }
        return false;
    }

    // clear the list
    public void clear() {
        head = null;
        size = 0;
    }

    public int getIndexOf(T element){
        var node = head;
        int index = 0;

        while(node != null){
            if(node.getElement().equals(element))
                return index;
            node = node.getNext();
            index++;
        }
        return -1;
    }

    // return string with elements of linked list seprated by arrow within the last whitespace
    public String show() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getElement()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
