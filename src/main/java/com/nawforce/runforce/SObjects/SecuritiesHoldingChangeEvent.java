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
public class SecuritiesHoldingChangeEvent extends SObject {
	public static SObjectType$<SecuritiesHoldingChangeEvent> SObjectType;
	public static SObjectFields$<SecuritiesHoldingChangeEvent> Fields;

	public String AssetCategory;
	public String AssetCategoryName;
	public String AssetClass;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal GainLoss;
	public Id HouseholdId;
	public Account Household;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Date InvestmentEndDate;
	public Date InvestmentStartDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastUpdated;
	public Decimal MarketValue;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PercentChange;
	public Decimal Price;
	public Id PrimaryOwnerId;
	public Account PrimaryOwner;
	public Decimal PurchasePrice;
	public String ReplayId;
	public String Sector;
	public Decimal Shares;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public SecuritiesHoldingChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHoldingChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHoldingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHoldingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHoldingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
