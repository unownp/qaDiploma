package np.qa.diploma.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentData {
    private ArrayList<Comment> data;
    private Integer total;
    private Integer page;
    private Integer limit;
}
