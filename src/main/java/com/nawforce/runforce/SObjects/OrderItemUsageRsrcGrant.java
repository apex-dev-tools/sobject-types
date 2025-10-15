/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OrderItemUsageRsrcGrant extends SObject {
	public static SObjectType$<OrderItemUsageRsrcGrant> SObjectType;
	public static SObjectFields$<OrderItemUsageRsrcGrant> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Decimal GrantQuantity;
	public String GrantType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public Id ProductUsageGrantId;
	public ProductUsageGrant ProductUsageGrant;
	public Datetime SystemModstamp;
	public Id TokenResourceId;
	public UsageResource TokenResource;
	public Id UsageGrantRefreshPolicyId;
	public UsageGrantRenewalPolicy UsageGrantRefreshPolicy;
	public Id UsageGrantRolloverPolicyId;
	public UsageGrantRolloverPolicy UsageGrantRolloverPolicy;
	public Id UsageResourceId;
	public UsageResource UsageResource;
	public Integer ValidityPeriodTerm;
	public String ValidityPeriodUnit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OrderItemUsageRsrcGrantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OrderItemUsageRsrcGrantHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public OrderItemUsageRsrcGrant clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcGrant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcGrant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcGrant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcGrant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
