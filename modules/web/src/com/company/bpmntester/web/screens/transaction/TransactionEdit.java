package com.company.bpmntester.web.screens.transaction;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmntester.entity.Transaction;

@UiController("bpmntester_Transaction.edit")
@UiDescriptor("transaction-edit.xml")
@EditedEntityContainer("transactionDc")
@LoadDataBeforeShow
public class TransactionEdit extends StandardEditor<Transaction> {
}