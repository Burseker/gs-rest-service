package hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class Greeting {

    private final long id;
    private final String content;

    @JsonProperty("noMeaningTest")
    public final String subName;

    @JsonProperty("anotherNoMeaningTest")
    public final String strangeInfo;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        subName = "trololo";
        strangeInfo = "safdadfa";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
