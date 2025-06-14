//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("**********_Задача_№_1_*************");
        // Данные сотрудника
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        // Составление Ф.И.О.
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("**********_Задача_№_2_*************");
        String f =fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + f);

        System.out.println("**********_Задача_№_3_*************");
        String fullName1 = "Иванов Семён Семёнович";
        String s = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + s);
        }
    }
