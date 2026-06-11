/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ClinicalServiceRequestChangeEvent extends SObject {
	public static SObjectType$<ClinicalServiceRequestChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalServiceRequestChangeEvent> Fields;

	public Id BodySiteId;
	public CodeSetBundle BodySite;
	public Id CaseId;
	public Case Case;
	public Id CategoryId;
	public CodeSetBundle Category;
	public Object ChangeEventHeader;
	public Id ConditionId;
	public HealthCondition Condition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DateSigned;
	public Id DiagnosticReportId;
	public ClinicalEncounterDiagnosis DiagnosticReport;
	public String Division;
	public Id EncounterId;
	public ClinicalEncounter Encounter;
	public Datetime EndDate;
	public Id FacilityCodeId;
	public CodeSetBundle FacilityCode;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Boolean HasPrerequisites;
	public Id Id;
	public Boolean IsAccepted;
	public Boolean IsIgnored;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ObservationId;
	public CareObservation Observation;
	public Id OrchestrationInstanceId;
	public FlowOrchestrationInstance OrchestrationInstance;
	public Id OriginalRequestId;
	public ClinicalServiceRequest OriginalRequest;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public String PatientInstruction;
	public Id PerformerId;
	public SObject Performer;
	public Id PerformerTypeId;
	public CodeSetBundle PerformerType;
	public Id PrerequisiteCodeId;
	public CodeSetBundle PrerequisiteCode;
	public String Priority;
	public Decimal QuantityDenominator;
	public Decimal QuantityNumerator;
	public Id QuantityNumeratorUnitId;
	public UnitOfMeasure QuantityNumeratorUnit;
	public String QuantityType;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Decimal ReferralScore;
	public String ReplayId;
	public Id RequestCodeId;
	public CodeSetBundle RequestCode;
	public Id RequesterId;
	public SObject Requester;
	public Id ServiceRequestGroupIdentifierId;
	public Identifier ServiceRequestGroupIdentifier;
	public String SourceChannel;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDate;
	public String Status;
	public String StatusReason;
	public String Type;

	public ClinicalServiceRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
