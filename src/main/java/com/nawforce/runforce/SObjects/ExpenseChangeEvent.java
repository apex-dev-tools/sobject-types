/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExpenseChangeEvent extends SObject {
	public static SObjectType$<ExpenseChangeEvent> SObjectType;
	public static SObjectFields$<ExpenseChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Date ExpenseEndDate;
	public String ExpenseNumber;
	public Date ExpenseStartDate;
	public String ExpenseType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Decimal Quantity;
	public String ReplayId;
	public String Title;
	public Date TransactionDate;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;

	public ExpenseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpenseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
