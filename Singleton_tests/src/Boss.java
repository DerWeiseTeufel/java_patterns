public class Boss {
    private static Boss Instance;
    public String Name;
    private int Salary;
    private Boss(String name, int Salary){
        this.Name = name;
        this.Salary = Salary;
    };
    public static Boss getInstance(){
        if(Instance == null){
            Instance = new Boss("John", 100000);
        }
        return Instance;
    }

    public String canIgetPayraise(String employee){
        return ("No payrise when I am the boss, " + employee + "! DENIED.");
    }
}
