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
public class CareRequestExtensionChangeEvent extends SObject {
	public static SObjectType$<CareRequestExtensionChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestExtensionChangeEvent> Fields;

	public String AmbulanceTransportReason;
	public String AmbulanceTransportType;
	public Datetime AppealEffectuationDateTime;
	public String AuthorizationRefIdentifier;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public String CaseSubStatus;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public String DocumentAttachmentStatus;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Date HomeHealthCertificationEndDate;
	public Date HomeHealthCertificationStartDate;
	public Date HomeHealthStartDate;
	public Id Id;
	public String IndependentReviewDetermination;
	public Datetime IndependentReviewDeterminationDate;
	public Datetime IndependentReviewSubmissionDate;
	public Boolean IsIndependentReviewRequired;
	public Boolean IsMedicareCoverage;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NursingHomeResidentialStatus;
	public String PriorDischargeStatus;
	public String ReferenceCaseType;
	public Datetime ReopenDecisionDateTime;
	public String ReopenRequestOutcome;
	public String ReopenRequestType;
	public Id ReopenedById;
	public User ReopenedBy;
	public String ReplayId;
	public String RequestExtensionReason;
	public Datetime RequestExtnDecisionDateTime;
	public String RequestOutcome;
	public String RequestOutcomeDesc;
	public String RequestType;
	public Id RequestingProviderId;
	public HealthcareProvider RequestingProvider;
	public String ResolutionDescription;
	public String ServiceLevel;
	public String ServiceType;
	public Id ServicingFacilityId;
	public SObject ServicingFacility;
	public Id ServicingProviderId;
	public HealthcareProvider ServicingProvider;
	public Id SubscriberId;
	public Account Subscriber;
	public String SubscriberMemberIdentifier;
	public Decimal TotalAmbulanceTransportDistance;
	public Id UnitofMeasureId;
	public UnitOfMeasure UnitofMeasure;

	public CareRequestExtensionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExtensionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
