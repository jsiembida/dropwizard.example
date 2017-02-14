package example;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;


public class EchoRequest {
    @Length(max = 64)
    private String message;

    public EchoRequest() {
    }

    public EchoRequest(String message) {
        this.message = message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
