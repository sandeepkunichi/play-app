package models;

import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class User extends Model {

    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    public static Finder<Long, User> find = new Finder<Long,User>(User.class);
}