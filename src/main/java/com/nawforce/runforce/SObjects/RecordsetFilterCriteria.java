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
public class RecordsetFilterCriteria extends SObject {
	public static SObjectType$<RecordsetFilterCriteria> SObjectType;
	public static SObjectFields$<RecordsetFilterCriteria> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CustomLogic;
	public String Description;
	public String FilteredObject;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LogicalOperator;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String SourceObject;
	public Datetime SystemModstamp;

	public ApptBundleAggrPolicy[] ApptBundleAggrPolicies;
	public ApptBundleConfig[] ApptBundleConfigs;
	public ApptBundlePolicy[] ApptBundlePolicies;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public RecordsetFilterCriteriaFeed[] Feeds;
	public RecordsetFilterCriteriaHistory[] Histories;
	public MaintenanceWorkRule[] MaintenanceWorkRules;
	public NetworkActivityAudit[] ParentEntities;
	public RecordsetFilterCriteriaRule[] RecordsetFilterCriteriaRules;
	public RecordsetFltrCritMonitor[] RecordsetFltrCritMonitors;
	public RecordsetFilterCriteriaShare[] Shares;
	public Shift[] ShiftRecordsetFilterCriteria;
	public ShiftTemplate[] ShiftTemplates;

	public RecordsetFilterCriteria clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteria clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
