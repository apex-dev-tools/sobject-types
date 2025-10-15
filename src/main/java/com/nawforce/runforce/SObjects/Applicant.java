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
public class Applicant extends SObject {
	public static SObjectType$<Applicant> SObjectType;
	public static SObjectFields$<Applicant> Fields;

	public Id AccountId;
	public Account Account;
	public Id ApplicationFormId;
	public ApplicationForm ApplicationForm;
	public Date BirthDate;
	public String BusinessEntityName;
	public Id BusinessEntityPrimCtctId;
	public Name BusinessEntityPrimCtct;
	public String BusinessEntityType;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Email;
	public String FirstName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MiddleName;
	public String Name;
	public Id PartyProfileId;
	public PartyProfile PartyProfile;
	public String Phone;
	public String PhoneType;
	public String Role;
	public String Salutation;
	public String Stage;
	public String Suffix;
	public Datetime SystemModstamp;
	public String Type;
	public String UniqueReferenceNumber;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Applicant[] BusinessContactApplicants;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public DocumentChecklistItem[] DocumentChecklistWho;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApplicantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ApplicantHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestPertainsTo;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PartyExpense[] PartyExpenseParty;
	public PartyFinancialAsset[] PartyFinAssetParty;
	public PartyIncome[] PartyIncomes;
	public PersonEmployment[] PersonEmploymentDetails;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Applicant clone$() {throw new java.lang.UnsupportedOperationException();}
	public Applicant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Applicant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Applicant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Applicant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
