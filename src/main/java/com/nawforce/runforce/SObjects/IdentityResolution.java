/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IdentityResolution extends SObject {
	public static SObjectType$<IdentityResolution> SObjectType;
	public static SObjectFields$<IdentityResolution> Fields;

	public Decimal ConsolidationRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String ErrorCode;
	public String ErrorMessage;
	public Id Id;
	public Boolean IsCaseSensitive;
	public Boolean IsDeleted;
	public Boolean IsScheduled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public String LastRunStatus;
	public Datetime LastRunStatusDateTime;
	public Datetime LastSuccessfulRunDateTime;
	public Datetime LastViewedDate;
	public Long MatchedCount;
	public String Name;
	public String RootEntityLabel;
	public String SecondaryEntityLabel;
	public Long SourceCount;
	public String Status;
	public String StatusDetails;
	public String Suffix;
	public Datetime SystemModstamp;
	public Long TotalAnonymousRecords;
	public Long TotalNonAnonymousRecords;
	public Long UnifiedCount;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IdentityResolutionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public IdentityResolutionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public IdentityResolution clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityResolution clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityResolution clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityResolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityResolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
