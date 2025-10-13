/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AntiCorruptionInitSumChangeEvent extends SObject {
	public static SObjectType$<AntiCorruptionInitSumChangeEvent> SObjectType;
	public static SObjectFields$<AntiCorruptionInitSumChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public String EmployeeType;
	public Id Id;
	public String InitiativeType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String RecipientCategory;
	public Decimal RecipientCount;
	public Decimal RecipientPercentage;
	public String Region;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public AntiCorruptionInitSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AntiCorruptionInitSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AntiCorruptionInitSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AntiCorruptionInitSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AntiCorruptionInitSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
