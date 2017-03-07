package com.varaprasadps.dsa;

import com.varaprasadps.dsa.domain.LinkedList;
import com.varaprasadps.dsa.domain.Node;
import com.varaprasadps.dsa.domain.Result;

/**
 * @author by Vara Prasad.
 */
public class Finder<T> {

    public Result<T> middle(LinkedList<T> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            throw new IllegalArgumentException("input cannot be null");
        }
        int length = 0;
        Node<T> middle = linkedList.head();
        Node<T> current = linkedList.head();
        while (current != null) {
            length++;
            current = current.next();
            if (length % 2 == 0) {
                middle = middle.next();
            }
        }
        return new Result<>(middle.getData(), length);
    }



}
