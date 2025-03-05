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
public class MktCalculatedInsight extends SObject {
	public static SObjectType$<MktCalculatedInsight> SObjectType;
	public static SObjectFields$<MktCalculatedInsight> Fields;

	public String CalculatedInsightStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String ExternalErrorProperties;
	public Id HistoryCiId;
	public MktCalculatedInsight HistoryCi;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRemote;
	public Datetime LastCalcInsightStatusDateTime;
	public String LastCalcInsightStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRunDateTime;
	public String LastRunStatus;
	public Datetime LastRunStatusDateTime;
	public String LastRunStatusErrorCode;
	public Datetime LastViewedDate;
	public String Name;
	public String OwnedBy;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MktCalculatedInsightFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public MktCalculatedInsightHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MktCalculatedInsight clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktCalculatedInsight clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktCalculatedInsight clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktCalculatedInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktCalculatedInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
