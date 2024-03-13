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
public class Case extends SObject {
	public static SObjectType$<Case> SObjectType;
	public static SObjectFields$<Case> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public String CaseNumber;
	public Datetime ClosedDate;
	public String Comments;
	public String ContactEmail;
	public String ContactFax;
	public Id ContactId;
	public Contact Contact;
	public String ContactMobile;
	public String ContactPhone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsClosedOnCreate;
	public Boolean IsDeleted;
	public Boolean IsEscalated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MasterRecordId;
	public Case MasterRecord;
	public String Origin;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Case Parent;
	public String Priority;
	public String Reason;
	public String Status;
	public String Subject;
	public String SuppliedCompany;
	public String SuppliedEmail;
	public String SuppliedName;
	public String SuppliedPhone;
	public Datetime SystemModstamp;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CaseArticle[] CaseArticles;
	public CaseComment[] CaseComments;
	public CaseContactRole[] CaseContactRoles;
	public CaseExternalDocument[] CaseExternalDocuments;
	public CaseMilestone[] CaseMilestones;
	public CaseSolution[] CaseSolutions;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] EmailMessages;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CaseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public CaseHistory[] Histories;
	public ListEmail[] ListEmails;
	public MessagingSession[] MessagingSessions;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointments;
	public CaseShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public Task[] Tasks;
	public CaseTeamMember[] TeamMembers;
	public CaseTeamTemplateRecord[] TeamTemplateRecords;
	public TopicAssignment[] TopicAssignments;
	public WorkOrder[] WorkOrders;

	public Case clone$() {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
