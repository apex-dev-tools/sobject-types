/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MarketSegmentActivation extends SObject {
	public static SObjectType$<MarketSegmentActivation> SObjectType;
	public static SObjectFields$<MarketSegmentActivation> Fields;

	public String ActivationEventMetadata;
	public String ActivationFlowType;
	public String ActivationMappingSchema;
	public String ActivationObjectFilter;
	public String ActivationObjectName;
	public String ActivationObjectPath;
	public String ActivationProcessingType;
	public String ActivationRecordSchema;
	public String ActivationRefreshType;
	public String ActivationStatus;
	public Id ActivationTargetId;
	public ActivationTarget ActivationTarget;
	public Datetime AudienceDmoLastRunTimestamp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CuratedEntityName;
	public String CurrencyIsoCode;
	public String CustomerFileSource;
	public String DataGraphName;
	public String DataGraphPath;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DirectAttributeDmoFilterExpression;
	public String DmoFilterExpression;
	public Boolean DoExcludeDeletes;
	public Boolean DoExcludeUpdates;
	public Datetime EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRemote;
	public Datetime LastActivationStatusDateTime;
	public String LastActivationStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastPublishStatus;
	public String LastPublishStatusErrorMessage;
	public Datetime LastPublishedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LimitValue;
	public String LimitingAttributesExpression;
	public Id MarketSegmentId;
	public MarketSegment MarketSegment;
	public String Name;
	public String OwnedByOrg;
	public Long RecordCount;
	public String SourceDmoApiName;
	public Datetime StartDate;
	public String StaticAttributes;
	public Datetime SystemModstamp;
	public String WaterfallSelectedChildSegmentsConfig;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MarketSegmentActivationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MarketSegmentActivationHistory[] Histories;
	public MktSgmntActvtnAudAttribute[] MarketSegmentActivationAudAttribute;
	public MktSgmntActvtnContactPoint[] MarketSegmentActivationContactPoint;
	public MktSgmtActvDataSource[] MarketSgmtActvs;
	public MktSgmtActvDataModelFld[] MktSgmtActvDataModelFldActvs;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MarketSegmentActivation clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
