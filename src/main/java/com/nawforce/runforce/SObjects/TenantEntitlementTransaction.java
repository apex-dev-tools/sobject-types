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
public class TenantEntitlementTransaction extends SObject {
	public static SObjectType$<TenantEntitlementTransaction> SObjectType;
	public static SObjectFields$<TenantEntitlementTransaction> Fields;

	public String BusinessEnvType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDate;
	public String EntitlementCardDefDevlName;
	public String EntitlementTransactionSubType;
	public String EntitlementTransactionType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MgmtEntitlementTrxn;
	public String MgmtOrgContract;
	public String MgmtOrgEntitlementSchedule;
	public String MgmtOrgEntitlementTransaction;
	public Id MgmtOrgId;
	public Organization MgmtOrg;
	public String MgmtOrgOrder;
	public String MgmtOrgOrderItem;
	public String MgmtOrgRelatedEntitlementTrxn;
	public Decimal Multiplier;
	public Decimal Quantity;
	public Decimal RawQuantity;
	public Id RelatedTntEntitlementTrxnId;
	public TenantEntitlementTransaction RelatedTntEntitlementTrxn;
	public Datetime StartDate;
	public Datetime SystemModstamp;
	public Decimal Unit;
	public String UsageSubType0;
	public String UsageSubType1;
	public String UsageSubType2;
	public String UsageTypeDef;

	public TenantEntitlementTransaction[] RelatedTntEntitlementTrxns;

	public TenantEntitlementTransaction clone$() {throw new java.lang.UnsupportedOperationException();}
	public TenantEntitlementTransaction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TenantEntitlementTransaction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TenantEntitlementTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TenantEntitlementTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
