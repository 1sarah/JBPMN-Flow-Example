package com.company.bpmntester.web.screens.transaction;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmntester.entity.Transaction;

@UiController("bpmntester_Transaction.browse")
@UiDescriptor("transaction-browse.xml")
@LookupComponent("transactionsTable")
@LoadDataBeforeShow
public class TransactionBrowse extends StandardLookup<Transaction> {
}