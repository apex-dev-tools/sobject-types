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
public class CoverageBenefitItemLimitChangeEvent extends SObject {
	public static SObjectType$<CoverageBenefitItemLimitChangeEvent> SObjectType;
	public static SObjectFields$<CoverageBenefitItemLimitChangeEvent> Fields;

	public String AllowedLimit;
	public Decimal AllowedQuantity;
	public Id AllowedQuantityUnitId;
	public UnitOfMeasure AllowedQuantityUnit;
	public String AppliedLimit;
	public Decimal AppliedQuantity;
	public Id AppliedQuantityUnitId;
	public UnitOfMeasure AppliedQuantityUnit;
	public Id CareLimitTypeId;
	public CareLimitType CareLimitType;
	public Object ChangeEventHeader;
	public Id CoverageBenefitItemId;
	public CoverageBenefitItem CoverageBenefitItem;
	public String CoverageLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LimitNotes;
	public String Name;
	public String NetworkType;
	public Decimal PriorityOrder;
	public String ReplayId;
	public String TermType;

	public CoverageBenefitItemLimitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemLimitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
