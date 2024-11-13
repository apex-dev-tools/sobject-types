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
public class LoanApplicant extends SObject {
	public static SObjectType$<LoanApplicant> SObjectType;
	public static SObjectFields$<LoanApplicant> Fields;

	public String ApplicantExtIdentifier;
	public String AsianRaceSubType;
	public String BorrowerType;
	public String CitizenshipStatus;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DependentCount;
	public String DependentsAge;
	public String EthnicitySubType;
	public String EthnicityType;
	public String GenderType;
	public Boolean HasMilitaryService;
	public Id Id;
	public Boolean IsActiveMilitary;
	public Boolean IsDeleted;
	public Boolean IsJointCredit;
	public Boolean IsSurvivingMilitarySpouse;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String MaritalStatus;
	public Integer MilitaryTourExpirationMonth;
	public Integer MilitaryTourExpirationYear;
	public String Name;
	public String OtherAsianRaceSubType;
	public String OtherEthnicitySubType;
	public String OtherPacIslandSubType;
	public Id OwnerId;
	public Name Owner;
	public String PacIslandSubType;
	public String PreferredLanguage;
	public String RaceType;
	public Datetime SystemModstamp;
	public String TribeName;
	public Boolean WasActiveMilitary;
	public Boolean WasNonActivatedService;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
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
	public LoanApplicantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicantHistory[] Histories;
	public LoanApplicantAddress[] LoanApplicantAddresses;
	public LoanApplicantAsset[] LoanApplicantAssetRelations;
	public LoanApplicantDeclaration[] LoanApplicantDeclarations;
	public LoanApplicantEmployment[] LoanApplicantEmployments;
	public LoanApplicantIncome[] LoanApplicantIncomes;
	public LoanApplicantLiability[] LoanApplicantLiabilityRelations;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public LoanApplicantShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicant clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
