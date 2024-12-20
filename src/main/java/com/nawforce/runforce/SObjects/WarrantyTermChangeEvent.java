/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WarrantyTermChangeEvent extends SObject {
	public static SObjectType$<WarrantyTermChangeEvent> SObjectType;
	public static SObjectFields$<WarrantyTermChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String EffectiveStartDate;
	public String ExchangeType;
	public String Exclusions;
	public Decimal ExpensesCovered;
	public Integer ExpensesCoveredDuration;
	public String ExpensesCoveredUnitOfTime;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsTransferable;
	public Decimal LaborCovered;
	public Integer LaborCoveredDuration;
	public String LaborCoveredUnitOfTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Decimal PartsCovered;
	public Integer PartsCoveredDuration;
	public String PartsCoveredUnitOfTime;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public String ReplayId;
	public Integer WarrantyDuration;
	public String WarrantyTermName;
	public String WarrantyType;
	public String WarrantyUnitOfTime;

	public WarrantyTermChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTermChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
