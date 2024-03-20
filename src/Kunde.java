import java.util.Objects;

public class Kunde implements Role{

      private String name;
      private String description;

      public Kunde (String name, String description){
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
            if (!(o instanceof Kunde kunde)) return false;
            return Objects.equals(name, kunde.name) && Objects.equals(description, kunde.description);
      }

      @Override
      public int hashCode() {
            return Objects.hash(name, description);
      }
}
