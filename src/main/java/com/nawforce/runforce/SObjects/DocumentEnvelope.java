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
public class DocumentEnvelope extends SObject {
	public static SObjectType$<DocumentEnvelope> SObjectType;
	public static SObjectFields$<DocumentEnvelope> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DeliveredDateTime;
	public String EnvelopeIdentifier;
	public String EnvelopeMessageContent;
	public String EnvelopeSubject;
	public String EnvelopeUri;
	public Datetime FinalStatusDateTime;
	public String FinalStatusReason;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSyncDateTime;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceObjectId;
	public Name ReferenceObject;
	public String Status;
	public Datetime StatusChangeDateTime;
	public Datetime SystemModstamp;
	public String Vendor;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentRecipient[] DocumentRecipients;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DocumentEnvelopeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public DocumentEnvelopeHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DocumentEnvelopeShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DocumentEnvelope clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentEnvelope clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentEnvelope clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentEnvelope clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentEnvelope clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
