public class LogOpenListener implements EventListener {
    private String mailBox;

    public LogOpenListener(String mailBox) {
    this.mailBox = mailBox;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Email to " + mailBox + ": The new " + eventType + " has appeared!");
    }
}