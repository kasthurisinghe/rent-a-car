package lk.ijse.car_hire.entity.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class UserName {
//    the above @Embeddable name used because this is a coloumn but not an entity

    @Column(name = "first_name", nullable = false, length = 100)
    private String fistName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;
}
