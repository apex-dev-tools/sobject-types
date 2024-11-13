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
public class CareMetricTargetChangeEvent extends SObject {
	public static SObjectType$<CareMetricTargetChangeEvent> SObjectType;
	public static SObjectFields$<CareMetricTargetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CodeId;
	public CodeSet Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DetailRatioDenominator;
	public Decimal DetailRatioNumerator;
	public Id DetailRatioUnitId;
	public UnitOfMeasure DetailRatioUnit;
	public String DetailString;
	public Decimal DueDuration;
	public Id DueDurationUnitId;
	public UnitOfMeasure DueDurationUnit;
	public Date EndDate;
	public Id Id;
	public Boolean IsOutcomePositive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LowerLimit;
	public Id MeasureCodeId;
	public SObject MeasureCode;
	public String Name;
	public Decimal NumericValue;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public String ReplayId;
	public Date StartDate;
	public String TargetedOutcome;
	public String Type;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;
	public Decimal UpperLimit;

	public CareMetricTargetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTargetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
