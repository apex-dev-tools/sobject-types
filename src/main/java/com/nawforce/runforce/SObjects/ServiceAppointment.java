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
public class ServiceAppointment extends SObject {
	public static SObjectType$<ServiceAppointment> SObjectType;
	public static SObjectFields$<ServiceAppointment> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualDuration;
	public Datetime ActualEndTime;
	public Datetime ActualStartTime;
	public String AdditionalInformation;
	public Address Address;
	public Id AppointmentCategoryId;
	public AppointmentCategory AppointmentCategory;
	public Id AppointmentInvitationId;
	public AppointmentInvitation AppointmentInvitation;
	public String AppointmentMode;
	public String AppointmentNumber;
	public String AppointmentType;
	public String ApptBookingInfoUrl;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public Integer AttendeeCount;
	public Integer AttendeeLimit;
	public Id BundlePolicyId;
	public ApptBundlePolicy BundlePolicy;
	public String CancellationReason;
	public Datetime CheckedInTime;
	public String City;
	public String Comments;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DueDate;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EarliestStartTime;
	public String Email;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
	public String GeocodeAccuracy;
	public String GroupAppointmentAccessType;
	public Id Id;
	public Boolean IsAnonymousBooking;
	public Boolean IsBundle;
	public Boolean IsBundleMember;
	public Boolean IsDeleted;
	public Boolean IsManuallyBundled;
	public Boolean IsOffsiteAppointment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Id OwnerId;
	public Name Owner;
	public Id ParentRecordId;
	public Name ParentRecord;
	public String ParentRecordStatusCategory;
	public String ParentRecordType;
	public String Phone;
	public String PostalCode;
	public Id ReceiptOrderId;
	public Order ReceiptOrder;
	public Id RelatedBundleId;
	public ServiceAppointment RelatedBundle;
	public Datetime SchedEndTime;
	public Datetime SchedStartTime;
	public String ServiceNote;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public Datetime SystemModstamp;
	public String TimeZone;
	public String Transaction;
	public Integer TravelTimeBuffer;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ServiceAppointment[] BundledServiceAppointments;
	public ClinicalEncounter[] Clinical_Encounter_ServiceAppointment;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DigitalSignature[] DigitalSignatures;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DynamicDataCapture[] DynamicDataCaptures;
	public EmailMessage[] Emails;
	public EngagementInteraction[] EngagementContext;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceAppointmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GeolocationBasedAction[] GeolocationBasedActions;
	public ServiceAppointmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceAppointmentAttendee[] ServiceAppointmentAttendees;
	public ServiceAppointmentCapacityUsage[] ServiceAptCapacityUsages;
	public ServiceReport[] ServiceReports;
	public AssignedResource[] ServiceResources;
	public ServiceAppointmentShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public VideoCall[] VideoRelatedRecords;
	public WaitlistParticipant[] WaitlistParticipants;

	public ServiceAppointment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
