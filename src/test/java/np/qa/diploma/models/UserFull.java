package np.qa.diploma.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFull {
    private String id;
    private String title;
    private String firstName;
    private String lastName;
    private String registerDate;

}
