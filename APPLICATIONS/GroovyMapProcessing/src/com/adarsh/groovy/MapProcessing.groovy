package com.adarsh.groovy

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 4/7/13 10:01 PM
 * @see
 */

public class MapProcessing {

    def static getMap() {
        def stringMap = ["Su": "Sunday"
                , "Mo": "Monday"
                , "Tu": "Tuesday"
                , "We": "Wednesday"
                , "Th": "Thursday"
                , "Fr": "Friday",
                "Sa": "Saturday"];
        return stringMap
    }

    public static void main(String[] args) {
        def stringMap = getMap()
        displayMap1(stringMap)
        println()
        displayMap2(stringMap)
        println()
        displayMap3(stringMap)
        println()
        displayMap4(stringMap)

    }

    def static displayMap1(stringMap) {
        for (days in stringMap) {
            println "${days.value}  "
        }
    }

    def static displayMap2(stringMap) {
        stringMap.each() {
            key, value -> println "${key} : ${value}"
        };
    }

    def static displayMap3(stringMap) {
        stringMap.eachWithIndex() {
            obj, i -> println " ${i}: ${obj}"
        };
    }

    def static displayMap4(stringMap) {
        stringMap.entrySet().each {
            entry ->
            println " $entry.key: $entry.value"
        };
    }
}
