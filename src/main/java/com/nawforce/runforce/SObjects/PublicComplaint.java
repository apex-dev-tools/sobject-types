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
public class PublicComplaint extends SObject {
	public static SObjectType$<PublicComplaint> SObjectType;
	public static SObjectFields$<PublicComplaint> Fields;

	public Id AccountId;
	public Account Account;
	public String BusinessAddress;
	public String BusinessName;
	public String Comments;
	public String ComplaintSubType;
	public String ComplaintType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Email;
	public String FirstName;
	public Id Id;
	public Date IncidentDate;
	public Boolean IsDeleted;
	public Boolean IsReporterConfidential;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MobileNumber;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public String ReporterAddress;
	public String ReporterCategory;
	public String ReporterOrganization;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public ComplaintCase[] ComplaintCaseComplaint;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PublicComplaintFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PublicComplaintHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ComplaintParticipant[] PublicComplaintParticipants;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public PublicComplaintShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PublicComplaint clone$() {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaint clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaint clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PublicComplaint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
