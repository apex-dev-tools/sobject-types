/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MaintenanceWorkRule extends SObject {
	public static SObjectType$<MaintenanceWorkRule> SObjectType;
	public static SObjectFields$<MaintenanceWorkRule> Fields;

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
	public Date NextSuggestedMaintenanceDate;
	public Id OwnerId;
	public Name Owner;
	public Id ParentMaintenancePlanId;
	public MaintenancePlan ParentMaintenancePlan;
	public Id ParentMaintenanceRecordId;
	public MaintenanceAsset ParentMaintenanceRecord;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String RecurrencePattern;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;
	public Id WorkTypeId;
	public WorkType WorkType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MaintenanceWorkRuleFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MaintenanceWorkRuleHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MaintenanceWorkRuleShare[] Shares;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;

	public MaintenanceWorkRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
