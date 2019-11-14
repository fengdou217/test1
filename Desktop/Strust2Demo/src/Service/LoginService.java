package Service;

import Dao.Impl.LoginDao;
import Dao.Impl.LoginImpl;
import Model.LoginModel;

public class LoginService {
    public String add(LoginModel model){
        LoginDao loginDao=new LoginImpl();
        int a=loginDao.add(model);
        String result="";
        if (a == 1) {
            result = "成功";
        } else {
            result = "失败";
        }
        return result;
    }
}
