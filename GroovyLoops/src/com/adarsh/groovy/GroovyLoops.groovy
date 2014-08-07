package com.adarsh.groovy

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 4/7/13 10:19 PM
 * @see
 */

public class GroovyLoops {

    public static void main(String[] args) {
        loopExample1()
        println()
        loopExample2()
        println()
        loopExample3()
        println()
        loopExample4()
        println()
        loopExample5()
        println()
        loopExample6()
        println()
        loopExample7()
        println()
        loopExample8()
        println()
        loopExample9()
        println()
    }

    def static loopExample1() {
        for (int i = 0; i < 10; i++) {
            print "${i} "
        }
    }

    def static loopExample2() {
        for (i in 0..9) {
            print "${i} "
        }
    }

    def static loopExample3() {
        for (i in [0, 1, 2, 3, 4,5,6,7,8,9]) {
            print "${i} "
        }
    }

    def static loopExample4() {
        def array = (0..9).toArray()
        for (i in array) {
            print "${i} "
        }
    }

    def static loopExample5() {
        def map = ['abc': 1, 'def': 2, 'xyz': 3]
        for (e in map) {
            print "$e.value "
        }
    }

    def static loopExample6() {
        def map = ['abc': 1, 'def': 2, 'xyz': 3]
        for (v in map.values()) {
            print "${v} "
        }
    }

    def static loopExample7() {
        def text = "abcdefghijklmnopqrstuvwxyz"
        for (c in text) {
            print "${c} "
        }
    }

    def static loopExample8() {
        def text = 'a'..'z'
        for (c in text) {
            print "${c} "
        }
    }

    def static loopExample9() {
        5.times {
            print 'hello  '
        }
    }
}
