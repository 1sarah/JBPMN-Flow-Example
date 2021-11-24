package com.company.bpmntester.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmntester.entity.User;

@UiController("bpmntester_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@LoadDataBeforeShow
public class UserBrowse extends StandardLookup<User> {
}