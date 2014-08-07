package com.adarsh.groovy

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 4/7/13 9:37 PM
 * @see
 */

public class ListProcessing {

    def static getList() {
        def names = new ArrayList()
        names.add("Adarsh kumar")
        names.add("Amit kumar")
        names.add("Radha singh")
        names.add("Sounu singh")
        return names
    }

    def static changeCase(strings) {
        def result = new ArrayList()
        for (s in strings) {
            if (s.size() > 0) {
                result.add(s.toString().toUpperCase())
            }
        }
        return result
    }

    public static void main(String[] args) {
        def names = getList()
        System.out.println(names)
        def upperCaseNames = changeCase(names)
        displayName1(upperCaseNames);
        displayNames2(upperCaseNames)
        displayNames3(upperCaseNames)
    }

    def static displayName1(names) {
        for (name in names) {
            System.out.println(name)
        }
    }

    def static displayNames2(names) {
        names.each() {
            print " ${it} \n"
        };
    }

    def static displayNames3(names) {
        names.eachWithIndex() {
            obj, i -> println " ${i}: ${obj}"
        };
    }


}
