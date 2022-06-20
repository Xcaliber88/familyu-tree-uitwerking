import java.util.List;

public class Pet {

    private String name;
    private int age;
    private String species;
    private List<Person> owners;

    public Pet(String name,int age, String species ){
        this.name = name;
        this.age = age;
        this.species=species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public void setOwners(List<Person> owners) {
        this.owners = owners;
    }

    public void addOwner(Person owner){
        owners.add(owner);

    }

}
