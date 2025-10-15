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
public class CareObservationChangeEvent extends SObject {
	public static SObjectType$<CareObservationChangeEvent> SObjectType;
	public static SObjectFields$<CareObservationChangeEvent> Fields;

	public Id AdditionalCode1Id;
	public CodeSet AdditionalCode1;
	public Id AdditionalCode2Id;
	public CodeSet AdditionalCode2;
	public Id BasedOnId;
	public SObject BasedOn;
	public Id BaselineUnitId;
	public UnitOfMeasure BaselineUnit;
	public String BaselineValueText;
	public Id BodySiteId;
	public CodeSetBundle BodySite;
	public Id CaseId;
	public Case Case;
	public String Category;
	public Object ChangeEventHeader;
	public Id CodeId;
	public CodeSet Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DerivationSourceId;
	public SObject DerivationSource;
	public Id DeviceId;
	public Asset Device;
	public String Division;
	public Datetime EffectiveDateTime;
	public Id EncounterId;
	public ClinicalEncounter Encounter;
	public Datetime EndDateTime;
	public Id ExpectedValueId;
	public CareMetricTarget ExpectedValue;
	public Boolean HasMetExpectedValue;
	public Id Id;
	public Id IdentifierId;
	public Identifier Identifier;
	public Boolean IsMonitoredRemotely;
	public Boolean IsObserved;
	public Boolean IsOutcomePositive;
	public Datetime IssuedDateTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LowerBaselineValue;
	public Id MethodId;
	public CodeSetBundle Method;
	public String Name;
	public Decimal NumericValue;
	public Datetime ObservationEndTime;
	public Datetime ObservationStartTime;
	public String ObservationStatus;
	public Id ObservedSubjectId;
	public Account ObservedSubject;
	public Id ObservedValueCodeId;
	public CodeSetBundle ObservedValueCode;
	public Decimal ObservedValueDenominator;
	public Decimal ObservedValueNumerator;
	public String ObservedValueText;
	public String ObservedValueType;
	public Id ObservedValueUnitId;
	public UnitOfMeasure ObservedValueUnit;
	public Id ObserverId;
	public SObject Observer;
	public Id OwnerId;
	public User Owner;
	public Id PartOfId;
	public SObject PartOf;
	public Id PatientSpecimenId;
	public CodeSetBundle PatientSpecimen;
	public String ProcessingResult;
	public Id RelatedObservationId;
	public CareObservation RelatedObservation;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;
	public Decimal UpperBaselineValue;
	public String ValueInterpretation;

	public CareObservationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareObservationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
