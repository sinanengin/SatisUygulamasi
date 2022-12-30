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

    public int loginId(ArrayList<Account> accounts)
    {
        for(Account account : accounts)
        {
            if(account.getUsername().equals(username)&&account.getPassword().equals(password))
            {
                return account.getId();
            }
        }
        return 0;
    }

    public boolean loginAccountCheck(ArrayList<Account> accounts,int registerId)
    {
        if (registerId==0)
        {
            System.out.println("** Şu Anda Mevcut Herhangi Bir Kayıt Yok. **\n");
            System.out.println("*** Lütfen Öncelikle Kayıt Olunuz. ***\n");
            return true;
        }
        else {
            return false;
        }
    }

}