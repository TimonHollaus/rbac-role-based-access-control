import java.util.Objects;

public class Mitarbeiter implements Role{

      private String name;
      private String description;

      public Mitarbeiter(String name, String description){
            this.name = name;
            this.description = description;
      }


      @Override
      public String getName() {
            return this.name;
      }

      @Override
      public String getDescription() {
            return this.description;
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Mitarbeiter that)) return false;
            return Objects.equals(name, that.name) && Objects.equals(description, that.description);
      }

      @Override
      public int hashCode() {
            return Objects.hash(name, description);
      }
}
