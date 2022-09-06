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
public class WorkPlanTemplateEntry extends SObject {
	public static SObjectType$<WorkPlanTemplateEntry> SObjectType;
	public static SObjectFields$<WorkPlanTemplateEntry> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer ExecutionOrder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime SystemModstamp;
	public String WorkPlanTemplateEntryNumber;
	public Id WorkPlanTemplateId;
	public WorkPlanTemplate WorkPlanTemplate;
	public Id WorkStepTemplateId;
	public WorkStepTemplate WorkStepTemplate;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkPlanTemplateEntryFeed[] Feeds;
	public WorkPlanTemplateEntryHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public WorkPlanTemplateEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
