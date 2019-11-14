package Action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() {

//        HttpServletRequest hsr = ServletActionContext.getRequest();
        //
//        String username = hsr.getParameter("username");
//        String password = hsr.getParameter("password");
//        LoginModel loginModel = new LoginModel();
//        loginModel.setUsername(username);
//        loginModel.setPassword(password);

//        LoginService loginService = new LoginService();
//        String result = loginService.add(loginModel);
//        ActionContext actionContext = ActionContext.getContext();
//        Map request = (Map) actionContext.get("request");
//        request.put("username", username);

//        result = loginService.add(loginModel);
//        if (result != null) {
//
//            ServletActionContext.getRequest().setAttribute("result", result);
            System.out.println(username);
            System.out.println(password);
//        }

        return "success";


    }
}


