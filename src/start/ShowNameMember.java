/**
 * 
 */
package start;

/**
 * @author admin
 *
 */
public class ShowNameMember {
        public static void showNameMember(String[] str) {
                String name;
                for (int i = 0; i < str.length; i++) {
                        name = str[i].trim().substring(str[i].lastIndexOf(" "));
                        System.out.println("Member'Name is Student["+(i)+"]" + name);
                }
        }

}
