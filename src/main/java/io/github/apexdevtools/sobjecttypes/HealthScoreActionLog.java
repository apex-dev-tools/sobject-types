/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class HealthScoreActionLog extends SObject {
	public static SObjectType$<HealthScoreActionLog> SObjectType;
	public static SObjectFields$<HealthScoreActionLog> Fields;

	public Datetime ActionDate;
	public String ActionDescription;
	public String ActionIconUrl;
	public String ActionLabel;
	public String ActionName;
	public String ActionStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PerformedById;
	public User PerformedBy;
	public Decimal Score;
	public Id ScoreCategoryId;
	public ScoreCategory ScoreCategory;
	public Id SubjectId;
	public Name Subject;
	public Datetime SystemModstamp;
	public Id TargetAccountId;
	public Account TargetAccount;
	public Id TargetContactId;
	public Contact TargetContact;
	public Id TargetLeadId;
	public Lead TargetLead;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthScoreActionLogFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthScoreActionLogHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public HealthScoreActionLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreActionLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreActionLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreActionLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthScoreActionLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
