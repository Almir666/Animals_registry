public class Main {
    public static void main(String[] args) {

        Pets PetsList = new Pets();
        Pack_animal PackList = new Pack_animal();
        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimalClass());
        }

        App getApp = new App();
        getApp.start(PetsList, PackList);

        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }
        System.out.println();

        for (Horses cat : PackList.getListHorses()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }

        System.out.println();

        // String standartPetsComands[] = { "sit", "voice", "get paw" };
        // String standartPackComands[] = { "move", "stop" };

        // Cats testCat1 = new Cats("666", "01.01.2020", "Cat", standartPetsComands, "Satan");
        // Cats testCat2 = new Cats("02", "02.11.2022", "Cat", standartPetsComands, "Tom");
        // Cats testCat3 = new Cats("03", "12.03.2021", "Cat", standartPetsComands, "Artem");
        // Dogs testDog1 = new Dogs("04", "06.01.2019", "Dog", standartPetsComands, "Rex");
        // Dogs testDog2 = new Dogs("05", "01.01.2017", "Dog", standartPetsComands, "Lucky");
        // Horses testHorse = new Horses("01", "03.21.2018", "Horse", standartPetsComands, "Spirit");

        // allList.getAllAnimals().add(testCat1);
        // allList.getAllAnimals().add(testCat2);
        // allList.getAllAnimals().add(testCat3);
        // PetsList.getListCats().add(testCat1);
        // PetsList.getListCats().add(testCat2);
        // PetsList.getListCats().add(testCat3);

        // PetsList.getListDogs().add(testDog1);
        // PetsList.getListDogs().add(testDog2);

    }
}
