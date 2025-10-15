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
public class EconomicPerformanceSumChangeEvent extends SObject {
	public static SObjectType$<EconomicPerformanceSumChangeEvent> SObjectType;
	public static SObjectFields$<EconomicPerformanceSumChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Market;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PerformanceCategory;
	public String PerformanceType;
	public String Region;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
	public Decimal TotalAmount;

	public EconomicPerformanceSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EconomicPerformanceSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EconomicPerformanceSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EconomicPerformanceSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EconomicPerformanceSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
