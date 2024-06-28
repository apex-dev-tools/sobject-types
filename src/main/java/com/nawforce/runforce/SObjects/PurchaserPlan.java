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
public class PurchaserPlan extends SObject {
	public static SObjectType$<PurchaserPlan> SObjectType;
	public static SObjectFields$<PurchaserPlan> Fields;

	public String Affiliation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsVerifiable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Notes;
	public Id OwnerId;
	public Name Owner;
	public Id PayerId;
	public Account Payer;
	public String PlanNumber;
	public String PlanStatus;
	public String PlanType;
	public String ServiceType;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;

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
	public PurchaserPlanFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PurchaserPlanHistory[] Histories;
	public Identifier[] Identifiers;
	public MemberPlan[] MemberPlans;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PlanBenefit[] PlanBenefits;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PurchaserPlanAssn[] PurchaserPlanAssociations;
	public Note[] PurchaserPlanNotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public PurchaserPlanShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PurchaserPlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PurchaserPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
