import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    Person test;
    @BeforeEach
    public void init(){
        test =new Person("Bobby", "Jan", "Jansen","male", 34);
    }

    @Test
    public void getName(){
        //arrange
      // see BeforeEach

        //act
        String result = test.getName();
        //assert
        Assertions.assertEquals("Bobby",result);
    }

    @Test
    public void setName(){
        //arrange
        // see BeforeEach

        test.setName(test.getName());

        //act

        String result = test.getName();

        // assert

        Assertions.assertEquals("Bobby", result);
    }

    @Test
    public void  getMiddleName(){
        //arrange
        // see @BeforeEach

        // act
        String result = test.getMiddleName();
        //assert
        Assertions.assertEquals("Jan", result);
    }

    @Test
    public void setMiddleName(){
        //arrange
        // see @BeforeEach

        test.setMiddleName(test.getMiddleName());

        // act
        String result = test.getMiddleName();

        //assert
        Assertions.assertEquals("Jan", result);
    }

    @Test
    public void getLastName(){
        //arrange
        // see @BeforeEach

        // act
        String result = test.getLastName();

        //assert
        Assertions.assertEquals("Jansen", result);
    }

    @Test
    public void setLastName(){
        //arrange
        // see @BeforeEach
        test.setLastName(test.getLastName());

        // act
        String result = test.getLastName();

        // assert

        Assertions.assertEquals("Jansen", result);
    }

    @Test
    public void getSex(){
        //arrange
        // see @BeforeEach

        // act
        String result = test.getSex();

        // assert
        Assertions.assertEquals("male", result);
    }

    @Test
    public void setSex(){
        //arrange
        // see @BeforeEach
        test.setSex(test.getSex());
        // act
        String result = test.getSex();

        //assert
        Assertions.assertEquals("Male", result);
    }

    @Test
    public void getAge(){
        //arrange
        // see @BeforeEach

        // act
        int result = test.getAge();

        // assert
        Assertions.assertEquals(34, result);
    }

    @Test
    public void setAge(){
        //arrange
        // see @BeforeEach
        test.setAge(test.getAge());
        // act
        int result = test.getAge();

        //assert
        Assertions.assertEquals(34, result);
    }

    @Test
    public void getMother(){
        //arrange
        // see @BeforeEach
        Person testMother =new Person("Ien", "nie", "minie", "female", 36);
        test.setMother(testMother);

        // act
        Person result = test.getMother();

        // assert
        Assertions.assertEquals(testMother, result);
    }

    @Test
    public void setMother(){
        //arrange
        // see @BeforeEach
        Person testMother =new Person("Ien", "nie", "minie", "female", 36);
        test.setMother(testMother);
        // act
        Person result = test.getMother();

        //assert
        Assertions.assertEquals(testMother, result);
    }

    @Test
    public void getFather(){

        //arrange
        // see BeforeEach
        Person testFather = new Person("Vader", "Darth", "male",60);
        test.setFather(testFather);

        // act

        Person result = test.getFather();

        // assert
        Assertions.assertEquals(testFather, result);
    }

    @Test
    public void setFather(){
        //arrange
        // see @BeforeEach
        Person testFather = new Person("Vader", "Darth", "male",60);
        test.setFather(testFather);
        // act
        Person result = test.getFather();

        //assert
        Assertions.assertEquals(testFather, result);
    }

    @Test
    public void getSiblings(){

        //arrange
        // see BeforeEach

        List<Person> testSiblings = new ArrayList<Person>();
        Person testSibling = new Person("BrotherJan", "Darth", "male",62);
        Person testSibling2 = new Person("BrotherJohn", "Darth", "male",58);
        testSiblings.add(testSibling );
        testSiblings.add(testSibling2);
        test.setSiblings(testSiblings);


        // act

        List<Person> result= test.getSiblings();

        // assert

        Assertions.assertEquals(testSiblings, result);


    }

    @Test
    public void setSiblings(){
        //arrange
        // see @BeforeEach
        List<Person> testSiblings = new ArrayList<Person>();
        Person testSibling = new Person("BrotherJan", "Darth", "male",62);
        Person testSibling2 = new Person("BrotherJohn", "Darth", "male",58);
        testSiblings.add(testSibling);
        testSiblings.add(testSibling2);
        test.setSiblings(testSiblings);

        // act
        List<Person> result = test.getSiblings();

        //assert
        Assertions.assertEquals(testSiblings, result);
    }

    @Test
    public void getChildren(){

        //arrange
        // see BeforeEach

        List<Person> testChildren= new ArrayList<Person>();
        Person testChild = new Person("SonOfAVader", "Darth", "male",12);
        Person testChild2 = new Person("DaughterOfAVader", "Darth", "female",8);
        testChildren.add(testChild);
        testChildren.add(testChild2);
        test.setChildren(testChildren);


        // act

        List<Person> result= test.getChildren();

        // assert

        Assertions.assertEquals(testChildren, result);

    }

    @Test
    public void setChildren(){
        //arrange
        // see @BeforeEach
        List<Person> testChildren= new ArrayList<Person>();
        Person testChild = new Person("SonOfAVader", "Darth", "male",12);
        Person testChild2 = new Person("DaughterOfAVader", "Darth", "female",8);
        testChildren.add(testChild);
        testChildren.add(testChild2);
        test.setChildren(testChildren);

        // act
        List<Person> result = test.getChildren();

        //assert
        Assertions.assertEquals(testChildren, result);
    }

    @Test
    public void getPets() {
        //arrange
        // see @BeforeEach
        List<Pet> testPets = new ArrayList<Pet>();
        Pet testPet = new Pet("Leo", 4, "cat");
        Pet testPet2 = new Pet("Tom", 8, "dog");
        testPets.add(testPet);
        testPets.add(testPet2);
        test.setPets(testPets);

        //act
        List<Pet> result = test.getPets();

        //assert
        Assertions.assertEquals(testPets, result);
    }

    @Test
    public void setPets() {
        //arrange
        // see @BeforeEach
        List<Pet> testPets = new ArrayList<Pet>();
        Pet testPet = new Pet("Leo", 4, "cat");
        Pet testPet2 = new Pet("Tom", 8, "dog");
        testPets.add(testPet);
        testPets.add(testPet2);
        test.setPets(testPets);

        //act
        List<Pet> result = test.getPets();

        //assert
        Assertions.assertEquals(testPets, result);
    }

    @Test
    public void addParents(){
        // arrange
        // see@beforeEach
        List<Person> testParents = new ArrayList<Person>();
        Person mother = new Person("Jane", "van ", "Tarzan", "female", 36);
        Person father = new Person ("Tarzan", "van", "deJungle", "male", 38);
        test.addParents(mother, father);
        testParents.add(mother);
        testParents.add(father);

        //act

    }


}
