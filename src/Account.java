public class Account {
    private int id;
    private String username;
    private String password;

    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public int getId(){ return id; }

    public void SetUsername(String username){ this.username = username; }
    public void SetPassword(String password){ this.password = password; }
    public void SetId(int id){ this.id = id; }

}
