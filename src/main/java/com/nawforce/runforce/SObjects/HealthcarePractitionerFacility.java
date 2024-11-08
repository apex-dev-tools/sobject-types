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
public class HealthcarePractitionerFacility extends SObject {
	public static SObjectType$<HealthcarePractitionerFacility> SObjectType;
	public static SObjectFields$<HealthcarePractitionerFacility> Fields;

	public Id AccountId;
	public Account Account;
	public String AvailabilityExceptions;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String GenderRestriction;
	public Boolean Has24x7Service;
	public Id HealthcareFacilityId;
	public HealthcareFacility HealthcareFacility;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Integer HighestValidAge;
	public Id Id;
	public Date InitialStartDate;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsDirectoryPrint;
	public Boolean IsPrimaryCarePhysician;
	public Boolean IsPrimaryFacility;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LowestValidAge;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public Name Owner;
	public Id PractitionerId;
	public Contact Practitioner;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String SsaCountyCode;
	public Datetime SystemModstamp;
	public Date TerminationDate;
	public String TerminationReason;
	public Id TerminationRequestedById;
	public User TerminationRequestedBy;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClinicalDetectedIssueDetail[] CDetectedIssueMitigationAuthor;
	public CareProviderFacilitySpecialty[] CareProviderFacility_Specialties;
	public CareRequestDrug[] CareRequestDrugs;
	public ClinicalAlert[] ClinicalAlert_RaisedBy;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthcarePractitionerFacilityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcareProviderService[] HealthcareProviderGroup;
	public HealthcareFacilityNetwork[] Healthcare_Facility_Networks;
	public HealthcarePractitionerFacilityHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareRequestExtension[] ServicingFacilityCareRequestExtensions;
	public CareRequestItem[] ServicingFacilityCareRequestItems;
	public HealthcarePractitionerFacilityShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HealthcarePractitionerFacility clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePractitionerFacility clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePractitionerFacility clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePractitionerFacility clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePractitionerFacility clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
