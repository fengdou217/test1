package Action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction  extends ActionSupport {
    public String execute() {
        System.out.println("inside action...");

        return "success";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
