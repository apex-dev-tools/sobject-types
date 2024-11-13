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
public class FinancialPlanChangeEvent extends SObject {
	public static SObjectType$<FinancialPlanChangeEvent> SObjectType;
	public static SObjectFields$<FinancialPlanChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal EstimatedSuccessPercent;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystemIdentifier;
	public Date StartDate;
	public String Status;
	public String Type;

	public FinancialPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
