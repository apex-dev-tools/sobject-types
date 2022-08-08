/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssetWarrantyChangeEvent extends SObject {
	public static SObjectType$<AssetWarrantyChangeEvent> SObjectType;
	public static SObjectFields$<AssetWarrantyChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public com.nawforce.runforce.System.String AssetWarrantyNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Date EndDate;
	public com.nawforce.runforce.System.String ExchangeType;
	public com.nawforce.runforce.System.String Exclusions;
	public Decimal ExpensesCovered;
	public Date ExpensesCoveredEndDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsTransferable;
	public Decimal LaborCovered;
	public Date LaborCoveredEndDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal PartsCovered;
	public Date PartsCoveredEndDate;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public com.nawforce.runforce.System.String ReplayId;
	public Date StartDate;
	public Id WarrantyTermId;
	public WarrantyTerm WarrantyTerm;
	public com.nawforce.runforce.System.String WarrantyType;

	public AssetWarrantyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetWarrantyChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
