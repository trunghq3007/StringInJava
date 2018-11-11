/**
 * 
 */
package start;

import java.util.Scanner;

/**
 * @author HQTrung
 *
 */
public class Main {
        // number HV in VnLearn class
        static int numberHV;

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: enter and print list HV in VnLearn class
         * Version 1.0
         * @param args
         */
        public static void showNameMember(String[] str) {
                String name;
                for (int i = 0; i < str.length; i++) {
                        name = str[i].trim().substring(str[i].lastIndexOf(" "));
                        System.out.println("Member'Name of Student[" + (i) + "]" + name);
                }
        }

        public static void main(String[] args) {
                // enter size of class
                numberHV = inputSizeArr();
                // enter list HV
                String[] arrHV = enterArray(numberHV);
                // print list HV
                System.out.println("List HV");
                System.out.println("=======");
                printListHV(arrHV);
                // print ho of list HV
                printNameListHV(arrHV);
                // print name
                showNameMember(arrHV);

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: enter size of class
         * Version 1.0
         */
        static int inputSizeArr() {
                // instance scanner for I/O
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number hv :numberHV = ");
                numberHV = scanner.nextInt();
                while (numberHV < 0) {
                        System.out.println("Enter number hv :numberHV = ");
                        numberHV = scanner.nextInt();
                }
                return numberHV;

        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: enter list name of vnlearn class
         * Version 1.0
         * @return String[]
         */
        public static String[] enterArray(int size) {

                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                String[] arrVnLearnClass = new String[numberHV];
                // enter value for all element of array
                for (int i = 0; i < size; i++) {

                        System.out.print("HV[" + i + "] = ");
                        arrVnLearnClass[i] = scanner.nextLine();
                }
                return arrVnLearnClass;
        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: print list HV in VnLearn Class
         * Version 1.0
         * @param arrHV
         */
        public static void printListHV(String[] arrHV) {
                for (int i = 0; i < arrHV.length; i++) {
                        String hvtHV = arrHV[i];
                        System.out.println("HV " + i + ": " + hvtHV);
                }
        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: .print ho HV
         * Version 1.0
         * @param arrHV
         */
        public static void printNameListHV(String[] arrHV) {
                String ho;
                System.out.println("DS Ho:");
                for (int i = 0; i < arrHV.length; i++) {
                        ho = arrHV[i].trim().substring(0, arrHV[i].indexOf(" "));
                        System.out.println(ho);

                }
        }

        /**
         * Create by: HQTrung - CTO VnLearn
         * Create date: Nov 11, 2018
         * Modifier: HQTrung
         * Modified date: Nov 11, 2018
         * Description: .print uppercase list hv
         * Version 1.0
         * @param arrHV
         */
        public static void printUperCaseListHV(String[] arrHV) {
                for (int i = 0; i < arrHV.length; i++) {
                        String hvtHV = arrHV[i];
                        System.out.println("HV " + i + ": " + hvtHV.toUpperCase());
                }
        }
}
