/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
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
	public com.nawforce.runforce.System.String CaseNumber;
	public Datetime ClosedDate;
	public com.nawforce.runforce.System.String Comments;
	public com.nawforce.runforce.System.String ContactEmail;
	public com.nawforce.runforce.System.String ContactFax;
	public Id ContactId;
	public Contact Contact;
	public com.nawforce.runforce.System.String ContactMobile;
	public com.nawforce.runforce.System.String ContactPhone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsEscalated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MasterRecordId;
	public Case MasterRecord;
	public com.nawforce.runforce.System.String Origin;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Case Parent;
	public com.nawforce.runforce.System.String Priority;
	public com.nawforce.runforce.System.String Reason;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Subject;
	public com.nawforce.runforce.System.String SuppliedCompany;
	public com.nawforce.runforce.System.String SuppliedEmail;
	public com.nawforce.runforce.System.String SuppliedName;
	public com.nawforce.runforce.System.String SuppliedPhone;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Type;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CaseArticle[] CaseArticles;
	public CaseComment[] CaseComments;
	public CaseContactRole[] CaseContactRoles;
	public CaseExternalDocument[] CaseExternalDocuments;
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
	public CaseHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public ReturnOrder[] ReturnOrders;
	public CaseShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public CaseTeamMember[] TeamMembers;
	public CaseTeamTemplateRecord[] TeamTemplateRecords;
	public TopicAssignment[] TopicAssignments;
	public WorkOrder[] WorkOrders;

	public Case clone$() {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
