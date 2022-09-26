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
public class TenantUsageEntitlement extends SObject {
	public static SObjectType$<TenantUsageEntitlement> SObjectType;
	public static SObjectFields$<TenantUsageEntitlement> Fields;

	public Decimal AmountUsed;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CurrentAmountAllowed;
	public Date EndDate;
	public String Frequency;
	public Boolean HasRollover;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPersistentResource;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Decimal OverageGrace;
	public String ResourceGroupKey;
	public String Setting;
	public Date StartDate;
	public Datetime SystemModstamp;
	public Datetime UsageDate;

	public TenantUsageEntitlement clone$() {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageEntitlement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
