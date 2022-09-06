/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MaintenanceAsset extends SObject {
	public static SObjectType$<MaintenanceAsset> SObjectType;
	public static SObjectFields$<MaintenanceAsset> Fields;

	public Id AssetId;
	public Asset Asset;
	public Id ContractLineItemId;
	public ContractLineItem ContractLineItem;
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
	public String MaintenanceAssetNumber;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Date NextSuggestedMaintenanceDate;
	public Datetime SystemModstamp;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MaintenanceAssetFeed[] Feeds;
	public MaintenanceAssetHistory[] Histories;
	public MaintenanceWorkRule[] MaintenanceWorkRules;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public MaintenanceAsset clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAsset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAsset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
