import java.util.Scanner;

public class App {
    public void start(Pets petList, Pack_animal packList) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "\n1: Завести новое животное\n2: Показать списко животных\n3: Посмотреть какие команды знает животное\n4: Обучить новой команде\n0: Выход");
            String key = in.next();
            switch (key) {
                case "0":
                    return;
                case "1":
                    System.out.println(
                            "К какому классу относится животное?(выберите нужную цифру)\n1: Домашний питомец\n2: Вьючное животное\n0: предыдущее меню");
                    String key2 = in.next();
                    switch (key2) {
                        case "0":
                            break;
                        case "1":
                            System.out.println(
                                    "Выберите к какому виду относится питомец: \n1:Кошка \n2:Собака \n3:Хомяк \n0:Выход \n");
                            String keyPet = in.next();
                            switch (keyPet) {
                                case "0":
                                    break;
                                case "1":
                                    String standartCatComands[] = {};
                                    System.out.println("Присвойте id питомцу: \n");
                                    String idCat = in.next();
                                    System.out.println("Дата рождения: \n");
                                    String birthCat = in.next();
                                    System.out.println("Введите имя питомца: \n");
                                    String nameCat = in.next();
                                    Cats tempCat = new Cats(idCat, birthCat, "Кошка", standartCatComands, nameCat);
                                    petList.getListCats().add(tempCat);
                                    break;
                                case "2":
                                    String standartDogComands[] = { "Voice", "Sit", "Get paw" };
                                    System.out.println("Присвойте id питомцу: \n");
                                    String idDog = in.next();
                                    System.out.println("Дата рождения: \n");
                                    String birthDog = in.next();
                                    System.out.println("Введите имя питомца: \n");
                                    String nameDog = in.next();
                                    Dogs tempDog = new Dogs(idDog, birthDog, "Собака", standartDogComands, nameDog);
                                    petList.getListDogs().add(tempDog);
                                    break;
                                case "3":
                                    String standartHamsterComands[] = {};
                                    System.out.println("Присвойте id питомцу: \n");
                                    String idH = in.next();
                                    System.out.println("Дата рождения: \n");
                                    String birthH = in.next();
                                    System.out.println("Введите имя питомца: \n");
                                    String nameH = in.next();
                                    Hamsters tempH = new Hamsters(idH, birthH, "Хомяк", standartHamsterComands, nameH);
                                    petList.getListHamsters().add(tempH);
                                    break;
                                default:
                                    System.out.println("Введите корректное число: от 0 до 3");
                                    break;
                            }
                        case "2":
                            System.out.println(
                                    "Выберите к какому виду относится вьючное животное: \n1:Лошадь \n2:Осёл \n0:Выход \n");
                            String keyPack = in.next();
                            switch (keyPack) {
                                case "0":
                                    break;
                                case "1":
                                    String standartHorseComands[] = { "Move", "Stop" };
                                    System.out.println("Присвойте id животному: \n");
                                    String idHorse = in.next();
                                    System.out.println("Дата рождения: \n");
                                    String birthHorse = in.next();
                                    System.out.println("Введите имя животного: \n");
                                    String nameHorse = in.next();
                                    Horses tempHorse = new Horses(idHorse, birthHorse, "Лошадь", standartHorseComands,
                                            nameHorse);
                                    packList.getListHorses().add(tempHorse);
                                    break;
                                case "2":
                                    String standartDonkeyComands[] = { "Move", "Stop" };
                                    System.out.println("Присвойте id животному: \n");
                                    String idDonkey = in.next();
                                    System.out.println("Дата рождения: \n");
                                    String birthDonkey = in.next();
                                    System.out.println("Введите имя животного: \n");
                                    String nameDonkey = in.next();
                                    Donkeys tempDonkey = new Donkeys(idDonkey, birthDonkey, "Осёл",
                                            standartDonkeyComands,
                                            nameDonkey);
                                    packList.getListDonkeys().add(tempDonkey);
                                    break;
                                default:
                                    System.out.println("Введите корректную цифру от 0 до 2");
                                    break;
                            }
                        default:
                            System.out.println("Введите корректную цифру от 0 до 3");
                            break;
                    }
                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }
}