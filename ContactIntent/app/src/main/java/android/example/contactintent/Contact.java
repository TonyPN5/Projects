package android.example.contactintent;
import java.util.Date;
import java.util.UUID;


public class Contact {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Contact(){
        mId = UUID.randomUUID();
        mDate = new Date();

    }
    public UUID getID(){
        return mId;

    }
    public String getTitle(){
        return mTitle;

    }
    public void setTitle(String title){
        mTitle = title;

    }
    public Date getDate(){
        return mDate

    }
    public void setDate(Date date){
        mDate = date;

    }



}
