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
public class CareObservationComponentChangeEvent extends SObject {
	public static SObjectType$<CareObservationComponentChangeEvent> SObjectType;
	public static SObjectFields$<CareObservationComponentChangeEvent> Fields;

	public Id BaselineUnitId;
	public UnitOfMeasure BaselineUnit;
	public String BaselineValueText;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public Object ChangeEventHeader;
	public Id ComponentTypeCodeId;
	public CodeSetBundle ComponentTypeCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Boolean IsObserved;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LowerBaselineValue;
	public String MissingDataReason;
	public String Name;
	public Decimal NumericValue;
	public Datetime ObservationEndDateTime;
	public Datetime ObservationStartDateTime;
	public Id ObservedValueCodeId;
	public CodeSetBundle ObservedValueCode;
	public Decimal ObservedValueDenominator;
	public Decimal ObservedValueNumerator;
	public String ObservedValueText;
	public Id ObservedValueUnitId;
	public UnitOfMeasure ObservedValueUnit;
	public String ReplayId;
	public Decimal UpperBaselineValue;
	public String ValueInterpretation;
	public String ValueType;

	public CareObservationComponentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
