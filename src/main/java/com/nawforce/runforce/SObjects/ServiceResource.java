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
public class ServiceResource extends SObject {
	public static SObjectType$<ServiceResource> SObjectType;
	public static SObjectFields$<ServiceResource> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCapacityBased;
	public Boolean IsOptimizationCapable;
	public Boolean IsPrimary;
	public Decimal LastKnownLatitude;
	public Location LastKnownLocation;
	public Datetime LastKnownLocationDate;
	public Decimal LastKnownLongitude;
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
	public Id RelatedRecordId;
	public User RelatedRecord;
	public String ResourceType;
	public Id SchedulingConstraintId;
	public SchedulingConstraint SchedulingConstraint;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AppointmentInvitee[] AppointmentInvitations;
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
	public ServiceResourceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ServiceResourceHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ResourceAbsence[] ResourceAbsences;
	public ResourcePreference[] ResourcePreferences;
	public AssignedResource[] ServiceAppointments;
	public ServiceCrewMember[] ServiceCrewMembers;
	public ServiceResourceCapacity[] ServiceResourceCapacities;
	public ServiceResourcePreference[] ServiceResourcePreferences;
	public ServiceResourceSkill[] ServiceResourceSkills;
	public WaitlistServiceResource[] ServiceResources;
	public ServiceTerritoryMember[] ServiceTerritories;
	public ServiceResourceShare[] Shares;
	public Shift[] ShiftServiceResources;
	public SurveySubject[] SurveySubjectEntities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TimeSheet[] TimeSheets;
	public TopicAssignment[] TopicAssignments;
	public Visit[] VisitServiceResource;
	public Visitor[] Visitors;
	public WaitlistParticipant[] WaitlistParticipants;

	public ServiceResource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
