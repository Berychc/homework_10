public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();

    } public static void task1() {
        String firstname = "Ivan"; // — для хранения имени.
        String middleName = "Ivanovich"; // — для хранения отчества.
        String lastName = "Ivanov"; // — для хранения фамилии.
        String fullName = firstname + " " + middleName + " " + lastName;; // — для хранения Ф. И. О.
        System.out.printf("Ф.И.О. сотрудника - %s",fullName);

    } public static void task2() {
        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName.toUpperCase());

    } public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s",fullName);
    }
}