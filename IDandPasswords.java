package CSE215_Project;

import java.util.HashMap;

public class IDandPasswords {
    //Signup_Page signup = new Signup_Page(userid,password);

    static HashMap<String, String> logininfo = new HashMap<String, String>();
    String userid;
    String password;

    public IDandPasswords(String userid, String password) {
        this.userid = userid;
        this.password = password;
        logininfo.put("Alindo", "pizza");
        logininfo.put("Saikat", "PASSWORD");
        logininfo.put("Safat", "abc123");
        logininfo.put("Muntasir", "pizza");
        logininfo.put("", "PASSWORD");
        logininfo.put("Meher", "abc123");
        logininfo.put("Sayed", "pizza");
        logininfo.put("Ivy", "PASSWORD");
        logininfo.put("Minhaj", "abc123");
        logininfo.put("Mim", "pizza");
        logininfo.put("Sharika", "PASSWORD");
        logininfo.put("Shafin", "abc123");
        logininfo.put("Shafkat", "pizza");
        logininfo.put("Marjan", "PASSWORD");
        logininfo.put("Samota", "abc123");
        logininfo.put("Bahota", "pizza");
        logininfo.put("Ivana", "PASSWORD");
        logininfo.put("Neha", "abc123");
        logininfo.put("Nuriva", "pizza");
        logininfo.put("Tahmid", "PASSWORD");
        logininfo.put("Mehedi", "abc123");
        //logininfo = signup.info;
        logininfo.put(userid, password);
    }

    public HashMap<String, String> getLoginInfo() {
        return logininfo;
    }
}