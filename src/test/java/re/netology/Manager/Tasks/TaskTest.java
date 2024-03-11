package re.netology.Manager.Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void trueSimTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвон");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void falseSimTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("позвон");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void trueEpicTask() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(43, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void falseEpicTask() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(43, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Сметана");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void trueMeetingTaskTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void trueMeetingTaskProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = true;
        boolean actual = meeting.matches("Нето");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void trueMeetingTaskStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = false;
        boolean actual = meeting.matches("обед");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nonTask() {
        Task task = new Task(1);

        boolean expected = false;
        boolean actual = task.matches("1");

        Assertions.assertEquals(expected, actual);
    }
}