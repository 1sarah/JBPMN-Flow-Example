package com.company.bpmntester.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmntester.entity.User;

@UiController("bpmntester_User.edit")
@UiDescriptor("user-edit.xml")
@EditedEntityContainer("userDc")
@LoadDataBeforeShow
public class UserEdit extends StandardEditor<User> {
}