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
public class ActivationTarget extends SObject {
	public static SObjectType$<ActivationTarget> SObjectType;
	public static SObjectFields$<ActivationTarget> Fields;

	public String AudienceHistoryDmoName;
	public String AudienceLatestDmoName;
	public String ConnectionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataConConfigurationId;
	public MktDataConnection DataConConfiguration;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String ExportToDirectory;
	public String ExportToEndpoint;
	public Id Id;
	public Boolean IsCommunicationCappingEnabled;
	public Boolean IsDeleted;
	public Boolean IsRemote;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishStatusDate;
	public String LastPublishStatusErrorMessage;
	public Datetime LastReferencedDate;
	public Datetime LastTargetStatusDateTime;
	public String LastTargetStatusErrorCode;
	public Datetime LastViewedDate;
	public String MasterLabel;
	public String OutputFormat;
	public String OwnedByOrg;
	public Id OwnerId;
	public Name Owner;
	public String PlatformName;
	public String PlatformPrivacyType;
	public String RunStatus;
	public Datetime SystemModstamp;
	public String TargetStatus;
	public String TargetType;

	public ActivationTargetSecureFTP[] ActivationTargets;
	public MarketSegmentActivation[] ActivationTargets;
	public ActivationTrgtIntOrgAccess[] ActivationTargetsIntOrgAccess;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ActivationTargetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ActivationTargetHistory[] Histories;
	public ActivationTargetPlatform[] PlatformActivationTargets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActivationTargetShare[] Shares;

	public ActivationTarget clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivationTarget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTarget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
