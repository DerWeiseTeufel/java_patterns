public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Email to " + email + ": The new " + eventType + " has appeared!");
    }
}
