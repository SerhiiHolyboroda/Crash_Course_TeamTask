package com.opencart.repository;

import com.opencart.datamodel.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {

    private EditAccountModelRepository() {
    }

    public static EditAccountModel getEditAccountModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return EditAccountModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .build();
    }
}
