public class Editor {
    public EventManager events;
    private String magazine;

    public Editor() {
        this.events = new EventManager("The New Yorker", "Spiegel", "Washington Post");
    }

    public void Publish(String magazineName) {
        events.notify(magazineName);
    }


}
