import java.util.Scanner;

public class Main {
    //СКАЖУ ЧЕСТНО, Я ЭТО ПЕРЕПИСАЛА У РЕБЯТ.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threat = 0;

        System.out.println("Мониторинг экологических рисков: ");
        System.out.println("Прошу ответить на вопросы, указывая уровень риска от 1(мин) до 10(макс)\n");

        System.out.print("Загрязнение воздуха - >  ");
        boolean airPollution = answerQuestion(scanner);

        System.out.print("Разрушение озонового слоя - >  ");
        boolean ozoneDepletion = answerQuestion(scanner);

        System.out.print("Загрязнения водных объектов - >  ");
        boolean pollutionOfWater = answerQuestion(scanner);

        System.out.print("Изменение климата - >  ");
        boolean climaticСhange = answerQuestion(scanner);

        System.out.print("Высокое загрязнение экосистемы химическими и токсичными веществами - >  ");
        boolean chemicalsToxicSub = answerQuestion(scanner);

        System.out.print("Увеличением парниковых газов? - >  ");
        boolean increaseGreenGases = answerQuestion(scanner);

        System.out.print("Высокий уровень загрязнения отходами - >  ");
        boolean wastePollution = answerQuestion(scanner);

        System.out.print("Природные ископаемые ресурсы истощены - >  ");
        boolean naturalResources = answerQuestion(scanner);

        System.out.print("Уменьшение плодородности растений - >  ");
        boolean reducedPlant = answerQuestion(scanner);

        System.out.print("Потеря биоразнообразия и живых организмов - >  ");
        boolean biodiversityDue = answerQuestion(scanner);
        System.out.println();

        boolean riskEco = airPollution || ozoneDepletion || climaticСhange || chemicalsToxicSub
                || wastePollution || naturalResources || reducedPlant || biodiversityDue ||
                pollutionOfWater || increaseGreenGases;

        System.out.println("Экологический риск: " + (riskEco ? "Опасность!!!" : "нет риска"));

    }

    public static boolean answerQuestion(Scanner scanner) {
        int risk = scanner.nextInt();

        if (risk <= 5) return false;
        return true;
    }
}