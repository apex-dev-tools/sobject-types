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
public class MemberPlan extends SObject {
	public static SObjectType$<MemberPlan> SObjectType;
	public static SObjectFields$<MemberPlan> Fields;

	public String Affiliation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String ExternalIdentifier;
	public String GroupNumber;
	public Id Id;
	public Boolean IsDeleted;
	public String IssuerNumber;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Date LastVerification;
	public Datetime LastViewedDate;
	public Id MemberId;
	public Account Member;
	public String MemberNumber;
	public String Name;
	public String Notes;
	public Id OwnerId;
	public Name Owner;
	public Id PayerId;
	public Account Payer;
	public Id PayerNetworkId;
	public HealthcarePayerNetwork PayerNetwork;
	public Id PlanId;
	public PurchaserPlan Plan;
	public String PrimaryCarePhysician;
	public String PrimarySecondaryTertiary;
	public String RelationshipToSubscriber;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id SubscriberId;
	public Account Subscriber;
	public Datetime SystemModstamp;
	public String VerificationStatus;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CarePreauth[] CarePreauths;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CoverageBenefit[] CoverageBenefits;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MemberPlanFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MemberPlanHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] MemberPlanNotes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public MemberPlanShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MemberPlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public MemberPlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
