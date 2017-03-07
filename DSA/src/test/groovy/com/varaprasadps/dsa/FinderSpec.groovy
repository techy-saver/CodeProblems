package com.varaprasadps.dsa

import com.varaprasadps.dsa.domain.LinkedList
import com.varaprasadps.dsa.domain.Node
import com.varaprasadps.dsa.domain.Result
import spock.lang.Specification

/**
 * @author by Vara Prasad.
 */
class FinderSpec extends Specification {

    Finder<String> subject = new Finder()

    def "middle() - failure if the input is not valid"() {
        when:
        subject.middle(input);

        then:
        thrown(IllegalArgumentException)

        where:
        input << [
                null,
                new LinkedList<>()
        ]
    }

    def "middle() - test for odd length"() {
        given:
        LinkedList<String> list = new LinkedList<>();
        list.add(new Node<>("A"))
        list.add(new Node<>("B"))
        list.add(new Node<>("C"))
        list.add(new Node<>("D"))
        list.add(new Node<>("E"))

        when:
        Result<String> result = subject.middle(list);

        then:
        result.length == 5
        result.data == "C"
    }

    def "middle() - test for even length"() {
        given:
        LinkedList<String> list = new LinkedList<>();
        list.add(new Node<>("A"))
        list.add(new Node<>("B"))
        list.add(new Node<>("C"))
        list.add(new Node<>("D"))
        list.add(new Node<>("E"))
        list.add(new Node<>("F"))

        when:
        Result<String> result = subject.middle(list);

        then:
        result.data == "D"
        result.length == 6
    }



}
