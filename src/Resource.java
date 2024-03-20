import java.util.HashSet;
import java.util.Iterator;

public class Resource {
      private HashSet<Role> roleSet;

      public Resource(){
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

      public boolean hasAccess(User user){
            HashSet<Role> intersection = new HashSet<>(user.userRoles());
            intersection.retainAll(this.roleSet);
            return !intersection.isEmpty();
      }
}
