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
public class Opportunity extends SObject {
	public static SObjectType$<Opportunity> SObjectType;
	public static SObjectFields$<Opportunity> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Id CampaignId;
	public Campaign Campaign;
	public Date CloseDate;
	public Id ContactId;
	public Contact Contact;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Decimal ExpectedRevenue;
	public com.nawforce.runforce.System.String Fiscal;
	public com.nawforce.runforce.System.Integer FiscalQuarter;
	public com.nawforce.runforce.System.Integer FiscalYear;
	public com.nawforce.runforce.System.String ForecastCategory;
	public com.nawforce.runforce.System.String ForecastCategoryName;
	public com.nawforce.runforce.System.Boolean HasOpenActivity;
	public com.nawforce.runforce.System.Boolean HasOpportunityLineItem;
	public com.nawforce.runforce.System.Boolean HasOverdueTask;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsExcludedFromTerritory2Filter;
	public com.nawforce.runforce.System.Boolean IsPrivate;
	public com.nawforce.runforce.System.Boolean IsSplit;
	public com.nawforce.runforce.System.Boolean IsWon;
	public Date LastActivityDate;
	public Id LastAmountChangedHistoryId;
	public OpportunityHistory LastAmountChangedHistory;
	public Id LastCloseDateChangedHistoryId;
	public OpportunityHistory LastCloseDateChangedHistory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastStageChangeDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String LeadSource;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NextStep;
	public Id OwnerId;
	public User Owner;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Decimal Probability;
	public com.nawforce.runforce.System.String StageName;
	public Id SyncedQuoteId;
	public Quote SyncedQuote;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Decimal TotalOpportunityQuantity;
	public com.nawforce.runforce.System.String Type;

	public AccountPartner[] AccountPartners;
	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OpportunityFeed[] Feeds;
	public OpportunityFieldHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public OpportunityCompetitor[] OpportunityCompetitors;
	public OpportunityContactRole[] OpportunityContactRoles;
	public OpportunityHistory[] OpportunityHistories;
	public OpportunityLineItem[] OpportunityLineItems;
	public OpportunityPartner[] OpportunityPartnersFrom;
	public OpportunitySplit[] OpportunitySplits;
	public OpportunityTeamMember[] OpportunityTeamMembers;
	public Partner[] Partners;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Quote[] Quotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public ServiceAppointment[] ServiceAppointments;
	public OpportunityShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Opportunity clone$() {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
