
public class Account {
    public String userName;
    private String password;
    private int time;

    private boolean isUnlocked=false;
    private boolean isTabletUnlocked=false;

    public Account(String userName , String password,int time){
        this.userName=userName;
        this.password=password;
        this.time = time;

    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
    public int getTime(){
        return time;
    }
    public void resetTime(){
        time=0;
    }

    public void setIsCRUnlocked(){
        isUnlocked=true;
    }
    public boolean getIsCRUnlocked(){
        return isUnlocked;
    }
    public void setIsTabletUnlocked(){
        isTabletUnlocked=true;
    }
    public boolean getIsTabletUnlocked(){
        return isTabletUnlocked;}

    public void reset(){
        isUnlocked=false;
        isTabletUnlocked=false;
    }

}
