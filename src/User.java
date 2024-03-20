import java.util.HashSet;
import java.util.Iterator;

public class User {

      private HashSet <Role> roleSet;

      public User(){
            roleSet = new HashSet<>();
      }
      public void addRole(Role role){
            roleSet.add(role);
      }

      public void deleteRole(String name){
            roleSet.remove(name);
      }

      public String listRoles(){
            String ergebnis = "";
            Iterator<Role> iterator = this.roleSet.iterator();
            while (iterator.hasNext()) {
                  ergebnis += iterator.next().getName() + "\n";
            }
            return ergebnis;
      }
      public HashSet<Role> userRoles(){
            return this.roleSet;
      }

}
