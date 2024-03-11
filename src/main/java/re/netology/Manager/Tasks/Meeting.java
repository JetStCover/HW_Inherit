package re.netology.Manager.Tasks;

public class Meeting extends Task {

    private String topic;
    private String project;
    private String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.project = project;
        this.topic = topic;
        this.start = start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
