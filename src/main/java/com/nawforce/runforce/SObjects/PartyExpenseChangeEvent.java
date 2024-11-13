/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PartyExpenseChangeEvent extends SObject {
	public static SObjectType$<PartyExpenseChangeEvent> SObjectType;
	public static SObjectFields$<PartyExpenseChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsSelfPaid;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PartyId;
	public SObject Party;
	public Id PayeeId;
	public SObject Payee;
	public Id PayerId;
	public SObject Payer;
	public String RecurrenceInterval;
	public String ReplayId;
	public Datetime StartDateTime;
	public String Status;
	public Decimal TotalAmount;
	public String Type;
	public String UsageType;

	public PartyExpenseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyExpenseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyExpenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
