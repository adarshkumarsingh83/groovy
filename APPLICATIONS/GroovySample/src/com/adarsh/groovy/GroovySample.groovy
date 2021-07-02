package com.adarsh.groovy

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 4/7/13 12:25 PM
 * @see 
 */
 public class GroovySample {

      def msgText=" Hi this is ";

      public final String getMessage(final String userName) {
         return "${msgText} " + new Date() + " " + userName;
     }

     public static void main(String[] args) {
         String msg = new GroovySample().getMessage("Adarsh kumar singh ")
         println(msg);
     }
}
