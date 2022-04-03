package np.qa.diploma.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {
    String id;
    //string(length: 6-50, preview only)
    String message;
    String post;
    String publishDate;
    User owner;

}
