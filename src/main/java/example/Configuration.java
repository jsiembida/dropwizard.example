package example;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;


public class Configuration extends io.dropwizard.Configuration {
    @NotEmpty
    private String parameter = "Some Value";

    @JsonProperty
    public String getParameter() {
        return parameter;
    }

    @JsonProperty
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
