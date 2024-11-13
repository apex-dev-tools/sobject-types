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
public class CareProgramEnrollee extends SObject {
	public static SObjectType$<CareProgramEnrollee> SObjectType;
	public static SObjectFields$<CareProgramEnrollee> Fields;

	public Id AccountId;
	public Account Account;
	public String BenefitCoverageType;
	public Id CareProgramId;
	public CareProgram CareProgram;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrolleeType;
	public Id EnrollmentLocationId;
	public ServiceTerritory EnrollmentLocation;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsPatientInLtrmCareFacility;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Datetime OptOutPeriodEndDateTime;
	public Datetime OptOutPeriodStartDateTime;
	public String OptOutReasonType;
	public Id OwnerId;
	public Name Owner;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public Applicant[] CareProgramEnrolleeApplicants;
	public CareRegisteredDevice[] CareProgramEnrollees;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_CareProgramEnrollee;
	public CareProgramEnrolleeProduct[] Care_Program_Enrollee_Products;
	public CareProgramEnrollmentCard[] Care_Program_Enrollment_Cards;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareProgramEnrolleeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareProgramEnrolleeHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public ServiceAppointment[] ServiceAppointments;
	public CareProgramEnrolleeShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareProgramEnrollee clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrollee clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrollee clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrollee clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrollee clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
