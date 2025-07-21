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
public class DataAction extends SObject {
	public static SObjectType$<DataAction> SObjectType;
	public static SObjectFields$<DataAction> Fields;

	public String ActionApiName;
	public String ActionStatus;
	public String AffiliationDmoDeveloperName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastActionStatusDateTime;
	public String LastActionStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ManagedBy;
	public String Name;
	public Boolean ShouldProcessDayZero;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataActionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataActionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public DataAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
