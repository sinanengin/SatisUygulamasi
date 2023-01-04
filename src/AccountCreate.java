import java.lang.reflect.Array;
import java.util.ArrayList;
public class AccountCreate {
    private String username;
    private String password;

    AccountCreate(){};
    AccountCreate(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    AccountCreate(String username)
    {
        this.username = username;
    }

    public boolean registerCheck(ArrayList<Account> accounts)
    {
        for(Account account : accounts)
        {
            if(account.getUsername().equals(username))
            {
                return true;
            }
        }
        return false;
    }

    public boolean loginCheck(ArrayList<Account> accounts)
    {
        for (Account account: accounts)
        {
            if(account.getUsername().equals(username) && account.getPassword().equals(password))
            {
                Static.loginId=account.getId();
                return true;
            }
        }
        return false;
    }

    public boolean loginAccountCheck(ArrayList<Account> accounts,int registerId)
    {
        if (registerId==0)
        {

            System.out.println("\nŞu Anda Mevcut Herhangi Bir Kayıt Yok. Lütfen Öncelikle Kayıt Olunuz...");
            try
            {
                System.out.println("Devam Etmek için ENTER Tuşuna Basabilirsiniz..");
                System.in.read();
            }
            catch (Exception e) {
                System.out.println("Bir Hata Oluştu...");
            }
            return true;
        }
        else {
            return false;
        }
    }

}