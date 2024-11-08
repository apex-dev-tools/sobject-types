/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GroupCensusMember extends SObject {
	public static SObjectType$<GroupCensusMember> SObjectType;
	public static SObjectFields$<GroupCensusMember> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public Decimal AnnualEligibleSalary;
	public Date Birthdate;
	public String City;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DependentCount;
	public String Email;
	public String FirstName;
	public Decimal FullTimeEquivalent;
	public String Gender;
	public String GeocodeAccuracy;
	public Id GroupCensusId;
	public GroupCensus GroupCensus;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOptOutAllPlans;
	public Boolean IsPortalUser;
	public Date JoinDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Lastname;
	public Decimal Latitude;
	public Decimal Longitude;
	public String MemberKey;
	public String MemberType;
	public String Name;
	public String OptOutPlanTypes;
	public Id OwnerId;
	public Name Owner;
	public String PhoneNumber;
	public Date PolicyStartDate;
	public String PostalCode;
	public Id PrimaryGroupCensusMemberId;
	public GroupCensusMember PrimaryGroupCensusMember;
	public String PrimaryMemberCategory;
	public String PrimaryMemberSource;
	public String RelationshipToPrimaryMember;
	public String SmokerStatus;
	public String SourceSystemIdentifier;
	public String State;
	public String StateCode;
	public String Status;
	public String Street;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public GroupCensusMember[] DependentGroupCensusMembers;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public GroupCensusMemberFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroupCensusMemberPlan[] GroupCensusMemberPlans;
	public GroupCensusMemberHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GroupCensusMemberShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GroupCensusMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
