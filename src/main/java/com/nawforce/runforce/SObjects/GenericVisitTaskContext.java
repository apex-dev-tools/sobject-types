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
public class GenericVisitTaskContext extends SObject {
	public static SObjectType$<GenericVisitTaskContext> SObjectType;
	public static SObjectFields$<GenericVisitTaskContext> Fields;

	public Id ContextId;
	public Name Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefinitionReferenceId;
	public GenericVisitTaskContext DefinitionReference;
	public String Description;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDefinition;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartDateTime;
	public String Status;
	public String StatusCode;
	public Datetime SystemModstamp;
	public Id VisitId;
	public Visit Visit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
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
	public GenericVisitTaskContextFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContextDefinitionReference;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GenericVisitTaskContextHistory[] Histories;
	public GnrcVstKeyPerformanceInd[] KPIVisitTaskContexts;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GenericVisitTaskContextShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public GnrcVstTaskContextRelation[] VisitTaskContexts;

	public GenericVisitTaskContext clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenericVisitTaskContext clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenericVisitTaskContext clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenericVisitTaskContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenericVisitTaskContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
