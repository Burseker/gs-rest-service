package hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class Greeting {

    private final long id;
    private final String content;

    @JsonProperty("noMeaningTest")
    public final String subName;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        subName = "trololo";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
