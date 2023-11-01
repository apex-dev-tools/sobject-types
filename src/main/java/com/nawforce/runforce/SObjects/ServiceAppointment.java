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
public class ServiceAppointment extends SObject {
	public static SObjectType$<ServiceAppointment> SObjectType;
	public static SObjectFields$<ServiceAppointment> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualDuration;
	public Datetime ActualEndTime;
	public Datetime ActualStartTime;
	public Address Address;
	public String AppointmentNumber;
	public String ApptBookingInfoUrl;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public Id BundlePolicyId;
	public ApptBundlePolicy BundlePolicy;
	public String City;
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
	public String GeocodeAccuracy;
	public Id Id;
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
	public String PostalCode;
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
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ServiceAppointment[] BundledServiceAppointments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DigitalSignature[] DigitalSignatures;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceAppointmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ServiceAppointmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceAppointmentCapacityUsage[] ServiceAptCapacityUsages;
	public ServiceReport[] ServiceReports;
	public AssignedResource[] ServiceResources;
	public ServiceAppointmentShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ServiceAppointment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
