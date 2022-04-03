package np.qa.diploma.models;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
//данный класс для описания моделей комментов/постов от юзеров.
//не путать с методом post
public class Post {

    String id;
    //string(length: 6-50, preview only)
    String text;
    String image;
    Integer likes;
    ArrayList<String> tags;
    String publishDate;
    User owner;

}
