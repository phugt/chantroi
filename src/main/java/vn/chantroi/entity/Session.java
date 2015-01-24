package vn.chantroi.entity;

import java.io.Serializable;
import vn.chantroi.entity.db.User;

/**
 *
 * @author phugt
 */
public class Session implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
