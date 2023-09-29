package com.stackroute.oops;

import com.stackroute.oops.Animal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTests {

    private static final String INITIALIZE_OBJECT_MESSAGE = "Use the default constructor for proper initialization of object";
    private static final String SET_OBJECT_PROPERTIES_MESSAGE = "check the setters for proper assignment of property values";
    private static final String ANIMAL_DETAILS_MESSAGE = "details returned by getAnimalDetails method is not correct or not as per required format";
    private static final String EQUALS_HASHCODE_MESSAGE = "when two different objects with same properties are constructed,then equals method returns true and hash code of two objects are same";
    private static final String EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE = "when two different objects with different properties are constructed,then equals method returns false and hash code of two objects are not equal";

    private Animal animal;

    @BeforeEach
    public void setUp() {

        animal = new Animal();
    }

    @AfterEach
    public void tearDown() {

        animal = null;
    }

    @Test
    public void givenAnimalClassWhenCreateObjectUsingDefaultConstructorThenCheckNotNull() {

        Animal testAnimal = new Animal();
        assertNotNull(testAnimal, INITIALIZE_OBJECT_MESSAGE);
    }

    @Test
    public void givenAnimalObjectWhenPropertyValuesAreSetThenCheckIfTheyAreSet() {
        animal.setId(1);
        animal.setName("Elephant");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);

        assertEquals("Elephant", animal.getName(), SET_OBJECT_PROPERTIES_MESSAGE);
        assertEquals(400, animal.getAverageWeight(), SET_OBJECT_PROPERTIES_MESSAGE);
        assertEquals(4, animal.getNumberOfLegs(), SET_OBJECT_PROPERTIES_MESSAGE);
    }

    @Test
    public void givenAnimalObjectThenVerifyProperAnimalDetails() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var animalDetails = animal.getAnimalDetails();

        String expectedDetails = "Animal{Id=1, name='Camel', averageWeight=400.0,numberOfLegs=4}";
        final var regex = "//s+";
        assertEquals(expectedDetails.toLowerCase().replaceAll(regex, " "), animalDetails.toLowerCase().replaceAll(regex, " "), ANIMAL_DETAILS_MESSAGE);
    }


    @Test
    void givenAnimalObjectWhenTestEqualsHashCodeThenReturnTrue() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var secondAnimal = new Animal();

        secondAnimal.setId(1);
        secondAnimal.setName("Camel");
        secondAnimal.setAverageWeight(400);
        secondAnimal.setNumberOfLegs(4);

        assertTrue(animal.equals(secondAnimal), EQUALS_HASHCODE_MESSAGE);

        assertEquals(animal.hashCode(), secondAnimal.hashCode(), EQUALS_HASHCODE_MESSAGE);


    }

    @Test
    void givenAnimalObjectsWhenNameDifferThenEqualsHashCodeReturnsFalse() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var secondAnimal = new Animal();

        secondAnimal.setId(1);
        secondAnimal.setName("Lion");
        secondAnimal.setAverageWeight(400);
        secondAnimal.setNumberOfLegs(4);
        assertFalse(animal.equals(secondAnimal), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);

        assertNotEquals(animal.hashCode(), secondAnimal.hashCode(), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);


    }

    @Test
    void givenAnimalObjectsWhenTwoPropertiesDifferentThenEqualsHashCodeReturnsFalse() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var secondAnimal = new Animal();

        secondAnimal.setId(2);
        secondAnimal.setName("Lion");
        secondAnimal.setAverageWeight(400);
        secondAnimal.setNumberOfLegs(4);
        assertFalse(animal.equals(secondAnimal), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);

        assertNotEquals(animal.hashCode(), secondAnimal.hashCode(), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);


    }

    @Test
    void givenAnimalObjectsWhenThreePropertiesDifferentThenEqualsHashCodeReturnsFalse() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var secondAnimal = new Animal();

        secondAnimal.setId(2);
        secondAnimal.setName("Lion");
        secondAnimal.setAverageWeight(300);
        secondAnimal.setNumberOfLegs(4);
        assertFalse(animal.equals(secondAnimal), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);

        assertNotEquals(animal.hashCode(), secondAnimal.hashCode(), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);


    }

    @Test
    void givenAnimalObjectsWhenAllPropertiesDifferentThenEqualsHashCodeReturnsFalse() {
        animal.setId(1);
        animal.setName("Camel");
        animal.setAverageWeight(400);
        animal.setNumberOfLegs(4);
        var seaAnimal = new Animal();

        seaAnimal.setId(2);
        seaAnimal.setName("Octopus");
        seaAnimal.setAverageWeight(200);
        seaAnimal.setNumberOfLegs(20);
        assertFalse(animal.equals(seaAnimal), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);

        assertNotEquals(animal.hashCode(), seaAnimal.hashCode(), EQUALS_HASHCODE_NEGATIVE_SCENARIO_MESSAGE);


    }
}
