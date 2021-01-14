package com.opencart.repository;




import com.opencart.datamodel.LoginModel;
import com.opencart.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

import static com.opencart.repository.RegisterModelRepository.setRegisterModel;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
//        ArrayList<String> data = setRegisterModel();
//        System.out.println(data.get(0));
//        System.out.println(data.get(1));
  //  String password = data.get(0);
     String password = "nosferatugamevampire@gmail.com";
        return LoginModel.getBuilder()
               // .email(data.get(1))
  //          .email(data.get(1))
           .email("nosferatugamevampire@gmail.com")
                .password(password)
                .passwordConfirm(password)
                .build();
    }
}

