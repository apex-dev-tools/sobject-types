/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkType extends SObject {
	public static SObjectType$<WorkType> SObjectType;
	public static SObjectFields$<WorkType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Decimal DurationInMinutes;
	public com.nawforce.runforce.System.String DurationType;
	public Decimal EstimatedDuration;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.Integer MinimumCrewSize;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.Integer RecommendedCrewSize;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public com.nawforce.runforce.System.Boolean ShouldAutoCreateSvcAppt;
	public Datetime SystemModstamp;

	public AppointmentTopicTimeSlot[] AppointmentTopicTimeSlots;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkTypeFeed[] Feeds;
	public WorkTypeHistory[] Histories;
	public LinkedArticle[] LinkedArticles;
	public MaintenanceAsset[] MaintenanceAssets;
	public MaintenancePlan[] MaintenancePlans;
	public MaintenanceWorkRule[] MaintenanceWorkRules;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductServiceCampaign[] ProductServiceCampaignWorkTypes;
	public ProductRequired[] ProductsRequired;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkTypeShare[] Shares;
	public SkillRequirement[] SkillRequirements;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;
	public WorkTypeGroupMember[] WorkTypeGroupMembers;

	public WorkType clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
