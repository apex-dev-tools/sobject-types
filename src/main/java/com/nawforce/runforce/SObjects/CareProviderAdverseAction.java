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
public class CareProviderAdverseAction extends SObject {
	public static SObjectType$<CareProviderAdverseAction> SObjectType;
	public static SObjectFields$<CareProviderAdverseAction> Fields;

	public Id AccountId;
	public Account Account;
	public Id AccreditationId;
	public Accreditation Accreditation;
	public Date ActionIssueDate;
	public String ActionType;
	public Id BoardCertificationId;
	public BoardCertification BoardCertification;
	public Id BusinessLicenseId;
	public BusinessLicense BusinessLicense;
	public String CaseNumber;
	public String CourtSentence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Date IncidentDate;
	public Date IncidentReportedDate;
	public String InsurancePolicyNumber;
	public String InsuranceProviderName;
	public Boolean IsDeleted;
	public String Jurisdiction;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PenaltyAmount;
	public Id PractitionerId;
	public Contact Practitioner;
	public String RegulatoryBody;
	public String RegulatoryBodyType;
	public String ReportingEntity;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareProviderAdverseActionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareProviderAdverseActionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareProviderAdverseActionShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareProviderAdverseAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderAdverseAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
