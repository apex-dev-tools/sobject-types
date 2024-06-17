/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareRequestItemChangeEvent extends SObject {
	public static SObjectType$<CareRequestItemChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestItemChangeEvent> Fields;

	public Decimal AmbulanceTransportDistance;
	public String AmbulanceTransportReason;
	public String AmbulanceTransportType;
	public Integer ApprovedLengthOfStay;
	public String ApprovedLevelOfCare;
	public Integer ApprovedQuantity;
	public Date ApprovedServiceEndDate;
	public Date ApprovedServiceStartDate;
	public String AuthApprovalIdentifier;
	public String AuthorizationRefIdentifier;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public Object ChangeEventHeader;
	public String ClinicalDetermination;
	public String ClinicalDeterminationNotes;
	public Id ClinicalDeterminationReasonId;
	public CodeSet ClinicalDeterminationReason;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public String CodeDescription;
	public String CodeType;
	public String CodeTypeIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer CumulativeLengthOfStay;
	public String CurrencyIsoCode;
	public String CurrentLevelOfCare;
	public Datetime DecisionDate;
	public String DeniedLevelOfCare;
	public Integer DeniedQuantity;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public String FreeFormProcedureDescription;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ModifiedCodeDescription;
	public String ModifiedCodeIdentifier;
	public String ModifiedCodeType;
	public String ModifiedCodeTypeIdentifier;
	public Date ModifiedEffectiveDate;
	public Date ModifiedEndDate;
	public String ModifiedLevelOfCare;
	public String ModifiedModifier;
	public String ModifiedModifierDescription;
	public Id ModifiedProcedureCodeId;
	public HealthCareProcedure ModifiedProcedureCode;
	public Id ModifiedProcedureCodeSetId;
	public SObject ModifiedProcedureCodeSet;
	public Integer ModifiedQuantity;
	public String Modifier;
	public String Modifier2;
	public String Modifier2Description;
	public String Modifier3;
	public String Modifier3Description;
	public String Modifier4;
	public String Modifier4Description;
	public Id ModifierCodeSetId;
	public SObject ModifierCodeSet;
	public String ModifierDescription;
	public String Name;
	public String Priority;
	public Id ProcedureCodeId;
	public HealthCareProcedure ProcedureCode;
	public Id ProcedureCodeSetId;
	public SObject ProcedureCodeSet;
	public Integer Quantity;
	public String QuantityType;
	public Id ReasonCodeId;
	public SObject ReasonCode;
	public String ReplayId;
	public String RequestType;
	public Integer RequestedLengthOfStay;
	public String RequestedLevelOfCare;
	public Date RequestedServiceEndDate;
	public Date RequestedServiceStartDate;
	public String ServiceCategory;
	public String ServiceCategoryCode;
	public Id ServicingFacilityId;
	public SObject ServicingFacility;
	public Id ServicingProviderId;
	public HealthcareProvider ServicingProvider;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public String StatusReason;
	public Id TransportLocationId;
	public Account TransportLocation;

	public CareRequestItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
