import java.util.Objects;

public class Manager implements Role{

      private String name;
      private String description;

      public Manager(String name, String description){
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
            if (!(o instanceof Manager manager)) return false;
            return Objects.equals(name, manager.name) && Objects.equals(description, manager.description);
      }

      @Override
      public int hashCode() {
            return Objects.hash(name, description);
      }
}
