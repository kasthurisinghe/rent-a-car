package lk.ijse.car_hire.entity;





import lk.ijse.car_hire.entity.embedded.UserName;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "userAdmin")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity {
//    i re-named table name as '@Table(name = "user")' but , i had an error because user is a reserved keyword in the database


    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private UserName fulName;

    @Column(name = "nic", nullable = false)
    private String nic;

    @Column(name = "userPassword", nullable = false)
    private String userPassword;

    private String email;

    @Column(name = "username", nullable = false)
    private String user_name;
}
