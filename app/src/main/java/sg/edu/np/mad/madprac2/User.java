package sg.edu.np.mad.madprac2;

import android.os.Parcel;
import android.os.Parcelable;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;



    public User(String name, String description, int id, boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }
}
