package com.opencart.repository;

import com.opencart.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Date;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }
    public  static ArrayList <String>    setRegisterModel(){
        ArrayList <String> userData = new ArrayList <String>();

        userData.add( RandomStringUtils.randomAlphabetic(7));
        userData.add(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        return userData;
    }
    public static RegisterModel getRegisterModel() {

//        String password = RandomStringUtils.randomAlphabetic(7);

        ArrayList <String> data = setRegisterModel();
     String password = data.get(0);
        System.out.println(data.get(0));
        System.out.println(data.get(1));
     //   String password = "nosferatugamevampire@gmail.com";
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
            .email(data.get(1))
 //               .email("nosferatugamevampire@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();

    }

}
