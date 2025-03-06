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
public class MarketSegment extends SObject {
	public static SObjectType$<MarketSegment> SObjectType;
	public static SObjectFields$<MarketSegment> Fields;

	public String AdditionalMetadataInfo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataGraphId;
	public DataGraph DataGraph;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String ExcludeCriteria;
	public Id Id;
	public String IncludeCriteria;
	public Boolean IsCurrentSaveApproxCount;
	public Boolean IsDeleted;
	public Boolean IsPrevSaveApproxCount;
	public Boolean IsRemote;
	public Boolean IsSeedSegment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishStatusDateTime;
	public String LastPublishStatusErrorCode;
	public Datetime LastPublishedEndDateTime;
	public Datetime LastReferencedDate;
	public Datetime LastSeedModelRunDateTime;
	public Datetime LastSeedModelStatusDateTime;
	public String LastSeedModelStatusErrorCode;
	public Datetime LastSegmentCountEndDateTime;
	public Long LastSegmentExcludedCount;
	public Long LastSegmentExcludedCountError;
	public Long LastSegmentIncludedCount;
	public Long LastSegmentMemberCount;
	public Long LastSegmentMemberCountError;
	public Long LastSegmentRemainderCount;
	public Datetime LastSegmentStatusDateTime;
	public String LastSegmentStatusErrorCode;
	public String LastSegmentStatusErrorDetails;
	public Long LastSegmentTotalCount;
	public Datetime LastViewedDate;
	public String LookbackPeriod;
	public String MarketSegmentType;
	public String Name;
	public Datetime NextPublishDateTime;
	public String OwnedBy;
	public Date PublishScheduleEndDate;
	public Datetime PublishScheduleEndDateTime;
	public String PublishScheduleInterval;
	public Datetime PublishScheduleStartDateTime;
	public String PublishStatus;
	public String PublishType;
	public String SeedModelStatus;
	public String SeedSimilarity;
	public Long SeedSimilarityHighToMedium;
	public Long SeedSimilarityMediumToLow;
	public String SegmentMembershipDataModelList;
	public String SegmentMembershipTable;
	public String SegmentStatus;
	public String SourceMarketSegment;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MarketSegmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public MarketSegmentHistory[] Histories;
	public MarketSegmentActivation[] MarketSegmentActivationTargets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MarketSegment clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSegment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
