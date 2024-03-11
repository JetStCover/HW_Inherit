package re.netology.Manager.Tasks;
import java.util.Objects;
public class Task {
    protected int id;
    public Task(int id) {
        this.id = id;
    }
    public boolean matches(String query) {
        return false;
    }
}