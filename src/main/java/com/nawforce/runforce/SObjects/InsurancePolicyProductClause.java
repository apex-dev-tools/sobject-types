/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsurancePolicyProductClause extends SObject {
	public static SObjectType$<InsurancePolicyProductClause> SObjectType;
	public static SObjectFields$<InsurancePolicyProductClause> Fields;

	public String ApplicableObjectType;
	public String ClauseText;
	public String ConstraintModelDeveloperName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreationMethod;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Date EffectiveDate;
	public Date ExpirationDate;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SystemModstamp;

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
	public InsurancePolicyProductClauseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InsurancePolicyProductClauseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public InsurancePolicyProductClause clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyProductClause clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyProductClause clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyProductClause clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyProductClause clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
