package com.opencart.repository;




import com.opencart.datamodel.LoginModel;
import com.opencart.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        String password = RandomStringUtils.randomAlphabetic(7);
        return LoginModel.getBuilder()
                .email(registerModel.getEmail())
                .password(registerModel.getPassword())
               // .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                //.passwordConfirm(password)
                .build();
    }
}
