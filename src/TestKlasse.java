public class TestKlasse {
      public static void main(String[] args) {

            User user1 = new User();
            User user2 = new User();

            Resource kaufen = new Resource();
            Resource verkaufen = new Resource();
            Resource managen = new Resource();

            Role Kunde = new Kunde("Kunde", "Die Rolle Kunde wird alles Kunden zugeteilt!");
            Role Mitarbeiter = new Mitarbeiter("Mitarbeiter", "Diese Rolle erhalten alle Mitarbeiter!");
            Role Manager = new Manager("Manager", "Diese Rolle erhalten alle Manager!");

            user1.addRole(Kunde);
            kaufen.addRole(Kunde);
            System.out.println(user1.listRoles());

            System.out.println(kaufen.hasAccess(user1));


      }
}
