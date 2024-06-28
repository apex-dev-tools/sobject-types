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
public class Visit extends SObject {
	public static SObjectType$<Visit> SObjectType;
	public static SObjectFields$<Visit> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActualVisitEndTime;
	public Datetime ActualVisitStartTime;
	public Id AddressId;
	public Address Address;
	public Id ContactId;
	public Contact Contact;
	public Id ContextId;
	public Name Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String InstructionDescription;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentVisitId;
	public Visit ParentVisit;
	public Id PlaceId;
	public Name Place;
	public Datetime PlannedVisitEndTime;
	public Datetime PlannedVisitStartTime;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public String Status;
	public String StatusRemarks;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String VisitPriority;
	public Id VisitTypeId;
	public Name VisitType;
	public Id VisitorId;
	public Name Visitor;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AssessmentTask[] AssessmentTasks;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EngagementInteraction[] EngagementContext;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public VisitFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContextVisits;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GenericVisitTask[] GenericVisitTasks;
	public VisitHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public Visit[] ParentVisits;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductItemTransaction[] ProductItemTransactions;
	public ProductRequired[] ProductsRequired;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RegulatoryCodeViolation[] RegCodeInspection;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public AuthorizationFormConsent[] RelatedAuthorizationFormConsents;
	public VisitShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public VideoCall[] VideoRelatedRecords;
	public VisitedParty[] VisitVisitedParties;
	public Visitor[] Visitors;

	public Visit clone$() {throw new java.lang.UnsupportedOperationException();}
	public Visit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Visit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Visit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Visit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
