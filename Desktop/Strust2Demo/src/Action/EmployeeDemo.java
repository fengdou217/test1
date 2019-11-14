package Action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results(value = {
        @Result(name = "success", location = "/jsp/success.jsp"),
        @Result(name = "input", location = "/index.jsp"),
})

public class EmployeeDemo extends ActionSupport {
    private String name;
    private Integer age;

    @Action(value = "/empinfo")
    public String execute() {
        return "success";
    }

    @RequiredFieldValidator(message = "The name is required")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @IntRangeFieldValidator(message = "Age must be in between 28 and 65", min = "29", max = "65")
    int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
