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
public class WarrantyTermChangeEvent extends SObject {
	public static SObjectType$<WarrantyTermChangeEvent> SObjectType;
	public static SObjectFields$<WarrantyTermChangeEvent> Fields;

	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String EffectiveStartDate;
	public com.nawforce.runforce.System.String ExchangeType;
	public com.nawforce.runforce.System.String Exclusions;
	public Decimal ExpensesCovered;
	public com.nawforce.runforce.System.Integer ExpensesCoveredDuration;
	public com.nawforce.runforce.System.String ExpensesCoveredUnitOfTime;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsTransferable;
	public Decimal LaborCovered;
	public com.nawforce.runforce.System.Integer LaborCoveredDuration;
	public com.nawforce.runforce.System.String LaborCoveredUnitOfTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Decimal PartsCovered;
	public com.nawforce.runforce.System.Integer PartsCoveredDuration;
	public com.nawforce.runforce.System.String PartsCoveredUnitOfTime;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.Integer WarrantyDuration;
	public com.nawforce.runforce.System.String WarrantyTermName;
	public com.nawforce.runforce.System.String WarrantyType;
	public com.nawforce.runforce.System.String WarrantyUnitOfTime;

	public WarrantyTermChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
