public class Main {
    public static void main(String[] args) {
        Pets PetsList = new Pets();

        String standartPetsComands[] = { "sit", "voice", "get paw" };
        String standartPackComands[] = { "move", "stop" };

        Cats testCat1 = new Cats("666", "01.01.2020", "Cat", standartPetsComands, "Satan");
        Cats testCat2 = new Cats("02", "02.11.2022", "Cat", standartPetsComands, "Tom");
        Cats testCat3 = new Cats("03", "12.03.2021", "Cat", standartPetsComands, "Artem");
        Horses testHorse = new Horses("01", "03.21.2018", "Horse", standartPetsComands, "Spirit");

        PetsList.getListCats().add(testCat1);
        PetsList.getListCats().add(testCat2);
        PetsList.getListCats().add(testCat3);

        System.out.println(testCat1.animal_name);
        System.out.println(testCat1.getPersonal_name());
        System.out.println(testCat1.getAnimalClass());
        System.out.println(testCat1.getComands());
        for (Cats cat: PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " ");
        }
        System.out.println();
        System.out.println(testHorse.animal_name);
        System.out.println(testHorse.personal_name);
        System.out.println(testHorse.getAnimalClass());
    }
}
