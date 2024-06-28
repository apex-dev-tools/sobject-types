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
public class AssetWarrantyChangeEvent extends SObject {
	public static SObjectType$<AssetWarrantyChangeEvent> SObjectType;
	public static SObjectFields$<AssetWarrantyChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public String AssetWarrantyNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Date EndDate;
	public String ExchangeType;
	public String Exclusions;
	public Decimal ExpensesCovered;
	public Date ExpensesCoveredEndDate;
	public Id Id;
	public Boolean IsTransferable;
	public Decimal LaborCovered;
	public Date LaborCoveredEndDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal PartsCovered;
	public Date PartsCoveredEndDate;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public String ReplayId;
	public Date StartDate;
	public Id WarrantyTermId;
	public WarrantyTerm WarrantyTerm;
	public String WarrantyType;

	public AssetWarrantyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
