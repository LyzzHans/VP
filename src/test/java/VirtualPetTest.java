import org.junit.jupiter.api.Test;
import virtual_pet.VirtualPet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {


    @Test
    public void shouldHaveADefaultThirstOf20() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        int actualPetThirst = underTest.getPetThirst();
        assertEquals(20, actualPetThirst);
    }

    @Test
    public void shouldHaveADefaultHungerOf30() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        int actualPetHunger = underTest.getPetHunger();
        assertEquals(30, actualPetHunger);
    }

    @Test
    public void shouldHaveADefaultHealthOf30() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        int actualPetHealth = underTest.getPetHealth();
        assertEquals(30, actualPetHealth);

    }

    @Test
    public void shouldHaveADefaultBoredomOf80() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        int actualPetBoredom = underTest.getPetBoredom();
        assertEquals(80, actualPetBoredom);
    }

    @Test
    public void feedVirtualPetShouldDecreaseHungerBy5() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        underTest.feed();
        int actualHunger = underTest.getPetHunger();
        assertEquals(25, actualHunger);

    }

    @Test
    public void waterVirtualPetShouldDecreaseThirstBy5() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        underTest.water();
        int actualPetThirst = underTest.getPetThirst();
        assertEquals(15, actualPetThirst);
    }
    @Test
    public void playWithVirtualPetShouldDecreaseBoredomBy20() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        underTest.play();
        int actualPetBoredom = underTest.getPetBoredom();
        assertEquals(60, actualPetBoredom);

    }
    @Test
    public void vetShouldIncreasePetHealthBy30() {
        VirtualPet underTest = new VirtualPet("Harry", "Cat");
        underTest.vet();
        int actualPetHealth = underTest.getPetHealth();
        assertEquals(60, actualPetHealth);
    }
}